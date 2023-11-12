
package modelo;

import controlador.Usuarios;
import controlador.Agenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vista.AdministradorView;
import vista.MedicoView;
import vista.PacienteView;
import vista.SecretariaView;
import java.util.List;
import java.util.ArrayList;


    public class BD {
        Connection conexion = null;
        //metodos

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
    
        public boolean agendar(Agenda agenda){
        try {
        String SQL = "INSERT INTO agenda_medica(nombreMed,especialidad,status,fecha)values('"+agenda.getNombreMed()+"','"+agenda.getEspecialidad()+"','"+agenda.getStatus()+"','"+agenda.getFecha()+"')";
        Statement s = conexion.createStatement();
        s.executeUpdate( SQL );
        s.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }  //fin metodo agregar



        // METODO PARA INICIAR SESION

    public static void iniciarSesion(String rut, String contrasena) {
           String rol = "";
           String url = "jdbc:mysql://localhost:3306/usuarios_galeno";
           String user = "root";
           String password = "";

           try (Connection conn  = DriverManager.getConnection(url, user, password)) {
               String query = "SELECT rol FROM usuarios WHERE rut = ? AND rut = ?";
               PreparedStatement stmt = conn.prepareStatement(query);
               stmt.setString(1, rut);
               stmt.setString(2, rut);
               ResultSet rs = stmt.executeQuery();

               if (rs.next()) {
                   rol = rs.getString("rol");
               } else {
                   JOptionPane.showMessageDialog(null, "No se encuentra usuario registrado");
                   System.out.println("Credenciales inválidas.");

               }
           } catch (SQLException e) {
               e.printStackTrace();
           }

           // Redirigir según el rol
           switch (rol) {
               case "Paciente":
                   // Abrir pantalla de vista para el Decano
                   PacienteView p = new PacienteView();
                   p.setVisible(true);

                   break;
               case "Medico":
                   // Abrir pantalla de vista para el Profesor
                   MedicoView m = new MedicoView();
                   m.setVisible(true);
                   break;
               case "Secretaria":
                   // Abrir pantalla de vista para el Alumno
                   SecretariaView s = new SecretariaView();
                   s.setVisible(true);
                   break;
               case "administrador":
                    // Abrir pantalla de vista para el Alumno
                    AdministradorView a = new AdministradorView();
                    a.setVisible(true);
                      break;
               default:
                   System.out.println("Rol desconocido. No se puede abrir la pantalla de vista.");
                   break;
               }
           }// fin metodo iniciar sesion 

 
 
    public boolean agregar(Usuarios usuarios ){
        try {
        String SQL = "INSERT INTO usuarios(nombre,apellido,rut,direccion,telefono,correo,rol)values('"+usuarios.getNombre()+"','"+usuarios.getApellido()+"','"+usuarios.getRut()+"','"+usuarios.getDireccion()+"','"+usuarios.getTelefono()+"','"+usuarios.getCorreo()+"','"+usuarios.getRol()+"')";
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

    } catch (Exception e) {
        System.out.println(e);
    }

    return nombresCompletosMedicos;
}
   
    //fin metodo obtenerMedicos
    
    
    
}//fin clase BD
