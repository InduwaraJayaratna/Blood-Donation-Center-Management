package control;
import java.sql.*;
import model.*;
public class CADonatonDelete {
    public void deleteDonation(int d_id) throws SQLException{
            
            MADonationDelete mcd = new MADonationDelete();
            mcd.deleteDonation(d_id);
        
        }
}
