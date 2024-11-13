
package control;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.*;

public class CADInfo {
    public void updateUser(int user_id, String email, String name, String gender,String dob,String blood_group,String pass) throws SQLException{
            MADInfo muc = new MADInfo();
            muc.updateUser(user_id,email,name,gender,dob, blood_group, pass);
    }
}
