package com.bookify.Interfaces.Authenticate.Panels;

import com.bookify.Interfaces.Authenticate.AuthenticateScreen;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class LoginPanel extends javax.swing.JPanel {

    public LoginPanel() {
        initComponents();
        init();
    }

    private void init() {
        mainLogo.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Logo.svg", 45, 45));
        usernameField.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        passwordField.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        authenticateBtn.putClientProperty(FlatClientProperties.STYLE, "arc:10");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        authenticateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        mainLogo.setBackground(new java.awt.Color(255, 255, 255));
        mainLogo.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Inter 24pt SemiBold", 1, 17)); // NOI18N
        jLabel1.setText("Bookify");

        jLabel2.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Bookify – Hotel Management Dashboard");

        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(101, 99, 99));
        jLabel13.setText("<html>Welcome, Administrator! Please log in with your credentials to access the Bookify management dashboard.</html>");

        jLabel12.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(101, 99, 99));
        jLabel12.setText("<html>Here, you can monitor room availability, manage guest bookings, oversee staff tasks, and handle user access with ease.</html>");

        usernameField.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(83, 83, 83));
        usernameField.setText("Username");
        usernameField.setMargin(new java.awt.Insets(2, 15, 2, 6));

        passwordField.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(83, 83, 83));
        passwordField.setText("Password");
        passwordField.setMargin(new java.awt.Insets(2, 15, 2, 6));

        authenticateBtn.setBackground(new java.awt.Color(23, 23, 23));
        authenticateBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        authenticateBtn.setForeground(new java.awt.Color(255, 255, 255));
        authenticateBtn.setText("Authenticate");
        authenticateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticateBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(124, 124, 124));
        jLabel3.setText("© 2025 Bookify. All rights reserved. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(usernameField)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(authenticateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(authenticateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void authenticateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticateBtnActionPerformed
        AuthenticateScreen.getInstance()
                .getCardLayout()
                .show(AuthenticateScreen.getInstance().getMainPanel(), "otpVerificationPanel");
    }//GEN-LAST:event_authenticateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authenticateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
