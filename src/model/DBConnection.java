package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnection {
    private static Connection con;
    public static Connection getMyConnection()
    {
        try{
        String dbpath="jdbc:mysql://localhost/life";
        con=DriverManager.getConnection(dbpath,"root","");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
