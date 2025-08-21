package com.bookify.Interfaces.Panels.ManageGuests;

import com.bookify.CustomRenderComponent.CustomTableHeader;
import com.bookify.CustomRenderComponent.RoundedBorder;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class ManageGuest extends javax.swing.JPanel {

    public ManageGuest() {
        initComponents();
        init();
    }

    private void init() {
        homeIcon.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Home.svg", homeIcon.getWidth(), homeIcon.getHeight()));
        RoundedBorder.applyLineBorder(totalGuests, 20);
        RoundedBorder.applyLineBorder(currentlyCheckIns, 20);
        RoundedBorder.applyLineBorder(upcomingCheckouts, 20);
        RoundedBorder.applyLineBorder(checkOutToday, 20);
        RoundedBorder.applyLineBorder(tablePanel, 20);
        reloadBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Reload.svg"));
        reloadBtn.putClientProperty(FlatClientProperties.STYLE, "arc:12");
        searchField.putClientProperty(FlatClientProperties.STYLE, "arc:12");
        new CustomTableHeader(guestTabel.getTableHeader()).initHeader();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        totalGuests = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalGuestLabel = new javax.swing.JLabel();
        currentlyCheckIns = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        checkInLabel = new javax.swing.JLabel();
        upcomingCheckouts = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        checkOutLabel = new javax.swing.JLabel();
        checkOutToday = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        checkOutTodayLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        reloadBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        guestTabel = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        homeIcon.setBackground(new java.awt.Color(255, 255, 255));
        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeIcon.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/  Guest Management");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 1, 26)); // NOI18N
        jLabel3.setText("Manage Guests");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1, 5, 5));

        totalGuests.setBackground(new java.awt.Color(255, 255, 255));
        totalGuests.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel4.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel4.setText("Total Guests");

        jLabel5.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("<html>\nCumulative count of all guests who<br/>\nhave stayed or booked.\n</html>");
        jLabel5.setToolTipText("");

        totalGuestLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        totalGuestLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalGuestLabel.setText("30");

        javax.swing.GroupLayout totalGuestsLayout = new javax.swing.GroupLayout(totalGuests);
        totalGuests.setLayout(totalGuestsLayout);
        totalGuestsLayout.setHorizontalGroup(
            totalGuestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalGuestsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(totalGuestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(totalGuestsLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(120, 120, 120)))
                .addGap(18, 18, 18)
                .addComponent(totalGuestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        totalGuestsLayout.setVerticalGroup(
            totalGuestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalGuestsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(totalGuestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(totalGuestsLayout.createSequentialGroup()
                        .addComponent(totalGuestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(totalGuestsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );

        jPanel2.add(totalGuests);

        currentlyCheckIns.setBackground(new java.awt.Color(255, 255, 255));
        currentlyCheckIns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel7.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("<html>\nNumber of guests currently <br/>\n staying in the hotel.\n</html>");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel8.setText("Currently Check-ins");

        checkInLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        checkInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkInLabel.setText("30");

        javax.swing.GroupLayout currentlyCheckInsLayout = new javax.swing.GroupLayout(currentlyCheckIns);
        currentlyCheckIns.setLayout(currentlyCheckInsLayout);
        currentlyCheckInsLayout.setHorizontalGroup(
            currentlyCheckInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentlyCheckInsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(currentlyCheckInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(currentlyCheckInsLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(72, 72, 72)))
                .addGap(18, 18, 18)
                .addComponent(checkInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        currentlyCheckInsLayout.setVerticalGroup(
            currentlyCheckInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentlyCheckInsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(currentlyCheckInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, currentlyCheckInsLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(12, 12, 12))
        );

        jPanel2.add(currentlyCheckIns);

        upcomingCheckouts.setBackground(new java.awt.Color(255, 255, 255));
        upcomingCheckouts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel10.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("<html>\nGuests presently checked into their<br/>\nrooms.\n</html>");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel11.setText("Upcoming Check-outs");

        checkOutLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        checkOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkOutLabel.setText("30");

        javax.swing.GroupLayout upcomingCheckoutsLayout = new javax.swing.GroupLayout(upcomingCheckouts);
        upcomingCheckouts.setLayout(upcomingCheckoutsLayout);
        upcomingCheckoutsLayout.setHorizontalGroup(
            upcomingCheckoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingCheckoutsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(upcomingCheckoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addGroup(upcomingCheckoutsLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        upcomingCheckoutsLayout.setVerticalGroup(
            upcomingCheckoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upcomingCheckoutsLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(upcomingCheckoutsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(upcomingCheckoutsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel2.add(upcomingCheckouts);

        checkOutToday.setBackground(new java.awt.Color(255, 255, 255));
        checkOutToday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("<html> Guests who departed the hotel<br/> today. </html>");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel14.setText("Check-out Today");

        checkOutTodayLabel.setFont(new java.awt.Font("Inter 18pt", 1, 35)); // NOI18N
        checkOutTodayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkOutTodayLabel.setText("30");

        javax.swing.GroupLayout checkOutTodayLayout = new javax.swing.GroupLayout(checkOutToday);
        checkOutToday.setLayout(checkOutTodayLayout);
        checkOutTodayLayout.setHorizontalGroup(
            checkOutTodayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkOutTodayLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(checkOutTodayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkOutTodayLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(102, 102, 102))
                    .addGroup(checkOutTodayLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)))
                .addComponent(checkOutTodayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        checkOutTodayLayout.setVerticalGroup(
            checkOutTodayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkOutTodayLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(checkOutTodayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkOutTodayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, checkOutTodayLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addGap(12, 12, 12))
        );

        jPanel2.add(checkOutToday);

        jComboBox1.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booking Status" }));

        jComboBox2.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Payment Status" }));

        searchField.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        searchField.setText("Search");

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 247, 247)));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        guestTabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        guestTabel.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        guestTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        guestTabel.setRowHeight(6);
        guestTabel.setSelectionBackground(new java.awt.Color(0, 0, 0));
        guestTabel.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(guestTabel);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkInLabel;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JPanel checkOutToday;
    private javax.swing.JLabel checkOutTodayLabel;
    private javax.swing.JPanel currentlyCheckIns;
    private javax.swing.JTable guestTabel;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JButton reloadBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel totalGuestLabel;
    private javax.swing.JPanel totalGuests;
    private javax.swing.JPanel upcomingCheckouts;
    // End of variables declaration//GEN-END:variables
}
