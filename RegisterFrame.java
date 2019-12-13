package com.posystem.gui;

import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
import java.text.SimpleDateFormat;
import java.awt.Color;

public class RegisterFrame extends javax.swing.JFrame {

    public RegisterFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleRegPanel = new javax.swing.JPanel();
        CreateAccount = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        LargeRegPanel = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        RegisterButton_ = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();
        FNameLabel = new javax.swing.JLabel();
        FNameField = new javax.swing.JTextField();
        LNameField = new javax.swing.JTextField();
        LNameLabel = new javax.swing.JLabel();
        RePassLabel = new javax.swing.JLabel();
        BirthLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressField = new javax.swing.JTextArea();
        BDateField = new com.toedter.calendar.JDateChooser();
        GenderLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        RePassField = new javax.swing.JPasswordField();
        FemaleRadio = new javax.swing.JRadioButton();
        MaleRadio = new javax.swing.JRadioButton();
        PhoneField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TitleRegPanel.setBackground(new java.awt.Color(249, 105, 14));

        CreateAccount.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        CreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        CreateAccount.setText("Create Account");

        CloseButton.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(255, 255, 255));
        CloseButton.setText("X");
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseButtonMouseExited(evt);
            }
        });

        MinimizeButton.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        MinimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        MinimizeButton.setText("-");
        MinimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TitleRegPanelLayout = new javax.swing.GroupLayout(TitleRegPanel);
        TitleRegPanel.setLayout(TitleRegPanelLayout);
        TitleRegPanelLayout.setHorizontalGroup(
            TitleRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleRegPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CreateAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinimizeButton)
                .addGap(18, 18, 18)
                .addComponent(CloseButton)
                .addGap(27, 27, 27))
        );
        TitleRegPanelLayout.setVerticalGroup(
            TitleRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleRegPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(TitleRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateAccount)
                    .addComponent(CloseButton)
                    .addComponent(MinimizeButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        LargeRegPanel.setBackground(new java.awt.Color(34, 49, 63));
        LargeRegPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(236, 240, 241));
        UserLabel.setText(" Username:");
        LargeRegPanel.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        PassLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(236, 240, 241));
        PassLabel.setText("  Password:");
        LargeRegPanel.add(PassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 97, -1));

        UserField.setBackground(new java.awt.Color(108, 122, 137));
        UserField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserField.setForeground(new java.awt.Color(228, 241, 254));
        LargeRegPanel.add(UserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, -1));

        PassField.setBackground(new java.awt.Color(108, 122, 137));
        PassField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PassField.setForeground(new java.awt.Color(228, 241, 254));
        LargeRegPanel.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 220, -1));

        RegisterButton_.setBackground(new java.awt.Color(34, 167, 240));
        RegisterButton_.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        RegisterButton_.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton_.setText("Submit");
        RegisterButton_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterButton_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterButton_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterButton_MouseExited(evt);
            }
        });
        RegisterButton_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButton_ActionPerformed(evt);
            }
        });
        LargeRegPanel.add(RegisterButton_, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 106, 40));

        ResetButton.setBackground(new java.awt.Color(242, 38, 19));
        ResetButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Reset");
        ResetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResetButtonMouseExited(evt);
            }
        });
        LargeRegPanel.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 106, 40));

        LoginLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(204, 204, 204));
        LoginLabel.setText("Login to your new account");
        LoginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginLabelMouseExited(evt);
            }
        });
        LargeRegPanel.add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        FNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FNameLabel.setForeground(new java.awt.Color(236, 240, 241));
        FNameLabel.setText("First Name:");
        LargeRegPanel.add(FNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        FNameField.setBackground(new java.awt.Color(108, 122, 137));
        FNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FNameField.setForeground(new java.awt.Color(228, 241, 254));
        LargeRegPanel.add(FNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 220, -1));

        LNameField.setBackground(new java.awt.Color(108, 122, 137));
        LNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LNameField.setForeground(new java.awt.Color(228, 241, 254));
        LargeRegPanel.add(LNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, -1));

        LNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LNameLabel.setForeground(new java.awt.Color(236, 240, 241));
        LNameLabel.setText("Last Name:");
        LargeRegPanel.add(LNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        RePassLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RePassLabel.setForeground(new java.awt.Color(236, 240, 241));
        RePassLabel.setText("Retype Password:");
        LargeRegPanel.add(RePassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        BirthLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BirthLabel.setForeground(new java.awt.Color(236, 240, 241));
        BirthLabel.setText("Birthdate:");
        LargeRegPanel.add(BirthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 90, -1));

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(236, 240, 241));
        AddressLabel.setText("  Address:");
        LargeRegPanel.add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 84, -1));

        AddressField.setBackground(new java.awt.Color(108, 122, 137));
        AddressField.setColumns(20);
        AddressField.setForeground(new java.awt.Color(228, 241, 254));
        AddressField.setRows(5);
        jScrollPane1.setViewportView(AddressField);

        LargeRegPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 250, -1));

        BDateField.setBackground(new java.awt.Color(108, 122, 137));
        BDateField.setToolTipText("select birthdate");
        BDateField.setMaxSelectableDate(new java.util.Date(253370739702000L));
        LargeRegPanel.add(BDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 150, -1));

        GenderLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GenderLabel.setForeground(new java.awt.Color(236, 240, 241));
        GenderLabel.setText("Gender:");
        LargeRegPanel.add(GenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 80, -1));

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(236, 240, 241));
        PhoneLabel.setText("Phone No.");
        LargeRegPanel.add(PhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 100, -1));

        RePassField.setBackground(new java.awt.Color(108, 122, 137));
        RePassField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RePassField.setForeground(new java.awt.Color(228, 241, 254));
        LargeRegPanel.add(RePassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 220, -1));

        FemaleRadio.setBackground(new java.awt.Color(34, 49, 63));
        FemaleRadio.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        FemaleRadio.setForeground(new java.awt.Color(236, 240, 241));
        FemaleRadio.setText(" Female");
        LargeRegPanel.add(FemaleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        MaleRadio.setBackground(new java.awt.Color(34, 49, 63));
        MaleRadio.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        MaleRadio.setForeground(new java.awt.Color(236, 240, 241));
        MaleRadio.setText(" Male");
        LargeRegPanel.add(MaleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        PhoneField.setBackground(new java.awt.Color(108, 122, 137));
        PhoneField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneField.setForeground(new java.awt.Color(228, 241, 254));
        LargeRegPanel.add(PhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleRegPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LargeRegPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitleRegPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LargeRegPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LargeRegPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void MinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeButtonMouseClicked

    private void LoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseClicked
        LoginFrame lgf = new LoginFrame();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LoginLabelMouseClicked

    private void ResetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseClicked
        this.ResetAll();
    }//GEN-LAST:event_ResetButtonMouseClicked

    private void CloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseEntered
        CloseButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_CloseButtonMouseEntered

    private void CloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseExited
        CloseButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_CloseButtonMouseExited

    private void MinimizeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseEntered
        MinimizeButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_MinimizeButtonMouseEntered

    private void MinimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseExited
        MinimizeButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_MinimizeButtonMouseExited

    private void RegisterButton_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButton_MouseEntered
        RegisterButton_.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_RegisterButton_MouseEntered

    private void RegisterButton_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButton_MouseExited
        RegisterButton_.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_RegisterButton_MouseExited

    private void ResetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseEntered
        ResetButton.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_ResetButtonMouseEntered

    private void ResetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseExited
        ResetButton.setBackground(new Color(242,38,19));
    }//GEN-LAST:event_ResetButtonMouseExited

    private void LoginLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseExited
        LoginLabel.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_LoginLabelMouseExited

    private void LoginLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabelMouseEntered
        LoginLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_LoginLabelMouseEntered

    private void RegisterButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButton_ActionPerformed
        
        String fname = FNameField.getText();
        String lname = LNameField.getText();
        String uname = UserField.getText();
        String pass = String.valueOf(PassField.getPassword());
        String repass = String.valueOf(RePassField.getPassword());
        String phone = PhoneField.getText();
        String gender1 = MaleRadio.getText();
        String gender2 = FemaleRadio.getText();
        String bdate = null;
        String address = AddressField.getText();
        
        if(uname.equals("")){
            JOptionPane.showMessageDialog(null, "Username is required!");
        }else if(isUsernameExist(uname)){
            JOptionPane.showMessageDialog(null, "Username already exist!");
        }else if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Password is required!");
        }else if(repass.equals("")){
            JOptionPane.showMessageDialog(null, "Retype password again!");
        }else if(!pass.equals(repass)){
            JOptionPane.showMessageDialog(null, "Password doesn't match!");
        }else{
        
        if(BDateField.getDate() != null){
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            bdate = df.format(BDateField.getDate());
        }
        
        PreparedStatement ps;
        String query = "INSERT INTO `posclient_tbl`(`firstname`, `lastname`, `username`, `password`, `phone`, `gender`, `birthdate`, `address`) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            ps = MySQLConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, uname);
            ps.setString(4, pass);
            ps.setString(5, phone);
            
            if(MaleRadio.isSelected()){
                ps.setString(6, gender1);
            }else if(FemaleRadio.isSelected()){
                ps.setString(6, gender2); 
            }else{
                ps.setNull(6, 0);
            }

            if(bdate != null){
                ps.setString(7, bdate);
            }else{
                ps.setNull(7, 0);
            }
            ps.setString(8, address);
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Account Created!");
                this.ResetAll();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_RegisterButton_ActionPerformed
    
    public boolean isUsernameExist(String username){
        
        PreparedStatement ps;
        ResultSet rs;
        
        boolean checkUser = false;
        String query = "SELECT * FROM `posclient_tbl` WHERE `username` = ?";
        try {
            ps = MySQLConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                checkUser = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return checkUser;
    }
    
    public void ResetAll(){
        FNameField.setText("");
        LNameField.setText("");
        UserField.setText("");
        PassField.setText("");
        RePassField.setText("");
        MaleRadio.setSelected(false);
        FemaleRadio.setSelected(false);
        PhoneField.setText("");
        AddressField.setText("");
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new RegisterFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AddressField;
    private javax.swing.JLabel AddressLabel;
    private com.toedter.calendar.JDateChooser BDateField;
    private javax.swing.JLabel BirthLabel;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JLabel CreateAccount;
    private javax.swing.JTextField FNameField;
    private javax.swing.JLabel FNameLabel;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JTextField LNameField;
    private javax.swing.JLabel LNameLabel;
    private javax.swing.JPanel LargeRegPanel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JPasswordField RePassField;
    private javax.swing.JLabel RePassLabel;
    private javax.swing.JButton RegisterButton_;
    private javax.swing.JButton ResetButton;
    private javax.swing.JPanel TitleRegPanel;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
