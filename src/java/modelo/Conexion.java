package modelo;

import java.sql.*;
import org.apache.jasper.tagplugins.jstl.core.Catch;

public class Conexion {

    private Connection conn;
    private Statement state;
    private Medicamento medicamento = new Medicamento();
    
    public void conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia", "root", null);
            state = conn.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void eliminar(String codigo)
    {
        try {
            conectar();
            state.executeUpdate("DELETE FROM medicamento WHERE codigo ='"+codigo+"';");
            conn.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public void insertar(String codigo, String farmaco,int precio)
    {
        try {
            conectar();
            state.executeUpdate("INSERT INTO medicamento VALUES('"
                                    +codigo +"','"
                                    +farmaco+"','"
                                    +precio +"');");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    //INSERT RECEIVING An object
    
    public void insertObject (Medicamento objeto)
    {
        try {
            conectar();
            state.executeUpdate("INSERT INTO medicamento VALUES('"
                    +objeto.getFarmaco()+"','"
                    +objeto.getCodigo()+"','"
                    +objeto.getPrecio()+"')");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    
    public Medicamento buscar(String codigo){
        Medicamento medicamento = new Medicamento();
        
        try {
            conectar();;
            ResultSet rs = state.executeQuery("SELECT * FROM medicamento WHERE codigo = '"+codigo+"';");
            while (rs.next()) {
                medicamento.setCodigo((String)rs.getObject(1));
                medicamento.setCodigo((String)rs.getObject(2));
                medicamento.setPrecio((Integer)rs.getObject(3));
            }
            conn.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return medicamento;
    }
}
 