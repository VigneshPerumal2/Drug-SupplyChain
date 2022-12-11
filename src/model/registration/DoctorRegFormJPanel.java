/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.registration;


import classes.Doctor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.sendmail.testEmail;
import util.sql.DoctorSqlQuery;

/**
 *
 * @author sunayanashivanagi
 */
public class DoctorRegFormJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRegFormJPanel
     */
    private boolean validation;
    javax.swing.JSplitPane splitPane;
    public DoctorRegFormJPanel(javax.swing.JSplitPane splitPane) {
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

        jPanel2 = new javax.swing.JPanel();
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
        lblGender = new javax.swing.JLabel();
        radiobtnOthers = new javax.swing.JRadioButton();
        radiobtnMale = new javax.swing.JRadioButton();
        radiobtnFemale = new javax.swing.JRadioButton();
        lblLocation = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        valLocation = new javax.swing.JLabel();
        lblSpeciality = new javax.swing.JLabel();
        txtSpeciality = new javax.swing.JTextField();
        valAilments = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        btnReset = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 51, 153));
        lblHeading.setText("Enter Doctor Details");
        jPanel2.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 470, 90));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText("Name");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 290, 30));

        valName.setForeground(new java.awt.Color(255, 61, 0));
        valName.setText("Please enter valid Name");
        jPanel2.add(valName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 290, 20));

        lblEmailId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblEmailId.setForeground(new java.awt.Color(102, 102, 102));
        lblEmailId.setText("Email Id");
        jPanel2.add(lblEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 70, 30));

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 290, 30));

        valEmailId.setForeground(new java.awt.Color(255, 61, 0));
        valEmailId.setText("Please enter valid Email Id");
        jPanel2.add(valEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 290, 20));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Password");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 110, 30));

        valPassword.setForeground(new java.awt.Color(255, 61, 0));
        valPassword.setText("Please enter valid Password");
        jPanel2.add(valPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 290, 20));

        txtPassword.setText("jPasswordField1");
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 290, 30));

        lblPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblPhoneNumber.setText("Phone Number");
        jPanel2.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 140, 30));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 290, 30));

        valPhoneNumber.setForeground(new java.awt.Color(255, 61, 0));
        valPhoneNumber.setText("Please enter valid Phone Number");
        jPanel2.add(valPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 290, 20));

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(102, 102, 102));
        lblAge.setText("Age");
        jPanel2.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 70, 30));

        spinnerAge.setModel(new javax.swing.SpinnerNumberModel(24, 24, 80, 1));
        jPanel2.add(spinnerAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 30));

        lblRace.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblRace.setForeground(new java.awt.Color(102, 102, 102));
        lblRace.setText("Race");
        jPanel2.add(lblRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 70, 30));

        drpRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asian", "African", "American", "European", "Hispanic" }));
        jPanel2.add(drpRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 200, 30));

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(102, 102, 102));
        lblGender.setText("Gender");
        jPanel2.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 70, 30));

        radiobtnOthers.setText("Others");
        radiobtnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnOthersActionPerformed(evt);
            }
        });
        jPanel2.add(radiobtnOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        radiobtnMale.setText("Male");
        radiobtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnMaleActionPerformed(evt);
            }
        });
        jPanel2.add(radiobtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        radiobtnFemale.setText("Female");
        radiobtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnFemaleActionPerformed(evt);
            }
        });
        jPanel2.add(radiobtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        lblLocation.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(102, 102, 102));
        lblLocation.setText("Location");
        jPanel2.add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 140, 30));

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel2.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 290, 30));

        valLocation.setForeground(new java.awt.Color(255, 61, 0));
        valLocation.setText("Please enter valid Location");
        jPanel2.add(valLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 290, 20));

        lblSpeciality.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblSpeciality.setForeground(new java.awt.Color(102, 102, 102));
        lblSpeciality.setText("Speciality");
        jPanel2.add(lblSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 140, 30));

        txtSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialityActionPerformed(evt);
            }
        });
        jPanel2.add(txtSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 290, 30));

        valAilments.setForeground(new java.awt.Color(255, 61, 0));
        valAilments.setText("Please enter valid Speciality");
        jPanel2.add(valAilments, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 290, 20));
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
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 160, 40));

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
        jPanel2.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 160, 40));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N
        jPanel2.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 110, 70));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/DoctorReg.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 190));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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

    private void radiobtnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnOthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnOthersActionPerformed

    private void radiobtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnMaleActionPerformed

    private void radiobtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnFemaleActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialityActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
      String Doctor_Name = txtName.getText();
        int Doctor_Age = (int) spinnerAge.getValue();
        String Doctor_Race = String.valueOf(drpRace.getSelectedItem());
        String gender="";
        if (radiobtnFemale.isSelected()) {
             gender = radiobtnFemale.getText();
        } else if (radiobtnMale.isSelected()) {
             gender = radiobtnMale.getText();
        } else if (radiobtnOthers.isSelected()) {
             gender = radiobtnOthers.getText();
        }
        String Doctor_Location = txtLocation.getText();
        String Speciality = txtSpeciality.getText();
        String Email_Id = txtEmailId.getText();
        String Phone_No = txtPhoneNumber.getText();
        String Password = txtPassword.getText(); 
        
        
        //Database Query Object
        DoctorSqlQuery sql = new DoctorSqlQuery();
        int result = 0;
        
        
        //create a doctor object
        Doctor obj = new Doctor();
        
        
        //Fill he object using setter
        obj.setDoctor_Name(Doctor_Name);
        obj.setDoctor_Age(Doctor_Age);
        obj.setDoctor_Race(Doctor_Race);
        obj.setDoctor_Gender(Doctor_Race);
        obj.setDoctor_Location(Doctor_Location);
        obj.setSpeciality(Speciality);
        obj.setEmail_Id(Email_Id);
        obj.setPhone_No(Phone_No);
        obj.setPassword(Password);
        
        if (validation()) {
            result = sql.createDoctor(obj);    
        }
        if (result == 1) {
            formReset();        
            splitPane.setRightComponent(new SuccessGifJPanel());
        } else {
            validation();
            JOptionPane.showMessageDialog(this, "Doctor not created !");

        }
       
    }//GEN-LAST:event_btnsubmitActionPerformed
 private void formReset() {

        txtName.setText("");
        txtSpeciality.setText("");
        txtEmailId.setText("");
        txtLocation.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        

        valName.setText("");
        valAilments.setText("");
        valEmailId.setText("");
        valLocation.setText("");
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
        valAilments.setText("");
        valEmailId.setText("");
        valLocation.setText("");
        valPassword.setText("");
        valPhoneNumber.setText("");
       
        String Doctor_Name = txtName.getText();
        String Doctor_Location = txtLocation.getText();
        String Email_Id = txtEmailId.getText();
        String Phone_No = txtPhoneNumber.getText();
        String Password = txtPassword.getText();
        String Speciality = txtSpeciality.getText();
        String location = txtLocation.getText();

        System.out.println("Doctor Name->" + Doctor_Name);

        //Name Validation
        if (Doctor_Name.length() <= 0) {
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
        if (Speciality.length() <= 0) {
            valAilments.setText("Please Enter Speciality");
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblSpeciality;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JRadioButton radiobtnFemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JRadioButton radiobtnOthers;
    private javax.swing.JSpinner spinnerAge;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSpeciality;
    private javax.swing.JLabel valAilments;
    private javax.swing.JLabel valEmailId;
    private javax.swing.JLabel valLocation;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
