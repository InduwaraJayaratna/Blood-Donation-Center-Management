/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.SQLException;
import model.MAFeedack;
public class CAFeedback {
        public void deleteFeedback(int feedback_id) throws SQLException{
            
            MAFeedack mcd = new MAFeedack();
            mcd.deleteFeedback(feedback_id);
        
        }
}
