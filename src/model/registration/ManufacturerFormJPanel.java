/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.registration;

import classes.Manufacturer;
import javax.swing.JOptionPane;
import util.sql.ManufacturerSqlQuery;

import java.sql.Date;
/**
 *
 * @author sunayanashivanagi
 */
public class ManufacturerFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerFormJPanel
     */
    private boolean validation;
    javax.swing.JSplitPane splitPane;
    public ManufacturerFormJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        this.splitPane=splitPane;
        
        formReset();
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
        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        valName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        valLocation = new javax.swing.JLabel();
        lblTypeOfMedicine = new javax.swing.JLabel();
        lblDateofEst = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        btnReset = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        datechooserDateofEst = new com.toedter.calendar.JDateChooser();
        comboboxMedicine = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        valEmailId = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        valPassword = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        valPhoneNumber = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 51, 153));
        lblHeading.setText("Enter Manufacturer Details");
        jPanel2.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 540, 90));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText("Name");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 290, 30));

        valName.setForeground(new java.awt.Color(255, 61, 0));
        valName.setText("Please enter valid Name");
        jPanel2.add(valName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 290, 20));

        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(102, 102, 102));
        lblLocation.setText("Location");
        jPanel2.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 30));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel2.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 290, 30));

        valLocation.setForeground(new java.awt.Color(255, 61, 0));
        valLocation.setText("Please enter valid Location");
        jPanel2.add(valLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 290, 20));

        lblTypeOfMedicine.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTypeOfMedicine.setForeground(new java.awt.Color(102, 102, 102));
        lblTypeOfMedicine.setText("Type of Medicine");
        jPanel2.add(lblTypeOfMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, 30));

        lblDateofEst.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblDateofEst.setForeground(new java.awt.Color(102, 102, 102));
        lblDateofEst.setText("Date of Establishment");
        jPanel2.add(lblDateofEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 200, 30));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, 90));
        jPanel2.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 190, 0));

        btnReset.setBackground(new java.awt.Color(255, 51, 0));
        btnReset.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Reverse.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.setIconTextGap(10);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, 160, 40));

        btnsubmit.setBackground(new java.awt.Color(0, 153, 0));
        btnsubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Double Tick.png"))); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, 160, 40));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        jPanel2.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 110, 70));
        jPanel2.add(datechooserDateofEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 290, 30));

        comboboxMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablets", "Capsules", "Syrups", "Injections", "Implants", "Ointments", "Vitamins" }));
        comboboxMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxMedicineActionPerformed(evt);
            }
        });
        jPanel2.add(comboboxMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 290, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Manufacturer.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 390, 400));

        lblEmailId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEmailId.setForeground(new java.awt.Color(102, 102, 102));
        lblEmailId.setText("Email Id");
        jPanel2.add(lblEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 70, 30));

        valEmailId.setForeground(new java.awt.Color(255, 61, 0));
        valEmailId.setText("Please enter valid Email Id");
        jPanel2.add(valEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 290, 20));

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 290, 30));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Password");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 110, 30));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 290, 30));

        valPassword.setForeground(new java.awt.Color(255, 61, 0));
        valPassword.setText("Please enter valid Password");
        jPanel2.add(valPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 290, 20));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 290, 30));

        lblPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblPhoneNumber.setText("Phone Number");
        jPanel2.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 140, 30));

        valPhoneNumber.setForeground(new java.awt.Color(255, 61, 0));
        valPhoneNumber.setText("Please enter valid Phone Number");
        jPanel2.add(valPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 290, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
         formReset();
        /**
     * Form reset implementation
     */
    
    }//GEN-LAST:event_btnResetActionPerformed
    private void formReset() 
    {

        txtName.setText("");
        txtLocation.setText("");
        comboboxMedicine.setSelectedItem("");
        datechooserDateofEst.setDate(null);
        txtEmailId.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        
        valName.setText("");
        valLocation.setText("");
        valEmailId.setText("");
        valPassword.setText("");
        valPhoneNumber.setText("");
        
        
    }
    
      /**
     * Validation implementation
     *
     * @return
     */
    private boolean validation() {
        boolean validation = true;
        
        
        valName.setText("");
        valLocation.setText("");
        valEmailId.setText("");
        valPassword.setText("");
        valPhoneNumber.setText("");
                
        
        String Manufacturer_Name = txtName.getText();
        String Manufacturer_Location = txtLocation.getText();
        String Email_Id = txtEmailId.getText();
        String Password = txtPassword.getText();
        String Phone_No = txtPhoneNumber.getText();
       

        System.out.println("Manufacturer Name->" + Manufacturer_Name);

        //Name Validation
        if (Manufacturer_Name.length() <= 0) {
            valName.setText("Please Enter Name");
            validation = false;
        }
        //Location Validation
        if (Manufacturer_Location.length() <= 0) {
            valLocation.setText("Please Enter Location");
            validation = false;
        }
         //Email_Id Validation
        if (Email_Id.length() <= 0) {
            valEmailId.setText("Please Enter EmailId");
            validation = false;
        }
        //Phone_No Validation
        if (Phone_No.length() <= 0) {
            valPhoneNumber.setText("Please Enter Phone_No");
            validation = false;
        }
        //Password Validation
        if (Password.length() <= 0) {
            valPassword.setText("Please Enter Password");
            validation = false;
        }

        return validation;
    }
    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //collecting values
        String Manufacturer_Name = txtName.getText();
        String Manufacturer_Location = txtLocation.getText();
        String Manufacturer_Medicine_Type= " ";
        if(comboboxMedicine.getSelectedIndex()==0) Manufacturer_Medicine_Type = "Tablets";
        if(comboboxMedicine.getSelectedIndex()==1) Manufacturer_Medicine_Type = "Capsules";
        if(comboboxMedicine.getSelectedIndex()==2) Manufacturer_Medicine_Type = "Syrups";
        if(comboboxMedicine.getSelectedIndex()==3) Manufacturer_Medicine_Type = "Injections";
        if(comboboxMedicine.getSelectedIndex()==4) Manufacturer_Medicine_Type = "Implants";
        if(comboboxMedicine.getSelectedIndex()==5) Manufacturer_Medicine_Type = "Ointments";
        if(comboboxMedicine.getSelectedIndex()==6) Manufacturer_Medicine_Type = "Vitamins";
        Date Manufacturer_date = new java.sql.Date(datechooserDateofEst.getDate().getTime());
        String Email_Id = txtEmailId.getText();
        String Phone_No = txtPhoneNumber.getText();
        String Password = txtPassword.getText();
        
        //Database Query Object
        ManufacturerSqlQuery sql = new ManufacturerSqlQuery();
        int result = 0;
        
        
        //Create a manufacturer object
        Manufacturer obj = new Manufacturer();
        
        
        //Fill he object using setter
        obj.setManufacturer_Name(Manufacturer_Name);
        obj.setManufacturer_Location(Manufacturer_Location);
        obj.setType_Of_Medicine(Manufacturer_Medicine_Type);
        obj.setManufacturer_Date_Of_Establishment(Manufacturer_date);
        obj.setEmail_Id(Email_Id);
        obj.setPassword(Password);
        obj.setPhone_No(Phone_No);
        
        if (validation()) {
            result = sql.createManufacturer(obj);        
        }
        if (result == 1) {
            formReset();        
            splitPane.setRightComponent(new SuccessGifJPanel());
        } else {
            validation();
            JOptionPane.showMessageDialog(this, "Manufacturer not created !");

        }

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void comboboxMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxMedicineActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> comboboxMedicine;
    private com.toedter.calendar.JDateChooser datechooserDateofEst;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDateofEst;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTypeOfMedicine;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JLabel valEmailId;
    private javax.swing.JLabel valLocation;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
