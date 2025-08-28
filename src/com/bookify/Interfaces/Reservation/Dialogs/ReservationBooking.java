/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.bookify.Interfaces.Reservation.Dialogs;

import com.bookify.CustomRenderComponent.RoundedBorder;
import com.bookify.Interfaces.ManageGuests.Panels.GuestDetailsPannel;
import com.bookify.Interfaces.ManageGuests.Panels.PaymentConfirmationPannel;
import com.bookify.Interfaces.ManageGuests.Panels.ReservationInformationPannel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ReservationBooking extends javax.swing.JPanel {

    private GuestDetailsPannel guestDetailsPannel;
    private ReservationInformationPannel reservationInformationPannel;
    private PaymentConfirmationPannel paymentConfirmationPannel;
    private CardLayout cardLayout;
    private static ReservationBooking dialog;

    public ReservationBooking() {
        initComponents();
        loadPanels();
        init();
    }

    private void init() {
        homeIcon
                .setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Home.svg",
                        homeIcon.getWidth(), homeIcon.getHeight()));
//        jLabel1.putClientProperty(FlatClientProperties.STYLE,
//                "arc:999; borderWidth:2; borderColor:#CC0000; font:bold +14; alignment:center;");
    }

    public static ReservationBooking getInstance() {
        if (dialog == null) {
            dialog = new ReservationBooking();
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
        this.guestDetailsPannel = new GuestDetailsPannel();
        this.reservationInformationPannel = new ReservationInformationPannel();
        this.paymentConfirmationPannel = new PaymentConfirmationPannel();

        this.mainLayout.add(guestDetailsPannel, "guestDetailsPannel");
        this.mainLayout.add(reservationInformationPannel, "reservationInformationPannel");
        this.mainLayout.add(paymentConfirmationPannel, "paymentConfirmationPannel");

        this.cardLayout.show(mainLayout, "guestDetailsPannel");

        SwingUtilities.updateComponentTreeUI(mainLayout);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelNumber1 = new javax.swing.JLabel();
        labelNumber2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelNumber3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new java.awt.CardLayout());

        sidePanel.setBackground(new java.awt.Color(255, 255, 255));

        homeIcon.setBackground(new java.awt.Color(255, 255, 255));
        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/  Reservation Management");

        jLabel3.setBackground(new java.awt.Color(100, 100, 100));
        jLabel3.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("/  Reserve Bookings");

        jLabel1.setText("Guest Details");

        labelNumber1.setText("1");

        labelNumber2.setText("2");

        jLabel6.setText("Reservation Information");

        labelNumber3.setText("3");

        jLabel8.setText("Guest Details");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(labelNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addComponent(labelNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addComponent(labelNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7))
                    .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelNumber1))
                .addGap(18, 18, 18)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelNumber2))
                .addGap(18, 18, 18)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelNumber3))
                .addContainerGap(432, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelNumber1;
    private javax.swing.JLabel labelNumber2;
    private javax.swing.JLabel labelNumber3;
    private javax.swing.JPanel mainLayout;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
