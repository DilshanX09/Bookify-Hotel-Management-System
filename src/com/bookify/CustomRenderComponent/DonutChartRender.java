package com.bookify.CustomRenderComponent;

import com.bookify.Constant.ThemeColors;
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class DonutChartRender {

    private final Color[] defaultColors = new Color[]{
        new Color(245, 166, 35), // orange
        new Color(249, 208, 69), // yellow
        new Color(83, 121, 194), // blue
        new Color(15, 32, 48) // dark navy
    };

    public ChartPanel createDonutChart(String title, String[] categories, double[] values) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 0; i < categories.length; i++) {
            dataset.setValue(categories[i], values[i]);
        }

        JFreeChart chart = ChartFactory.createPieChart(
                title,
                dataset,
                true, // legend
                false, // tooltips
                false // URLs
        );

        chart.setBackgroundPaint(Color.WHITE);
        chart.getTitle().setFont(new Font("Inter 18pt", Font.BOLD, 22));
        chart.getTitle().setPaint(Color.BLACK);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlineVisible(false);
        plot.setCircular(true);
        plot.setLabelGap(0.02);
        plot.setInteriorGap(0.25); // smaller gap = thicker donut

        Color[] defaultColors = new Color[]{
            new Color(245, 166, 35),
            new Color(249, 208, 69),
            new Color(83, 121, 194),
            new Color(15, 32, 48)
        };

        for (int i = 0; i < categories.length; i++) {
            plot.setSectionPaint(categories[i], defaultColors[i % defaultColors.length]);
        }

        chart.getLegend().setItemFont(new Font("Inter 18pt", Font.PLAIN, 14));
        chart.getLegend().setBackgroundPaint(Color.WHITE);
        chart.getLegend().setBorder(0, 0, 0, 0);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 600));

        return chartPanel;
    }

}
