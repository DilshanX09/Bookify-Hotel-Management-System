package com.bookify.Interfaces.panels.Dashboard;
import com.bookify.CustomRenderComponent.RoundedBorder;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        init();
    }

    private void init() {
        RoundedBorder.applyLineBorder(totalBookings, 20);
        RoundedBorder.applyLineBorder(checkIn, 20);
        RoundedBorder.applyLineBorder(checkOut, 20);
        RoundedBorder.applyLineBorder(totalRevenue, 20);
        RoundedBorder.applyLineBorder(totalRooms, 20);
        RoundedBorder.applyLineBorder(occupiedRoom, 20);
        RoundedBorder.applyLineBorder(availableRooms, 20);
        RoundedBorder.applyLineBorder(yearRevenueChart, 20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        totalBookings = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        checkIn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        checkOut = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalRevenue = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        totalRooms = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        occupiedRoom = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        availableRooms = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        yearRevenueChart = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 4, 10, 10));

        totalBookings.setBackground(new java.awt.Color(255, 255, 255));
        totalBookings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel11.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel11.setText("Total Bookings");

        jLabel12.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel12.setText("<html>Cumulative number of reservations made in the system, including current, upcoming, and completed stays.</html>");

        jLabel13.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 42)); // NOI18N
        jLabel13.setText("30");

        javax.swing.GroupLayout totalBookingsLayout = new javax.swing.GroupLayout(totalBookings);
        totalBookings.setLayout(totalBookingsLayout);
        totalBookingsLayout.setHorizontalGroup(
            totalBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalBookingsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(totalBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, totalBookingsLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(157, 157, 157))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        totalBookingsLayout.setVerticalGroup(
            totalBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalBookingsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(15, 15, 15)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(totalBookings);

        checkIn.setBackground(new java.awt.Color(255, 255, 255));
        checkIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel8.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel8.setText("Check-in");

        jLabel9.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel9.setText("<html>Total number of guests who have successfully checked in to the hotel today.</html>");

        jLabel10.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 42)); // NOI18N
        jLabel10.setText("30");

        javax.swing.GroupLayout checkInLayout = new javax.swing.GroupLayout(checkIn);
        checkIn.setLayout(checkInLayout);
        checkInLayout.setHorizontalGroup(
            checkInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkInLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(checkInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkInLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(206, 206, 206))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        checkInLayout.setVerticalGroup(
            checkInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkInLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(20, 20, 20))
        );

        jPanel1.add(checkIn);

        checkOut.setBackground(new java.awt.Color(255, 255, 255));
        checkOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel5.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel5.setText("Check-out");

        jLabel6.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel6.setText("<html>Number of guests who have completed their stay and checked out of the hotel today.</html>");

        jLabel7.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 42)); // NOI18N
        jLabel7.setText("30");

        javax.swing.GroupLayout checkOutLayout = new javax.swing.GroupLayout(checkOut);
        checkOut.setLayout(checkOutLayout);
        checkOutLayout.setHorizontalGroup(
            checkOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(checkOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, checkOutLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(193, 193, 193))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        checkOutLayout.setVerticalGroup(
            checkOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(checkOut);

        totalRevenue.setBackground(new java.awt.Color(255, 255, 255));
        totalRevenue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel1.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("Total Revenue");

        jLabel2.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel2.setText("<html>Total revenue generated from bookings, check-ins, and other services, including completed and in-progress payments.</html>");

        jLabel4.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 42)); // NOI18N
        jLabel4.setText("$1898.98");

        javax.swing.GroupLayout totalRevenueLayout = new javax.swing.GroupLayout(totalRevenue);
        totalRevenue.setLayout(totalRevenueLayout);
        totalRevenueLayout.setHorizontalGroup(
            totalRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalRevenueLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(totalRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, totalRevenueLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(162, 162, 162))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        totalRevenueLayout.setVerticalGroup(
            totalRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalRevenueLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(totalRevenue);

        jLabel14.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel14.setText("Rooms Summery");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 0, 15));

        totalRooms.setBackground(new java.awt.Color(255, 255, 255));
        totalRooms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel21.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel21.setText("Total Rooms");

        jLabel22.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel22.setText("<html>Total number of rooms registered in the system across all categories and floors.</html>");

        jLabel23.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 40)); // NOI18N
        jLabel23.setText("30");

        javax.swing.GroupLayout totalRoomsLayout = new javax.swing.GroupLayout(totalRooms);
        totalRooms.setLayout(totalRoomsLayout);
        totalRoomsLayout.setHorizontalGroup(
            totalRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalRoomsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(totalRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(totalRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(320, 320, 320))
                    .addGroup(totalRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(20, 20, 20))))
        );
        totalRoomsLayout.setVerticalGroup(
            totalRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalRoomsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(totalRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(totalRooms);

        occupiedRoom.setBackground(new java.awt.Color(255, 255, 255));
        occupiedRoom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel18.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel18.setText("Occupied Rooms");

        jLabel19.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel19.setText("<html>Rooms currently assigned to guests and marked as occupied in the system.</html>");

        jLabel20.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 40)); // NOI18N
        jLabel20.setText("30");

        javax.swing.GroupLayout occupiedRoomLayout = new javax.swing.GroupLayout(occupiedRoom);
        occupiedRoom.setLayout(occupiedRoomLayout);
        occupiedRoomLayout.setHorizontalGroup(
            occupiedRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(occupiedRoomLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(occupiedRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(occupiedRoomLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(320, 320, 320))
                    .addGroup(occupiedRoomLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(20, 20, 20))))
        );
        occupiedRoomLayout.setVerticalGroup(
            occupiedRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(occupiedRoomLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(occupiedRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(occupiedRoom);

        availableRooms.setBackground(new java.awt.Color(255, 255, 255));
        availableRooms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel15.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 18)); // NOI18N
        jLabel15.setText("Available Rooms");

        jLabel16.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel16.setText("<html>Rooms that are currently unoccupied and ready to be reserved or assigned to new guests.</html>");

        jLabel17.setFont(new java.awt.Font("Inter 24pt SemiBold", 0, 40)); // NOI18N
        jLabel17.setText("30");

        javax.swing.GroupLayout availableRoomsLayout = new javax.swing.GroupLayout(availableRooms);
        availableRooms.setLayout(availableRoomsLayout);
        availableRoomsLayout.setHorizontalGroup(
            availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableRoomsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availableRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(320, 320, 320))
                    .addGroup(availableRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(20, 20, 20))))
        );
        availableRoomsLayout.setVerticalGroup(
            availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableRoomsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(availableRooms);

        yearRevenueChart.setBackground(new java.awt.Color(255, 255, 255));
        yearRevenueChart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel24.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel24.setText("Year Revenue");

        javax.swing.GroupLayout yearRevenueChartLayout = new javax.swing.GroupLayout(yearRevenueChart);
        yearRevenueChart.setLayout(yearRevenueChartLayout);
        yearRevenueChartLayout.setHorizontalGroup(
            yearRevenueChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearRevenueChartLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        yearRevenueChartLayout.setVerticalGroup(
            yearRevenueChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearRevenueChartLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Inter 18pt", 1, 26)); // NOI18N
        jLabel25.setText("Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearRevenueChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearRevenueChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableRooms;
    private javax.swing.JPanel checkIn;
    private javax.swing.JPanel checkOut;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel occupiedRoom;
    private javax.swing.JPanel totalBookings;
    private javax.swing.JPanel totalRevenue;
    private javax.swing.JPanel totalRooms;
    private javax.swing.JPanel yearRevenueChart;
    // End of variables declaration//GEN-END:variables
}
