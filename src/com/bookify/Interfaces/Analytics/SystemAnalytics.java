package com.bookify.Interfaces.Analytics;

import com.bookify.Constant.ThemeColors;
import com.bookify.Interfaces.Analytics.Panels.BookingAnalysis;
import com.bookify.Interfaces.Analytics.Panels.GuestsAnalysis;
import com.bookify.Interfaces.Analytics.Panels.OperationalAnalysis;
import com.bookify.Interfaces.Analytics.Panels.RevenueAnalysis;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class SystemAnalytics extends javax.swing.JPanel {

    private CardLayout cardLayout;
    private BookingAnalysis bookingAnalysis;
    private RevenueAnalysis revenueAnalysis;
    private GuestsAnalysis guestsAnalysis;
    private OperationalAnalysis operationalAnalysis;

    public SystemAnalytics() {
        initComponents();
        init();
        initPanels();
        initButtons();
    }

    private void initButtons() {
        Color defaultColor = Color.WHITE;
        Color clickedColor = Color.BLACK;

        ArrayList<JButton> buttonsList = new ArrayList<>();
        buttonsList.add(jButton1);
        buttonsList.add(jButton2);
        buttonsList.add(jButton3);
        buttonsList.add(jButton4);
        buttonsList.add(jButton5);
        buttonsList.add(jButton6);

        for (JButton btn : buttonsList) {
            btn.setBackground(defaultColor);
            btn.setForeground(Color.BLACK);
            btn.setBorder(null);
            btn.setFocusPainted(false);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setMargin(new Insets(5, 5, 5, 5));
            btn.putClientProperty(FlatClientProperties.STYLE,
                    "arc:12; borderWidth:0");
        }

        jButton1.setBackground(clickedColor);
        jButton1.setForeground(Color.WHITE);
        jButton1.putClientProperty(FlatClientProperties.STYLE,
                "arc:12; borderColor:#D9D9D9; borderWidth:0");

        for (JButton btn : buttonsList) {
            btn.addActionListener(e -> {
                for (JButton b : buttonsList) {
                    b.setBackground(defaultColor);
                    b.setForeground(Color.BLACK);
                    b.putClientProperty(FlatClientProperties.STYLE,
                            "arc:12; borderWidth:0");
                }

                btn.setBackground(clickedColor);
                btn.setForeground(Color.WHITE);
                btn.putClientProperty(FlatClientProperties.STYLE,
                        "arc:12; borderWidth:0");
            });
        }
    }

    private void initPanels() {
        if (cardLayout == null && mainLayout.getLayout() instanceof CardLayout) {
            this.cardLayout = (CardLayout) mainLayout.getLayout();
        }

        this.bookingAnalysis = new BookingAnalysis();
        this.revenueAnalysis = new RevenueAnalysis();
        this.guestsAnalysis = new GuestsAnalysis();
        this.operationalAnalysis = new OperationalAnalysis();

        this.mainLayout.add(bookingAnalysis, "bookingAnalysis");
        this.mainLayout.add(revenueAnalysis, "revenueAnalysis");
        this.mainLayout.add(guestsAnalysis, "guestsAnalysis");
        this.mainLayout.add(operationalAnalysis, "operationalAnalysis");

        this.cardLayout.show(mainLayout, "bookingAnalysis");
        SwingUtilities.updateComponentTreeUI(mainLayout);
    }

    private void init() {
        homeIcon.setIcon(new FlatSVGIcon("com/bookify/Resources/Icons/Home.svg", 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        mainLayout = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        homeIcon.setBackground(new java.awt.Color(255, 255, 255));
        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/ Analytics");

        jLabel25.setFont(new java.awt.Font("Inter 18pt", 1, 26)); // NOI18N
        jLabel25.setText("System Analytics");

        jButton1.setBackground(new java.awt.Color(43, 43, 43));
        jButton1.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Booking Analysis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jButton2.setText("Revenue Analysis");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jButton3.setText("Guests Analysis");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jButton4.setText("Operational Analysis");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jButton5.setText("Customer Experience");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton6.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jButton6.setText("Seasonal Insights");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        mainLayout.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6))
                    .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel25)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(mainLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.cardLayout.show(mainLayout, "bookingAnalysis");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.cardLayout.show(mainLayout, "revenueAnalysis");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.cardLayout.show(mainLayout, "guestsAnalysis");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.cardLayout.show(mainLayout, "operationalAnalysis");
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainLayout;
    // End of variables declaration//GEN-END:variables
}
