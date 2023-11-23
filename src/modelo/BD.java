
package modelo;

import controlador.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import vista.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


    public class BD {
        Connection conexion = null;
//METODOS
        
        //CONEXIONES

          
            
            public void agendaMedica(){
            try {
            String url = "jdbc:mysql://localhost:3306/agenda";
            String user = "root";
            String password = "";
            
            conexion = DriverManager.getConnection(url,user,password);
                System.out.println("Conectado a agenda");
            } catch (SQLException e) {
                System.out.println("No se pudo conectar a la base de datos de la agenda medica"+ e.getMessage());
            }
        }//fin metodo agendaMedica

            //METODO ALMACENAR DATOS USUARIO LOGEADO

            
            
            
        // METODO PARA INICIAR SESION
            public static void iniciarSesion(String rut, String contrasena) {
                   String rol = "";
                   String nombreUsuario = "";
                   String apellidoUsuario = "";
                   String rutUsuario = "";
                   String url = "jdbc:mysql://localhost:3306/agenda";
                   String user = "root";
                   String password = "";

                   try (Connection conn  = DriverManager.getConnection(url, user, password)) {
                       String query = "SELECT rol, nombre, apellido, rut FROM usuarios_galeno WHERE rut = ? AND rut = ?";
                       PreparedStatement stmt = conn.prepareStatement(query);
                       stmt.setString(1, rut);
                       stmt.setString(2, rut);
                       ResultSet rs = stmt.executeQuery();

                       if (rs.next()) {
                           rol = rs.getString("rol");
                           nombreUsuario = rs.getString("nombre");
                           apellidoUsuario = rs.getString("apellido");
                           rutUsuario = rs.getString("rut");
                       } else {
                           JOptionPane.showMessageDialog(null, "No se encuentra usuario registrado");
                           System.out.println("Credenciales inválidas.");
                           return;
                       }
                   } catch (SQLException e) {
                       e.printStackTrace();
                   }

                   // Redirigir según el rol
                 // ...

            switch (rol) {
                case "paciente":
                    PacienteView p = new PacienteView();
                    p.setNombreUsuario(nombreUsuario);
                    p.setRutUsuario(rutUsuario);
                    p.setVisible(true);
                    break;
                case "Medico":
                    MedicoView m = new MedicoView();
                    m.setNombreUsuario(nombreUsuario);
                    m.setApellidoUsuario(apellidoUsuario);
                    m.setRutUsuario(rutUsuario);
                    m.setVisible(true);
                    break;
                case "Secretaria":
                    SecretariaView s = new SecretariaView();
                    s.setNombreUsuario(nombreUsuario); 
                    s.setRutUsuario(rutUsuario);
                    s.setVisible(true);
                    break;
                case "administrador":
                    AdministradorView a = new AdministradorView();
                    a.setNombreUsuario(nombreUsuario);
                    //a.setRutUsuario(rutUsuario);
                    a.setVisible(true);
                    break;
                default:
                    System.out.println("Rol desconocido. No se puede abrir la pantalla de vista.");
                    break;
                    }
                }// fin metodo iniciar sesion 



            
            //CRUD AGENDA_MEDICA
            //CREATE
            public boolean agendarCita(Agenda agenda){
            try {
            String SQL = "INSERT INTO agenda_medica(rutPaciente, nombreMed, rutMed, especialidad, fecha, status, valorConsulta) VALUES ('"+agenda.getRutPaciente()+"','"+agenda.getNombreMed()+"','"+agenda.getRutMed()+"','"+agenda.getEspecialidad()+"','"+agenda.getFecha()+"','"+agenda.getStatus()+"','"+agenda.getValorConsulta()+"')";
            System.out.println("Sentencia SQL: " + SQL);

            Statement s = conexion.createStatement();
            s.executeUpdate( SQL );

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return false;
            }
            return true;
        }  //fin metodo agregar
            
            
            //READ
            //METODO PARA MOSTRAR DATOS EN TABLA
            public void desconectar() throws SQLException {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                }
            }
            
            public void actualizarCitas(JTable tabla) throws SQLException {
                agendaMedica();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Rut Paciente");
                modelo.addColumn("Nombre Medico");
                modelo.addColumn("Especialidad");
                modelo.addColumn("Fecha");
                modelo.addColumn("Estado");


                String consulta = "SELECT rutPaciente, nombreMed, especialidad, fecha, status FROM agenda_medica ";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Object[] fila = new Object[6]; // 7 es el número de columnas en la tabla

                    fila[0] = resultSet.getString("rutPaciente");
                    fila[1] = resultSet.getString("nombreMed");
                    fila[2] = resultSet.getString("especialidad");
                    fila[3] = resultSet.getString("fecha");
                    fila[4] = resultSet.getString("status");

                    modelo.addRow(fila);
                }
                tabla.setModel(modelo);
                resultSet.close();
                statement.close();
                desconectar();
            }//FIN METODO MOSTRAR DATOS
            
            //UPDATE
            public void editarCita(String nombremed, String rutMed,String especialidad, String fecha, String rut, String fecha2) throws SQLException {
            agendaMedica();
            String consulta = "UPDATE agenda_medica SET nombreMed = ?, rutMed = ?, especialidad = ?, fecha = ? WHERE rutPaciente = ? AND fecha = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1,nombremed );
            preparedStatement.setString(2,rutMed);
            preparedStatement.setString(3,especialidad );
            preparedStatement.setString(4, fecha );
            preparedStatement.setString(5, rut );
            preparedStatement.setString(6, fecha2 );
            preparedStatement.executeUpdate();
                }//fin metofo editarAgenda

            //DELETE
            
            //metodo para eliminar un usuario por rut
            public void cancelarCita(String rut, String fecha) throws SQLException {
            agendaMedica();
            String consulta = "DELETE FROM agenda_medica WHERE rutPaciente = ? AND fecha = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1, rut);
            preparedStatement.setString(2, fecha);
            preparedStatement.executeUpdate();
            }//fin metodo eliminarUsuario
    
            
            
            
      //FIN CRUD AGENDA MEDICA      
