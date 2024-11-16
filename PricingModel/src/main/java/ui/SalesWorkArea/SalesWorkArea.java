/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SalesWorkArea;

import java.util.ArrayList;
import javax.swing.JPanel;
import model.Business.Business;
import model.CustomerManagement.CustomerProfile;
import model.SalesManagement.SalesPersonProfile;

/**
 *
 * @author Tanmay Paawar
 */
public class SalesWorkArea extends javax.swing.JPanel {

    JPanel CardSequencePanel;
    Business business;
    SalesPersonProfile salesperson;
    private CustomerProfile loggedInCustomer;

    
    /**
     * Creates new form SalesWorkArea
     */
    public SalesWorkArea(Business b, SalesPersonProfile spp, JPanel clp) {
        initComponents();
        business =b ;
        salesperson = spp;
        CardSequencePanel = clp;
        
         ArrayList<CustomerProfile> customerlist = business.getCustomerDirectory().getCustomerList();
        if (customerlist.isEmpty()) {
            return;
        }
        
        for (CustomerProfile c : customerlist) {
            
            customerNamejCombo.addItem(c.toString());
            customerNamejCombo.setSelectedIndex(0);
    }
//       populatejCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnServeCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        customerNamejCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        btnServeCustomer.setBackground(new java.awt.Color(102, 153, 255));
        btnServeCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnServeCustomer.setText("Serve Customers");
        btnServeCustomer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServeCustomer.setMaximumSize(new java.awt.Dimension(200, 40));
        btnServeCustomer.setMinimumSize(new java.awt.Dimension(20, 23));
        btnServeCustomer.setPreferredSize(new java.awt.Dimension(240, 30));
        btnServeCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServeCustomerIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        jLabel1.setText("Customer");

        customerNamejCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNamejComboActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerNamejCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(btnServeCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(customerNamejCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton1)))
                .addGap(75, 75, 75)
                .addComponent(btnServeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnServeCustomerIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServeCustomerIdentifyResourceAssetsActionPerformed

        for(CustomerProfile customer: business.getCustomerDirectory().getCustomerList()){
            if(customerNamejCombo.getSelectedItem().equals(customer.getPerson().toString())){
                loggedInCustomer = customer;
//                ProcessOrder aos = new ProcessOrder(business,loggedInCustomer, salesperson, CardSequencePanel);
//                CardSequencePanel.add("ManageVulns", aos);
//                ((CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

            }
        }
    }//GEN-LAST:event_btnServeCustomerIdentifyResourceAssetsActionPerformed

    private void customerNamejComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNamejComboActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_customerNamejComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        CardSequencePanel.remove(this);
//        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnServeCustomer;
    private javax.swing.JComboBox<String> customerNamejCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

  private void populatejCombobox(ArrayList<CustomerProfile> searchedCustomer) {
        customerNamejCombo.removeAllItems();
        for(CustomerProfile customer1: searchedCustomer){
            customerNamejCombo.addItem(customer1.toString());
            customerNamejCombo.setSelectedIndex(0);
        }
    }


}
