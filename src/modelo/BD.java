
package modelo;

import controlador.*;
import java.sql.*;
import javax.swing.JOptionPane;
import vista.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


    public class BD {
        Connection conexion = null;
//METODOS
        
        //CONEXIONES

            public void conectar(){
            try {
            String url = "jdbc:mysql://localhost:3306/usuarios_galeno";
            String user = "root";
            String password = "";
            conexion = DriverManager.getConnection(url, user, password);
                System.out.println("Conexion Lista");   
            } catch (SQLException e) {
                System.out.println("No se pudo conectar la base de datos"+ e.getMessage());
            }       
        }//fin metodo conectar
            
            
            public void agendaMedica(){
            try {
            String url = "jdbc:mysql://localhost:3306/agenda";
            String user = "root";
            String password = "";
            
            conexion = DriverManager.getConnection(url,user,password);
                System.out.println("Conexion a la agenda medica lista");
            } catch (SQLException e) {
                System.out.println("No se pudo conectar a la base de datos de la agenda medica"+ e.getMessage());
            }
        }//fin metodo agendaMedica

            
        // METODO PARA INICIAR SESION
            public static void iniciarSesion(String rut, String contrasena) {
                   String rol = "";
                   String nombreUsuario = "";
                   String url = "jdbc:mysql://localhost:3306/usuarios_galeno";
                   String user = "root";
                   String password = "";

                   try (Connection conn  = DriverManager.getConnection(url, user, password)) {
                       String query = "SELECT rol, nombre FROM usuarios WHERE rut = ? AND rut = ?";
                       PreparedStatement stmt = conn.prepareStatement(query);
                       stmt.setString(1, rut);
                       stmt.setString(2, rut);
                       ResultSet rs = stmt.executeQuery();

                       if (rs.next()) {
                           rol = rs.getString("rol");
                           nombreUsuario = rs.getString("nombre");

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
                case "Paciente":
                    PacienteView p = new PacienteView();
                    p.setNombreUsuario(nombreUsuario);
                    p.setVisible(true);
                    break;
                case "Medico":
                    MedicoView m = new MedicoView();
                    m.setNombreUsuario(nombreUsuario);
                    m.setVisible(true);
                    break;
                case "Secretaria":
                    SecretariaView s = new SecretariaView();
                    s.setNombreUsuario(nombreUsuario);
                    s.setVisible(true);
                    break;
                case "administrador":
                    AdministradorView a = new AdministradorView();
                    a.setNombreUsuario(nombreUsuario);
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
            String SQL = "INSERT INTO agenda_medica(rutPaciente, nombreMed, especialidad, fecha, status, valorConsulta) VALUES ('"+agenda.getRutPaciente()+"','"+agenda.getNombreMed()+"','"+agenda.getEspecialidad()+"','"+agenda.getFecha()+"','"+agenda.getStatus()+"','"+agenda.getValorConsulta()+"')";
            System.out.println("Sentencia SQL: " + SQL);

            
            Statement s = conexion.createStatement();
            s.executeUpdate( SQL );
            s.close();
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


                String consulta = "SELECT rutPaciente, nombreMed, especialidad, fecha, status FROM agenda_medica";
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
            public void editarCita(String nombremed, String especialidad, String fecha, String rut, String fecha2) throws SQLException {
            agendaMedica();
            String consulta = "UPDATE agenda_medica SET nombreMed = ?, especialidad = ?, fecha = ? WHERE rutPaciente = ? AND fecha = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1,nombremed );
            preparedStatement.setString(2,especialidad );
            preparedStatement.setString(3, fecha );
            preparedStatement.setString(4, rut );
            preparedStatement.setString(5, fecha2 );
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
                String SQL = "INSERT INTO usuarios(nombre,apellido,rut,direccion,telefono,correo,rol,especialidad)values('"+usuarios.getNombre()+"','"+usuarios.getApellido()+"','"+usuarios.getRut()+"','"+usuarios.getDireccion()+"','"+usuarios.getTelefono()+"','"+usuarios.getCorreo()+"','"+usuarios.getRol()+"','"+usuarios.getEspecialidad()+"')";
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
                PreparedStatement preparedStatement = conexion.prepareStatement("SELECT nombre, apellido FROM usuarios WHERE especialidad = ?");
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
            
            
            
            public ResultSet obtenerNombreMedico(String especialidad, String nombreMed) throws SQLException {
                String consulta = "SELECT nombreMed, fecha, valorConsulta FROM agenda_medica WHERE (especialidad = ? AND nombreMed = ?)";
                PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setString(1, especialidad);
                preparedStatement.setString(2,nombreMed);
                return preparedStatement.executeQuery();
            }//FIN METODO OBTENERNOMBRE MEDICO
            
            public void informeFiltrado(JTable tabla, String especialidad, String nombreMed) throws SQLException {
                agendaMedica();
                DefaultTableModel modelo2 = new DefaultTableModel();
                modelo2.addColumn("Nombre Medico");
                modelo2.addColumn("Fecha");
                modelo2.addColumn("Monto Recaudado");

                ResultSet resultSet = obtenerNombreMedico(especialidad,nombreMed);
                
                while (resultSet.next()) {
                    Object[] fila = new Object[3]; // 7 es el número de columnas en la tabla

                    fila[0] = resultSet.getString("nombreMed");
                    fila[1] = resultSet.getString("fecha");
                    fila[2] = resultSet.getInt("valorConsulta");
                    modelo2.addRow(fila);
                }
                tabla.setModel(modelo2);
                resultSet.close();
                desconectar();
            }//FIN METODO MOSTRAR DATOS
    
    
}//fin clase BD
