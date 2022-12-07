/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package model.ingredientsupplier;

/**
 *
 * @author sunayanashivanagi
 */
public class IngredientSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IngredientSupplierJPanel
     */
    javax.swing.JSplitPane splitPane;
    public IngredientSupplierJPanel(javax.swing.JSplitPane splitPane) {
        initComponents();
        this.splitPane=splitPane;
        System.out.println("Inside IS Right");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInventoryM = new javax.swing.JTabbedPane();
        panOrderManagement = new javax.swing.JPanel();
        lblOrderTable = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnOrderUpdate = new javax.swing.JButton();
        btnOrderDelete = new javax.swing.JButton();
        panInventoryManagement = new javax.swing.JPanel();
        lblInventoryTable = new javax.swing.JLabel();
        btnNewInventory = new javax.swing.JButton();
        lbllogo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnInventoryUpdate = new javax.swing.JButton();
        btnInventoryDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelInventoryM.setBackground(new java.awt.Color(255, 255, 255));
        PanelInventoryM.setForeground(new java.awt.Color(0, 51, 153));
        PanelInventoryM.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        panOrderManagement.setBackground(new java.awt.Color(255, 255, 255));
        panOrderManagement.setForeground(new java.awt.Color(0, 51, 153));

        lblOrderTable.setBackground(new java.awt.Color(255, 255, 255));
        lblOrderTable.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblOrderTable.setForeground(new java.awt.Color(153, 153, 153));
        lblOrderTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Full Shopping Basket.png"))); // NOI18N
        lblOrderTable.setText("Order Table");
        lblOrderTable.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblOrderTable.setIconTextGap(10);

        btnNewOrder.setBackground(new java.awt.Color(0, 153, 51));
        btnNewOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Plus(2).png"))); // NOI18N
        btnNewOrder.setText("New");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ingredient Id", "Transaction Id", "Manufacturer Id", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrder);

        btnOrderUpdate.setBackground(new java.awt.Color(255, 204, 0));
        btnOrderUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnOrderUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Available Updates.png"))); // NOI18N
        btnOrderUpdate.setText("UPDATE");
        btnOrderUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderUpdateActionPerformed(evt);
            }
        });

        btnOrderDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnOrderDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Remove.png"))); // NOI18N
        btnOrderDelete.setText("DELETE");

        javax.swing.GroupLayout panOrderManagementLayout = new javax.swing.GroupLayout(panOrderManagement);
        panOrderManagement.setLayout(panOrderManagementLayout);
        panOrderManagementLayout.setHorizontalGroup(
            panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panOrderManagementLayout.createSequentialGroup()
                .addGroup(panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOrderManagementLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblOrderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panOrderManagementLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnOrderUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnOrderDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewOrder)))
            .addGroup(panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panOrderManagementLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        panOrderManagementLayout.setVerticalGroup(
            panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrderManagementLayout.createSequentialGroup()
                .addGroup(panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panOrderManagementLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panOrderManagementLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblOrderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 597, Short.MAX_VALUE)
                .addGroup(panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panOrderManagementLayout.createSequentialGroup()
                        .addGroup(panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrderUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrderDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
            .addGroup(panOrderManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panOrderManagementLayout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        PanelInventoryM.addTab("Order Management", panOrderManagement);

        panInventoryManagement.setBackground(new java.awt.Color(255, 255, 255));
        panInventoryManagement.setForeground(new java.awt.Color(255, 255, 255));

        lblInventoryTable.setBackground(new java.awt.Color(255, 255, 255));
        lblInventoryTable.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblInventoryTable.setForeground(new java.awt.Color(153, 153, 153));
        lblInventoryTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Warehouse.png"))); // NOI18N
        lblInventoryTable.setText("Inventory Table");
        lblInventoryTable.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblInventoryTable.setIconTextGap(10);

        btnNewInventory.setBackground(new java.awt.Color(0, 153, 0));
        btnNewInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnNewInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnNewInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Plus(2).png"))); // NOI18N
        btnNewInventory.setText("New");
        btnNewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewInventoryActionPerformed(evt);
            }
        });

        lbllogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/AVSlogo.png"))); // NOI18N

        tblInventory.setForeground(new java.awt.Color(255, 255, 255));
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblInventory);

        btnInventoryUpdate.setBackground(new java.awt.Color(255, 204, 0));
        btnInventoryUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnInventoryUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnInventoryUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Available Updates.png"))); // NOI18N
        btnInventoryUpdate.setText("UPDATE");
        btnInventoryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryUpdateActionPerformed(evt);
            }
        });

        btnInventoryDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnInventoryDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnInventoryDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/images/Remove.png"))); // NOI18N
        btnInventoryDelete.setText("DELETE");

        javax.swing.GroupLayout panInventoryManagementLayout = new javax.swing.GroupLayout(panInventoryManagement);
        panInventoryManagement.setLayout(panInventoryManagementLayout);
        panInventoryManagementLayout.setHorizontalGroup(
            panInventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInventoryManagementLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(btnInventoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnInventoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panInventoryManagementLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panInventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panInventoryManagementLayout.createSequentialGroup()
                        .addComponent(lblInventoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(btnNewInventory)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panInventoryManagementLayout.setVerticalGroup(
            panInventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInventoryManagementLayout.createSequentialGroup()
                .addGroup(panInventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInventoryManagementLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnNewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInventoryManagementLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblInventoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panInventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panInventoryManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInventoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInventoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        PanelInventoryM.addTab("Inventory Management", panInventoryManagement);

        add(PanelInventoryM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnNewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewInventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewInventoryActionPerformed

    private void btnOrderUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrderUpdateActionPerformed

    private void btnInventoryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanelInventoryM;
    private javax.swing.JButton btnInventoryDelete;
    private javax.swing.JButton btnInventoryUpdate;
    private javax.swing.JButton btnNewInventory;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnOrderDelete;
    private javax.swing.JButton btnOrderUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInventoryTable;
    private javax.swing.JLabel lblOrderTable;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JPanel panInventoryManagement;
    private javax.swing.JPanel panOrderManagement;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}
