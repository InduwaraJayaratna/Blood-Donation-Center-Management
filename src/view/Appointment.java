/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Component;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DBConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static view.Reg.gender;

/**
 *
 * @author User
 */
public class Appointment extends javax.swing.JFrame {
String email,name;
    /**
     * Creates new form Appointment
     */
    public Appointment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtE = new javax.swing.JTextField();
        cC = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        cB = new javax.swing.JComboBox<>();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 50));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Center");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 33));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood Group");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        txtN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNActionPerformed(evt);
            }
        });
        getContentPane().add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 582, -1));

        txtE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEActionPerformed(evt);
            }
        });
        getContentPane().add(txtE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 582, -1));

        cC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cC.setForeground(new java.awt.Color(204, 0, 0));
        cC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Center>", "Panadura", "Kandana", "Gampaha", "Kadawatha" }));
        cC.setBorder(null);
        getContentPane().add(cC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 580, 35));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Schedule >>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 218, 49));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setText("<<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 140, 50));

        lbl1.setText("jLabel7");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 556, -1, 30));

        cB.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        cB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Blood Group>", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        cB.setToolTipText("");
        cB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBActionPerformed(evt);
            }
        });
        getContentPane().add(cB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 196, 32));
        getContentPane().add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 300, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("F:\\DSE224\\EAD\\Activity\\CourseWork\\Coursework\\src\\Appointment.png")); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 0, 0), null, null));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNActionPerformed

    private void txtEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String email,dob,pass,repass;  
        String fullName = txtN.getText().trim();
       
        email = txtE.getText().trim();
        Component frame = null;
        
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        // Regular expression for letters-only validation
        String lettersOnlyRegex = "^[a-zA-Z\\s]+$";
        
        try {
    if (!matcher.matches()) {
     JOptionPane.showMessageDialog(frame, "Invalid email format", "Error", JOptionPane.ERROR_MESSAGE);
     }
    else if (!fullName.matches(lettersOnlyRegex)) {
        JOptionPane.showMessageDialog(new JFrame(), "Full Name should contain only letters", "Error", JOptionPane.ERROR_MESSAGE);
        // You might want to clear the text field or take appropriate action here
    }
    else if ("".equals(txtE.getText())) {
        JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
    } else if ("".equals(txtN.getText())) {
        JOptionPane.showMessageDialog(new JFrame(), "Full Name is required", "Error", JOptionPane.ERROR_MESSAGE);
    }else if (cC.getSelectedIndex() == -1 || cC.getSelectedIndex() == 0) {
        // No blood type selected, show an error message
        JOptionPane.showMessageDialog(new JFrame(), "Please select your Center", "Error", JOptionPane.ERROR_MESSAGE);
    }else if (date_chooser.getDate() == null) {
        JOptionPane.showMessageDialog(new JFrame(), "Date is required", "Error", JOptionPane.ERROR_MESSAGE);
    }else if (cB.getSelectedIndex() == -1 || cB.getSelectedIndex() == 0) {
        // No blood type selected, show an error message
        JOptionPane.showMessageDialog(new JFrame(), "Please select your Blood Type", "Error", JOptionPane.ERROR_MESSAGE);
    }  else {
        int user_id = Integer.parseInt(lbl1.getText());
        String query = "INSERT INTO appointment(user_id, center, date, blood_type) VALUES(?, ?, ?, ?)";
            PreparedStatement preparedStatement= DBConnection.getMyConnection().prepareStatement(query); 
            preparedStatement.setInt(1, user_id);
            preparedStatement.setString(2, cC.getSelectedItem().toString());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dobText = dateFormat.format( date_chooser.getDate());
            preparedStatement.setString(3, dobText);
            preparedStatement.setString(4, cB.getSelectedItem().toString());
           int rowsAffected = preparedStatement.executeUpdate();
        
            
        // Clear form fields
       if (rowsAffected > 0) {
            // Clear form fields
            this.dispose();
            new AppointmentConfirmation().setVisible(true);
        } 
       else {
            JOptionPane.showMessageDialog(new JFrame(), "Error in database operation", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }
        
    } 
        catch (SQLException e) {
        JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    // Handle SQL exception
    
    e.printStackTrace();
    }

        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           System.out.println("Error! " + e.getMessage()); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int notFound=0;
        try {
            Statement st1 = DBConnection.getMyConnection().createStatement();
            email = txtE.getText();
            name = txtN.getText();
            
           String queryN = "SELECT name,user_id FROM user WHERE email= '"+DLogin.email+"';";
            txtE.setText(DLogin.email);
            ResultSet rs = st1.executeQuery(queryN);
            while(rs.next()){
                txtN.setText(rs.getString("name"));
                lbl1.setText(String.valueOf(rs.getInt("user_id")));
            }
               
        }catch(Exception e){
           System.out.println("Error!" + e.getMessage()); 
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cB;
    private javax.swing.JComboBox<String> cC;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTextField txtE;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
