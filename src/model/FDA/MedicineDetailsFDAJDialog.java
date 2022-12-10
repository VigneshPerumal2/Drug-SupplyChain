/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package model.FDA;

import util.extras.*;

/**
 *
 * @author sunayanashivanagi
 */
public class MedicineDetailsFDAJDialog extends javax.swing.JDialog {

    /**
     * Creates new form MedicineDetailsJDialog
     */
    public MedicineDetailsFDAJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lblMedicineDetails = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lclMedicineName = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblDOM = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblShellL = new javax.swing.JLabel();
        lblShellLife = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        lblManu = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        lblIng = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMedicineDetails.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicineDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblMedicineDetails.setForeground(new java.awt.Color(102, 102, 102));
        lblMedicineDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicineDetails.setText("Medicine Details");
        getContentPane().add(lblMedicineDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 45));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText(" Name - ");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lclMedicineName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lclMedicineName.setForeground(new java.awt.Color(102, 0, 153));
        lclMedicineName.setText("{Medicine Name}");
        getContentPane().add(lclMedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblCat.setForeground(new java.awt.Color(102, 102, 102));
        lblCat.setText("Category - ");
        getContentPane().add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        lblCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(102, 0, 153));
        lblCategory.setText("{Medicine Name}");
        getContentPane().add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lblDOM.setForeground(new java.awt.Color(102, 102, 102));
        lblDOM.setText("Date of Manufacturing - ");
        getContentPane().add(lblDOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblDate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDate.setForeground(new java.awt.Color(102, 0, 153));
        lblDate.setText("{Medicine Name}");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        lblShellL.setForeground(new java.awt.Color(102, 102, 102));
        lblShellL.setText("Shell Life - ");
        getContentPane().add(lblShellL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblShellLife.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblShellLife.setForeground(new java.awt.Color(102, 0, 153));
        lblShellLife.setText("{Medicine Name}");
        getContentPane().add(lblShellLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        btnReject.setBackground(new java.awt.Color(255, 51, 0));
        btnReject.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Unavailable.png"))); // NOI18N
        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        getContentPane().add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 110, 30));

        btnAccept.setBackground(new java.awt.Color(0, 153, 51));
        btnAccept.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Approval.png"))); // NOI18N
        btnAccept.setText("ACCEPT");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 110, 30));

        lblManu.setForeground(new java.awt.Color(102, 102, 102));
        lblManu.setText("Manufacturer - ");
        getContentPane().add(lblManu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lblManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblManufacturer.setForeground(new java.awt.Color(102, 0, 153));
        lblManufacturer.setText("{Medicine Name}");
        getContentPane().add(lblManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        lblIng.setForeground(new java.awt.Color(102, 102, 102));
        lblIng.setText("Ingredients - ");
        getContentPane().add(lblIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 260, 110));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 245, -1, 60));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 20, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcceptActionPerformed

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
            java.util.logging.Logger.getLogger(MedicineDetailsFDAJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineDetailsFDAJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineDetailsFDAJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineDetailsFDAJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MedicineDetailsFDAJDialog dialog = new MedicineDetailsFDAJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDOM;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblIng;
    private javax.swing.JLabel lblManu;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblMedicineDetails;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblShellL;
    private javax.swing.JLabel lblShellLife;
    private javax.swing.JLabel lclMedicineName;
    // End of variables declaration//GEN-END:variables
}
