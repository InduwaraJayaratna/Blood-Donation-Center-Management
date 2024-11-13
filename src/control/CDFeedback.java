package control;
import model.*;
import java.sql.*;
public class CDFeedback {
        public int userID(int user_id) throws SQLException
        {
            try 
            {
            MDFeedback mdf = new MDFeedback();
            ResultSet resultSet = mdf.getUserID();

            if (resultSet.next()) {
                return resultSet.getInt("user_id");
            }
            return -1;

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } 
            
        }

    public int getUserID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
