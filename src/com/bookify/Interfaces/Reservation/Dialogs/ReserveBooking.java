package com.bookify.Interfaces.Reservation.Dialogs;

import com.bookify.Interfaces.Reservation.Dialogs.Panels.GuestDetails;
import com.bookify.Interfaces.Reservation.Dialogs.Panels.PaymentAndConfirmation;
import com.bookify.Interfaces.Reservation.Dialogs.Panels.ReservationInformation;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ReserveBooking extends javax.swing.JFrame {

    private GuestDetails guestDetails;
    private ReservationInformation reservationInformation;
    private PaymentAndConfirmation paymentAndConfirmation;
    private CardLayout cardLayout;
    private static ReserveBooking dialog;

    public ReserveBooking() {
        initComponents();
        loadPanels();
    }

    public static ReserveBooking getInstance() {
        if (dialog == null) {
            dialog = new ReserveBooking();
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

        this.guestDetails = new GuestDetails();
        this.reservationInformation = new ReservationInformation();
        this.paymentAndConfirmation = new PaymentAndConfirmation();

        this.mainLayout.add(guestDetails, "guestDetails");
        this.mainLayout.add(reservationInformation, "reservationInformation");
        this.mainLayout.add(paymentAndConfirmation, "paymentAndConfirmation");

        SwingUtilities.updateComponentTreeUI(mainLayout);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainLayout;
    // End of variables declaration//GEN-END:variables
}
