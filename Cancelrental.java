
package VRSgui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import VRSgui.VehiclesUi;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Cancelrental extends javax.swing.JFrame {

    public Cancelrental() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancelrental = new javax.swing.JButton();
        homebtnREC = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        clientid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        canceldate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CANCEL RENTAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        cancelrental.setBackground(new java.awt.Color(204, 204, 204));
        cancelrental.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 16)); // NOI18N
        cancelrental.setText("CANCEL RENTAL");
        cancelrental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelrentalActionPerformed(evt);
            }
        });

        homebtnREC.setBackground(new java.awt.Color(204, 204, 204));
        homebtnREC.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        homebtnREC.setForeground(new java.awt.Color(0, 0, 102));
        homebtnREC.setText("HOME");
        homebtnREC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnRECActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(204, 204, 204));
        exitbtn.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(0, 0, 102));
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        jLabel3.setText("Client ID:");

        clientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        jLabel4.setText("Date of cancellation: ");

        canceldate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceldateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelrental, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(exitbtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(homebtnREC))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clientid)))
                                .addGap(0, 1, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(canceldate)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(homebtnREC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clientid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(canceldate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(cancelrental, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnRECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnRECActionPerformed
        userOrAdmin next = new userOrAdmin ();
        next.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_homebtnRECActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        exitSystem next = new exitSystem();
        next.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_exitbtnActionPerformed

    private void cancelrentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelrentalActionPerformed
      String clientId = clientid.getText();  // Get client ID from the input field
    String cancelDateInput = canceldate.getText();  // Get cancellation date input
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  // Define date format

    if (clientId == null || clientId.isEmpty() || cancelDateInput == null || cancelDateInput.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Client ID and cancellation date are required.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclerentalsystem", "root", "")) {
        // Check if client ID exists in the reciept table
        String checkClientQuery = "SELECT rentalStart FROM reciept WHERE clientId = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkClientQuery)) {
            checkStmt.setString(1, clientId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Get rental start date from the database
                String rentalStart = rs.getString("rentalStart");
                if (rentalStart == null || rentalStart.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Rental start date not found for the given Client ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                java.util.Date rentalStartDate = dateFormat.parse(rentalStart);
                java.util.Date cancelDate = dateFormat.parse(cancelDateInput);

                // Compare dates
                if (cancelDate.before(rentalStartDate)) {
                    // Cancel the reservation
                    String deleteQuery = "DELETE FROM reciept WHERE clientId = ?";
                    try (PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {
                        deleteStmt.setString(1, clientId);
                        deleteStmt.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Reservation canceled successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Cancellation date must be earlier than the rental start date.", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Client ID does not exist in the receipt table.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use 'yyyy-MM-dd'.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_cancelrentalActionPerformed

    private void clientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientidActionPerformed

    private void canceldateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceldateActionPerformed
      
    }//GEN-LAST:event_canceldateActionPerformed

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
            java.util.logging.Logger.getLogger(Cancelrental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancelrental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancelrental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancelrental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancelrental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField canceldate;
    private javax.swing.JButton cancelrental;
    private javax.swing.JTextField clientid;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton homebtnREC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    // End of variables declaration//GEN-END:variables
}
