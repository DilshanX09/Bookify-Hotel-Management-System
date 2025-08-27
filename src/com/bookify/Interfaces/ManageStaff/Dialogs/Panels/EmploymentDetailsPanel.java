package com.bookify.Interfaces.ManageStaff.Dialogs.Panels;

import com.bookify.Interfaces.ManageStaff.Dialogs.RegisterStaffMember;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class EmploymentDetailsPanel extends javax.swing.JPanel {

    public EmploymentDetailsPanel() {
        initComponents();
        init();
    }

    private void init() {
        homeIcon.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Home.svg", 25, 25));
        staffIdField.putClientProperty(FlatClientProperties.STYLE, "arc:12");
        salaryField.putClientProperty(FlatClientProperties.STYLE, "arc:12");
        registerBtn.putClientProperty(FlatClientProperties.STYLE, "arc:12");
        previousBtn.putClientProperty(FlatClientProperties.STYLE, "arc:12");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        positionCombo = new javax.swing.JComboBox<>();
        staffIdField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        salaryField = new javax.swing.JTextField();
        statusCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        previousBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        homeIcon.setBackground(new java.awt.Color(255, 255, 255));
        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/  Staff Management");

        jLabel3.setBackground(new java.awt.Color(100, 100, 100));
        jLabel3.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("/  Register Staff Member");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Register Staff Member");

        jLabel1.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel1.setText("Employment Details");

        jLabel5.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel5.setText("<html>Enter the staff member's Employment details, assign a role, and set system access if required.</html>");

        registerBtn.setBackground(new java.awt.Color(0, 0, 0));
        registerBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel6.setText("Position");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 15, 0));

        positionCombo.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        positionCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(positionCombo);

        staffIdField.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        staffIdField.setMargin(new java.awt.Insets(2, 15, 2, 6));
        jPanel3.add(staffIdField);

        jLabel7.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel7.setText("Staff ID");

        jLabel8.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel8.setText("Salary");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 15, 0));

        salaryField.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        salaryField.setMargin(new java.awt.Insets(2, 15, 2, 6));
        jPanel4.add(salaryField);

        statusCombo.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        statusCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(statusCombo);

        jLabel9.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel9.setText("Status");

        previousBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        previousBtn.setText("previous");
        previousBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(152, 152, 152))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(156, 156, 156))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(163, 163, 163)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        RegisterStaffMember
        .getInstance()
        .getCardLayout()
        .show(RegisterStaffMember.getInstance().getMainLayout(), "personalDetailsPanel");
    }//GEN-LAST:event_previousBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        RegisterStaffMember
        .getInstance()
        .getCardLayout()
        .show(RegisterStaffMember.getInstance().getMainLayout(), "employmentDetailsPanel");
    }//GEN-LAST:event_registerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> positionCombo;
    private javax.swing.JButton previousBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField staffIdField;
    private javax.swing.JComboBox<String> statusCombo;
    // End of variables declaration//GEN-END:variables
}
