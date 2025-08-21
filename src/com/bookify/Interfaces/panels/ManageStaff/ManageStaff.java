package com.bookify.Interfaces.panels.ManageStaff;

import com.bookify.CustomRenderComponent.CustomTableHeader;
import com.bookify.CustomRenderComponent.RoundedBorder;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;

public class ManageStaff extends javax.swing.JPanel {

    public ManageStaff() {
        initComponents();
        init();
    }

    private void init() {
        homeIcon.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Home.svg", homeIcon.getWidth(), homeIcon.getHeight()));

        RoundedBorder.applyToPanel(totalStaff, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);
        RoundedBorder.applyToPanel(activeStaff, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);
        RoundedBorder.applyToPanel(onLeave, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);
        RoundedBorder.applyToPanel(cleanersOnDuty, 10, 1, Color.decode("#D9D9D9"), Color.WHITE);

        jButton2.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        jButton3.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        jButton4.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        jButton5.putClientProperty(FlatClientProperties.STYLE, "arc:10");

        new CustomTableHeader(staffTabel.getTableHeader()).initHeader();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        totalStaff = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalStaffLabel = new javax.swing.JLabel();
        activeStaff = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        activeStaffLabel = new javax.swing.JLabel();
        onLeave = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        onLeaveLabel = new javax.swing.JLabel();
        cleanersOnDuty = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cleanersLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTabel = new javax.swing.JTable();
        registerMemberBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        homeIcon.setBackground(new java.awt.Color(255, 255, 255));
        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeIcon.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/  Staff Management");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Staff Management");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1, 5, 5));

        totalStaff.setBackground(new java.awt.Color(255, 255, 255));
        totalStaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel4.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total Staff");

        jLabel5.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("<html>\nComplete count of all staff<br/>\ncurrently in the system.\n</html>");
        jLabel5.setToolTipText("");

        totalStaffLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        totalStaffLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalStaffLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalStaffLabel.setText("30");

        javax.swing.GroupLayout totalStaffLayout = new javax.swing.GroupLayout(totalStaff);
        totalStaff.setLayout(totalStaffLayout);
        totalStaffLayout.setHorizontalGroup(
            totalStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalStaffLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(totalStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(totalStaffLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addGap(120, 120, 120)))
                .addGap(18, 18, 18)
                .addComponent(totalStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        totalStaffLayout.setVerticalGroup(
            totalStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalStaffLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(totalStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(totalStaffLayout.createSequentialGroup()
                        .addComponent(totalStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(totalStaffLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );

        jPanel2.add(totalStaff);

        activeStaff.setBackground(new java.awt.Color(255, 255, 255));
        activeStaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel7.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("<html>\nStaff members currently marked as<br/>\nactive and available.\n</html>");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Active Staff");

        activeStaffLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        activeStaffLabel.setForeground(new java.awt.Color(0, 0, 0));
        activeStaffLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeStaffLabel.setText("30");

        javax.swing.GroupLayout activeStaffLayout = new javax.swing.GroupLayout(activeStaff);
        activeStaff.setLayout(activeStaffLayout);
        activeStaffLayout.setHorizontalGroup(
            activeStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeStaffLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(activeStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(activeStaffLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(72, 72, 72)))
                .addGap(18, 18, 18)
                .addComponent(activeStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        activeStaffLayout.setVerticalGroup(
            activeStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activeStaffLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(activeStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(activeStaffLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, activeStaffLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        jPanel2.add(activeStaff);

        onLeave.setBackground(new java.awt.Color(255, 255, 255));
        onLeave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel10.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("<html>\nStaff currently not reporting for<br/>\nduty due to approved leave.\n</html>");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("On Leave");

        onLeaveLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        onLeaveLabel.setForeground(new java.awt.Color(0, 0, 0));
        onLeaveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onLeaveLabel.setText("30");

        javax.swing.GroupLayout onLeaveLayout = new javax.swing.GroupLayout(onLeave);
        onLeave.setLayout(onLeaveLayout);
        onLeaveLayout.setHorizontalGroup(
            onLeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onLeaveLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(onLeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addGroup(onLeaveLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onLeaveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        onLeaveLayout.setVerticalGroup(
            onLeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, onLeaveLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(onLeaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(onLeaveLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(onLeaveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel2.add(onLeave);

        cleanersOnDuty.setBackground(new java.awt.Color(255, 255, 255));
        cleanersOnDuty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("<html>\nCleaners currently marked as on<br/>\nduty and available.. \n</html>");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cleaners On Duty");

        cleanersLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        cleanersLabel.setForeground(new java.awt.Color(0, 0, 0));
        cleanersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleanersLabel.setText("30");

        javax.swing.GroupLayout cleanersOnDutyLayout = new javax.swing.GroupLayout(cleanersOnDuty);
        cleanersOnDuty.setLayout(cleanersOnDutyLayout);
        cleanersOnDutyLayout.setHorizontalGroup(
            cleanersOnDutyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cleanersOnDutyLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(cleanersOnDutyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cleanersOnDutyLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addGap(102, 102, 102))
                    .addGroup(cleanersOnDutyLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)))
                .addComponent(cleanersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        cleanersOnDutyLayout.setVerticalGroup(
            cleanersOnDutyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cleanersOnDutyLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(cleanersOnDutyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cleanersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cleanersOnDutyLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        jPanel2.add(cleanersOnDuty);

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

        staffTabel.setBackground(new java.awt.Color(255, 255, 255));
        staffTabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));
        staffTabel.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        staffTabel.setForeground(new java.awt.Color(0, 0, 0));
        staffTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Staff ID", "Full Name", "Role", "Contact", "Email Address", "Joined Date", "Status", "Arrival Schedule", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        staffTabel.setRowHeight(6);
        staffTabel.setSelectionBackground(new java.awt.Color(0, 0, 0));
        staffTabel.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(staffTabel);

        registerMemberBtn.setBackground(new java.awt.Color(0, 0, 0));
        registerMemberBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        registerMemberBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerMemberBtn.setText("Register Member");
        registerMemberBtn.setMaximumSize(new java.awt.Dimension(135, 24));
        registerMemberBtn.setMinimumSize(new java.awt.Dimension(135, 24));
        registerMemberBtn.setPreferredSize(new java.awt.Dimension(135, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(582, 582, 582)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registerMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activeStaff;
    private javax.swing.JLabel activeStaffLabel;
    private javax.swing.JLabel cleanersLabel;
    private javax.swing.JPanel cleanersOnDuty;
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
    private javax.swing.JPanel onLeave;
    private javax.swing.JLabel onLeaveLabel;
    private javax.swing.JButton registerMemberBtn;
    private javax.swing.JTable staffTabel;
    private javax.swing.JPanel totalStaff;
    private javax.swing.JLabel totalStaffLabel;
    // End of variables declaration//GEN-END:variables
}
