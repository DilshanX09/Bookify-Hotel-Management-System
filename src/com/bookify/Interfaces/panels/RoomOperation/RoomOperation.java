package com.bookify.Interfaces.panels.RoomOperation;

import com.bookify.CustomRenderComponent.CustomTableHeader;
import com.bookify.CustomRenderComponent.RoundedBorder;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;

public class RoomOperation extends javax.swing.JPanel {

    public RoomOperation() {
        initComponents();
        init();
    }

    
    private void init(){
        homeIcon.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Home.svg" , homeIcon.getWidth() , homeIcon.getHeight()));
        
        roomRegisterBtn.putClientProperty(FlatClientProperties.STYLE, "arc:10");

        RoundedBorder.applyToPanel(availableRooms, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);
        RoundedBorder.applyToPanel(occupiedRooms, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);
        RoundedBorder.applyToPanel(roomMaintanance, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);
        RoundedBorder.applyToPanel(cleaningPendings, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);

        new CustomTableHeader(roomOperationTable.getTableHeader()).initHeader();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        availableRooms = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalRoomsLabel = new javax.swing.JLabel();
        occupiedRooms = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        occupiedRoomsLabel = new javax.swing.JLabel();
        roomMaintanance = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        roomMaintananceLabel = new javax.swing.JLabel();
        cleaningPendings = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cleaningPendingsLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomOperationTable = new javax.swing.JTable();
        roomRegisterBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        homeIcon.setBackground(new java.awt.Color(255, 255, 255));
        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeIcon.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/  Room Operation");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Room Operation");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1, 5, 5));

        availableRooms.setBackground(new java.awt.Color(255, 255, 255));
        availableRooms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel4.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Available Rooms");

        jLabel5.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("<html>\nRooms that are vacant and<br/>\navailable for immediate booking.\n</html>");
        jLabel5.setToolTipText("");

        totalRoomsLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        totalRoomsLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalRoomsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalRoomsLabel.setText("30");

        javax.swing.GroupLayout availableRoomsLayout = new javax.swing.GroupLayout(availableRooms);
        availableRooms.setLayout(availableRoomsLayout);
        availableRoomsLayout.setHorizontalGroup(
            availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableRoomsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(availableRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(120, 120, 120)))
                .addGap(18, 18, 18)
                .addComponent(totalRoomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        availableRoomsLayout.setVerticalGroup(
            availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, availableRoomsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(availableRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availableRoomsLayout.createSequentialGroup()
                        .addComponent(totalRoomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(availableRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );

        jPanel2.add(availableRooms);

        occupiedRooms.setBackground(new java.awt.Color(255, 255, 255));
        occupiedRooms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel7.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("<html>\nRooms that are currently assigned<br/>\nand in use by guests.\n</html>");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Occupied Rooms");

        occupiedRoomsLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        occupiedRoomsLabel.setForeground(new java.awt.Color(0, 0, 0));
        occupiedRoomsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        occupiedRoomsLabel.setText("30");

        javax.swing.GroupLayout occupiedRoomsLayout = new javax.swing.GroupLayout(occupiedRooms);
        occupiedRooms.setLayout(occupiedRoomsLayout);
        occupiedRoomsLayout.setHorizontalGroup(
            occupiedRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(occupiedRoomsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(occupiedRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(occupiedRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(72, 72, 72)))
                .addGap(18, 18, 18)
                .addComponent(occupiedRoomsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        occupiedRoomsLayout.setVerticalGroup(
            occupiedRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, occupiedRoomsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(occupiedRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(occupiedRoomsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, occupiedRoomsLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(12, 12, 12))
        );

        jPanel2.add(occupiedRooms);

        roomMaintanance.setBackground(new java.awt.Color(255, 255, 255));
        roomMaintanance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel10.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("<html>\nRooms currently out of service<br/>\nawaiting maintenance.\n</html>");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Rooms Under Maintaince");

        roomMaintananceLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        roomMaintananceLabel.setForeground(new java.awt.Color(0, 0, 0));
        roomMaintananceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomMaintananceLabel.setText("30");

        javax.swing.GroupLayout roomMaintananceLayout = new javax.swing.GroupLayout(roomMaintanance);
        roomMaintanance.setLayout(roomMaintananceLayout);
        roomMaintananceLayout.setHorizontalGroup(
            roomMaintananceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomMaintananceLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(roomMaintananceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addGroup(roomMaintananceLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomMaintananceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        roomMaintananceLayout.setVerticalGroup(
            roomMaintananceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomMaintananceLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(roomMaintananceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roomMaintananceLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roomMaintananceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel2.add(roomMaintanance);

        cleaningPendings.setBackground(new java.awt.Color(255, 255, 255));
        cleaningPendings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("<html>\nRooms awaiting cleaning after<br/>\nguest check-out.\n<html/>");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cleaning Pendings");

        cleaningPendingsLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        cleaningPendingsLabel.setForeground(new java.awt.Color(0, 0, 0));
        cleaningPendingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleaningPendingsLabel.setText("30");

        javax.swing.GroupLayout cleaningPendingsLayout = new javax.swing.GroupLayout(cleaningPendings);
        cleaningPendings.setLayout(cleaningPendingsLayout);
        cleaningPendingsLayout.setHorizontalGroup(
            cleaningPendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cleaningPendingsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(cleaningPendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cleaningPendingsLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(102, 102, 102))
                    .addGroup(cleaningPendingsLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)))
                .addComponent(cleaningPendingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        cleaningPendingsLayout.setVerticalGroup(
            cleaningPendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cleaningPendingsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(cleaningPendingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cleaningPendingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cleaningPendingsLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addGap(12, 12, 12))
        );

        jPanel2.add(cleaningPendings);

        jButton2.setBackground(new java.awt.Color(245, 245, 245));
        jButton2.setBorder(null);
        jButton2.setPreferredSize(new java.awt.Dimension(128, 35));

        jButton3.setBackground(new java.awt.Color(245, 245, 245));
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(128, 35));

        jButton5.setBackground(new java.awt.Color(245, 245, 245));
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(128, 35));

        jButton4.setBackground(new java.awt.Color(245, 245, 245));
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(128, 35));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(237, 237, 237), 1, true));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        roomOperationTable.setBackground(new java.awt.Color(255, 255, 255));
        roomOperationTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        roomOperationTable.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        roomOperationTable.setForeground(new java.awt.Color(0, 0, 0));
        roomOperationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Guset ID", "Full Name", "Mobiel", "Email", "Check-in Date", "Check-out Date", "Room Number", "Booking Status", "Payment Status", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomOperationTable.setRowHeight(6);
        roomOperationTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        roomOperationTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(roomOperationTable);

        roomRegisterBtn.setBackground(new java.awt.Color(0, 0, 0));
        roomRegisterBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        roomRegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        roomRegisterBtn.setText("Register Room");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(582, 582, 582)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomRegisterBtn)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(roomRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableRooms;
    private javax.swing.JPanel cleaningPendings;
    private javax.swing.JLabel cleaningPendingsLabel;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel occupiedRooms;
    private javax.swing.JLabel occupiedRoomsLabel;
    private javax.swing.JPanel roomMaintanance;
    private javax.swing.JLabel roomMaintananceLabel;
    private javax.swing.JTable roomOperationTable;
    private javax.swing.JButton roomRegisterBtn;
    private javax.swing.JLabel totalRoomsLabel;
    // End of variables declaration//GEN-END:variables
}
