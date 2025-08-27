package com.bookify.Interfaces;

import com.bookify.Constant.ThemeColors;
import com.bookify.CustomRenderComponent.RoundedBorder;
import com.bookify.Interfaces.Calender.CalenderPanel;
import com.bookify.Interfaces.ManageGuests.Panels.ManageGuest;
import com.bookify.Interfaces.Reservation.Panels.Reservation;
import com.bookify.Interfaces.Dashboard.Panels.Dashboard;
import com.bookify.Interfaces.ManageStaff.Panels.ManageStaff;
import com.bookify.Interfaces.RoomOperation.Panels.RoomOperation;
import com.bookify.Interfaces.RoomServiceNotification.Panels.RoomService;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MainScreen extends javax.swing.JFrame {

    static {
        UIManager.put("Component.borderColor", new Color(237, 237, 237));
        UIManager.put("Component.focusColor", new Color(237, 237, 237));
        UIManager.put("Component.focusWidth", 0);
        UIManager.put("Component.innerFocusWidth", 0);
        UIManager.put("Component.arc", 12);
    }

    private CardLayout cardLayout;
    private Dashboard dashboard;
    private Reservation reservation;
    private ManageGuest manageGuest;
    private ManageStaff manageStaff;
    private RoomOperation roomOperation;
    private CalenderPanel calenderPanel;
    private RoomService roomService;


    public MainScreen() {
        initComponents();
        initPanels();
        init();
        initButtons();
    }

    private void initPanels() {
        if (cardLayout == null && mainPanel.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) mainPanel.getLayout();
        }

        this.dashboard = new Dashboard();
        this.reservation = new Reservation();
        this.manageGuest = new ManageGuest();
        this.manageStaff = new ManageStaff();
        this.roomOperation = new RoomOperation();
        this.calenderPanel = new CalenderPanel();
        this.roomService = new RoomService();

        RoundedBorder.applyLineBorder(dashboard, 20);
        RoundedBorder.applyLineBorder(reservation, 20);
        RoundedBorder.applyLineBorder(manageGuest, 20);
        RoundedBorder.applyLineBorder(manageStaff, 20);
        RoundedBorder.applyLineBorder(roomOperation, 20);
        RoundedBorder.applyLineBorder(calenderPanel, 20);
        RoundedBorder.applyLineBorder(roomService, 20);

        RoundedBorder.applyToPanel(mainPanel, 20, 1, Color.decode("#EDEDED"), Color.WHITE);

        this.mainPanel.add(dashboard, "dashboard");
        this.mainPanel.add(reservation, "reservation");
        this.mainPanel.add(manageGuest, "manageGuest");
        this.mainPanel.add(manageStaff, "manageStaff");
        this.mainPanel.add(roomOperation, "roomOperation");
        this.mainPanel.add(calenderPanel, "calenderPanel");
        this.mainPanel.add(roomService, "roomService");


        SwingUtilities.updateComponentTreeUI(mainPanel);
    }

    private void initButtons() {
        // <editor-fold defaultstate="collapsed" desc="Buttons">   
        Color defaultColor = ThemeColors.BACKGROUND_MIDDLE_GRAY;
        Color clickedColor = ThemeColors.WHITE;

        ArrayList<JButton> buttonsList = new ArrayList<>();
        buttonsList.add(dashboardBtn);
        buttonsList.add(reservationBtn);
        buttonsList.add(roomOperationBtn);
        buttonsList.add(manageStaffBtn);
        buttonsList.add(manageGuestsBtn);
        buttonsList.add(BookingsBtn);
        buttonsList.add(analyticsBtn);
        buttonsList.add(roomNotifiBtn);

        for (JButton btn : buttonsList) {
            btn.setBackground(defaultColor);
            btn.setForeground(Color.BLACK);
            btn.setBorder(null);
            btn.setFocusPainted(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setMargin(new Insets(5, 20, 5, 5));
            btn.putClientProperty(FlatClientProperties.STYLE,
                    "arc:10; borderWidth:0");
        }

        dashboardBtn.setBackground(clickedColor);
        dashboardBtn.putClientProperty(FlatClientProperties.STYLE,
                "arc:10; borderColor:#D9D9D9; borderWidth:1");

        for (JButton btn : buttonsList) {
            btn.addActionListener(e -> {
                for (JButton b : buttonsList) {
                    b.setBackground(defaultColor);
                    b.putClientProperty(FlatClientProperties.STYLE,
                            "arc:10; borderWidth:0");
                }

                btn.setBackground(clickedColor);
                btn.putClientProperty(FlatClientProperties.STYLE,
                        "arc:10; borderColor:#D9D9D9; borderWidth:1");
            });
        }

        dashboardBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Dashboard.svg", 25, 25));
        dashboardBtn.setHorizontalAlignment(SwingConstants.LEFT);
        dashboardBtn.setIconTextGap(10);
        dashboardBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        reservationBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Reservation.svg", 25, 25));
        reservationBtn.setHorizontalAlignment(SwingConstants.LEFT);
        reservationBtn.setIconTextGap(10);
        reservationBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        roomOperationBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/RoomOperation.svg", 25, 25));
        roomOperationBtn.setHorizontalAlignment(SwingConstants.LEFT);
        roomOperationBtn.setIconTextGap(10);
        roomOperationBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        manageStaffBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/ManageStaff.svg", 25, 25));
        manageStaffBtn.setHorizontalAlignment(SwingConstants.LEFT);
        manageStaffBtn.setIconTextGap(10);
        manageStaffBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        manageGuestsBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/ManageGuests.svg", 25, 25));
        manageGuestsBtn.setHorizontalAlignment(SwingConstants.LEFT);
        manageGuestsBtn.setIconTextGap(10);
        manageGuestsBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        BookingsBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Booking-Summery.svg", 25, 25));
        BookingsBtn.setHorizontalAlignment(SwingConstants.LEFT);
        BookingsBtn.setIconTextGap(10);
        BookingsBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        analyticsBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Chart.svg", 25, 25));
        analyticsBtn.setHorizontalAlignment(SwingConstants.LEFT);
        analyticsBtn.setIconTextGap(10);
        analyticsBtn.setHorizontalTextPosition(SwingConstants.RIGHT);

        roomNotifiBtn.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Notification.svg", 25, 25));
        roomNotifiBtn.setHorizontalAlignment(SwingConstants.LEFT);
        roomNotifiBtn.setIconTextGap(10);
        roomNotifiBtn.setHorizontalTextPosition(SwingConstants.RIGHT);
        // </editor-fold>
    }

    private void init() {
        mainLogo.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Logo.svg", 43, 43));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        dashboardBtn = new javax.swing.JButton();
        mainLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reservationBtn = new javax.swing.JButton();
        roomOperationBtn = new javax.swing.JButton();
        manageStaffBtn = new javax.swing.JButton();
        manageGuestsBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BookingsBtn = new javax.swing.JButton();
        analyticsBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        roomNotifiBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bookify System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        dashboardBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        dashboardBtn.setText("Dashboard");
        dashboardBtn.setBorder(null);
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        mainLogo.setBackground(new java.awt.Color(247, 247, 247));
        mainLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLogo.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Inter 18pt", 1, 19)); // NOI18N
        jLabel1.setText("Bookify");

        jLabel2.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(167, 165, 165));
        jLabel2.setText("Daily Operation");

        reservationBtn.setBackground(new java.awt.Color(247, 247, 247));
        reservationBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        reservationBtn.setText("Reservation");
        reservationBtn.setBorder(null);
        reservationBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reservationBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        reservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationBtnActionPerformed(evt);
            }
        });

        roomOperationBtn.setBackground(new java.awt.Color(247, 247, 247));
        roomOperationBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        roomOperationBtn.setText("Room Operation");
        roomOperationBtn.setBorder(null);
        roomOperationBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roomOperationBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        roomOperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomOperationBtnActionPerformed(evt);
            }
        });

        manageStaffBtn.setBackground(new java.awt.Color(247, 247, 247));
        manageStaffBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        manageStaffBtn.setText("Manage Staff");
        manageStaffBtn.setBorder(null);
        manageStaffBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageStaffBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        manageStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStaffBtnActionPerformed(evt);
            }
        });

        manageGuestsBtn.setBackground(new java.awt.Color(247, 247, 247));
        manageGuestsBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        manageGuestsBtn.setText("Manage Guests");
        manageGuestsBtn.setBorder(null);
        manageGuestsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageGuestsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        manageGuestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageGuestsBtnActionPerformed(evt);
            }
        });

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(167, 165, 165));
        jLabel3.setText("Summery");

        BookingsBtn.setBackground(new java.awt.Color(247, 247, 247));
        BookingsBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        BookingsBtn.setText("Bookings");
        BookingsBtn.setBorder(null);
        BookingsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BookingsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingsBtnActionPerformed(evt);
            }
        });

        analyticsBtn.setBackground(new java.awt.Color(247, 247, 247));
        analyticsBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        analyticsBtn.setText("Analytics");
        analyticsBtn.setBorder(null);
        analyticsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        analyticsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        analyticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyticsBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(167, 165, 165));
        jLabel4.setText("Notification");

        roomNotifiBtn.setBackground(new java.awt.Color(247, 247, 247));
        roomNotifiBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        roomNotifiBtn.setText("Room & Service");
        roomNotifiBtn.setBorder(null);
        roomNotifiBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roomNotifiBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        roomNotifiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNotifiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomOperationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageGuestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(BookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analyticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNotifiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(mainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomOperationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageGuestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BookingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(analyticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(roomNotifiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        cardLayout.show(mainPanel, "dashboard");
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void reservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationBtnActionPerformed
        cardLayout.show(mainPanel, "reservation");
    }//GEN-LAST:event_reservationBtnActionPerformed

    private void roomOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomOperationBtnActionPerformed
        cardLayout.show(mainPanel, "roomOperation");
    }//GEN-LAST:event_roomOperationBtnActionPerformed

    private void manageStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStaffBtnActionPerformed
        cardLayout.show(mainPanel, "manageStaff");
    }//GEN-LAST:event_manageStaffBtnActionPerformed

    private void manageGuestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageGuestsBtnActionPerformed
        cardLayout.show(mainPanel, "manageGuest");
    }//GEN-LAST:event_manageGuestsBtnActionPerformed

    private void BookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingsBtnActionPerformed
        cardLayout.show(mainPanel, "calenderPanel");
    }//GEN-LAST:event_BookingsBtnActionPerformed

    private void analyticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyticsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analyticsBtnActionPerformed

    private void roomNotifiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNotifiBtnActionPerformed
        cardLayout.show(mainPanel, "roomService");
    }//GEN-LAST:event_roomNotifiBtnActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new MainScreen().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookingsBtn;
    private javax.swing.JButton analyticsBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainLogo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manageGuestsBtn;
    private javax.swing.JButton manageStaffBtn;
    private java.awt.Panel panel1;
    private javax.swing.JButton reservationBtn;
    private javax.swing.JButton roomNotifiBtn;
    private javax.swing.JButton roomOperationBtn;
    // End of variables declaration//GEN-END:variables
}
