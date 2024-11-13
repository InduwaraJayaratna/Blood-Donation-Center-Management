
package model;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MADInfo {
    public void updateUser(int user_id, String email, String name, String gender,String dob,String blood_group,String pass) throws SQLException{
        
        PreparedStatement st = DBConnection.getMyConnection().prepareStatement("UPDATE user SET email = ?, name = ?, gender = ?, dob = ?, blood_group = ?, pass = ? WHERE user_id = ?;");
        st.setString(1,email);
        st.setString(2,name);
        st.setString(3,gender);
        st.setString(4,dob);
        st.setString(5,blood_group);
        st.setString(6,pass);
        st.setInt(7,user_id);
        int count = st.executeUpdate();
        
        if(count > 0){
            JOptionPane.showMessageDialog(null, "Details updated Successfully added.");
        }
        else{
            JOptionPane.showMessageDialog(new JFrame(), "Wrong data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
