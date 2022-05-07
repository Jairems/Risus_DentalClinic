package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String base = "Risus_Dent";
    //private final String timezone = "serverTimezone=UTC";
    private final String user = "postgres";
    private final String password = "TheonePostgre"; /* Verificar contraseña */
    private final String url = "jdbc:postgresql://localhost:5432/" + base;
    private final String driver = "org.postgresql.Driver";
    private Connection con = null;

    public Connection getConexion()
    {
        try
        {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            if (!con.isClosed())
                System.out.println("Conexión Realizada Crack!");
        }
        catch(SQLException e)
        {
            System.err.println(e);
        }
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    /*public void close(ResultSet result){
        try {
            result.close();
            System.out.println("Result cerrado Crack!");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }*/

    public void close(PreparedStatement state){
        try {
            state.close();
            System.out.println("PState cerrado Crack!");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void close(Connection conect){
        try {
            conect.close();
            System.out.println("Conect cerrado Crack!");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