//-----------------------------------------------------------------------------------------------------------------------------------------

            public boolean registrar(Usuarios usuarios ){
                try {
                String SQL = "INSERT INTO usuarios_galeno(nombre,apellido,rut,direccion,telefono,correo,rol,especialidad)values('"+usuarios.getNombre()+"','"+usuarios.getApellido()+"','"+usuarios.getRut()+"','"+usuarios.getDireccion()+"','"+usuarios.getTelefono()+"','"+usuarios.getCorreo()+"','"+usuarios.getRol()+"','"+usuarios.getEspecialidad()+"')";
                Statement s = conexion.createStatement();
                s.executeUpdate( SQL );
                s.close();

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
                return true;
            }  //fin metodo agregar
 

    
            public List<String> obtenerMedicos(String especialidad) {
                List<String> nombresCompletosMedicos = new ArrayList<>();
            try {
                PreparedStatement preparedStatement = conexion.prepareStatement("SELECT nombre, apellido FROM usuarios_galeno WHERE especialidad = ?");
                preparedStatement.setString(1, especialidad);
                ResultSet resultSet = preparedStatement.executeQuery();
                // Procesar los resultados
                while (resultSet.next()) {
                    String nombreMedico = resultSet.getString("nombre");
                    String apellidoMedico = resultSet.getString("apellido");
                    String nombreCompleto = nombreMedico + " " + apellidoMedico;
                    nombresCompletosMedicos.add(nombreCompleto);
                    }
                }
            catch (Exception e) {
                System.out.println(e);
                }
                return nombresCompletosMedicos;
            }//fin metodo obtenerMedicos
    
          
            public void informe(JTable tabla) throws SQLException {
                    agendaMedica();
                    DefaultTableModel modelo2 = new DefaultTableModel();
                    modelo2.addColumn("Nombre Medico");
                    modelo2.addColumn("Fecha");
                    modelo2.addColumn("Monto Recaudado");

                    String consulta = "SELECT nombreMed, fecha, valorConsulta FROM agenda_medica";
                    PreparedStatement statement = conexion.prepareStatement(consulta);
                    ResultSet resultSet = statement.executeQuery();

                    while (resultSet.next()) {
                        Object[] fila = new Object[3]; // 7 es el número de columnas en la tabla

                        fila[0] = resultSet.getString("nombreMed");
                        fila[1] = resultSet.getString("fecha");
                        fila[2] = resultSet.getInt("valorConsulta");
                        modelo2.addRow(fila);
                    }
                    tabla.setModel(modelo2);
                    resultSet.close();
                    statement.close();
                    desconectar();
                }//FIN METODO MOSTRAR DATOS
            
            
            
public ResultSet obtenerFiltro(String especialidad, String nombreMed, String fechaDesde, String fechaHasta) throws SQLException {
    StringBuilder consulta = new StringBuilder("SELECT nombreMed, fecha, valorConsulta FROM agenda_medica WHERE 1 = 1");

    // Agregar filtro por especialidad si no es el valor predeterminado
    if (!"Especialidad".equals(especialidad) && !especialidad.isBlank()) {
        consulta.append(" AND especialidad = ?");
    }

    // Agregar filtro por nombreMed si no está en blanco
    if (!nombreMed.isBlank()) {
        consulta.append(" AND nombreMed = ?");
    }

    // Agregar filtro por fecha si las fechas no son nulas
    if (fechaDesde != null && fechaHasta != null) {
        consulta.append(" AND fecha BETWEEN ? AND ?");
    }

    PreparedStatement preparedStatement = conexion.prepareStatement(consulta.toString());
    int parameterIndex = 1;

    // Configurar parámetros de especialidad
    if (!"Especialidad".equals(especialidad) && !especialidad.isBlank()) {
        preparedStatement.setString(parameterIndex++, especialidad);
    }

    // Configurar parámetros de nombreMed
    if (!nombreMed.isBlank()) {
        preparedStatement.setString(parameterIndex++, nombreMed);
    }

    // Configurar parámetros de fecha si las fechas no son nulas
    if (fechaDesde != null && fechaHasta != null) {
        preparedStatement.setString(parameterIndex++, fechaDesde);
        preparedStatement.setString(parameterIndex++, fechaHasta);
    }

    return preparedStatement.executeQuery();
}
//FIN METODO OBTENERNOMBRE MEDICO
            
            public void informeFiltrado(JTable tabla, String especialidad, String nombreMed, String fechaDesde, String fechaHasta) throws SQLException {
                agendaMedica();
                DefaultTableModel modelo2 = new DefaultTableModel();
                modelo2.addColumn("Nombre Medico");
                modelo2.addColumn("Fecha");
                modelo2.addColumn("Monto Recaudado");

                ResultSet resultSet = obtenerFiltro(especialidad, nombreMed, fechaDesde, fechaHasta);

                while (resultSet.next()) {
                    Object[] fila = new Object[3]; // 3 es el número de columnas en la tabla

                    fila[0] = resultSet.getString("nombreMed");
                    fila[1] = resultSet.getString("fecha");
                    fila[2] = resultSet.getInt("valorConsulta");
                    modelo2.addRow(fila);
                }

                tabla.setModel(modelo2);
                            resultSet.close();
                            desconectar();
                }//FIN METODO MOSTRAR DATOS
            
            
            public ResultSet obtenerFiltroMedico() throws SQLException {
                
                LocalDate fechaActual = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String fechaHoyString = fechaActual.format(formatter);
                String consulta = "SELECT u.nombre, u.apellido, u.rut, a.status, a.fecha FROM usuarios_galeno u "
                                + "JOIN agenda_medica a ON u.rut = a.rutPaciente "
                                + "WHERE a.fecha = ?" +"AND a.status = 'agendado'";


                PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setString(1, fechaHoyString);

                return preparedStatement.executeQuery();
            }

            public void informeFiltradoMedico(JTable tabla) throws SQLException {
                agendaMedica();
                DefaultTableModel modelo2 = new DefaultTableModel();
                modelo2.addColumn("Nombre");
                modelo2.addColumn("Apellido");
                modelo2.addColumn("Rut");
                modelo2.addColumn("Fecha");
                modelo2.addColumn("Estado");

                ResultSet resultSet = obtenerFiltroMedico();

                while (resultSet.next()) {
                    Object[] fila = new Object[5]; // 3 es el número de columnas en la tabla

                    fila[0] = resultSet.getString("nombre");
                    fila[1] = resultSet.getString("apellido");
                    fila[2] = resultSet.getString("rut");
                    fila[3] =resultSet.getString("fecha");
                    fila[4] = resultSet.getString("status");

                    modelo2.addRow(fila);
                }

                tabla.setModel(modelo2);
                resultSet.close();
                desconectar();
            }//FIN METODO MOSTRAR DATOS
            
            
            
            public void editarCitaMedico(String nombre, String apellido) throws SQLException {
                agendaMedica();
                String consulta = "UPDATE agenda_medica a " +
                                  "JOIN usuarios_galeno u ON u.rut = a.rutPaciente " +
                                  "SET a.status = 'atendido' " +
                                  "WHERE u.nombre = ? AND u.apellido = ? AND a.status = 'agendado'";

                PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, apellido);
                preparedStatement.executeUpdate();
            }   
            
            

            
            public void actualizarCitasPaciente(JTable tabla, String rutPaciente) throws SQLException {
                agendaMedica();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Rut Paciente");
                modelo.addColumn("Nombre Medico");
                modelo.addColumn("Especialidad");
                modelo.addColumn("Fecha");
                modelo.addColumn("Estado");

                String consulta = "SELECT rutPaciente, nombreMed, especialidad, fecha, status FROM agenda_medica WHERE rutPaciente = ?";
                PreparedStatement statement = conexion.prepareStatement(consulta);
                statement.setString(1, rutPaciente);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Object[] fila = new Object[5]; // 7 es el número de columnas en la tabla

                    fila[0] = resultSet.getString("rutPaciente");
                    fila[1] = resultSet.getString("nombreMed");
                    fila[2] = resultSet.getString("especialidad");
                    fila[3] = resultSet.getString("fecha");
                    fila[4] = resultSet.getString("status");
                    modelo.addRow(fila);
                }
                tabla.setModel(modelo);
                resultSet.close();
                statement.close();
                desconectar();
            }//FIN METODO MOSTRAR DATOS
            
            
            
            
            
            public ResultSet obtenerFiltroInformeMedico(String nombreMed, String rutMed, String fechaDesde,String fechaHasta) throws SQLException {
                
                String consulta = "SELECT nombreMed, rutMed, fecha, valorConsulta FROM agenda_medica WHERE rutMed = ?";

            if (fechaDesde != null) {
                consulta += " AND a.fecha >= ?";
            }

            if (fechaHasta != null) {
                consulta += " AND a.fecha <= ?";
            }

                PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setString(1, rutMed);
                   System.out.println("aa: " + rutMed);
                if (fechaDesde != null && fechaHasta != null) {
                    preparedStatement.setString(2, fechaDesde);
                    preparedStatement.setString(3, fechaHasta);
                }
                    return preparedStatement.executeQuery();
            }

            public void informeFiltradoInformeMedico(JTable tabla, String nombreMed,String rutMed, String fechaDesde, String fechaHasta) throws SQLException {
                agendaMedica();
                DefaultTableModel modelo2 = new DefaultTableModel();
                modelo2.addColumn("Nombre Medico");
                modelo2.addColumn("Rut Medico");
                modelo2.addColumn("Fecha");
                modelo2.addColumn("Monto Recaudado");

                ResultSet resultSet = obtenerFiltroInformeMedico(nombreMed, rutMed, fechaDesde, fechaHasta);

                while (resultSet.next()) {
                    Object[] fila = new Object[4];

                    fila[0] = resultSet.getString("nombreMed");
                    fila[1] = resultSet.getString("rutMed");
                    fila[2] = resultSet.getString("fecha");
                    fila[3] = resultSet.getInt("valorConsulta");

                    modelo2.addRow(fila);
                }

                tabla.setModel(modelo2);
                resultSet.close();
                desconectar();
            }//FIN METODO MOSTRAR DATOS
            
            
            
            
            
            
            
            public String obtenerRutMedico(String nombreMed) throws SQLException {
                agendaMedica();
                String consulta = "SELECT rutMed FROM agenda_medica WHERE nombreMed = ?";
                try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                    statement.setString(1, nombreMed);
                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            return resultSet.getString("rutMed");
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace(); // Maneja adecuadamente la excepción en tu aplicación
                } finally {
                    desconectar(); // Asegúrate de cerrar la conexión
                }
                return null; // Devuelve lo que sea apropiado en tu caso si no se encuentra el médico
            }

            

            
            public void generarInformePDF(JTable tabla, int totalRecaudado) {
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
                    String timestamp = LocalDateTime.now().format(formatter);
                    // Ruta del archivo PDF (ajústala según tus necesidades)
                    String filePath = "Informes/informe_" + timestamp + "_.pdf";

                    PDDocument document = new PDDocument();
                    PDPage page = new PDPage();
                    document.addPage(page);

                    PDPageContentStream contentStream = new PDPageContentStream(document, page);


                    // Configurar posición inicial
                    float margin = 50;
                    float yStart = page.getMediaBox().getHeight() - margin;
                    float tableWidth = page.getMediaBox().getWidth() - 2 * margin;
                    float yPosition = yStart;
                    int rowsPerPage = 30;
                    int numRows = tabla.getRowCount();

                    // Agregar encabezado al documento
                    float textWidth = PDType1Font.HELVETICA_BOLD.getStringWidth("Informe Recaudacion") / 1000 * 20;
                    float centerX = (page.getMediaBox().getWidth() - textWidth) / 2;

                    contentStream.beginText();
                    contentStream.setFont(PDType1Font.HELVETICA_BOLD, 20);
                    contentStream.newLineAtOffset(centerX, yPosition);
                    contentStream.showText("Informe Recaudacion");
                    contentStream.endText();
                    float subrayadoY = yPosition - 5; // Ajusta este valor según tus necesidades
                    contentStream.drawLine(centerX, subrayadoY, centerX + textWidth, subrayadoY);
                    yPosition -= 40;
                    
                    
                    // Agregar títulos de columnas
                    contentStream.beginText();
                    contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);

                    float col1Width = PDType1Font.HELVETICA_BOLD.getStringWidth("Nombre Medico") / 1000 * 12;
                    float col2Width = PDType1Font.HELVETICA_BOLD.getStringWidth("Fecha") / 1000 * 12;
                    float col3Width = PDType1Font.HELVETICA_BOLD.getStringWidth("Monto Recaudado") / 1000 * 12;

                    float col1CenterX = margin + col1Width / 6;
                    float col2CenterX = margin + col1Width + (tableWidth - (col1Width + col2Width)) / 2.4f;
                    float col3CenterX = margin + col1Width + col2Width + (tableWidth - (col1Width + col2Width + col3Width))/1.1f;
                    
                    
                    contentStream.newLineAtOffset(col1CenterX, yPosition);
                    contentStream.showText("Nombre Medico");

                    contentStream.newLineAtOffset(col2CenterX - col1CenterX, 0);
                    contentStream.showText("Fecha");

                    contentStream.newLineAtOffset(col3CenterX - col2CenterX, 0);
                    contentStream.showText("Monto Recaudado");

                    contentStream.endText();
                    yPosition -= 30;
                    

                    // Agregar contenido de la tabla al documento
                    for (int i = 0; i < numRows; i++) {
                        yPosition -= 20;
                        contentStream.beginText();
                        contentStream.setFont(PDType1Font.HELVETICA, 12);
                        contentStream.newLineAtOffset(margin, yPosition);

                        for (int j = 0; j < tabla.getColumnCount(); j++) {
                            if (j == 1) { // Columna del medio
                                contentStream.showText(tabla.getValueAt(i, j).toString());
                                contentStream.newLineAtOffset(150, 0); // Ajusta este valor según tus necesidades
                            } else if (j == 0) { // Primera columna
                                contentStream.showText(tabla.getValueAt(i, j).toString());
                                contentStream.newLineAtOffset(250, 0); // Ajusta este valor según tus necesidades
                            } else if (j == 2) { // Tercera columna
                                contentStream.showText("$"+tabla.getValueAt(i, j).toString());
                                contentStream.newLineAtOffset(650, 0); // Ajusta este valor según tus necesidades
                            } else { // Otras columnas
                                contentStream.showText( tabla.getValueAt(i, j).toString());
                                contentStream.newLineAtOffset(150, 0); // Ajusta este valor según tus necesidades
                            }
                        }

                        contentStream.endText();
                        
                        
                        if (i % rowsPerPage == 0 && i > 0) {
                            contentStream.close();
                            page = new PDPage();
                            document.addPage(page);
                            contentStream = new PDPageContentStream(document, page);
                            yPosition = yStart;
                        }
                    }
                    
                            float totalTableWidth = col1Width + col2Width + col3Width;
                            // Ajusta la posición X según tus necesidades
                            float totalCenterX = margin + (tableWidth - totalTableWidth) / 2;

                            yPosition -= 60; // Ajusta este valor según tus necesidades

                            // Agregar la línea del total después del espacio adicional
                            contentStream.beginText();
                            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 14);
                            contentStream.newLineAtOffset(totalCenterX, yPosition);
                            contentStream.showText("Total Recaudado: $" + totalRecaudado);
                            contentStream.endText();
                            contentStream.close();
                            document.save(filePath);
                            document.close();
                            JOptionPane.showMessageDialog(null, "Informe PDF generado exitosamente.");
                            try {
                                File file = new File(filePath);
                                Desktop.getDesktop().open(file);
                            } catch (IOException e) {
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Error al abrir el archivo PDF.");
                                System.out.println(e);
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error al generar el informe PDF.");
                            System.out.println(e);
                        }
                    }

}//fin clase BD
