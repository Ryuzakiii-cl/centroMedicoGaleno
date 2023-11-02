
package modelo;
import controlador.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vista.MedicoView;
import vista.PacienteView;
import vista.SecretariaView;

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
            System.out.println("No se pudo conectar la base de datos");
            System.out.println(e.getMessage());
        }       
    }//fin metodo conectar
    
    
    
    // METODO PARA INICIAR SESION

 public static void iniciarSesion(String correo, String contrasena) {
        String rol = "";
        String url = "jdbc:mysql://localhost:3306/usuarios_galeno";
        String user = "root";
        String password = "";
        
        try (Connection conn  = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT rol FROM usuarios WHERE correo = ? AND correo = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, correo);
            stmt.setString(2, correo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                rol = rs.getString("rol");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario Desconocido Cerrando Programa");
                System.out.println("Credenciales inválidas. Inténtelo de nuevo.");
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Redirigir según el rol
        switch (rol) {
            case "paciente":
                // Abrir pantalla de vista para el Decano
                PacienteView p = new PacienteView();
                p.setVisible(true);
                
                break;
            case "medico":
                // Abrir pantalla de vista para el Profesor
                MedicoView m = new MedicoView();
                m.setVisible(true);
                break;
            case "secretaria":
                // Abrir pantalla de vista para el Alumno
                SecretariaView s = new SecretariaView();
                s.setVisible(true);
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
 
 

    
    
    
}//fin clase BD
