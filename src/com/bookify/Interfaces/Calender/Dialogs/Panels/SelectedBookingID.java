package com.bookify.Interfaces.Calender.Dialogs.Panels;

import com.bookify.Interfaces.Calender.Dialogs.SelectedDateBookings;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class SelectedBookingID extends javax.swing.JPanel {

    public SelectedBookingID() {
        initComponents();
        init();
    }

    private void init() {
        homeIcon.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Home.svg", 25, 25));
        backIcon.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Back.svg", 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bookingStatusLabel = new javax.swing.JLabel();
        roomIdLabel = new javax.swing.JLabel();
        roomTypeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(100, 100, 100));
        jLabel3.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("/  Selected Date Booking List");

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/  Booking Summary Calendar");

        homeIcon.setBackground(new java.awt.Color(255, 255, 255));
        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(100, 100, 100));
        jLabel4.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("/  #321623");

        backIcon.setBackground(new java.awt.Color(255, 255, 255));
        backIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backIcon.setOpaque(true);
        backIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter 18pt Medium", 0, 17)); // NOI18N
        jLabel1.setText("Booking ID #321623");

        jLabel5.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Bookings by 2025 July 25");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

        bookingStatusLabel.setBackground(new java.awt.Color(251, 250, 250));
        bookingStatusLabel.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        bookingStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingStatusLabel.setText("Booking Status - xxxx");
        bookingStatusLabel.setOpaque(true);
        jPanel1.add(bookingStatusLabel);

        roomIdLabel.setBackground(new java.awt.Color(251, 250, 250));
        roomIdLabel.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        roomIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomIdLabel.setText("Room ID - xxxxxxxxxx");
        roomIdLabel.setOpaque(true);
        jPanel1.add(roomIdLabel);

        roomTypeLabel.setBackground(new java.awt.Color(251, 250, 250));
        roomTypeLabel.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        roomTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomTypeLabel.setText("Room Type - xxxxxxxx");
        roomTypeLabel.setOpaque(true);
        jPanel1.add(roomTypeLabel);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel9.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel9.setText("Total Amount");
        jPanel2.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel10.setText("Advanced Payment");
        jPanel2.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel11.setText("xxxxxxxx");
        jPanel2.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel12.setText("xxxxxxxx");
        jPanel2.add(jLabel12);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel13.setText("Check In Date");
        jPanel3.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel14.setText("Check Out Date");
        jPanel3.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel15.setText("xx/xx/xxxx");
        jPanel3.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel16.setText("xx/xx/xxxx");
        jPanel3.add(jLabel16);

        jSeparator1.setBackground(new java.awt.Color(202, 202, 202));
        jSeparator1.setForeground(new java.awt.Color(242, 237, 237));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel17.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel17.setText("Name");
        jPanel4.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel18.setText("Phone");
        jPanel4.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel19.setText("xx/xx/xxxx");
        jPanel4.add(jLabel19);

        jLabel20.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel20.setText("xx/xx/xxxx");
        jPanel4.add(jLabel20);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel21.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel21.setText("Email");
        jPanel5.add(jLabel21);

        jLabel22.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel22.setText("NIC");
        jPanel5.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel23.setText("xxxxxxxx");
        jPanel5.add(jLabel23);

        jLabel24.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel24.setText("xxxxxxxx");
        jPanel5.add(jLabel24);

        jSeparator2.setBackground(new java.awt.Color(202, 202, 202));
        jSeparator2.setForeground(new java.awt.Color(242, 237, 237));

        jLabel25.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 15)); // NOI18N
        jLabel25.setText("Guest Details");

        jSeparator3.setBackground(new java.awt.Color(202, 202, 202));
        jSeparator3.setForeground(new java.awt.Color(242, 237, 237));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel26.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel26.setText("Room Number");
        jPanel6.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel27.setText("Floor");
        jPanel6.add(jLabel27);

        jLabel28.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel28.setText("xx/xx/xxxx");
        jPanel6.add(jLabel28);

        jLabel29.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel29.setText("xx/xx/xxxx");
        jPanel6.add(jLabel29);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel30.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel30.setText("Status");
        jPanel7.add(jLabel30);

        jLabel31.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel31.setText("Price Per Night");
        jPanel7.add(jLabel31);

        jLabel32.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel32.setText("xxxxxxxx");
        jPanel7.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel33.setText("xxxxxxxx");
        jPanel7.add(jLabel33);

        jLabel34.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 15)); // NOI18N
        jLabel34.setText("Room Details");

        jLabel35.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 15)); // NOI18N
        jLabel35.setText("Summary");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridLayout(4, 2, 5, 5));

        jLabel36.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel36.setText("Payment Method");
        jPanel8.add(jLabel36);

        jLabel37.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Online");
        jPanel8.add(jLabel37);

        jLabel38.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel38.setText("Nights");
        jPanel8.add(jLabel38);

        jLabel39.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("4000/ Per Night x 3");
        jPanel8.add(jLabel39);

        jLabel40.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel40.setText("Total");
        jPanel8.add(jLabel40);

        jLabel41.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("LKR 12000.00");
        jPanel8.add(jLabel41);

        jLabel42.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel42.setText("Guest Count");
        jPanel8.add(jLabel42);

        jLabel43.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("LKR 12000.00");
        jPanel8.add(jLabel43);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel25)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel35)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel25)
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addGap(12, 12, 12)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconMouseClicked
        SelectedDateBookings
                .getInstance()
                .getCardLayout()
                .show(SelectedDateBookings.getInstance().getMainLayout(), "bookingList");
    }//GEN-LAST:event_backIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel bookingStatusLabel;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel roomIdLabel;
    private javax.swing.JLabel roomTypeLabel;
    // End of variables declaration//GEN-END:variables
}
