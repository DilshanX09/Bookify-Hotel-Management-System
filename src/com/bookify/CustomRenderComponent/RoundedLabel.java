package com.bookify.CustomRenderComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RoundedLabel extends JLabel {

    private final int cornerRadius;
    private final Color bgColor;

    public RoundedLabel(String text, Color bgColor, int cornerRadius) {
        super(text, SwingConstants.CENTER);
        this.bgColor = bgColor;
        this.cornerRadius = cornerRadius;
        setForeground(Color.WHITE);
        setFont(new Font("Inter 18pt", Font.PLAIN, 12));
        setPreferredSize(new Dimension(30, 30));
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(bgColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        g2.dispose();
        super.paintComponent(g);
    }
}
