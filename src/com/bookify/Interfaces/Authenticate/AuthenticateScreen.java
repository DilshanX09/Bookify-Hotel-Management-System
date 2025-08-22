package com.bookify.Interfaces.Authenticate;

import com.bookify.Interfaces.Authenticate.Panels.LoginPanel;
import com.bookify.Interfaces.Authenticate.Panels.OTPVerificationPanel;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class AuthenticateScreen extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private LoginPanel loginPanel;
    private OTPVerificationPanel otpVerificationPanel;
    private static AuthenticateScreen authScreen;

    public AuthenticateScreen() {
        initComponents();
        initPanels();
    }

    public static synchronized AuthenticateScreen getInstance() {
        if (authScreen == null) {
            authScreen = new AuthenticateScreen();
        }

        return authScreen;
    }

    private void initPanels() {
        if (cardLayout == null && mainPanel.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) mainPanel.getLayout();
        }

        this.loginPanel = new LoginPanel();
        this.otpVerificationPanel = new OTPVerificationPanel();

        this.mainPanel.add(loginPanel, "loginPanel");
        this.mainPanel.add(otpVerificationPanel, "otpVerificationPanel");

        this.cardLayout.show(mainPanel, "loginPanel");
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setMinimumSize(new java.awt.Dimension(474, 547));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();
        AuthenticateScreen.getInstance().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
