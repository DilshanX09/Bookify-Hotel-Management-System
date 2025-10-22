package com.bookify.CustomRenderComponent;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.title.LegendTitle;

public class PieChartRender {
    
    private DefaultPieDataset dataset;
    private String chartTitle;
    private Map<String, Color> colorMap;
    private boolean legendVisible;
    
    public PieChartRender() {
        this.dataset = new DefaultPieDataset();
        this.colorMap = new HashMap<>();
        this.legendVisible = true;
    }
    
    public void setDataset(DefaultPieDataset dataset) {
        this.dataset = dataset;
    }
    
    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }
    
    public void setColorMap(Map<String, Color> colorMap) {
        this.colorMap = colorMap;
    }
    
    public void setLegendVisible(boolean legendVisible) {
        this.legendVisible = legendVisible;
    }
    
    public void addSection(String key, Number value, Color color) {
        dataset.setValue(key, value);
        if (color != null) {
            colorMap.put(key, color);
        }
    }
    
    public JPanel createPieChartPanel() {
        JFreeChart chart = ChartFactory.createPieChart(
                chartTitle,
                dataset,
                legendVisible,
                true,
                false
        );

        // Customize the chart
        chart.setBorderVisible(false);
        chart.setBackgroundPaint(Color.WHITE);

        // Get the plot and customize it
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlineVisible(false);
        plot.setLabelBackgroundPaint(Color.WHITE);
        plot.setLabelFont(new Font("Inter 18pt", Font.PLAIN, 12));
        plot.setLabelOutlinePaint(null);
        plot.setLabelShadowPaint(null);
        plot.setLabelPaint(new Color(80, 80, 80));

        // Custom label generator to show both category and percentage
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{0} - {1}%", new DecimalFormat("0"), new DecimalFormat("0")));

        // Remove shadow
        plot.setShadowPaint(null);
        plot.setShadowXOffset(0);
        plot.setShadowYOffset(0);
        
        LegendTitle legend = chart.getLegend();
        legend.setItemFont(new Font("Inter 18pt", Font.PLAIN, 15));
        legend.setBorder(0, 0, 0, 0);

        // Apply custom colors
        for (Map.Entry<String, Color> entry : colorMap.entrySet()) {
            plot.setSectionPaint(entry.getKey(), entry.getValue());
        }

        // Create and return the chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 400));
        chartPanel.setBackground(Color.WHITE);
        
        return chartPanel;
    }
}
