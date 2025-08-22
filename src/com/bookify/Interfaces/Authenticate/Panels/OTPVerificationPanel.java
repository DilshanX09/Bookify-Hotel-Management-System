package com.bookify.Interfaces.Authenticate.Panels;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class OTPVerificationPanel extends javax.swing.JPanel {

    public OTPVerificationPanel() {
        initComponents();
        init();
    }

    private void init() {
        mainLogo.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Logo.svg", 45, 45));
        otpField.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        verifyBtn.putClientProperty(FlatClientProperties.STYLE, "arc:10");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mainLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        otpField = new javax.swing.JTextField();
        verifyBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Inter 24pt SemiBold", 1, 17)); // NOI18N
        jLabel1.setText("Bookify");

        mainLogo.setBackground(new java.awt.Color(255, 255, 255));
        mainLogo.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("<html>For security, please enter the OTP to continue as Administrator.</html>");

        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(101, 99, 99));
        jLabel13.setText("<html>A 9-digit verification code has been sent to your email. Enter it below to securely access the Bookify Hotel Management admin panel.</html>");

        otpField.setFont(new java.awt.Font("Inter 18pt Medium", 0, 24)); // NOI18N
        otpField.setForeground(new java.awt.Color(83, 83, 83));
        otpField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otpField.setText("000 - 000 - 000");
        otpField.setMargin(new java.awt.Insets(2, 15, 2, 6));

        verifyBtn.setBackground(new java.awt.Color(23, 23, 23));
        verifyBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        verifyBtn.setForeground(new java.awt.Color(255, 255, 255));
        verifyBtn.setText("Verify");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(124, 124, 124));
        jLabel3.setText("© 2025 Bookify. All rights reserved. ");

        jLabel4.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jLabel4.setText("Email send to : *********shan@gmail.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel3)
                .addGap(0, 131, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(verifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(otpField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(otpField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JTextField otpField;
    private javax.swing.JButton verifyBtn;
    // End of variables declaration//GEN-END:variables
}
