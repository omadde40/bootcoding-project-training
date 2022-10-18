package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME = "app_order_manu_item";
    public void crateTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root#123");
            Statement stmt = con.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL, "
                    + " quantity int4, "
                    + " total_price decimal, "
                    + " order_id bigint, "
                    + " menu_item_name text, "
                    + " is_veg bool, "
                    + " CONSTRAINT app_order_manu_item_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);
//            String sql = "Select * from " + TABLE_NAME;
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()){
//                System.out.println("Menu Item Name = " + rs.getString("menu_item_name"));
//                System.out.println("Quantity = " + rs.getString("quantity"));
//                System.out.println("Total Price = " + rs.getString("total_price"));
//                System.out.println("IsVeg = " + rs.getString("is_veg"));
//            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
