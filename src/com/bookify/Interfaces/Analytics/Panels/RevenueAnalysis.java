package com.bookify.Interfaces.Analytics.Panels;

import com.bookify.CustomRenderComponent.BarChartRender;
import com.bookify.CustomRenderComponent.LineChartRender;
import com.bookify.CustomRenderComponent.RoundedBorder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;

public class RevenueAnalysis extends javax.swing.JPanel {

    public RevenueAnalysis() {
        initComponents();
        init();
        initRevenueTrendChart();
        initRevenueByDepartmentChart();
        initADRChart();
        initRevPARChart();
    }

    private void initRevenueTrendChart() {
        XYSeries series = new XYSeries("Bookings");
        series.add(1, 8000);
        series.add(2, 12000);
        series.add(3, 7000);
        series.add(4, 5000);
        series.add(5, 3000);
        series.add(6, 15000);
        series.add(7, 20000);
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        LineChartRender revenueTrendChart = new LineChartRender();
        revenueTrendChart.setxAxisTitle("Time");
        revenueTrendChart.setyAxisTitle("Total Revenue");
        revenueTrendChart.setSeries(series);
        revenueTrendChart.setSymbolxAxisLabelName("Month");
        revenueTrendChart.setxAxisDataArray(months);
        revenueChartPanel.add(revenueTrendChart.createLineChartPanel());
    }

    private void initRevenueByDepartmentChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String[] categories = {"Rooms", "Dining", "Events", "T1", "T2", "T3", "T4", "T5"};
        int i = 5;
        for (String category : categories) {
            dataset.addValue(i++, "Categories", category);
        }
        BarChartRender barChart = new BarChartRender();
        barChart.setDataset(dataset);
        barChart.setxAxisTitle("Categories");
        barChart.setyAxisTitle("Revenue");
        revenueByDepartmentChartPanel.add(barChart.createBarChartPanel());
    }

    private void initADRChart() {
        XYSeries series = new XYSeries("Bookings");
        series.add(1, 8000);
        series.add(2, 12000);
        series.add(3, 7000);
        series.add(4, 5000);
        series.add(5, 3000);
        series.add(6, 15000);
        series.add(7, 20000);
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        LineChartRender ADRChart = new LineChartRender();
        ADRChart.setSeries(series);
        ADRChart.setSymbolxAxisLabelName("Month");
        ADRChart.setxAxisDataArray(months);
        ADRChart.setxAxisTitle("Time (months)");
        ADRChart.setyAxisTitle("ADR Value");
        ADRChartPanel.add(ADRChart.createLineChartPanel());
    }

    private void initRevPARChart() {
        XYSeries series = new XYSeries("Bookings");
        series.add(1, 8000);
        series.add(2, 12000);
        series.add(3, 7000);
        series.add(4, 5000);
        series.add(5, 3000);
        series.add(6, 15000);
        series.add(7, 20000);
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        LineChartRender RevPAR = new LineChartRender();
        RevPAR.setSeries(series);
        RevPAR.setSymbolxAxisLabelName("Month");
        RevPAR.setxAxisDataArray(months);
        RevPAR.setxAxisTitle("Time (months)");
        RevPAR.setyAxisTitle("RevPAR Value");
        RevPARChartPanel.add(RevPAR.createLineChartPanel());
    }

    private void init() {
        RoundedBorder.applyLineBorder(revenueChartMainPanel, 20);
        RoundedBorder.applyLineBorder(jPanel4, 20);
        RoundedBorder.applyLineBorder(jPanel5, 20);
        RoundedBorder.applyLineBorder(jPanel6, 20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        revenueChartMainPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        revenueChartPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        revenueByDepartmentChartPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ADRChartPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        RevPARChartPanel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        revenueChartMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        revenueChartMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel24.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel24.setText("Revenue Trends");

        jLabel26.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("See income growth and dips across time. ");

        revenueChartPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout revenueChartMainPanelLayout = new javax.swing.GroupLayout(revenueChartMainPanel);
        revenueChartMainPanel.setLayout(revenueChartMainPanelLayout);
        revenueChartMainPanelLayout.setHorizontalGroup(
            revenueChartMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(revenueChartMainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(revenueChartMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(revenueChartMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(revenueChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        revenueChartMainPanelLayout.setVerticalGroup(
            revenueChartMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(revenueChartMainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(revenueChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel29.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel29.setText("Revenue by Department");

        revenueByDepartmentChartPanel.setLayout(new java.awt.BorderLayout());

        jLabel30.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("Compare revenue from rooms, dining, events, and more.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(revenueByDepartmentChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(revenueByDepartmentChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel25.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel25.setText("ADR (Average Daily Rate)");

        jLabel27.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Average income earned per occupied room. ");

        ADRChartPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel25))
                .addContainerGap(312, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADRChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ADRChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(237, 237, 237)));

        jLabel31.setFont(new java.awt.Font("Inter 18pt Medium", 0, 16)); // NOI18N
        jLabel31.setText("RevPAR (Revenue per Available Room)");

        RevPARChartPanel.setLayout(new java.awt.BorderLayout());

        jLabel32.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setText("Profitability per available room. ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RevPARChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RevPARChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revenueChartMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(revenueChartMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADRChartPanel;
    private javax.swing.JPanel RevPARChartPanel;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel revenueByDepartmentChartPanel;
    private javax.swing.JPanel revenueChartMainPanel;
    private javax.swing.JPanel revenueChartPanel;
    // End of variables declaration//GEN-END:variables
}
