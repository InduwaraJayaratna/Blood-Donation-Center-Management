
package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class MAFeedack {
            public void deleteFeedback(int feedback_id) throws SQLException {
        
        PreparedStatement st = DBConnection.getMyConnection().prepareStatement("DELETE FROM feedbacks WHERE feedback_id = ?");
        st.setInt(1, feedback_id);
        int count = st.executeUpdate();
        
        if (count > 0) {
            JOptionPane.showMessageDialog(null, "Details deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "No records found for deletion.");
        }
    }
}
