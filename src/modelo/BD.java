
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    
    
    
    
    
    
    
}//fin clase BD
