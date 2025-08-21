package com.bookify.CustomRenderComponent;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class RoundedBorder extends AbstractBorder {

    private final int cornerRadius;
    private final int thickness;
    private final Color borderColor;
    private final Color backgroundColor;

    public RoundedBorder(int cornerRadius, int thickness, Color borderColor, Color backgroundColor) {
        this.cornerRadius = cornerRadius;
        this.thickness = Math.max(1, thickness);
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    public RoundedBorder(int cornerRadius, Color borderColor) {
        this.cornerRadius = cornerRadius;
        this.thickness = 1;
        this.borderColor = borderColor;
        this.backgroundColor = null;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (backgroundColor != null) {
            g2.setColor(backgroundColor);
            g2.fillRoundRect(x, y, width - 1, height - 1, cornerRadius, cornerRadius);
        }

        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(thickness));
        int offset = thickness / 2;
        g2.drawRoundRect(
                x + offset,
                y + offset,
                width - thickness,
                height - thickness,
                cornerRadius,
                cornerRadius
        );

        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(thickness, thickness, thickness, thickness);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(thickness, thickness, thickness, thickness);
        return insets;
    }

    public static void applyToPanel(JPanel panel, int radius, int thickness, Color borderColor, Color bgColor) {
        panel.setOpaque(false);
        panel.setBorder(new RoundedBorder(radius, thickness, borderColor, bgColor));
    }

    public static void applyLineBorder(JPanel panel, int radius) {
        panel.setOpaque(false);
        panel.setBorder(new RoundedBorder(radius, new Color(237, 237, 237)));
    }
}
