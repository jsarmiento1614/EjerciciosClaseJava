/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.sqlite.SQLiteDataSource;
/**
 *
 * @author diego
 */
public class Estudiantes {
    DataSource ds;
    Connection conn;

    public Estudiantes() {
        ds = SQLDatasource.getSQLLiteDataSource();
        conn = null;
    }
    
     private Connection connectDB(){
        try {
            conn = this.ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    private void disconnectDB(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getTabla(){
        conn = connectDB();
        String query = "Select * from Estudiantes";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps= conn.prepareStatement(query);
            rs = ps.executeQuery();
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
            disconnectDB(conn);
        }
        return rs;
    }
    
    
    
}
