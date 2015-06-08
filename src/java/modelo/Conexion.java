package modelo;

import java.sql.*;

public class Conexion {

    private Connection conn;
    private Statement state;
    
    public void conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
        }
    }
    
}
 