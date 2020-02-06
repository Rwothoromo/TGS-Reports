package auth;

import database.Connect;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    String superuser;
    String TGSuser;

    public Login() {    //constructor because method name is same as class name
        initComponents();
        conn = Connect.dbConnector();
    }

    /**
     * This method is called FROM within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *///Do not touch or delete
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        btnLoginAdmin = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jLabelSystemName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Testimonial Generating System - Login");
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));

        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 36), new java.awt.Color(0, 51, 51))); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setText("Password :");

        btnLogin.setBackground(new java.awt.Color(255, 51, 51));
        btnLogin.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabelId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelId.setText("IDNO :");

        btnLoginAdmin.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        btnLoginAdmin.setText("Admin Login");
        btnLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdminActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoginAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword)
                            .addComponent(jLabelId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtId)))))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kyuLogo.png"))); // NOI18N

        jLabelSystemName.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelSystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSystemName.setText("TESTIMONIAL GENERATING SYSTEM");
        jLabelSystemName.setToolTipText("TGS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelLogo)
                .addGap(18, 18, 18)
                .addComponent(jLabelSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(960, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String Id = txtId.getText().trim().toUpperCase();
        String Password = txtPassword.getText().trim();
        String sqlQuery = "SELECT * FROM user_table WHERE Id=? AND Password=?";

        try {
            // For alternative way, see ChangePassword.java
            PreparedStatement ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, Id); //Id is the 1st argument in our query hence use 1
            ps.setString(2, Password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) { //if successful login
                TGSuser = rs.getString(2) + " " + rs.getString(4);
                dispose();
                user.Dashboard dashboard = new user.Dashboard();
                dashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Details!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdminActionPerformed
        String Id = txtId.getText().trim().toUpperCase();
        String Password = txtPassword.getText().trim();
        String sqlQuery = "SELECT * FROM super_user WHERE Id=? AND Password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, Id);
            ps.setString(2, Password);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    superuser = rs.getString(2) + " " + rs.getString(4);
                    dispose();
                    admin.Dashboard dashboard = new admin.Dashboard();
                    dashboard.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Details!");
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLoginAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginAdmin;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSystemName;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
