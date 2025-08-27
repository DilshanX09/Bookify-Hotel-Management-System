package com.bookify.Interfaces.Calender.Dialogs;

import com.bookify.Interfaces.Calender.Dialogs.Panels.SelectedBookingID;
import com.bookify.Interfaces.Calender.Dialogs.Panels.SelectedDateBookingList;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SelectedDateBookings extends javax.swing.JFrame {

    private SelectedDateBookingList bookingList;
    private SelectedBookingID selectedBookingID;
    private CardLayout cardLayout;
    private static SelectedDateBookings dialog;

    public SelectedDateBookings() {
        initComponents();
        loadPanels();
    }

    public static SelectedDateBookings getInstance() {
        if (dialog == null) {
            dialog = new SelectedDateBookings();
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

        this.bookingList = new SelectedDateBookingList();
        this.selectedBookingID = new SelectedBookingID();

        this.mainLayout.add(bookingList, "bookingList");
        this.mainLayout.add(selectedBookingID,"selectedBookingID");

        this.cardLayout.show(mainLayout, "bookingList");
        System.out.println("Showing booking list");

        SwingUtilities.updateComponentTreeUI(mainLayout);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainLayout.setBackground(new java.awt.Color(255, 255, 255));
        mainLayout.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectedDateBookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainLayout;
    // End of variables declaration//GEN-END:variables
}
