
package model;

import java.sql.*;
import javax.swing.JOptionPane;
public class MADDataDelete {
    public void delete_appointment(int a_id) throws SQLException {
        
        PreparedStatement st = DBConnection.getMyConnection().prepareStatement("DELETE FROM appointment WHERE a_id = ?");
        st.setInt(1, a_id);
        int count = st.executeUpdate();
        
        if (count > 0) {
            JOptionPane.showMessageDialog(null, "Details deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "No records found for deletion.");
        }
    }
}
