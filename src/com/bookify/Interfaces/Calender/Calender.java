package com.bookify.Interfaces.Calender;

import com.bookify.CustomRenderComponent.RoundedLabel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
    * createHeaderPanel() -> create a calender header sectin 
    * initializeBookings() -> Generate random bookings 
    * createNavButton() -> Month navigate buttons setup
    * refreshCalendar() -> Refresh UI
    * createDayPanel() -> Create Day panels
 */
public class Calender {

    private final Map<String, String> dateBookings = new HashMap<>();
    private final Map<String, Color> roomColors = new HashMap<>();
    private YearMonth currentYearMonth;
    private JLabel monthYearLabel;
    private LocalDate selectedDate;
    private JPanel lastSelectedPanel = null;
    private JPanel calendarPanelContainer;

    private static final Color BACKGROUND_COLOR = new Color(255, 255, 255);
    private static final Color PANEL_BACKGROUND = Color.WHITE;
    private static final Color BORDER_COLOR = new Color(225, 230, 235);
    private static final Color HOVER_COLOR = new Color(240, 243, 247);
    private static final Color TEXT_COLOR = new Color(60, 64, 67);
    private static final Color HEADER_TEXT_COLOR = new Color(95, 99, 104);
    private static final Color WEEKEND_COLOR = new Color(128, 134, 139);
    private static final Color CIRCLE_BG = new Color(40, 40, 40);

    private static final Font HEADER_FONT = new Font("Inter 18pt", Font.BOLD, 23);
    private static final Font DAY_FONT = new Font("Inter 18pt", Font.BOLD, 14);
    private static final Font ROOM_FONT = new Font("Inter 18pt", Font.BOLD, 14);

    private static final String[] ROOM_TYPES = {"#RL123", "#RL456", "#RL789", "#RL101", "#RL202", "#RL303"};
    private static final Color[] ROOM_COLORS = {
        new Color(234, 67, 53),
        new Color(52, 168, 83),
        new Color(66, 133, 244),
        new Color(251, 188, 5),
        new Color(171, 71, 188),
        new Color(66, 133, 244)
    };

    public Calender() {
        this.currentYearMonth = YearMonth.now();
        initializeBookings();
    }

    public JPanel init() {
        return setupUI();
    }

    private void initializeBookings() {
        for (int i = 0; i < ROOM_TYPES.length; i++) {
            roomColors.put(ROOM_TYPES[i], ROOM_COLORS[i]);
        }
        Random random = new Random();
        int daysInMonth = currentYearMonth.lengthOfMonth();
        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date = currentYearMonth.atDay(day);
            String dateKey = date.toString();
            if (random.nextDouble() < 0.3) {
                int numberOfBookings = random.nextInt(3) + 1;
                StringBuilder bookings = new StringBuilder();
                for (int i = 0; i < numberOfBookings; i++) {
                    String room = ROOM_TYPES[random.nextInt(ROOM_TYPES.length)];
                    bookings.append(room);
                    if (i < numberOfBookings - 1) {
                        bookings.append(", ");
                    }
                }
                dateBookings.put(dateKey, bookings.toString());
            }
        }
        dateBookings.put(currentYearMonth.atDay(5).toString(), "#RL123, #RL456");
        dateBookings.put(currentYearMonth.atDay(12).toString(), "#RL789");
        dateBookings.put(currentYearMonth.atDay(15).toString(), "#RL101, #RL202, #RL303");
        dateBookings.put(currentYearMonth.atDay(20).toString(), "#RL123, #RL789");
        dateBookings.put(currentYearMonth.atDay(25).toString(), "#RL202");
    }

    private JPanel setupUI() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        mainPanel.setBackground(Color.WHITE);

        JPanel headerPanel = createHeaderPanel(mainPanel);
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        calendarPanelContainer = new JPanel(new BorderLayout());
        calendarPanelContainer.add(createCalendarPanel(), BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(calendarPanelContainer);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(BACKGROUND_COLOR);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

//        JPanel legendPanel = createLegendPanel();
//        mainPanel.add(legendPanel, BorderLayout.SOUTH);
        return mainPanel;
    }

    private JPanel createHeaderPanel(JPanel mainPanel) {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBorder(new EmptyBorder(0, 0, 15, 0));
        headerPanel.setBackground(BACKGROUND_COLOR);

        monthYearLabel = new JLabel("Booking Calender  |  " + currentYearMonth
                .getMonth().toString() + " " + currentYearMonth.getYear(),
                SwingConstants.LEFT);
        monthYearLabel.setFont(HEADER_FONT);
        monthYearLabel.setForeground(Color.BLACK);
        headerPanel.add(monthYearLabel, BorderLayout.CENTER);

        JPanel navPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 0));
        navPanel.setBackground(BACKGROUND_COLOR);

        JButton prevButton = createNavButton("←");
        prevButton.addActionListener(e -> refreshCalendar(mainPanel, -1));

        JButton nextButton = createNavButton("→");
        nextButton.addActionListener(e -> refreshCalendar(mainPanel, 1));

        JButton todayButton = createNavButton("Today");
        todayButton.addActionListener(e -> refreshCalendar(mainPanel, 0));

        navPanel.add(prevButton);
        navPanel.add(todayButton);
        navPanel.add(nextButton);

        headerPanel.add(navPanel, BorderLayout.EAST);

        return headerPanel;
    }

