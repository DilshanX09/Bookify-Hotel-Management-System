package com.bookify.Interfaces.CustomRenderComponent;

import com.bookify.Constant.ThemeColors;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class CustomTableHeader {

    private final JTableHeader tableHeader;

    public CustomTableHeader(JTableHeader header) {
        this.tableHeader = header;
    }

    public void initHeader() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(tableHeader.getWidth(), 50));
        renderer.setForeground(Color.WHITE);
        renderer.setBackground(ThemeColors.WHITE);
        this.tableHeader.setDefaultRenderer(renderer);
        this.tableHeader.setBorder(new MatteBorder(0, 0, 1, 0, ThemeColors.BORDER_GRAY));
        this.tableHeader.setFont(new Font("Inter 18pt Medium", Font.PLAIN, 14));
    }
}
