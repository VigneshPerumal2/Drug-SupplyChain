/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.registration;

import classes.Patient;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import util.sql.MySqlQuery;

/**
 *
 * @author sunayanashivanagi
 */
public class PatientRegFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegFormJPanel
     */
    private boolean validation;
    javax.swing.JSplitPane splitPane;
    public PatientRegFormJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        ButtonGroup bg1 = new ButtonGroup();
        this.splitPane=splitPane;
        bg1.add(radiobtnMale);
        bg1.add(radiobtnFemale);
        bg1.add(radiobtnOthers);

        radiobtnMale.setSelected(true);
        
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

        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        valName = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        valEmailId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        valPhoneNumber = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        spinnerAge = new javax.swing.JSpinner();
        lblRace = new javax.swing.JLabel();
        drpRace = new javax.swing.JComboBox<>();
        lblSex = new javax.swing.JLabel();
        radiobtnOthers = new javax.swing.JRadioButton();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnFemale = new javax.swing.JRadioButton();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        valLocation = new javax.swing.JLabel();
        lblAilments = new javax.swing.JLabel();
        txtAilments = new javax.swing.JTextField();
        valAilments = new javax.swing.JLabel();
        lbladdWallet = new javax.swing.JLabel();
        txtWallet = new javax.swing.JTextField();
        valAmount = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        btnReset = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 51, 153));
        lblHeading.setText("Enter Patient Details");
        add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 470, 90));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 290, 30));

        valName.setForeground(new java.awt.Color(255, 61, 0));
        valName.setText("Please enter valid Name");
        add(valName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 290, 20));

        lblEmailId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEmailId.setForeground(new java.awt.Color(102, 102, 102));
        lblEmailId.setText("Email Id");
        add(lblEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 70, 30));

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 290, 30));

        valEmailId.setForeground(new java.awt.Color(255, 61, 0));
        valEmailId.setText("Please enter valid Email Id");
        add(valEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 290, 20));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 110, 30));

        valPassword.setForeground(new java.awt.Color(255, 61, 0));
        valPassword.setText("Please enter valid Password");
        add(valPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 290, 20));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 290, 30));

        lblPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblPhoneNumber.setText("Phone Number");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 140, 30));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 290, 30));

        valPhoneNumber.setForeground(new java.awt.Color(255, 61, 0));
        valPhoneNumber.setText("Please enter valid Phone Number");
        add(valPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 290, 20));

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(102, 102, 102));
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 70, 30));

        spinnerAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 80, 1));
        add(spinnerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 30));

        lblRace.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblRace.setForeground(new java.awt.Color(102, 102, 102));
        lblRace.setText("Race");
        add(lblRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 70, 30));

        drpRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asian", "American", "Hispanic", "African" }));
        add(drpRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 200, 30));

        lblSex.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblSex.setForeground(new java.awt.Color(102, 102, 102));
        lblSex.setText("Gender");
        add(lblSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 70, 30));

        radiobtnOthers.setText("Others");
        radiobtnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnOthersActionPerformed(evt);
            }
        });
        add(radiobtnOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        radiobtnMale.setText("Male");
        radiobtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnMaleActionPerformed(evt);
            }
        });
        add(radiobtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        radiobtnFemale.setText("Female");
        radiobtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnFemaleActionPerformed(evt);
            }
        });
        add(radiobtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(102, 102, 102));
        lblLocation.setText("Location");
        add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 140, 30));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 290, 30));

        valLocation.setForeground(new java.awt.Color(255, 61, 0));
        valLocation.setText("Please enter valid Location");
        add(valLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 290, 20));

        lblAilments.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAilments.setForeground(new java.awt.Color(102, 102, 102));
        lblAilments.setText("Ailments");
        add(lblAilments, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 140, 30));

        txtAilments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAilmentsActionPerformed(evt);
            }
        });
        add(txtAilments, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 290, 30));

        valAilments.setForeground(new java.awt.Color(255, 61, 0));
        valAilments.setText("Please enter valid Ailments");
        add(valAilments, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 290, 20));

        lbladdWallet.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbladdWallet.setForeground(new java.awt.Color(102, 102, 102));
        lbladdWallet.setText("Add Wallet");
        add(lbladdWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 140, 30));

        txtWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWalletActionPerformed(evt);
            }
        });
        add(txtWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 200, 30));

        valAmount.setForeground(new java.awt.Color(255, 61, 0));
        valAmount.setText("Please enter valid Amount");
        add(valAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 290, 20));
        add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 710, -1, 90));
        add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 190, 0));

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
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 160, 40));

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
        add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 160, 40));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 110, 70));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Doctor and patient.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void radiobtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnMaleActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtAilmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAilmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAilmentsActionPerformed

    private void radiobtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnFemaleActionPerformed

    private void radiobtnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnOthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnOthersActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        
        //collecting values
        String Patient_Name = txtName.getText();
        int Patient_Age = (int) spinnerAge.getValue();
        String Patient_Race = String.valueOf(drpRace.getSelectedItem());
        String gender="";
        if (radiobtnFemale.isSelected()) {
             gender = radiobtnFemale.getText();
        } else if (radiobtnMale.isSelected()) {
             gender = radiobtnMale.getText();
        } else if (radiobtnOthers.isSelected()) {
              gender = radiobtnOthers.getText();
        }
        String Patient_Location = txtLocation.getText();
        String Ailments = txtAilments.getText();
        String Email_Id = txtEmailId.getText();
        String Phone_No = txtPhoneNumber.getText();
        String Password = txtPassword.getText();
        
        //Database Query Object
        MySqlQuery mySqlQuery = new MySqlQuery();
        int result = 0;
        
        
        //Create a patient object
        Patient obj = new Patient();
        
        
        //
        obj.setAilments(Ailments);
        obj.setEmail_Id(Email_Id);
        obj.setPassword(Password);
        obj.setPatient_Age(Patient_Age);
        obj.setPatient_Gender(gender);
        obj.setPatient_Location(Patient_Location);
        obj.setPatient_Name(Patient_Name);
        obj.setPatient_Race(Patient_Race);
        obj.setPhone_No(Phone_No);
        
        if (validation()) {
            result = mySqlQuery.createPatient(obj);        
        }
        if (result == 1) {
            formReset();        
            splitPane.setRightComponent(new SuccessGifJPanel());
        } else {
            validation();
            JOptionPane.showMessageDialog(this, "Patient not created !");

        }

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        formReset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWalletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWalletActionPerformed
    /**
     * Form reset implementation
     */
    private void formReset() {

        txtName.setText("");
        txtAilments.setText("");
        txtEmailId.setText("");
        txtLocation.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        txtWallet.setText("");

        valName.setText("");
        valPassword.setText("");
        valAilments.setText("");
        valEmailId.setText("");
        valLocation.setText("");
        valPhoneNumber.setText("");
        valAmount.setText("");

    }

    /**
     * Validation implementation
     *
     * @return
     */
    private boolean validation() {
        boolean validation = true;
        
        
        valName.setText("");
        valPassword.setText("");
        valAilments.setText("");
        valEmailId.setText("");
        valLocation.setText("");
        valPhoneNumber.setText("");
        valAmount.setText("");
        
        
        String Patient_Name = txtName.getText();
        String Patient_Location = txtLocation.getText();
        String Email_Id = txtEmailId.getText();
        String Phone_No = txtPhoneNumber.getText();
        String Password = txtPassword.getText();
        String Ailments = txtAilments.getText();
        String Wallet = txtWallet.getText();
        String location = txtLocation.getText();

        System.out.println("Patient Name->" + Patient_Name);

        //Name Validation
        if (Patient_Name.length() <= 0) {
            valName.setText("Please Enter Name");
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
        //Ailments Validation
        if (Ailments.length() <= 0) {
            valAilments.setText("Please Enter Ailments");
            validation = false;
        }
        //Wallet Validation
        if (Wallet.length() <= 0) {
            valAmount.setText("Please Enter Wallet");
            validation = false;
        }
        //Location Validation
        if (location.length() <= 0) {
            valLocation.setText("Please Enter Location");
            validation = false;
        }

        return validation;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> drpRace;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAilments;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lbladdWallet;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JRadioButton radiobtnOthers;
    private javax.swing.JSpinner spinnerAge;
    private javax.swing.JTextField txtAilments;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtWallet;
    private javax.swing.JLabel valAilments;
    private javax.swing.JLabel valAmount;
    private javax.swing.JLabel valEmailId;
    private javax.swing.JLabel valLocation;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
