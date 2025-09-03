package com.bookify.CustomRenderComponent;

import com.bookify.Constant.ThemeColors;
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChartRender {

    private String xAxisTitle;
    private String yAxisTitle;
    private DefaultCategoryDataset dataset;
    private double barWidth = 0.06;

    public void setxAxisTitle(String xAxisTitle) {
        this.xAxisTitle = xAxisTitle;
    }

    public void setyAxisTitle(String yAxisTitle) {
        this.yAxisTitle = yAxisTitle;
    }

    public void setDataset(DefaultCategoryDataset dataset) {
        this.dataset = dataset;
    }

    public void setBarWidth(double barWidth) {
        this.barWidth = barWidth;
    }

    public ChartPanel createBarChartPanel() {
        JFreeChart chart = ChartFactory.createBarChart("", xAxisTitle, yAxisTitle, dataset);
        chart.setBorderStroke(null);
        chart.setBackgroundPaint(Color.WHITE);
        chart.setBorderVisible(false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setOutlineVisible(false);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(ThemeColors.TEXT_GRAY);

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.BLACK);
        renderer.setDrawBarOutline(false);
        renderer.setBarPainter(new StandardBarPainter());
        renderer.setMaximumBarWidth(this.barWidth);

        chart.getTitle().setFont(new Font("Inter 24pt SemiBold", Font.BOLD, 22));
        chart.getTitle().setPaint(Color.BLACK);

        plot.getDomainAxis().setLabelFont(new Font("Inter 18pt", Font.BOLD, 14));
        plot.getDomainAxis().setLabelPaint(ThemeColors.BLACK);

        plot.getRangeAxis().setLabelFont(new Font("Inter 18pt", Font.BOLD, 16));
        plot.getRangeAxis().setLabelPaint(ThemeColors.BLACK);

        plot.getDomainAxis().setTickLabelFont(new Font("Inter 18pt", Font.PLAIN, 12));
        plot.getDomainAxis().setTickLabelPaint(ThemeColors.BLACK);

        plot.getRangeAxis().setTickLabelFont(new Font("Inter 18pt", Font.PLAIN, 12));
        plot.getRangeAxis().setTickLabelPaint(ThemeColors.BLACK);

        chart.getLegend().setItemFont(new Font("Inter 18pt", Font.PLAIN, 14));
        chart.getLegend().setItemPaint(ThemeColors.BLACK);
        chart.getLegend().setBackgroundPaint(Color.WHITE);
        chart.getLegend().setBorder(0, 0, 0, 0);

        return new ChartPanel(chart);
    }
}
