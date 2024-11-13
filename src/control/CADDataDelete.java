package control;
import java.sql.*;
import model.*;
public class CADDataDelete {
    public void delete_apoointment(int a_id) throws SQLException{
            
            MADDataDelete mcd = new MADDataDelete();
            mcd.delete_appointment(a_id);
        
        }
    
}
