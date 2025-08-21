
package com.bookify.Constant;

import javax.swing.border.AbstractBorder;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class RoundedBorder extends AbstractBorder{
     private final int cornerRadius;
    private final int thickness;
    private final Color borderColor;
    private final Color backgroundColor;

    public RoundedBorder(int cornerRadius, int thickness, Color borderColor, Color backgroundColor) {
        this.cornerRadius = cornerRadius;
        this.thickness = thickness;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(backgroundColor != null ? backgroundColor : c.getBackground());
        g2.fillRoundRect(x, y, width - 1, height - 1, cornerRadius, cornerRadius);

        g2.setStroke(new BasicStroke(thickness));
        g2.setColor(borderColor);
        g2.drawRoundRect(x + thickness / 2, y + thickness / 2,
                width - thickness, height - thickness,
                cornerRadius, cornerRadius);

        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(thickness, thickness, thickness, thickness);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.right = insets.top = insets.bottom = thickness;
        return insets;
    }

    public static void applyToPanel(JPanel panel, int radius, int thickness, Color borderColor, Color bgColor) {
        panel.setOpaque(false);
        panel.setBorder(new RoundedBorder(radius, thickness, borderColor, bgColor));
    }
}
