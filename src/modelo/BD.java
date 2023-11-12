
package modelo;

import controlador.*;
import java.sql.*;
import javax.swing.JOptionPane;
import vista.*;
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
