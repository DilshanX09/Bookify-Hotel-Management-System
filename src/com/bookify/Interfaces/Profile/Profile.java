package com.bookify.Interfaces.Profile;

import com.bookify.Constant.ThemeColors;
import com.bookify.CustomRenderComponent.RoundedBorder;
import com.bookify.CustomRenderComponent.RoundedPanel;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;

public final class Profile extends javax.swing.JDialog {

    public Profile(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    public void init() {
        RoundedPanel.setRounded(breadCrumbBackground, 38, ThemeColors.BACKGROUND_MIDDLE_GRAY);
        RoundedBorder.applyToPanel(staffIdPanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(joinedDatePanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(staffMemberNamePanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(jobRolePanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(emailPanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(phonePanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(lineOnePanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(lineTwoPanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(cityPanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(districtPanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(provincePanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(postalCodePanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(statusPanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        RoundedBorder.applyToPanel(genderPanel, 10, 1, ThemeColors.BORDER_GRAY, Color.WHITE);
        logOutButton.putClientProperty(FlatClientProperties.STYLE, "arc:200;");
        cancelButton.putClientProperty(FlatClientProperties.STYLE, "arc:200;");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        breadCrumbBackground = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        staffIdPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        joinedDatePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        staffMemberNamePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jobRolePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phonePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lineOnePanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lineTwoPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cityPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        districtPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        provincePanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        postalCodePanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        genderPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profile");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        breadCrumbBackground.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard   /   Profile");

        javax.swing.GroupLayout breadCrumbBackgroundLayout = new javax.swing.GroupLayout(breadCrumbBackground);
        breadCrumbBackground.setLayout(breadCrumbBackgroundLayout);
        breadCrumbBackgroundLayout.setHorizontalGroup(
            breadCrumbBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breadCrumbBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        breadCrumbBackgroundLayout.setVerticalGroup(
            breadCrumbBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, breadCrumbBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel25.setFont(new java.awt.Font("Inter 18pt Medium", 0, 18)); // NOI18N
        jLabel25.setText("Profile Information");

        jLabel26.setFont(new java.awt.Font("Inter 18pt", 0, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(148, 146, 146));
        jLabel26.setText("<html>\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s \n</html>");

        jLabel1.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 157, 157));
        jLabel1.setText("Staff ID");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel3.setText("#ID-17873923");

        javax.swing.GroupLayout staffIdPanelLayout = new javax.swing.GroupLayout(staffIdPanel);
        staffIdPanel.setLayout(staffIdPanelLayout);
        staffIdPanelLayout.setHorizontalGroup(
            staffIdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffIdPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(staffIdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        staffIdPanelLayout.setVerticalGroup(
            staffIdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffIdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        joinedDatePanel.setPreferredSize(new java.awt.Dimension(220, 59));

        jLabel4.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(157, 157, 157));
        jLabel4.setText("Joined date");

        jLabel5.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel5.setText("21 November, 2025");

        javax.swing.GroupLayout joinedDatePanelLayout = new javax.swing.GroupLayout(joinedDatePanel);
        joinedDatePanel.setLayout(joinedDatePanelLayout);
        joinedDatePanelLayout.setHorizontalGroup(
            joinedDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinedDatePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(joinedDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        joinedDatePanelLayout.setVerticalGroup(
            joinedDatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinedDatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(157, 157, 157));
        jLabel6.setText("Staff member full name");

        jLabel7.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel7.setText("jhone deo ");

        javax.swing.GroupLayout staffMemberNamePanelLayout = new javax.swing.GroupLayout(staffMemberNamePanel);
        staffMemberNamePanel.setLayout(staffMemberNamePanelLayout);
        staffMemberNamePanelLayout.setHorizontalGroup(
            staffMemberNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffMemberNamePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(staffMemberNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staffMemberNamePanelLayout.setVerticalGroup(
            staffMemberNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffMemberNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jobRolePanel.setPreferredSize(new java.awt.Dimension(220, 59));

        jLabel8.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(157, 157, 157));
        jLabel8.setText("Job role");

        jLabel9.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel9.setText("STAFF");

        javax.swing.GroupLayout jobRolePanelLayout = new javax.swing.GroupLayout(jobRolePanel);
        jobRolePanel.setLayout(jobRolePanelLayout);
        jobRolePanelLayout.setHorizontalGroup(
            jobRolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jobRolePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jobRolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jobRolePanelLayout.setVerticalGroup(
            jobRolePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jobRolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(157, 157, 157));
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel11.setText("jhonedeo@example.com ");

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        phonePanel.setPreferredSize(new java.awt.Dimension(220, 59));

        jLabel12.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(157, 157, 157));
        jLabel12.setText("Phone");

        jLabel13.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel13.setText("+94 71 917 8824");

        javax.swing.GroupLayout phonePanelLayout = new javax.swing.GroupLayout(phonePanel);
        phonePanel.setLayout(phonePanelLayout);
        phonePanelLayout.setHorizontalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phonePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        phonePanelLayout.setVerticalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phonePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(157, 157, 157));
        jLabel14.setText("Address line 01");

        jLabel15.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel15.setText("C87 Colombo road, Avissawella");

        javax.swing.GroupLayout lineOnePanelLayout = new javax.swing.GroupLayout(lineOnePanel);
        lineOnePanel.setLayout(lineOnePanelLayout);
        lineOnePanelLayout.setHorizontalGroup(
            lineOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineOnePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(lineOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        lineOnePanelLayout.setVerticalGroup(
            lineOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineOnePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lineTwoPanel.setPreferredSize(new java.awt.Dimension(220, 59));

        jLabel16.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(157, 157, 157));
        jLabel16.setText("Address line 02");

        jLabel17.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel17.setText("C87 Colombo road, Avissawella");

        javax.swing.GroupLayout lineTwoPanelLayout = new javax.swing.GroupLayout(lineTwoPanel);
        lineTwoPanel.setLayout(lineTwoPanelLayout);
        lineTwoPanelLayout.setHorizontalGroup(
            lineTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lineTwoPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(lineTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        lineTwoPanelLayout.setVerticalGroup(
            lineTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lineTwoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(157, 157, 157));
        jLabel18.setText("City");

        jLabel19.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel19.setText("Avissawella");

        javax.swing.GroupLayout cityPanelLayout = new javax.swing.GroupLayout(cityPanel);
        cityPanel.setLayout(cityPanelLayout);
        cityPanelLayout.setHorizontalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cityPanelLayout.setVerticalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        districtPanel.setPreferredSize(new java.awt.Dimension(220, 59));

        jLabel20.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(157, 157, 157));
        jLabel20.setText("District");

        jLabel21.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel21.setText("Colombo");

        javax.swing.GroupLayout districtPanelLayout = new javax.swing.GroupLayout(districtPanel);
        districtPanel.setLayout(districtPanelLayout);
        districtPanelLayout.setHorizontalGroup(
            districtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(districtPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(districtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        districtPanelLayout.setVerticalGroup(
            districtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, districtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(157, 157, 157));
        jLabel22.setText("Province");

        jLabel23.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel23.setText("Western province");

        javax.swing.GroupLayout provincePanelLayout = new javax.swing.GroupLayout(provincePanel);
        provincePanel.setLayout(provincePanelLayout);
        provincePanelLayout.setHorizontalGroup(
            provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provincePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        provincePanelLayout.setVerticalGroup(
            provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provincePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        postalCodePanel.setPreferredSize(new java.awt.Dimension(220, 59));

        jLabel24.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(157, 157, 157));
        jLabel24.setText("Postal code");

        jLabel27.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel27.setText("10700");

        javax.swing.GroupLayout postalCodePanelLayout = new javax.swing.GroupLayout(postalCodePanel);
        postalCodePanel.setLayout(postalCodePanelLayout);
        postalCodePanelLayout.setHorizontalGroup(
            postalCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postalCodePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(postalCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        postalCodePanelLayout.setVerticalGroup(
            postalCodePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, postalCodePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(157, 157, 157));
        jLabel28.setText("Status");

        jLabel29.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel29.setText("ACTIVE");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        genderPanel.setPreferredSize(new java.awt.Dimension(220, 59));

        jLabel30.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(157, 157, 157));
        jLabel30.setText("Gender");

        jLabel31.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        jLabel31.setText("Male");

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logOutButton.setBackground(new java.awt.Color(33, 33, 33));
        logOutButton.setFont(new java.awt.Font("Inter 18pt Medium", 0, 15)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Log out");
        logOutButton.setBorderPainted(false);
        logOutButton.setFocusPainted(false);

        cancelButton.setBackground(new java.awt.Color(243, 243, 243));
        cancelButton.setFont(new java.awt.Font("Inter 18pt Medium", 0, 15)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setBorderPainted(false);
        cancelButton.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lineOnePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(provincePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(postalCodePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(genderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(phonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(lineTwoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(districtPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(staffIdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(staffMemberNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(joinedDatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(jobRolePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(breadCrumbBackground, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(breadCrumbBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joinedDatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(staffIdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobRolePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(staffMemberNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(emailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lineTwoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(lineOnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(districtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(cityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postalCodePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(provincePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();
        Profile dialog = new Profile(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel breadCrumbBackground;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel cityPanel;
    private javax.swing.JPanel districtPanel;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JPanel genderPanel;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jobRolePanel;
    private javax.swing.JPanel joinedDatePanel;
    private javax.swing.JPanel lineOnePanel;
    private javax.swing.JPanel lineTwoPanel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel phonePanel;
    private javax.swing.JPanel postalCodePanel;
    private javax.swing.JPanel provincePanel;
    private javax.swing.JPanel staffIdPanel;
    private javax.swing.JPanel staffMemberNamePanel;
    private javax.swing.JPanel statusPanel;
    // End of variables declaration//GEN-END:variables
}
