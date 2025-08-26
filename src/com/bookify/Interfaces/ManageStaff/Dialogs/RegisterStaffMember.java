package com.bookify.Interfaces.ManageStaff.Dialogs;

import com.bookify.Interfaces.ManageStaff.Dialogs.Panels.EmploymentDetailsPanel;
import com.bookify.Interfaces.ManageStaff.Dialogs.Panels.PersonalDetailsPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RegisterStaffMember extends javax.swing.JFrame {

    private PersonalDetailsPanel personalDetailsPanel;
    private EmploymentDetailsPanel employmentDetailsPanel;
    private CardLayout cardLayout;
    private static RegisterStaffMember dialog;

    public RegisterStaffMember() {
        initComponents();
        loadPanels();
    }

    public static RegisterStaffMember getInstance() {
        if (dialog == null) {
            dialog = new RegisterStaffMember();
        }
        return dialog;
    }

    public JPanel getMainLayout() {
        return mainLayout;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    private void loadPanels() {
        if (cardLayout == null && mainLayout.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) mainLayout.getLayout();
        }

        this.personalDetailsPanel = new PersonalDetailsPanel();
        this.employmentDetailsPanel = new EmploymentDetailsPanel();

        this.mainLayout.add(personalDetailsPanel, "personalDetailsPanel");
        this.mainLayout.add(employmentDetailsPanel, "employmentDetailsPanel");

        this.cardLayout.show(mainLayout, "personalDetailsPanel");

        SwingUtilities.updateComponentTreeUI(mainLayout);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(449, 573));
        setMinimumSize(new java.awt.Dimension(449, 573));
        setPreferredSize(null);
        setResizable(false);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setMinimumSize(new java.awt.Dimension(449, 587));
        mainLayout.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainLayout;
    // End of variables declaration//GEN-END:variables
}