//    private JPanel createLegendPanel() {
//        JPanel legendPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 8));
//        legendPanel.setBackground(BACKGROUND_COLOR);
//        legendPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
//
//        JLabel legendLabel = new JLabel("Room Types:");
//        legendLabel.setFont(new Font("Segoe UI", Font.BOLD, 11));
//        legendLabel.setForeground(HEADER_TEXT_COLOR);
//        legendPanel.add(legendLabel);
//
//        for (int i = 0; i < ROOM_TYPES.length; i++) {
//            JPanel roomLegend = new JPanel(new FlowLayout(FlowLayout.LEFT, 4, 2));
//            roomLegend.setBackground(BACKGROUND_COLOR);
//
//            JLabel colorLabel = new JLabel("▌");
//            colorLabel.setFont(new Font("Arial", Font.BOLD, 14));
//            colorLabel.setForeground(ROOM_COLORS[i]);
//
//            JLabel roomLabel = new JLabel(ROOM_TYPES[i]);
//            roomLabel.setFont(new Font("Segoe UI", Font.PLAIN, 10));
//            roomLabel.setForeground(TEXT_COLOR);
//
//            roomLegend.add(colorLabel);
//            roomLegend.add(roomLabel);
//            legendPanel.add(roomLegend);
//        }
//
//        return legendPanel;
//    }
    private JButton createNavButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Inter 18pt", Font.BOLD, 15));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setBackground(CIRCLE_BG);
        button.setForeground(Color.WHITE);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setMargin(new Insets(8, 10, 8, 10));
        return button;
    }

    private void refreshCalendar(JPanel mainPanel, int direction) {
        if (direction == 0) {
            currentYearMonth = YearMonth.now();
        } else {
            currentYearMonth = currentYearMonth.plusMonths(direction);
        }
        initializeBookings();

        monthYearLabel.setText("Booking Calender  |  "
                + currentYearMonth.getMonth().toString() + " " + currentYearMonth.getYear());

        calendarPanelContainer.removeAll();
        calendarPanelContainer.add(createCalendarPanel(), BorderLayout.CENTER);
        calendarPanelContainer.revalidate();
        calendarPanelContainer.repaint();
    }

    private JPanel createCalendarPanel() {
        JPanel calendarPanel = new JPanel(new GridLayout(0, 7, 6, 6));
        calendarPanel.setBackground(Color.WHITE);
        calendarPanel.setBorder(new EmptyBorder(8, 8, 8, 8));

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (int i = 0; i < days.length; i++) {
            JPanel headerDayPanel = new JPanel(new BorderLayout());
            headerDayPanel.setBackground(Color.WHITE);

            JLabel dayLabel = new JLabel(days[i], SwingConstants.CENTER);
            dayLabel.setFont(DAY_FONT);
            dayLabel.setForeground(i >= 5 ? WEEKEND_COLOR : HEADER_TEXT_COLOR);
            dayLabel.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));

            headerDayPanel.add(dayLabel, BorderLayout.CENTER);
            calendarPanel.add(headerDayPanel);
        }

        LocalDate firstOfMonth = currentYearMonth.atDay(1);
        int daysInMonth = currentYearMonth.lengthOfMonth();
        int dayOfWeekValue = firstOfMonth.getDayOfWeek().getValue();

        for (int i = 1; i < dayOfWeekValue; i++) {
            JPanel emptyPanel = new JPanel();
            emptyPanel.setBackground(BACKGROUND_COLOR);
            calendarPanel.add(emptyPanel);
        }

        for (int day = 1; day <= daysInMonth; day++) {
            JPanel dayPanel = createDayPanel(day);
            calendarPanel.add(dayPanel);
        }

        return calendarPanel;
    }

    private JPanel createDayPanel(int day) {
        RoundedPanel dayPanel = new RoundedPanel(15);
        dayPanel.setLayout(new BorderLayout());
        dayPanel.setBackground(PANEL_BACKGROUND);
        dayPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        RoundedLabel dayLabel = new RoundedLabel(String.valueOf(day), CIRCLE_BG, 100);

        JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        datePanel.setOpaque(false);
        datePanel.add(dayLabel);
        dayPanel.add(datePanel, BorderLayout.NORTH);

        LocalDate date = currentYearMonth.atDay(day);
        String dateKey = date.toString();

        if (date.equals(LocalDate.now())) {
            dayPanel.setBackground(new Color(200, 230, 255));
        }

        JPanel bookingsPanel = new JPanel();
        bookingsPanel.setLayout(new BoxLayout(bookingsPanel, BoxLayout.Y_AXIS));
        bookingsPanel.setOpaque(false);
        bookingsPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

        if (dateBookings.containsKey(dateKey)) {
            String[] bookings = dateBookings.get(dateKey).split(", ");
            int maxToShow = Math.min(bookings.length, 3);
            for (int i = 0; i < maxToShow; i++) {
                addBookingToPanel(bookingsPanel, bookings[i]);
            }
        }

        dayPanel.add(bookingsPanel, BorderLayout.CENTER);

        dayPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectedDate = date;
                String bookings = dateBookings.getOrDefault(dateKey, "No bookings");
                System.out.println("Selected date: " + dateKey + ", Bookings: " + bookings);

                if (lastSelectedPanel != null) {
                    lastSelectedPanel.setBackground(PANEL_BACKGROUND);
                }

                dayPanel.setBackground(new Color(232, 240, 254));
                lastSelectedPanel = dayPanel;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (dayPanel != lastSelectedPanel) {
                    dayPanel.setBackground(HOVER_COLOR);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (dayPanel != lastSelectedPanel) {
                    dayPanel.setBackground(PANEL_BACKGROUND);
                }
            }
        });

        return dayPanel;
    }

    private void addBookingToPanel(JPanel panel, String room) {
        JPanel bookingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 0));
        bookingPanel.setOpaque(false);
        bookingPanel.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

        JLabel dotLabel = new JLabel("▌");
        dotLabel.setFont(new Font("Inter 18pt", Font.BOLD, 14));
        dotLabel.setForeground(roomColors.get(room));

        JLabel roomLabel = new JLabel(room);
        roomLabel.setFont(ROOM_FONT);
        roomLabel.setForeground(TEXT_COLOR);

        bookingPanel.add(dotLabel);
        bookingPanel.add(roomLabel);
        panel.add(bookingPanel);
    }

    class RoundedPanel extends JPanel {

        private int cornerRadius;

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            graphics.setColor(getBackground());
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

            graphics.setColor(BORDER_COLOR);
            graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
        }
    }
}
