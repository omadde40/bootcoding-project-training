package com.online.restaurant.app;

import com.online.restaurant.dao.*;

public class Application {
    public static void main(String[] args) {
//        Customer om =  new Customer();
//        om.setName("Om");
//        om.setCity("Nagpur");
//        om.setAddress("New Nandanwan, Nagpur");
//        om.setState("Maharashtra");
//        om.setEmailID("om@gmail.com");
//        om.setPhoneNumber(9130354502L);
//
//        System.out.println("Name : "+om.getName());
//        System.out.println("City : "+om.getCity());
//        System.out.println("Address : "+om.getAddress());
//        System.out.println("State : "+om.getState());
//        System.out.println("Email : "+om.getEmailID());
//        System.out.println("Number : "+om.getPhoneNumber());
//
//        Vendor haldi =new Vendor();
//        haldi.setName("hadliram");
//        haldi.setAddress("Sindibag");
//        haldi.setCity("Nagpur");
//        haldi.setCategory("VEG");
//        haldi.setPhoneNumber(9130354503L);
//        haldi.setRating(5.0);
//        haldi.setState("Maharashtra");
//
//        System.out.println("Name : "+haldi.getName());
//        System.out.println("City : "+haldi.getCity());
//        System.out.println("Address : "+haldi.getAddress());
//        System.out.println("State : "+haldi.getState());
//        System.out.println("Category : "+haldi.getCategory());
//        System.out.println("Number : "+haldi.getPhoneNumber());
//        System.out.println("Ratings : "+haldi.getRating());
//
//        Order order =new Order();
//        order.setCustomer(om);
//        order.setVendor(haldi);
//        order.setTotalAmount(999.00);
//        order.setOrderDate(new Date());
//        order.setDeliveryAddress("101, Civil Lines, Nagpur");
//
//        System.out.println("Customer : "+order.getCustomer());
//        System.out.println("Vendor : "+order.getVendor());
//        System.out.println("Total Amount : "+order.getTotalAmount());
//        System.out.println("Order ID : "+order.getOrderId());
//        System.out.println("Category : "+order.getDeliveryAddress());

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.crateTable();

        MenuItemDAO menuItemDAO = new MenuItemDAO();
        menuItemDAO.crateTable();

        OrderDAO orderDAO = new OrderDAO();
        orderDAO.crateTable();

        OrderMenuItemDAO orderMenuItemDAO = new OrderMenuItemDAO();
        orderMenuItemDAO.crateTable();

        VendorDAO vendorDAO = new VendorDAO();
        vendorDAO.crateTable();
     }
}
