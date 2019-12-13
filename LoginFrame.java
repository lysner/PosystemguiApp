package com.posystem.gui;

import java.util.logging.Logger;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {


    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null); //centralize form in the screen
        PassField_.setEchoChar((char)0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLogPanel = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        LargeLogPanel = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        UserField_ = new javax.swing.JTextField();
        PassField_ = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        RegisterLabel = new javax.swing.JLabel();
        ShowBox = new javax.swing.JCheckBox();
        AuthLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TitleLogPanel.setBackground(new java.awt.Color(249, 105, 14));

        Login.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");

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

        javax.swing.GroupLayout TitleLogPanelLayout = new javax.swing.GroupLayout(TitleLogPanel);
        TitleLogPanel.setLayout(TitleLogPanelLayout);
        TitleLogPanelLayout.setHorizontalGroup(
            TitleLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLogPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinimizeButton)
                .addGap(18, 18, 18)
                .addComponent(CloseButton)
                .addGap(27, 27, 27))
        );
        TitleLogPanelLayout.setVerticalGroup(
            TitleLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLogPanelLayout.createSequentialGroup()
                .addGroup(TitleLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitleLogPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Login))
                    .addGroup(TitleLogPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(TitleLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CloseButton)
                            .addComponent(MinimizeButton))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        LargeLogPanel.setBackground(new java.awt.Color(34, 49, 63));

        UserLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(236, 240, 241));
        UserLabel.setText("Username:");

        PassLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(236, 240, 241));
        PassLabel.setText("Password:");

        UserField_.setBackground(new java.awt.Color(108, 122, 137));
        UserField_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserField_.setForeground(new java.awt.Color(204, 204, 204));
        UserField_.setText("enter username");
        UserField_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserField_FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserField_FocusLost(evt);
            }
        });

        PassField_.setBackground(new java.awt.Color(108, 122, 137));
        PassField_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PassField_.setForeground(new java.awt.Color(204, 204, 204));
        PassField_.setText("enter password");
        PassField_.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PassField_FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassField_FocusLost(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(34, 167, 240));
        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ResetButton.setBackground(new java.awt.Color(242, 38, 19));
        ResetButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Reset");
        ResetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResetButtonMouseExited(evt);
            }
        });
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        RegisterLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RegisterLabel.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLabel.setText("Create a new account");
        RegisterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterLabelMouseExited(evt);
            }
        });

        ShowBox.setBackground(new java.awt.Color(34, 49, 63));
        ShowBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShowBox.setForeground(new java.awt.Color(236, 240, 241));
        ShowBox.setText(" show password");
        ShowBox.setToolTipText("check the box tho reveal password");
        ShowBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBoxActionPerformed(evt);
            }
        });

        AuthLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AuthLabel.setForeground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout LargeLogPanelLayout = new javax.swing.GroupLayout(LargeLogPanel);
        LargeLogPanel.setLayout(LargeLogPanelLayout);
        LargeLogPanelLayout.setHorizontalGroup(
            LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LargeLogPanelLayout.createSequentialGroup()
                .addGroup(LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LargeLogPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(AuthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LargeLogPanelLayout.createSequentialGroup()
                        .addGroup(LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LargeLogPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LargeLogPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(UserLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowBox)
                            .addGroup(LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UserField_)
                                .addComponent(PassField_, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                    .addComponent(RegisterLabel)
                    .addGroup(LargeLogPanelLayout.createSequentialGroup()
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        LargeLogPanelLayout.setVerticalGroup(
            LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LargeLogPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel)
                    .addComponent(UserField_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel)
                    .addComponent(PassField_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ShowBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(LargeLogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterLabel)
                .addGap(18, 18, 18)
                .addComponent(AuthLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleLogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LargeLogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitleLogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LargeLogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void MinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeButtonMouseClicked

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        UserField_.setText("enter username");
        PassField_.setEchoChar((char)0);
        PassField_.setText("enter password");
        ShowBox.setSelected(false);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void RegisterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLabelMouseClicked
        RegisterFrame rgf = new RegisterFrame();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_RegisterLabelMouseClicked

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        PreparedStatement ps;
        ResultSet rs;
        
        String uname = UserField_.getText();
        String pass = String.valueOf(PassField_.getPassword());
        
        String query = "SELECT * FROM `posclient_tbl` WHERE `username` = ? AND `password` = ?";
        
        try {
            ps = MySQLConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, uname);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                MainAppFrame mapf = new MainAppFrame();
                mapf.setVisible(true);
                mapf.pack();
                mapf.setLocationRelativeTo(null);
                mapf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Invalid username or password!","Login Failed",2);
                UserField_.setText("enter username");
                PassField_.setEchoChar((char)0);
                PassField_.setText("enter password");
                ShowBox.setSelected(false);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ShowBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBoxActionPerformed
        if(ShowBox.isSelected()){
            PassField_.setEchoChar((char)0);
        }else{
            PassField_.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowBoxActionPerformed

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

    private void UserField_FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserField_FocusGained
        if(UserField_.getText().trim().toLowerCase().equals("enter username")){
            UserField_.setText("");
        }
    }//GEN-LAST:event_UserField_FocusGained

    private void UserField_FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserField_FocusLost
        if(UserField_.getText().trim().equals("") || 
           UserField_.getText().trim().toLowerCase().equals("enter username")){
            UserField_.setText("enter username");
            UserField_.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_UserField_FocusLost

    private void PassField_FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassField_FocusGained
        
        String pass = String.valueOf(PassField_.getPassword());
        
        if(pass.trim().toLowerCase().equals("enter password")){
            PassField_.setText("");           
        }
        PassField_.setEchoChar('*');
        
    }//GEN-LAST:event_PassField_FocusGained

    private void PassField_FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassField_FocusLost
        String pass = String.valueOf(PassField_.getPassword());
        
        if(pass.trim().equals("") || 
           pass.trim().toLowerCase().equals("enter password")){
            PassField_.setText("enter password");
            PassField_.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_PassField_FocusLost

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        LoginButton.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        LoginButton.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void ResetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseEntered
        ResetButton.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_ResetButtonMouseEntered

    private void ResetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetButtonMouseExited
        ResetButton.setBackground(new Color(242,38,19));
    }//GEN-LAST:event_ResetButtonMouseExited

    private void RegisterLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLabelMouseEntered
        RegisterLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_RegisterLabelMouseEntered

    private void RegisterLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLabelMouseExited
        RegisterLabel.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_RegisterLabelMouseExited
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthLabel;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JPanel LargeLogPanel;
    private javax.swing.JLabel Login;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JPasswordField PassField_;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JCheckBox ShowBox;
    private javax.swing.JPanel TitleLogPanel;
    private javax.swing.JTextField UserField_;
    private javax.swing.JLabel UserLabel;
    // End of variables declaration//GEN-END:variables
}
