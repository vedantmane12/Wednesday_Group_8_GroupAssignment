/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");

    SupplierDirectory supplierDirectory = business.getSupplierDirectory();

    Supplier supplier1 = supplierDirectory.newSupplier("A");
    Supplier supplier2 = supplierDirectory.newSupplier("B");
    Supplier supplier3 = supplierDirectory.newSupplier("C");
    Supplier supplier4 = supplierDirectory.newSupplier("D");
    Supplier supplier5 = supplierDirectory.newSupplier("E");

    ProductCatalog productCatalogA = supplierDirectory.findSupplier("A").getProductCatalog();
    ProductCatalog productCatalogB = supplierDirectory.findSupplier("B").getProductCatalog();
    ProductCatalog productCatalogC = supplierDirectory.findSupplier("C").getProductCatalog();
    ProductCatalog productCatalogD = supplierDirectory.findSupplier("D").getProductCatalog();
    ProductCatalog productCatalogE = supplierDirectory.findSupplier("E").getProductCatalog();
    
    Product pA1 = productCatalogA.newProduct("Product A1", 10, 20, 15);
    Product pA2 = productCatalogA.newProduct("Product A2", 10, 25, 20);
    Product pA3 = productCatalogA.newProduct("Product A3", 5, 15, 10);
    Product pA4 = productCatalogA.newProduct("Product A4", 8, 18, 12);
    Product pA5 = productCatalogA.newProduct("Product A5", 12, 22, 17);
    Product pA6 = productCatalogA.newProduct("Product A6", 7, 17, 12);
    Product pA7 = productCatalogA.newProduct("Product A7", 11, 21, 16);
    Product pA8 = productCatalogA.newProduct("Product A8", 9, 19, 14);
    Product pA9 = productCatalogA.newProduct("Product A9", 6, 16, 11);
    Product pA10 = productCatalogA.newProduct("Product A10", 10, 20, 15);
    
    Product pB1 = productCatalogB.newProduct("Product B1", 15, 25, 20);
    Product pB2 = productCatalogB.newProduct("Product B2", 12, 22, 17);
    Product pB3 = productCatalogB.newProduct("Product B3", 5, 15, 10);
    Product pB4 = productCatalogB.newProduct("Product B4", 8, 18, 13);
    Product pB5 = productCatalogB.newProduct("Product B5", 13, 23, 18);
    Product pB6 = productCatalogB.newProduct("Product B6", 7, 17, 12);
    Product pB7 = productCatalogB.newProduct("Product B7", 11, 21, 16);
    Product pB8 = productCatalogB.newProduct("Product B8", 9, 19, 14);
    Product pB9 = productCatalogB.newProduct("Product B9", 6, 16, 11);
    Product pB10 = productCatalogB.newProduct("Product B10", 14, 24, 19);

    Product pC1 = productCatalogC.newProduct("Product C1", 9, 19, 14);
    Product pC2 = productCatalogC.newProduct("Product C2", 10, 20, 15);
    Product pC3 = productCatalogC.newProduct("Product C3", 8, 18, 13);
    Product pC4 = productCatalogC.newProduct("Product C4", 12, 22, 17);
    Product pC5 = productCatalogC.newProduct("Product C5", 11, 21, 16);
    Product pC6 = productCatalogC.newProduct("Product C6", 5, 15, 10);
    Product pC7 = productCatalogC.newProduct("Product C7", 7, 17, 12);
    Product pC8 = productCatalogC.newProduct("Product C8", 13, 23, 18);
    Product pC9 = productCatalogC.newProduct("Product C9", 14, 24, 19);
    Product pC10 = productCatalogC.newProduct("Product C10", 6, 16, 11);

    Product pD1 = productCatalogD.newProduct("Product D1", 10, 20, 15);
    Product pD2 = productCatalogD.newProduct("Product D2", 11, 21, 16);
    Product pD3 = productCatalogD.newProduct("Product D3", 9, 19, 14);
    Product pD4 = productCatalogD.newProduct("Product D4", 8, 18, 13);
    Product pD5 = productCatalogD.newProduct("Product D5", 12, 22, 17);
    Product pD6 = productCatalogD.newProduct("Product D6", 13, 23, 18);
    Product pD7 = productCatalogD.newProduct("Product D7", 7, 17, 12);
    Product pD8 = productCatalogD.newProduct("Product D8", 14, 24, 19);
    Product pD9 = productCatalogD.newProduct("Product D9", 6, 16, 11);
    Product pD10 = productCatalogD.newProduct("Product D10", 5, 15, 10);

    Product pE1 = productCatalogE.newProduct("Product E1", 10, 20, 15);
    Product pE2 = productCatalogE.newProduct("Product E2", 11, 21, 16);
    Product pE3 = productCatalogE.newProduct("Product E3", 12, 22, 17);
    Product pE4 = productCatalogE.newProduct("Product E4", 13, 23, 18);
    Product pE5 = productCatalogE.newProduct("Product E5", 7, 17, 12);
    Product pE6 = productCatalogE.newProduct("Product E6", 6, 16, 11);
    Product pE7 = productCatalogE.newProduct("Product E7", 9, 19, 14);
    Product pE8 = productCatalogE.newProduct("Product E8", 8, 18, 13);
    Product pE9 = productCatalogE.newProduct("Product E9", 10, 20, 15);
    Product pE10 = productCatalogE.newProduct("Product E10", 5, 15, 10);

    PersonDirectory personDirectory = business.getPersonDirectory();
    
    Person p1 = personDirectory.newPerson("Max");
    Person p2 = personDirectory.newPerson("Sergio");
    Person p3 = personDirectory.newPerson("Taylor");
    Person p4 = personDirectory.newPerson("Ankit");
    Person p5 = personDirectory.newPerson("Tanmay");
    Person p6 = personDirectory.newPerson("Vedant");
    Person p7 = personDirectory.newPerson("Sahil");
    Person p8 = personDirectory.newPerson("Leo");
    Person p9 = personDirectory.newPerson("Cristian");
    Person p10 = personDirectory.newPerson("Louis");

    CustomerDirectory customerDirectory = business.getCustomerDirectory();
    CustomerProfile c1 = customerDirectory.newCustomerProfile(p1);
    CustomerProfile c2 = customerDirectory.newCustomerProfile(p2);
    CustomerProfile c3 = customerDirectory.newCustomerProfile(p3);
    CustomerProfile c4 = customerDirectory.newCustomerProfile(p4);
    CustomerProfile c5 = customerDirectory.newCustomerProfile(p5);
    CustomerProfile c6 = customerDirectory.newCustomerProfile(p6);
    CustomerProfile c7 = customerDirectory.newCustomerProfile(p7);
    CustomerProfile c8 = customerDirectory.newCustomerProfile(p8);
    CustomerProfile c9 = customerDirectory.newCustomerProfile(p9);
    CustomerProfile c10 = customerDirectory.newCustomerProfile(p10);
    
    MasterOrderList masterOrderList = business.getMasterOrderList();
    
    Order o1 = masterOrderList.newOrder(c1);
    
    OrderItem oiC11 = o1.newOrderItem(pA1, 14, 1);
    OrderItem oiC12 = o1.newOrderItem(pA2, 17, 3);
    OrderItem oiC13 = o1.newOrderItem(pA3, 16, 4);
    OrderItem oiC14 = o1.newOrderItem(pA4, 18, 1);
    OrderItem oiC15 = o1.newOrderItem(pA5, 12, 6);
    OrderItem oiC16 = o1.newOrderItem(pA6, 11, 4);
    OrderItem oiC17 = o1.newOrderItem(pA7, 13, 1);
    OrderItem oiC18 = o1.newOrderItem(pA8, 19, 8);
    OrderItem oiC19 = o1.newOrderItem(pA9, 20, 6);
    OrderItem oiC110 = o1.newOrderItem(pA10, 15, 5);
    
    OrderItem oiC111 = o1.newOrderItem(pB1, 13, 1);
    OrderItem oiC112 = o1.newOrderItem(pB2, 17, 3);
    OrderItem oiC113 = o1.newOrderItem(pB3, 16, 4);
    OrderItem oiC114 = o1.newOrderItem(pB4, 18, 1);
    OrderItem oiC115 = o1.newOrderItem(pB5, 12, 6);
    OrderItem oiC116 = o1.newOrderItem(pB6, 11, 4);
    OrderItem oiC117 = o1.newOrderItem(pB7, 13, 1);
    OrderItem oiC118 = o1.newOrderItem(pB8, 19, 8);
    OrderItem oiC119 = o1.newOrderItem(pB9, 20, 6);
    OrderItem oiC120 = o1.newOrderItem(pB10, 15, 5);
    
    OrderItem oiC121 = o1.newOrderItem(pC1, 14, 1);
    OrderItem oiC122 = o1.newOrderItem(pC2, 17, 3);
    OrderItem oiC123 = o1.newOrderItem(pC3, 16, 4);
    OrderItem oiC124 = o1.newOrderItem(pC4, 18, 1);
    OrderItem oiC125 = o1.newOrderItem(pC5, 12, 6);
    OrderItem oiC126 = o1.newOrderItem(pC6, 11, 4);
    OrderItem oiC127 = o1.newOrderItem(pC7, 13, 1);
    OrderItem oiC128 = o1.newOrderItem(pC8, 19, 8);
    OrderItem oiC129 = o1.newOrderItem(pC9, 20, 6);
    OrderItem oiC130 = o1.newOrderItem(pC10, 15, 5);
    
    OrderItem oiC131 = o1.newOrderItem(pD1, 14, 1);
    OrderItem oiC132 = o1.newOrderItem(pD2, 17, 3);
    OrderItem oiC133 = o1.newOrderItem(pD3, 16, 4);
    OrderItem oiC134 = o1.newOrderItem(pD4, 18, 1);
    OrderItem oiC135 = o1.newOrderItem(pD5, 12, 6);
    OrderItem oiC136 = o1.newOrderItem(pD6, 11, 4);
    OrderItem oiC137 = o1.newOrderItem(pD7, 13, 1);
    OrderItem oiC138 = o1.newOrderItem(pD8, 19, 8);
    OrderItem oiC139 = o1.newOrderItem(pD9, 20, 6);
    OrderItem oiC140 = o1.newOrderItem(pD10, 15, 5);
    
    OrderItem oiC141 = o1.newOrderItem(pE1, 14, 1);
    OrderItem oiC142 = o1.newOrderItem(pE2, 17, 3);
    OrderItem oiC143 = o1.newOrderItem(pE3, 16, 4);
    OrderItem oiC144 = o1.newOrderItem(pE4, 18, 1);
    OrderItem oiC145 = o1.newOrderItem(pE5, 12, 6);
    OrderItem oiC146 = o1.newOrderItem(pE6, 11, 4);
    OrderItem oiC147 = o1.newOrderItem(pE7, 13, 1);
    OrderItem oiC148 = o1.newOrderItem(pE8, 19, 8);
    OrderItem oiC149 = o1.newOrderItem(pE9, 20, 6);
    OrderItem oiC150 = o1.newOrderItem(pE10, 15, 5);
    
    Order o2 = masterOrderList.newOrder(c2);
    
    OrderItem oiC21 = o2.newOrderItem(pA1, 12, 2);
    OrderItem oiC22 = o2.newOrderItem(pA2, 16, 1);
    OrderItem oiC23 = o2.newOrderItem(pA3, 10, 3);
    OrderItem oiC24 = o2.newOrderItem(pA4, 14, 2);
    OrderItem oiC25 = o2.newOrderItem(pA5, 18, 4);
    OrderItem oiC26 = o2.newOrderItem(pA6, 13, 5);
    OrderItem oiC27 = o2.newOrderItem(pA7, 17, 2);
    OrderItem oiC28 = o2.newOrderItem(pA8, 15, 7);
    OrderItem oiC29 = o2.newOrderItem(pA9, 12, 3);
    OrderItem oiC210 = o2.newOrderItem(pA10, 16, 4);
    
    OrderItem oiC211 = o2.newOrderItem(pB1, 19, 2);
    OrderItem oiC212 = o2.newOrderItem(pB2, 18, 1);
    OrderItem oiC213 = o2.newOrderItem(pB3, 12, 3);
    OrderItem oiC214 = o2.newOrderItem(pB4, 15, 2);
    OrderItem oiC215 = o2.newOrderItem(pB5, 19, 4);
    OrderItem oiC216 = o2.newOrderItem(pB6, 13, 5);
    OrderItem oiC217 = o2.newOrderItem(pB7, 17, 2);
    OrderItem oiC218 = o2.newOrderItem(pB8, 15, 7);
    OrderItem oiC219 = o2.newOrderItem(pB9, 13, 3);
    OrderItem oiC220 = o2.newOrderItem(pB10, 20, 4);
    
    OrderItem oiC221 = o2.newOrderItem(pC1, 15, 2);
    OrderItem oiC222 = o2.newOrderItem(pC2, 16, 1);
    OrderItem oiC223 = o2.newOrderItem(pC3, 14, 3);
    OrderItem oiC224 = o2.newOrderItem(pC4, 19, 2);
    OrderItem oiC225 = o2.newOrderItem(pC5, 17, 4);
    OrderItem oiC226 = o2.newOrderItem(pC6, 12, 5);
    OrderItem oiC227 = o2.newOrderItem(pC7, 14, 2);
    OrderItem oiC228 = o2.newOrderItem(pC8, 20, 7);
    OrderItem oiC229 = o2.newOrderItem(pC9, 21, 3);
    OrderItem oiC230 = o2.newOrderItem(pC10, 13, 4);
    
    OrderItem oiC231 = o2.newOrderItem(pD1, 16, 2);
    OrderItem oiC232 = o2.newOrderItem(pD2, 18, 1);
    OrderItem oiC233 = o2.newOrderItem(pD3, 15, 3);
    OrderItem oiC234 = o2.newOrderItem(pD4, 14, 2);
    OrderItem oiC235 = o2.newOrderItem(pD5, 18, 4);
    OrderItem oiC236 = o2.newOrderItem(pD6, 19, 5);
    OrderItem oiC237 = o2.newOrderItem(pD7, 13, 2);
    OrderItem oiC238 = o2.newOrderItem(pD8, 20, 7);
    OrderItem oiC239 = o2.newOrderItem(pD9, 12, 3);
    OrderItem oiC240 = o2.newOrderItem(pD10, 11, 4);
    
    OrderItem oiC241 = o2.newOrderItem(pE1, 16, 2);
    OrderItem oiC242 = o2.newOrderItem(pE2, 18, 1);
    OrderItem oiC243 = o2.newOrderItem(pE3, 18, 3);
    OrderItem oiC244 = o2.newOrderItem(pE4, 19, 2);
    OrderItem oiC245 = o2.newOrderItem(pE5, 13, 4);
    OrderItem oiC246 = o2.newOrderItem(pE6, 12, 5);
    OrderItem oiC247 = o2.newOrderItem(pE7, 15, 2);
    OrderItem oiC248 = o2.newOrderItem(pE8, 14, 7);
    OrderItem oiC249 = o2.newOrderItem(pE9, 16, 3);
    OrderItem oiC250 = o2.newOrderItem(pE10, 11, 4);

    Order o3 = masterOrderList.newOrder(c3);
    
    OrderItem oiC31 = o3.newOrderItem(pA1, 11, 2);
    OrderItem oiC32 = o3.newOrderItem(pA2, 14, 1);
    OrderItem oiC33 = o3.newOrderItem(pA3, 7, 3);
    OrderItem oiC34 = o3.newOrderItem(pA4, 15, 2);
    OrderItem oiC35 = o3.newOrderItem(pA5, 18, 4);
    OrderItem oiC36 = o3.newOrderItem(pA6, 13, 5);
    OrderItem oiC37 = o3.newOrderItem(pA7, 17, 2);
    OrderItem oiC38 = o3.newOrderItem(pA8, 15, 7);
    OrderItem oiC39 = o3.newOrderItem(pA9, 13, 3);
    OrderItem oiC310 = o3.newOrderItem(pA10, 17, 4);
    
    OrderItem oiC311 = o3.newOrderItem(pB1, 20, 2);
    OrderItem oiC312 = o3.newOrderItem(pB2, 18, 1);
    OrderItem oiC313 = o3.newOrderItem(pB3, 11, 3);
    OrderItem oiC314 = o3.newOrderItem(pB4, 14, 2);
    OrderItem oiC315 = o3.newOrderItem(pB5, 19, 4);
    OrderItem oiC316 = o3.newOrderItem(pB6, 13, 5);
    OrderItem oiC317 = o3.newOrderItem(pB7, 17, 2);
    OrderItem oiC318 = o3.newOrderItem(pB8, 16, 7);
    OrderItem oiC319 = o3.newOrderItem(pB9, 12, 3);
    OrderItem oiC320 = o3.newOrderItem(pB10, 21, 4);
    
    OrderItem oiC321 = o3.newOrderItem(pC1, 15, 2);
    OrderItem oiC322 = o3.newOrderItem(pC2, 16, 1);
    OrderItem oiC323 = o3.newOrderItem(pC3, 14, 3);
    OrderItem oiC324 = o3.newOrderItem(pC4, 19, 2);
    OrderItem oiC325 = o3.newOrderItem(pC5, 17, 4);
    OrderItem oiC326 = o3.newOrderItem(pC6, 12, 5);
    OrderItem oiC327 = o3.newOrderItem(pC7, 14, 2);
    OrderItem oiC328 = o3.newOrderItem(pC8, 20, 7);
    OrderItem oiC329 = o3.newOrderItem(pC9, 21, 3);
    OrderItem oiC330 = o3.newOrderItem(pC10, 13, 4);
    
    OrderItem oiC331 = o3.newOrderItem(pD1, 16, 2);
    OrderItem oiC332 = o3.newOrderItem(pD2, 18, 1);
    OrderItem oiC333 = o3.newOrderItem(pD3, 15, 3);
    OrderItem oiC334 = o3.newOrderItem(pD4, 14, 2);
    OrderItem oiC335 = o3.newOrderItem(pD5, 18, 4);
    OrderItem oiC336 = o3.newOrderItem(pD6, 19, 5);
    OrderItem oiC337 = o3.newOrderItem(pD7, 13, 2);
    OrderItem oiC338 = o3.newOrderItem(pD8, 21, 7);
    OrderItem oiC339 = o3.newOrderItem(pD9, 12, 3);
    OrderItem oiC340 = o3.newOrderItem(pD10, 11, 4);
    
    OrderItem oiC341 = o3.newOrderItem(pE1, 16, 2);
    OrderItem oiC342 = o3.newOrderItem(pE2, 18, 1);
    OrderItem oiC343 = o3.newOrderItem(pE3, 19, 3);
    OrderItem oiC344 = o3.newOrderItem(pE4, 20, 2);
    OrderItem oiC345 = o3.newOrderItem(pE5, 13, 4);
    OrderItem oiC346 = o3.newOrderItem(pE6, 12, 5);
    OrderItem oiC347 = o3.newOrderItem(pE7, 15, 2);
    OrderItem oiC348 = o3.newOrderItem(pE8, 14, 7);
    OrderItem oiC349 = o3.newOrderItem(pE9, 17, 3);
    OrderItem oiC350 = o3.newOrderItem(pE10, 11, 4);
    
    Order o4 = masterOrderList.newOrder(c4);
    
    OrderItem oiC41 = o4.newOrderItem(pA1, 12, 3);
    OrderItem oiC42 = o4.newOrderItem(pA2, 13, 2);
    OrderItem oiC43 = o4.newOrderItem(pA3, 9, 5);
    OrderItem oiC44 = o4.newOrderItem(pA4, 14, 3);
    OrderItem oiC45 = o4.newOrderItem(pA5, 19, 2);
    OrderItem oiC46 = o4.newOrderItem(pA6, 12, 6);
    OrderItem oiC47 = o4.newOrderItem(pA7, 18, 3);
    OrderItem oiC48 = o4.newOrderItem(pA8, 16, 5);
    OrderItem oiC49 = o4.newOrderItem(pA9, 14, 4);
    OrderItem oiC410 = o4.newOrderItem(pA10, 18, 2);
    
    OrderItem oiC411 = o4.newOrderItem(pB1, 21, 3);
    OrderItem oiC412 = o4.newOrderItem(pB2, 19, 2);
    OrderItem oiC413 = o4.newOrderItem(pB3, 12, 5);
    OrderItem oiC414 = o4.newOrderItem(pB4, 15, 3);
    OrderItem oiC415 = o4.newOrderItem(pB5, 20, 2);
    OrderItem oiC416 = o4.newOrderItem(pB6, 14, 6);
    OrderItem oiC417 = o4.newOrderItem(pB7, 18, 3);
    OrderItem oiC418 = o4.newOrderItem(pB8, 17, 5);
    OrderItem oiC419 = o4.newOrderItem(pB9, 13, 4);
    OrderItem oiC420 = o4.newOrderItem(pB10, 22, 2);
    
    OrderItem oiC421 = o4.newOrderItem(pC1, 16, 3);
    OrderItem oiC422 = o4.newOrderItem(pC2, 17, 2);
    OrderItem oiC423 = o4.newOrderItem(pC3, 15, 5);
    OrderItem oiC424 = o4.newOrderItem(pC4, 20, 3);
    OrderItem oiC425 = o4.newOrderItem(pC5, 18, 2);
    OrderItem oiC426 = o4.newOrderItem(pC6, 13, 6);
    OrderItem oiC427 = o4.newOrderItem(pC7, 15, 3);
    OrderItem oiC428 = o4.newOrderItem(pC8, 21, 5);
    OrderItem oiC429 = o4.newOrderItem(pC9, 22, 4);
    OrderItem oiC430 = o4.newOrderItem(pC10, 14, 2);
    
    OrderItem oiC431 = o4.newOrderItem(pD1, 17, 3);
    OrderItem oiC432 = o4.newOrderItem(pD2, 19, 2);
    OrderItem oiC433 = o4.newOrderItem(pD3, 16, 5);
    OrderItem oiC434 = o4.newOrderItem(pD4, 15, 3);
    OrderItem oiC435 = o4.newOrderItem(pD5, 19, 2);
    OrderItem oiC436 = o4.newOrderItem(pD6, 20, 6);
    OrderItem oiC437 = o4.newOrderItem(pD7, 14, 3);
    OrderItem oiC438 = o4.newOrderItem(pD8, 22, 5);
    OrderItem oiC439 = o4.newOrderItem(pD9, 13, 4);
    OrderItem oiC440 = o4.newOrderItem(pD10, 12, 2);
    
    OrderItem oiC441 = o4.newOrderItem(pE1, 17, 3);
    OrderItem oiC442 = o4.newOrderItem(pE2, 19, 2);
    OrderItem oiC443 = o4.newOrderItem(pE3, 20, 5);
    OrderItem oiC444 = o4.newOrderItem(pE4, 21, 3);
    OrderItem oiC445 = o4.newOrderItem(pE5, 14, 2);
    OrderItem oiC446 = o4.newOrderItem(pE6, 13, 6);
    OrderItem oiC447 = o4.newOrderItem(pE7, 16, 3);
    OrderItem oiC448 = o4.newOrderItem(pE8, 15, 5);
    OrderItem oiC449 = o4.newOrderItem(pE9, 18, 4);
    OrderItem oiC450 = o4.newOrderItem(pE10, 12, 2);

    Order o5 = masterOrderList.newOrder(c5);
    
    OrderItem oiC51 = o5.newOrderItem(pA1, 10, 4);
    OrderItem oiC52 = o5.newOrderItem(pA2, 14, 1);
    OrderItem oiC53 = o5.newOrderItem(pA3, 5, 6);
    OrderItem oiC54 = o5.newOrderItem(pA4, 16, 4);
    OrderItem oiC55 = o5.newOrderItem(pA5, 20, 3);
    OrderItem oiC56 = o5.newOrderItem(pA6, 14, 7);
    OrderItem oiC57 = o5.newOrderItem(pA7, 19, 4);
    OrderItem oiC58 = o5.newOrderItem(pA8, 17, 6);
    OrderItem oiC59 = o5.newOrderItem(pA9, 15, 5);
    OrderItem oiC510 = o5.newOrderItem(pA10, 19, 3);
    
    OrderItem oiC511 = o5.newOrderItem(pB1, 22, 4);
    OrderItem oiC512 = o5.newOrderItem(pB2, 20, 1);
    OrderItem oiC513 = o5.newOrderItem(pB3, 13, 6);
    OrderItem oiC514 = o5.newOrderItem(pB4, 16, 4);
    OrderItem oiC515 = o5.newOrderItem(pB5, 21, 3);
    OrderItem oiC516 = o5.newOrderItem(pB6, 15, 7);
    OrderItem oiC517 = o5.newOrderItem(pB7, 19, 4);
    OrderItem oiC518 = o5.newOrderItem(pB8, 18, 6);
    OrderItem oiC519 = o5.newOrderItem(pB9, 14, 5);
    OrderItem oiC520 = o5.newOrderItem(pB10, 23, 3);
    
    OrderItem oiC521 = o5.newOrderItem(pC1, 17, 4);
    OrderItem oiC522 = o5.newOrderItem(pC2, 18, 1);
    OrderItem oiC523 = o5.newOrderItem(pC3, 16, 6);
    OrderItem oiC524 = o5.newOrderItem(pC4, 21, 4);
    OrderItem oiC525 = o5.newOrderItem(pC5, 19, 3);
    OrderItem oiC526 = o5.newOrderItem(pC6, 14, 7);
    OrderItem oiC527 = o5.newOrderItem(pC7, 16, 4);
    OrderItem oiC528 = o5.newOrderItem(pC8, 22, 6);
    OrderItem oiC529 = o5.newOrderItem(pC9, 23, 5);
    OrderItem oiC530 = o5.newOrderItem(pC10, 15, 3);
    
    OrderItem oiC531 = o5.newOrderItem(pD1, 18, 4);
    OrderItem oiC532 = o5.newOrderItem(pD2, 20, 1);
    OrderItem oiC533 = o5.newOrderItem(pD3, 17, 6);
    OrderItem oiC534 = o5.newOrderItem(pD4, 16, 4);
    OrderItem oiC535 = o5.newOrderItem(pD5, 20, 3);
    OrderItem oiC536 = o5.newOrderItem(pD6, 21, 7);
    OrderItem oiC537 = o5.newOrderItem(pD7, 15, 4);
    OrderItem oiC538 = o5.newOrderItem(pD8, 23, 6);
    OrderItem oiC539 = o5.newOrderItem(pD9, 14, 5);
    OrderItem oiC540 = o5.newOrderItem(pD10, 13, 3);
    
    OrderItem oiC541 = o5.newOrderItem(pE1, 18, 4);
    OrderItem oiC542 = o5.newOrderItem(pE2, 20, 1);
    OrderItem oiC543 = o5.newOrderItem(pE3, 21, 6);
    OrderItem oiC544 = o5.newOrderItem(pE4, 22, 4);
    OrderItem oiC545 = o5.newOrderItem(pE5, 15, 3);
    OrderItem oiC546 = o5.newOrderItem(pE6, 14, 7);
    OrderItem oiC547 = o5.newOrderItem(pE7, 17, 4);
    OrderItem oiC548 = o5.newOrderItem(pE8, 16, 6);
    OrderItem oiC549 = o5.newOrderItem(pE9, 19, 5);
    OrderItem oiC550 = o5.newOrderItem(pE10, 13, 3);

    Order o6 = masterOrderList.newOrder(c6);
    
    OrderItem oiC61 = o6.newOrderItem(pA1, 14, 2);
    OrderItem oiC62 = o6.newOrderItem(pA2, 18, 4);
    OrderItem oiC63 = o6.newOrderItem(pA3, 13, 3);
    OrderItem oiC64 = o6.newOrderItem(pA4, 16, 2);
    OrderItem oiC65 = o6.newOrderItem(pA5, 19, 5);
    OrderItem oiC66 = o6.newOrderItem(pA6, 13, 3);
    OrderItem oiC67 = o6.newOrderItem(pA7, 17, 2);
    OrderItem oiC68 = o6.newOrderItem(pA8, 16, 7);
    OrderItem oiC69 = o6.newOrderItem(pA9, 14, 5);
    OrderItem oiC610 = o6.newOrderItem(pA10, 17, 4);
    
    OrderItem oiC611 = o6.newOrderItem(pB1, 21, 2);
    OrderItem oiC612 = o6.newOrderItem(pB2, 19, 4);
    OrderItem oiC613 = o6.newOrderItem(pB3, 12, 3);
    OrderItem oiC614 = o6.newOrderItem(pB4, 15, 2);
    OrderItem oiC615 = o6.newOrderItem(pB5, 20, 5);
    OrderItem oiC616 = o6.newOrderItem(pB6, 14, 3);
    OrderItem oiC617 = o6.newOrderItem(pB7, 18, 2);
    OrderItem oiC618 = o6.newOrderItem(pB8, 16, 7);
    OrderItem oiC619 = o6.newOrderItem(pB9, 13, 5);
    OrderItem oiC620 = o6.newOrderItem(pB10, 21, 4);
    
    OrderItem oiC621 = o6.newOrderItem(pC1, 16, 2);
    OrderItem oiC622 = o6.newOrderItem(pC2, 17, 4);
    OrderItem oiC623 = o6.newOrderItem(pC3, 15, 3);
    OrderItem oiC624 = o6.newOrderItem(pC4, 19, 2);
    OrderItem oiC625 = o6.newOrderItem(pC5, 18, 5);
    OrderItem oiC626 = o6.newOrderItem(pC6, 12, 3);
    OrderItem oiC627 = o6.newOrderItem(pC7, 14, 2);
    OrderItem oiC628 = o6.newOrderItem(pC8, 20, 7);
    OrderItem oiC629 = o6.newOrderItem(pC9, 22, 5);
    OrderItem oiC630 = o6.newOrderItem(pC10, 13, 4);
    
    OrderItem oiC631 = o6.newOrderItem(pD1, 17, 2);
    OrderItem oiC632 = o6.newOrderItem(pD2, 18, 4);
    OrderItem oiC633 = o6.newOrderItem(pD3, 16, 3);
    OrderItem oiC634 = o6.newOrderItem(pD4, 15, 2);
    OrderItem oiC635 = o6.newOrderItem(pD5, 19, 5);
    OrderItem oiC636 = o6.newOrderItem(pD6, 20, 3);
    OrderItem oiC637 = o6.newOrderItem(pD7, 14, 2);
    OrderItem oiC638 = o6.newOrderItem(pD8, 21, 7);
    OrderItem oiC639 = o6.newOrderItem(pD9, 13, 5);
    OrderItem oiC640 = o6.newOrderItem(pD10, 12, 4);
    
    OrderItem oiC641 = o6.newOrderItem(pE1, 17, 2);
    OrderItem oiC642 = o6.newOrderItem(pE2, 18, 4);
    OrderItem oiC643 = o6.newOrderItem(pE3, 19, 3);
    OrderItem oiC644 = o6.newOrderItem(pE4, 20, 2);
    OrderItem oiC645 = o6.newOrderItem(pE5, 14, 5);
    OrderItem oiC646 = o6.newOrderItem(pE6, 13, 3);
    OrderItem oiC647 = o6.newOrderItem(pE7, 16, 2);
    OrderItem oiC648 = o6.newOrderItem(pE8, 15, 7);
    OrderItem oiC649 = o6.newOrderItem(pE9, 18, 5);
    OrderItem oiC650 = o6.newOrderItem(pE10, 12, 4);

    Order o7 = masterOrderList.newOrder(c7);
    
    OrderItem oiC71 = o7.newOrderItem(pA1, 16, 3);
    OrderItem oiC72 = o7.newOrderItem(pA2, 19, 2);
    OrderItem oiC73 = o7.newOrderItem(pA3, 12, 5);
    OrderItem oiC74 = o7.newOrderItem(pA4, 15, 3);
    OrderItem oiC75 = o7.newOrderItem(pA5, 20, 4);
    OrderItem oiC76 = o7.newOrderItem(pA6, 14, 6);
    OrderItem oiC77 = o7.newOrderItem(pA7, 18, 3);
    OrderItem oiC78 = o7.newOrderItem(pA8, 17, 5);
    OrderItem oiC79 = o7.newOrderItem(pA9, 13, 4);
    OrderItem oiC710 = o7.newOrderItem(pA10, 18, 2);
    
    OrderItem oiC711 = o7.newOrderItem(pB1, 22, 3);
    OrderItem oiC712 = o7.newOrderItem(pB2, 20, 2);
    OrderItem oiC713 = o7.newOrderItem(pB3, 11, 5);
    OrderItem oiC714 = o7.newOrderItem(pB4, 14, 3);
    OrderItem oiC715 = o7.newOrderItem(pB5, 21, 4);
    OrderItem oiC716 = o7.newOrderItem(pB6, 15, 6);
    OrderItem oiC717 = o7.newOrderItem(pB7, 19, 3);
    OrderItem oiC718 = o7.newOrderItem(pB8, 17, 5);
    OrderItem oiC719 = o7.newOrderItem(pB9, 12, 4);
    OrderItem oiC720 = o7.newOrderItem(pB10, 22, 2);
    
    OrderItem oiC721 = o7.newOrderItem(pC1, 17, 3);
    OrderItem oiC722 = o7.newOrderItem(pC2, 18, 2);
    OrderItem oiC723 = o7.newOrderItem(pC3, 14, 5);
    OrderItem oiC724 = o7.newOrderItem(pC4, 20, 3);
    OrderItem oiC725 = o7.newOrderItem(pC5, 19, 4);
    OrderItem oiC726 = o7.newOrderItem(pC6, 13, 6);
    OrderItem oiC727 = o7.newOrderItem(pC7, 15, 3);
    OrderItem oiC728 = o7.newOrderItem(pC8, 21, 5);
    OrderItem oiC729 = o7.newOrderItem(pC9, 23, 4);
    OrderItem oiC730 = o7.newOrderItem(pC10, 14, 2);
    
    OrderItem oiC731 = o7.newOrderItem(pD1, 18, 3);
    OrderItem oiC732 = o7.newOrderItem(pD2, 19, 2);
    OrderItem oiC733 = o7.newOrderItem(pD3, 17, 5);
    OrderItem oiC734 = o7.newOrderItem(pD4, 16, 3);
    OrderItem oiC735 = o7.newOrderItem(pD5, 20, 4);
    OrderItem oiC736 = o7.newOrderItem(pD6, 21, 6);
    OrderItem oiC737 = o7.newOrderItem(pD7, 15, 3);
    OrderItem oiC738 = o7.newOrderItem(pD8, 22, 5);
    OrderItem oiC739 = o7.newOrderItem(pD9, 14, 4);
    OrderItem oiC740 = o7.newOrderItem(pD10, 13, 2);
    
    OrderItem oiC741 = o7.newOrderItem(pE1, 18, 3);
    OrderItem oiC742 = o7.newOrderItem(pE2, 19, 2);
    OrderItem oiC743 = o7.newOrderItem(pE3, 20, 5);
    OrderItem oiC744 = o7.newOrderItem(pE4, 21, 3);
    OrderItem oiC745 = o7.newOrderItem(pE5, 15, 4);
    OrderItem oiC746 = o7.newOrderItem(pE6, 14, 6);
    OrderItem oiC747 = o7.newOrderItem(pE7, 17, 3);
    OrderItem oiC748 = o7.newOrderItem(pE8, 16, 5);
    OrderItem oiC749 = o7.newOrderItem(pE9, 19, 4);
    OrderItem oiC750 = o7.newOrderItem(pE10, 13, 2);

    Order o8 = masterOrderList.newOrder(c8);
    
    OrderItem oiC81 = o8.newOrderItem(pA1, 17, 4);
    OrderItem oiC82 = o8.newOrderItem(pA2, 20, 1);
    OrderItem oiC83 = o8.newOrderItem(pA3, 11, 6);
    OrderItem oiC84 = o8.newOrderItem(pA4, 14, 4);
    OrderItem oiC85 = o8.newOrderItem(pA5, 21, 3);
    OrderItem oiC86 = o8.newOrderItem(pA6, 15, 7);
    OrderItem oiC87 = o8.newOrderItem(pA7, 19, 4);
    OrderItem oiC88 = o8.newOrderItem(pA8, 18, 6);
    OrderItem oiC89 = o8.newOrderItem(pA9, 12, 5);
    OrderItem oiC810 = o8.newOrderItem(pA10, 19, 3);
    
    OrderItem oiC811 = o8.newOrderItem(pB1, 23, 4);
    OrderItem oiC812 = o8.newOrderItem(pB2, 21, 1);
    OrderItem oiC813 = o8.newOrderItem(pB3, 10, 6);
    OrderItem oiC814 = o8.newOrderItem(pB4, 13, 4);
    OrderItem oiC815 = o8.newOrderItem(pB5, 22, 3);
    OrderItem oiC816 = o8.newOrderItem(pB6, 16, 7);
    OrderItem oiC817 = o8.newOrderItem(pB7, 20, 4);
    OrderItem oiC818 = o8.newOrderItem(pB8, 18, 6);
    OrderItem oiC819 = o8.newOrderItem(pB9, 11, 5);
    OrderItem oiC820 = o8.newOrderItem(pB10, 23, 3);
    
    OrderItem oiC821 = o8.newOrderItem(pC1, 18, 4);
    OrderItem oiC822 = o8.newOrderItem(pC2, 19, 1);
    OrderItem oiC823 = o8.newOrderItem(pC3, 13, 6);
    OrderItem oiC824 = o8.newOrderItem(pC4, 21, 4);
    OrderItem oiC825 = o8.newOrderItem(pC5, 20, 3);
    OrderItem oiC826 = o8.newOrderItem(pC6, 14, 7);
    OrderItem oiC827 = o8.newOrderItem(pC7, 16, 4);
    OrderItem oiC828 = o8.newOrderItem(pC8, 22, 6);
    OrderItem oiC829 = o8.newOrderItem(pC9, 24, 5);
    OrderItem oiC830 = o8.newOrderItem(pC10, 15, 3);
    
    OrderItem oiC831 = o8.newOrderItem(pD1, 19, 4);
    OrderItem oiC832 = o8.newOrderItem(pD2, 20, 1);
    OrderItem oiC833 = o8.newOrderItem(pD3, 18, 6);
    OrderItem oiC834 = o8.newOrderItem(pD4, 17, 4);
    OrderItem oiC835 = o8.newOrderItem(pD5, 21, 3);
    OrderItem oiC836 = o8.newOrderItem(pD6, 22, 7);
    OrderItem oiC837 = o8.newOrderItem(pD7, 16, 4);
    OrderItem oiC838 = o8.newOrderItem(pD8, 23, 6);
    OrderItem oiC839 = o8.newOrderItem(pD9, 15, 5);
    OrderItem oiC840 = o8.newOrderItem(pD10, 14, 3);
    
    OrderItem oiC841 = o8.newOrderItem(pE1, 19, 4);
    OrderItem oiC842 = o8.newOrderItem(pE2, 20, 1);
    OrderItem oiC843 = o8.newOrderItem(pE3, 21, 6);
    OrderItem oiC844 = o8.newOrderItem(pE4, 22, 4);
    OrderItem oiC845 = o8.newOrderItem(pE5, 16, 3);
    OrderItem oiC846 = o8.newOrderItem(pE6, 15, 7);
    OrderItem oiC847 = o8.newOrderItem(pE7, 18, 4);
    OrderItem oiC848 = o8.newOrderItem(pE8, 17, 6);
    OrderItem oiC849 = o8.newOrderItem(pE9, 20, 5);
    OrderItem oiC850 = o8.newOrderItem(pE10, 14, 3);

    Order o9 = masterOrderList.newOrder(c9);
    
    OrderItem oiC91 = o9.newOrderItem(pA1, 18, 2);
    OrderItem oiC92 = o9.newOrderItem(pA2, 22, 1);
    OrderItem oiC93 = o9.newOrderItem(pA3, 13, 5);
    OrderItem oiC94 = o9.newOrderItem(pA4, 16, 3);
    OrderItem oiC95 = o9.newOrderItem(pA5, 20, 2);
    OrderItem oiC96 = o9.newOrderItem(pA6, 15, 6);
    OrderItem oiC97 = o9.newOrderItem(pA7, 19, 3);
    OrderItem oiC98 = o9.newOrderItem(pA8, 17, 7);
    OrderItem oiC99 = o9.newOrderItem(pA9, 14, 4);
    OrderItem oiC910 = o9.newOrderItem(pA10, 18, 2);
    
    OrderItem oiC911 = o9.newOrderItem(pB1, 23, 1);
    OrderItem oiC912 = o9.newOrderItem(pB2, 20, 3);
    OrderItem oiC913 = o9.newOrderItem(pB3, 13, 5);
    OrderItem oiC914 = o9.newOrderItem(pB4, 16, 2);
    OrderItem oiC915 = o9.newOrderItem(pB5, 21, 4);
    OrderItem oiC916 = o9.newOrderItem(pB6, 15, 6);
    OrderItem oiC917 = o9.newOrderItem(pB7, 19, 3);
    OrderItem oiC918 = o9.newOrderItem(pB8, 17, 7);
    OrderItem oiC919 = o9.newOrderItem(pB9, 14, 4);
    OrderItem oiC920 = o9.newOrderItem(pB10, 22, 2);
    
    OrderItem oiC921 = o9.newOrderItem(pC1, 17, 3);
    OrderItem oiC922 = o9.newOrderItem(pC2, 18, 2);
    OrderItem oiC923 = o9.newOrderItem(pC3, 16, 5);
    OrderItem oiC924 = o9.newOrderItem(pC4, 20, 1);
    OrderItem oiC925 = o9.newOrderItem(pC5, 19, 4);
    OrderItem oiC926 = o9.newOrderItem(pC6, 13, 6);
    OrderItem oiC927 = o9.newOrderItem(pC7, 15, 3);
    OrderItem oiC928 = o9.newOrderItem(pC8, 21, 7);
    OrderItem oiC929 = o9.newOrderItem(pC9, 22, 2);
    OrderItem oiC930 = o9.newOrderItem(pC10, 14, 4);
    
    OrderItem oiC931 = o9.newOrderItem(pD1, 18, 3);
    OrderItem oiC932 = o9.newOrderItem(pD2, 19, 2);
    OrderItem oiC933 = o9.newOrderItem(pD3, 17, 5);
    OrderItem oiC934 = o9.newOrderItem(pD4, 16, 1);
    OrderItem oiC935 = o9.newOrderItem(pD5, 20, 4);
    OrderItem oiC936 = o9.newOrderItem(pD6, 21, 6);
    OrderItem oiC937 = o9.newOrderItem(pD7, 15, 3);
    OrderItem oiC938 = o9.newOrderItem(pD8, 22, 7);
    OrderItem oiC939 = o9.newOrderItem(pD9, 14, 2);
    OrderItem oiC940 = o9.newOrderItem(pD10, 13, 4);
    
    OrderItem oiC941 = o9.newOrderItem(pE1, 18, 3);
    OrderItem oiC942 = o9.newOrderItem(pE2, 19, 2);
    OrderItem oiC943 = o9.newOrderItem(pE3, 20, 5);
    OrderItem oiC944 = o9.newOrderItem(pE4, 21, 1);
    OrderItem oiC945 = o9.newOrderItem(pE5, 15, 4);
    OrderItem oiC946 = o9.newOrderItem(pE6, 14, 6);
    OrderItem oiC947 = o9.newOrderItem(pE7, 17, 3);
    OrderItem oiC948 = o9.newOrderItem(pE8, 16, 7);
    OrderItem oiC949 = o9.newOrderItem(pE9, 18, 2);
    OrderItem oiC950 = o9.newOrderItem(pE10, 13, 4);

    Order o10 = masterOrderList.newOrder(c10);
    
    OrderItem oiC101 = o10.newOrderItem(pA1, 19, 3);
    OrderItem oiC102 = o10.newOrderItem(pA2, 23, 1);
    OrderItem oiC103 = o10.newOrderItem(pA3, 14, 4);
    OrderItem oiC104 = o10.newOrderItem(pA4, 17, 2);
    OrderItem oiC105 = o10.newOrderItem(pA5, 21, 5);
    OrderItem oiC106 = o10.newOrderItem(pA6, 16, 3);
    OrderItem oiC107 = o10.newOrderItem(pA7, 20, 2);
    OrderItem oiC108 = o10.newOrderItem(pA8, 18, 6);
    OrderItem oiC109 = o10.newOrderItem(pA9, 15, 4);
    OrderItem oiC1010 = o10.newOrderItem(pA10, 19, 3);
    
    OrderItem oiC1011 = o10.newOrderItem(pB1, 24, 1);
    OrderItem oiC1012 = o10.newOrderItem(pB2, 21, 3);
    OrderItem oiC1013 = o10.newOrderItem(pB3, 14, 4);
    OrderItem oiC1014 = o10.newOrderItem(pB4, 17, 2);
    OrderItem oiC1015 = o10.newOrderItem(pB5, 22, 5);
    OrderItem oiC1016 = o10.newOrderItem(pB6, 16, 3);
    OrderItem oiC1017 = o10.newOrderItem(pB7, 20, 2);
    OrderItem oiC1018 = o10.newOrderItem(pB8, 18, 6);
    OrderItem oiC1019 = o10.newOrderItem(pB9, 15, 4);
    OrderItem oiC1020 = o10.newOrderItem(pB10, 23, 3);
    
    OrderItem oiC1021 = o10.newOrderItem(pC1, 18, 2);
    OrderItem oiC1022 = o10.newOrderItem(pC2, 19, 3);
    OrderItem oiC1023 = o10.newOrderItem(pC3, 17, 4);
    OrderItem oiC1024 = o10.newOrderItem(pC4, 21, 1);
    OrderItem oiC1025 = o10.newOrderItem(pC5, 20, 5);
    OrderItem oiC1026 = o10.newOrderItem(pC6, 14, 3);
    OrderItem oiC1027 = o10.newOrderItem(pC7, 16, 2);
    OrderItem oiC1028 = o10.newOrderItem(pC8, 22, 6);
    OrderItem oiC1029 = o10.newOrderItem(pC9, 23, 4);
    OrderItem oiC1030 = o10.newOrderItem(pC10, 15, 3);
    
    OrderItem oiC1031 = o10.newOrderItem(pD1, 19, 2);
    OrderItem oiC1032 = o10.newOrderItem(pD2, 20, 3);
    OrderItem oiC1033 = o10.newOrderItem(pD3, 18, 4);
    OrderItem oiC1034 = o10.newOrderItem(pD4, 17, 1);
    OrderItem oiC1035 = o10.newOrderItem(pD5, 21, 5);
    OrderItem oiC1036 = o10.newOrderItem(pD6, 22, 3);
    OrderItem oiC1037 = o10.newOrderItem(pD7, 16, 2);
    OrderItem oiC1038 = o10.newOrderItem(pD8, 23, 6);
    OrderItem oiC1039 = o10.newOrderItem(pD9, 15, 4);
    OrderItem oiC1040 = o10.newOrderItem(pD10, 14, 3);
    
    OrderItem oiC1041 = o10.newOrderItem(pE1, 19, 2);
    OrderItem oiC1042 = o10.newOrderItem(pE2, 20, 3);
    OrderItem oiC1043 = o10.newOrderItem(pE3, 21, 4);
    OrderItem oiC1044 = o10.newOrderItem(pE4, 22, 1);
    OrderItem oiC1045 = o10.newOrderItem(pE5, 16, 5);
    OrderItem oiC1046 = o10.newOrderItem(pE6, 15, 3);
    OrderItem oiC1047 = o10.newOrderItem(pE7, 18, 2);
    OrderItem oiC1048 = o10.newOrderItem(pE8, 17, 6);
    OrderItem oiC1049 = o10.newOrderItem(pE9, 19, 4);
    OrderItem oiC1050 = o10.newOrderItem(pE10, 14, 3);

    //ProductCatalog pdA = supplierDirectory.findSupplier("B").getProductCatalog();
    return business;

  }
}
