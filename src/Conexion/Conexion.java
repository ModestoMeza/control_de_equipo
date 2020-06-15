package Conexion;

import java.sql.*;

public class Conexion {
    
    
    Connection conn = null;
    
    
    public Conexion(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/control_inventario","root","");
            System.out.println("Exito Consulta Realizada");
        }catch(SQLException e){
            System.out.println(e);
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }      
}
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
 conn = null;       
    }
}
    

