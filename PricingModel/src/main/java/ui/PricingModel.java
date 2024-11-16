/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import ui.AdminWorkArea.AdminWorkArea;
import ui.AdminWorkArea.ManageSupplier;

/**
 *
 * @author kal bugrara
 */
public class PricingModel {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    Business business = ConfigureABusiness.initialize();
     
    //System.out.println(business.getSupplierDirectory().findSupplier("A").getProductCatalog().generatProductPerformanceReport());
    
<<<<<<< HEAD
=======
//    System.out.println(business.getCustomerDirectory().getCustomerList());
    System.out.println(business.getSupplierDirectory().getSuplierList());

//    AdminWork = new AdminWorkArea();
>>>>>>> origin/main

  }

}
