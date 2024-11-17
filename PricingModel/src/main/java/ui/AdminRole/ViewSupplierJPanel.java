package ui.AdminRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.ProductManagement.Product;
import model.ProductManagement.ProductSummary;
import model.Supplier.Supplier;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewSupplierJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;
    Product selectedProduct;
    
    public ViewSupplierJPanel(JPanel upc, Supplier s) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        lblSupplierName.setText("Supplier: " + s.getName());
        refreshTable();
    }

    public void refreshTable(){
        int rowCount = tblProductCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Product p: supplier.getProductCatalog().getProductList()){
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getFloorPrice();
            row[2] = p.getCeilingPrice();
            row[3] = p.getTargetPrice();
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSupplierName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtProdNames = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtproductPerformance = new javax.swing.JTextField();
        txtOrders = new javax.swing.JTextField();
        txtsalesaboveTarget = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        productFrequencyBelowTargetTextField = new javax.swing.JTextField();
        txtsalesRevenue = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productRevenueTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        lblSupplierName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSupplierName.setText("<Supplier Name>");

        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Floor Price", "Ceil Price", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductCatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductCatalogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblProductCatalogMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductCatalog);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Product Summary");

        txtProdNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdNamesActionPerformed(evt);
            }
        });

        jLabel11.setText("Number of Sales above Target");

        jLabel3.setText("Names of Products");

        jLabel12.setText("Product Price Performance");

        jLabel4.setText("Orders Above Target");

        txtproductPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductPerformanceActionPerformed(evt);
            }
        });

        txtsalesaboveTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalesaboveTargetActionPerformed(evt);
            }
        });

        jLabel6.setText("Orders Below Target");

        jLabel14.setText("Sales Revenue");

        productFrequencyBelowTargetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productFrequencyBelowTargetTextFieldActionPerformed(evt);
            }
        });

        txtsalesRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalesRevenueActionPerformed(evt);
            }
        });

        jLabel5.setText("Revenue from Solution Bundle");

        productRevenueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRevenueTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(18, 18, 18)
                            .addComponent(lblSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtProdNames, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76)
                            .addComponent(txtOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(445, 445, 445)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(productFrequencyBelowTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtproductPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsalesaboveTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(376, 376, 376))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblSupplierName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productFrequencyBelowTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtsalesaboveTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtproductPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtsalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      userProcessContainer.remove(this);
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void txtProdNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdNamesActionPerformed

    private void txtproductPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductPerformanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductPerformanceActionPerformed

    private void txtsalesaboveTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalesaboveTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalesaboveTargetActionPerformed

    private void productFrequencyBelowTargetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productFrequencyBelowTargetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productFrequencyBelowTargetTextFieldActionPerformed

    private void txtsalesRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalesRevenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalesRevenueActionPerformed

    private void productRevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueTextFieldActionPerformed

    private void tblProductCatalogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductCatalogMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductCatalogMouseEntered

    private void tblProductCatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductCatalogMouseClicked
        // TODO add your handling code here:
        int suppliertablesize = tblProductCatalog.getRowCount();
        int selectedrow = tblProductCatalog.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > suppliertablesize - 1) {
            return;
        }
        
        selectedProduct = (Product) tblProductCatalog                                                                                                                                                                                                                                                                                                                                                      .getValueAt(selectedrow, 0);
        if (selectedProduct == null) {
            return;
        }
        
           
        ProductSummary productsummary = new ProductSummary(selectedProduct);
        

        txtProdNames.setText(selectedProduct.toString());
        productRevenueTextField.setText(String.valueOf(productsummary.getSalesRevenues()));
        txtOrders.setText( String.valueOf(productsummary.getNumberAboveTarget()));
        productFrequencyBelowTargetTextField.setText( String.valueOf(productsummary.getNumberBelowTarget()));
        
        txtsalesaboveTarget.setText(String.valueOf(productsummary.getNumberAboveTarget()));
        txtproductPerformance.setText(String.valueOf(productsummary.getProductPricePerformance()));
        txtsalesRevenue.setText(String.valueOf(productsummary.getSalesRevenues()));
        //txtproductaboveTarget.setText(String.valueOf(productsummary.));
        
    }//GEN-LAST:event_tblProductCatalogMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JTextField productFrequencyBelowTargetTextField;
    private javax.swing.JTextField productRevenueTextField;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtOrders;
    private javax.swing.JTextField txtProdNames;
    private javax.swing.JTextField txtproductPerformance;
    private javax.swing.JTextField txtsalesRevenue;
    private javax.swing.JTextField txtsalesaboveTarget;
    // End of variables declaration//GEN-END:variables
}
