package com.bookify.CustomRenderComponent;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

public final class RoundedPanel {

    /**
     * @param panel
     * @param radius
     * @param bgColor
     * -----------
     * USAGE - RoundedPanel.setRounded(JPanel panelObject, int radius, ThemeColors.BACKGROUND_MIDDLE_GRAY);
     */
    public static void setRounded(JPanel panel, int radius, Color bgColor) {
        panel.setOpaque(false);
        panel.setBackground(bgColor);

        panel.setBorder(new AbstractBorder() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(c.getBackground());
                g2d.fillRoundRect(x, y, width - 1, height - 1, radius, radius);
                g2d.dispose();
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(0, 0, 0, 0);
            }

            @Override
            public Insets getBorderInsets(Component c, Insets insets) {
                insets.left = insets.top = insets.right = insets.bottom = 0;
                return insets;
            }
        });
    }
}
