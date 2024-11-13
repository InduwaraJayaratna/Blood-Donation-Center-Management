package model;
import view.DFeedback;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import view.DLogin;

public class MDFeedback {
    public ResultSet getUserID() throws SQLException {
        Statement st = DBConnection.getMyConnection().createStatement();
        ResultSet rst = st.executeQuery("Select user_id from user where email='" + DLogin.email + "'");
        return rst;
    }
}
