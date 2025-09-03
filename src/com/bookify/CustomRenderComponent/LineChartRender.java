package com.bookify.CustomRenderComponent;

import com.bookify.Constant.ThemeColors;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.PlotOrientation;

public class LineChartRender {

    private XYSeries series;
    private String xAxisTitle;
    private String yAxisTitle;
    private String[] xAxisDataArray;
    private String symbolxAxisLabelName;

    public void setSymbolxAxisLabelName(String symbolxAxisLabelName) {
        this.symbolxAxisLabelName = symbolxAxisLabelName;
    }

    public void setxAxisTitle(String xAxisValue) {
        this.xAxisTitle = xAxisValue;
    }

    public void setyAxisTitle(String yAxisValue) {
        this.yAxisTitle = yAxisValue;
    }

    public void setSeries(XYSeries series) {
        this.series = series;
    }

    public void setxAxisDataArray(String[] xAxisParams) {
        this.xAxisDataArray = xAxisParams;
    }

    public JPanel createLineChartPanel() {
        XYSeriesCollection dataset = new XYSeriesCollection(this.series);
        JFreeChart chart = ChartFactory.createXYLineChart(null,
                this.xAxisTitle,
                this.yAxisTitle,
                dataset,
                PlotOrientation.VERTICAL,
                false, false, false
        );

        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(ThemeColors.TEXT_GRAY);
        plot.setDomainGridlinesVisible(false);
        plot.setRangeGridlinesVisible(true);
        plot.setOutlineVisible(false);

        SymbolAxis xAxis = new SymbolAxis(this.symbolxAxisLabelName, this.xAxisDataArray);
        plot.setDomainAxis(xAxis);

        plot.getDomainAxis().setLabelFont(new Font("Inter 18pt", Font.BOLD, 16));
        plot.getDomainAxis().setTickLabelFont(new Font("Inter 18pt", Font.PLAIN, 12));

        plot.getRangeAxis().setLabelFont(new Font("Inter 18pt", Font.BOLD, 16));
        plot.getRangeAxis().setTickLabelFont(new Font("Inter 18pt", Font.PLAIN, 12));

        chart.setBorderVisible(true);
        chart.setBorderPaint(Color.WHITE);

        XYSplineRenderer renderer = new XYSplineRenderer();
        renderer.setSeriesPaint(0, Color.BLACK);
        renderer.setSeriesStroke(0, new BasicStroke(3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        plot.setRenderer(renderer);

        return new ChartPanel(chart);
    }
}
