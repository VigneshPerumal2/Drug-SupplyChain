/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.login;

import javax.swing.JOptionPane;
import util.extras.JHintPasswordTextField;
import util.extras.JHintTextField;
import util.sql.MySqlQuery;

/**
 *
 * @author sunayanashivanagi
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel() {
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

        imgLogo = new javax.swing.JLabel();
        lblEnterCredentials = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        txtEmailId = new JHintTextField("Enter Email ID");
        txtPassword = new JHintPasswordTextField("Enter Password");
        btnRegister = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(0, 200), new java.awt.Dimension(32767, 200));
        EmailId = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        valEmailId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        lblEnterCredentials.setForeground(new java.awt.Color(204, 204, 204));
        lblEnterCredentials.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterCredentials.setText("Please enter your credentials");
        add(lblEnterCredentials, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 30));

        lblWelcome.setFont(new java.awt.Font("Zapfino", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 51, 153));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome !");
        add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 400, 80));

        txtEmailId.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 360, 60));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 360, 60));

        btnRegister.setBackground(new java.awt.Color(0, 51, 153));
        btnRegister.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Add User Male.png"))); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 130, 50));

        btnSignIn.setBackground(new java.awt.Color(255, 61, 0));
        btnSignIn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Forward.png"))); // NOI18N
        btnSignIn.setText("SIGN IN");
        btnSignIn.setBorderPainted(false);
        btnSignIn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSignIn.setMixingCutoutShape(null);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 120, 50));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, 270));

        EmailId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        EmailId.setText("Email ID");
        add(EmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 340, 270, 40));

        Password.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Password.setText("Password");
        add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 350, 30));

        valPassword.setForeground(new java.awt.Color(255, 61, 0));
        valPassword.setText("Please enter valid Password");
        add(valPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        valEmailId.setForeground(new java.awt.Color(255, 61, 0));
        valEmailId.setText("Please enter valid Email Id");
        add(valEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        MySqlQuery sql= new MySqlQuery();
        int x =sql.registerPatient();
        if(x==1){
            JOptionPane.showMessageDialog(this, "User Created");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailId;
    private javax.swing.JLabel Password;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSignIn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel lblEnterCredentials;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel valEmailId;
    private javax.swing.JLabel valPassword;
    // End of variables declaration//GEN-END:variables
}
