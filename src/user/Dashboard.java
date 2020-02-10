package user;

import auth.Login;
import utils.Processing;

/**
 *
 * @author rwothoromo
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Class constructor.
     */
    public Dashboard() {
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

        btnProcess = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelSystemName = new javax.swing.JLabel();
        jLabelInstructions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Testimonial Generating System - Logged in as TGSUser");

        btnProcess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProcess.setText("Process Testimonial");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnSignOut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignOut.setText("Sign Out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kyuLogo.png"))); // NOI18N

        jLabelSystemName.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelSystemName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSystemName.setText("TESTIMONIAL GENERATING SYSTEM");
        jLabelSystemName.setToolTipText("TGS");

        jLabelInstructions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInstructions.setText("Select accordingly to perform your desired action.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInstructions)
                    .addComponent(jLabelSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSignOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelLogo)
                .addGap(18, 18, 18)
                .addComponent(jLabelSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelInstructions)
                .addGap(18, 18, 18)
                .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Redirects to testimonial processing screen
     * <p>
     * This method closes the user Dashboard and opens the above screen
     *
     * @param evt an ActionEvent
     */
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        dispose();
        Processing p = new Processing();
        p.setVisible(true);
    }//GEN-LAST:event_btnProcessActionPerformed

    /**
     * Redirects to the password change screen
     * <p>
     * This method closes the user Dashboard and opens the above screen
     *
     * @param evt an ActionEvent
     */
    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        dispose();
        EditPassword ep = new EditPassword();
        ep.setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    /**
     * Redirects to the Login screen
     * <p>
     * This method closes the user Dashboard and opens the above screen
     *
     * @param evt an ActionEvent
     */
    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btnSignOutActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabelInstructions;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSystemName;
    // End of variables declaration//GEN-END:variables
}