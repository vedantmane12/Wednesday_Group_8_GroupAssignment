/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SupplierRole;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.ProductManagement.Product;
import model.ProductManagement.ProductSummary;
import model.Supplier.Supplier;

/**
 *
 * @author Tanmay Paawar
 */
public class SalesPerformanceJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    //private Business business;
    private Supplier supplier;
    private ArrayList<Product> productList;
    Product selectedProduct;
    /**
     * Creates new form SalesPerformance
     */
    public SalesPerformanceJPanel(JPanel userProcessContainer, Supplier supplier ) {
    initComponents();
    //this.business = business;
    this.supplier = supplier;
    this.userProcessContainer = userProcessContainer;
    jLabel2.setText("Performance Report for Supplier " + supplier.getName());
    populateTable();
}
    

  private int calculateTotalTargetPrice() {
    int totalTargetPrice = 0;
    if (productList != null) {
        for (Product product : productList) {
            totalTargetPrice += product.getTotalTargetPrice();
        }
    }
    return totalTargetPrice;
}
                     
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);

        if (supplier != null) {
            productList = supplier.getProductCatalog().getProductList();
            ArrayList<Integer> adjustedPrices = adjustTargetPrices(productList);
    //        adjustTargetPrices();
            double totalRevenue = 0;
            double totalTarget = 0 ;
            int salesAboveTarget = 0;
            int salesBelowTarget = 0;
            double pl ;

            for (int i = 0; i < productList.size(); i++) {
                Product product = productList.get(i);
                ProductSummary summary = new ProductSummary(product);
                Object[] row = new Object[3];
                row[0] = product.toString();
    //            row[1] = summary.getSalesRevenues();
                row[1] = summary.getTargetPrice();
                row[2] = adjustedPrices.get(i);
                model.addRow(row);
                totalRevenue += summary.getSalesRevenues();
                salesAboveTarget += summary.getNumberAboveTarget()/productList.size();
                salesBelowTarget += summary.getNumberBelowTarget()/productList.size();
            }

             totalTarget = calculateTotalTargetPrice() ;

             pl = totalRevenue - totalTarget ;

             productRevenueTextField.setText(String.valueOf(totalRevenue));
             productNameTextField.setText(String.valueOf(totalTarget));
             profitOrLoss.setText(String.valueOf(pl));
             txtAboveTarget.setText(String.valueOf(salesAboveTarget));
             txtBelowTarget.setText(String.valueOf(salesBelowTarget));

        } 
    }
    
   private ArrayList<Integer> adjustTargetPrices(ArrayList<Product> productList) {
    ArrayList<Integer> adjustedPrices = new ArrayList<>();
    for (Product product : productList) {
        ProductSummary summary = new ProductSummary(product);
        int adjustedPrice;
        if (summary.getNumberBelowTarget() > summary.getNumberAboveTarget()) {
            adjustedPrice = lowerTargetPrice(product);
        } else if (summary.getNumberAboveTarget() > summary.getNumberBelowTarget()) {
            adjustedPrice = increaseTargetPrice(product);
        } else {
            adjustedPrice = product.getTargetPrice(); // No change
        }
        adjustedPrices.add(adjustedPrice);
    }
    return adjustedPrices;
}
    
    private int lowerTargetPrice(Product product) {
    int currentTarget = product.getTargetPrice();
    int newTarget = currentTarget - 1; 
    return newTarget;
//    product.updateProduct(product.getFloorPrice(), product.getCeilingPrice(), newTarget);
}

private int increaseTargetPrice(Product product) {
    int currentTarget = product.getTargetPrice();
    int newTarget = currentTarget + 1; 
    return newTarget;
//    product.updateProduct(product.getFloorPrice(), product.getCeilingPrice(), newTarget);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productRevenueTextField = new javax.swing.JTextField();
        profitOrLoss = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        Back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAboveTarget = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBelowTarget = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnUpdateTPrice = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        productNameTextField.setEditable(false);
        productNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Company sales revenue");

        productRevenueTextField.setEditable(false);
        productRevenueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productRevenueTextFieldActionPerformed(evt);
            }
        });

        profitOrLoss.setEditable(false);
        profitOrLoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profitOrLossActionPerformed(evt);
            }
        });

        jLabel2.setText("                                                    Performance Report");

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Target Price", "Adjusted Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jScrollPane2.setViewportView(jScrollPane1);

        Back1.setText("<< Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Target sales revenue");

        jLabel3.setText(" Above target");

        txtAboveTarget.setEditable(false);
        txtAboveTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAboveTargetActionPerformed(evt);
            }
        });

        jLabel4.setText("Below target");

        txtBelowTarget.setEditable(false);
        txtBelowTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBelowTargetActionPerformed(evt);
            }
        });

        jLabel6.setText("Frequency");

        jLabel7.setText("Profit or Loss");

        btnUpdateTPrice.setText("Update Target Prices");
        btnUpdateTPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Back1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profitOrLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBelowTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAboveTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdateTPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Back1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(productRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profitOrLoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAboveTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBelowTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(118, 118, 118)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateTPrice)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTextFieldActionPerformed

    private void productRevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueTextFieldActionPerformed

    private void profitOrLossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profitOrLossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profitOrLossActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back1ActionPerformed

    private void txtAboveTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAboveTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAboveTargetActionPerformed

    private void txtBelowTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBelowTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBelowTargetActionPerformed

    private void btnUpdateTPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTPriceActionPerformed
        // TODO add your handling code here:
        productList = supplier.getProductCatalog().getProductList();
        ArrayList<Integer> adjPrices = adjustTargetPrices(productList);
        
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            int targetPrice = adjPrices.get(i);
            
            product.updateProduct(product.getFloorPrice(), product.getCeilingPrice(), targetPrice);
        }
        
    }//GEN-LAST:event_btnUpdateTPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton btnUpdateTPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTextField productRevenueTextField;
    private javax.swing.JTextField profitOrLoss;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtAboveTarget;
    private javax.swing.JTextField txtBelowTarget;
    // End of variables declaration//GEN-END:variables
}
