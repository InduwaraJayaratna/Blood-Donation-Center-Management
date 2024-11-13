package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class MADonationDelete {
    public void deleteDonation(int d_id) throws SQLException {
        
        PreparedStatement st = DBConnection.getMyConnection().prepareStatement("DELETE FROM donation WHERE donate_id = ?");
        st.setInt(1, d_id);
        int count = st.executeUpdate();
        
        if (count > 0) {
            JOptionPane.showMessageDialog(null, "Details deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "No records found for deletion.");
        }
    }
}
