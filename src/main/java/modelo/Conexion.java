
package modelo;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    private final String base = "usuarios";
    private final String user = "prueba";
    private final String password = "1234";
    private final String url = "jdbc:sqlserver:sqlsrv\\sqlexpress;databaseName=usuarios" + base;
    
    
    public Connection getConexion()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
