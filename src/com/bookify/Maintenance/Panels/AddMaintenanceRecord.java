
package com.bookify.Maintenance.Panels;


public class AddMaintenanceRecord extends javax.swing.JPanel {

    
    public AddMaintenanceRecord() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maintenanceIdInput = new javax.swing.JTextField();
        generateIdBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        selectRoomInput = new javax.swing.JTextField();
        addRecordBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        selectStaffInput = new javax.swing.JTextField();
        selectStaffBtn = new javax.swing.JButton();
        DescriptionArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        selectStaffInput1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        selectRoomBtn1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(100, 100, 100));
        jLabel2.setFont(new java.awt.Font("Inter 18pt Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Maintenance Record");

        jLabel6.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Room Maintenace ID");

        maintenanceIdInput.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        maintenanceIdInput.setMargin(new java.awt.Insets(2, 15, 2, 6));

        generateIdBtn.setBackground(new java.awt.Color(0, 0, 0));
        generateIdBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        generateIdBtn.setForeground(new java.awt.Color(255, 255, 255));
        generateIdBtn.setText("Generate an ID");
        generateIdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateIdBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Description");

        jLabel8.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Select a room");

        selectRoomInput.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        selectRoomInput.setMargin(new java.awt.Insets(2, 15, 2, 6));

        addRecordBtn.setBackground(new java.awt.Color(0, 0, 0));
        addRecordBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        addRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRecordBtn.setText("Add Record");
        addRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Select a staff");

        selectStaffInput.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        selectStaffInput.setMargin(new java.awt.Insets(2, 15, 2, 6));

        selectStaffBtn.setBackground(new java.awt.Color(0, 0, 0));
        selectStaffBtn.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        selectStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        selectStaffBtn.setText("Select  a Staff member");
        selectStaffBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStaffBtnActionPerformed(evt);
            }
        });

        DescriptionArea.setColumns(20);
        DescriptionArea.setRows(5);

        jLabel10.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Room type");

        selectStaffInput1.setFont(new java.awt.Font("Inter 18pt Medium", 0, 13)); // NOI18N
        selectStaffInput1.setMargin(new java.awt.Insets(2, 15, 2, 6));

        jLabel11.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Date");

        selectRoomBtn1.setBackground(new java.awt.Color(0, 0, 0));
        selectRoomBtn1.setFont(new java.awt.Font("Inter 18pt Medium", 0, 14)); // NOI18N
        selectRoomBtn1.setForeground(new java.awt.Color(255, 255, 255));
        selectRoomBtn1.setText("Select a Room");
        selectRoomBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectRoomBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRoomBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectStaffBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(generateIdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(maintenanceIdInput)
                            .addComponent(jLabel9)
                            .addComponent(selectStaffInput1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(selectRoomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectStaffInput, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectRoomBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(DescriptionArea, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maintenanceIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generateIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectRoomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectRoomBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectStaffInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectStaffInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(addRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DescriptionArea))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generateIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateIdBtnActionPerformed
        
    }//GEN-LAST:event_generateIdBtnActionPerformed

    private void addRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRecordBtnActionPerformed

    private void selectStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStaffBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectStaffBtnActionPerformed

    private void selectRoomBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRoomBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectRoomBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionArea;
    private javax.swing.JButton addRecordBtn;
    private javax.swing.JButton generateIdBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField maintenanceIdInput;
    private javax.swing.JButton selectRoomBtn1;
    private javax.swing.JTextField selectRoomInput;
    private javax.swing.JButton selectStaffBtn;
    private javax.swing.JTextField selectStaffInput;
    private javax.swing.JTextField selectStaffInput1;
    // End of variables declaration//GEN-END:variables
}
