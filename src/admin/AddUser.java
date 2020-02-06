package admin;

import database.Connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rwothoromo
 */
public class AddUser extends javax.swing.JFrame {

    Connection conn = null;

    /**
     * Class constructor.
     */
    public AddUser() {
        initComponents();
        conn = Connect.dbConnector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelSystemName = new javax.swing.JLabel();
        jLabelInstructions = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabelFName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        jLabelONames = new javax.swing.JLabel();
        txtONames = new javax.swing.JTextField();
        jLabelPostion = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabelConfirmPassword = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Testimonial Generating System - Add a User");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kyuLogo.png"))); // NOI18N

        jLabelSystemName.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelSystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSystemName.setText("TESTIMONIAL GENERATING SYSTEM");
        jLabelSystemName.setToolTipText("TGS");

        jLabelInstructions.setText("Type the details as required to add the user.");

        jLabelId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelId.setText("IDNO :");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelFName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFName.setText("First Name :");

        txtFName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelONames.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelONames.setText("Other Name(s) :");

        txtONames.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelPostion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPostion.setText("Position :");

        txtPosition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setText("Give Password :");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelConfirmPassword.setText("Confirm Password :");

        txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddUser.setText("Add user");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInstructions)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelConfirmPassword)
                                .addComponent(jLabelPassword)
                                .addComponent(jLabelPostion))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelONames)
                                .addComponent(jLabelFName)
                                .addComponent(jLabelId))
                            .addGap(76, 76, 76)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                .addComponent(txtONames, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(18, 18, 18)
                .addComponent(jLabelSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelInstructions)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtONames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelONames))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPostion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfirmPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Redirects to the user Dashboard
     * <p>
     * This method closes the AddUser user screen and opens the above screen
     *
     * @param evt an ActionEvent
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        Dashboard d = new Dashboard();
        d.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * Adds a user to the user table
     * <p>
     * This method closes adds a user on the AddUser user screen
     *
     * @param evt an ActionEvent
     */
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        String id = txtId.getText();
        String fName = txtFName.getText();
        String oName = txtONames.getText();
        String position = txtPosition.getText();
        String password = txtPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        String sqlAddUser = "insert into users"
                + " (Id, FName, OName, Position, Password)"
                + " values ('" + id + "', '" + fName + "', '"
                + oName + "', '" + position + "', '" + password + "');";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlAddUser);
            if (password.equals(confirmPassword)) {
                ps.execute(sqlAddUser);
                JOptionPane.showMessageDialog(null, "User " + fName + " " + position + " successfully Added!");
            } else {
                JOptionPane.showMessageDialog(null, "You have an error!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DeleteUser().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelFName;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelInstructions;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelONames;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPostion;
    private javax.swing.JLabel jLabelSystemName;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtONames;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables
}
