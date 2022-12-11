/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.hospital;

import model.main.MainJFrame;

/**
 *
 * @author sunayanashivanagi
 */
public class HospitalSideJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalSideJPanel
     */
    public HospitalSideJPanel() {
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

        lblRoleHeadingDistributor = new javax.swing.JLabel();
        lblavslogod = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        imgDistributor = new javax.swing.JLabel();
        lblGIF = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRoleHeadingDistributor.setBackground(new java.awt.Color(204, 204, 255));
        lblRoleHeadingDistributor.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        lblRoleHeadingDistributor.setForeground(new java.awt.Color(102, 102, 102));
        lblRoleHeadingDistributor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoleHeadingDistributor.setText("Hospital Dashboard");
        add(lblRoleHeadingDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 400, 50));

        lblavslogod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavslogod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(lblavslogod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 110, 70));

        lblUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 51, 153));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("SUNAINA");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 400, 40));

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Shutdown.png"))); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 140, 40));

        imgDistributor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/HospitalL.jpg"))); // NOI18N
        add(imgDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 400, 240));

        lblGIF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/WelcomeIS.gif"))); // NOI18N
        add(lblGIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel imgDistributor;
    private javax.swing.JLabel lblGIF;
    private javax.swing.JLabel lblRoleHeadingDistributor;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblavslogod;
    // End of variables declaration//GEN-END:variables
}
