/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mihxdat
 */
public class ProductDAO extends DBContext {

    public ArrayList<Product> getTopProduct() {
        ArrayList<Product> list = new ArrayList<>();

        try {
            String sql = "select top(3) * from Product order by Price desc";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9));
                list.add(p);
            }
        } catch (Exception e) {

        }
        return list;

    }

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();
        
        try {
            String sql = "SELECT [ProductID]\n"
                    + "      ,[ProductName]\n"
                    + "      ,[Price]\n"
                    + "      ,[Discount]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[Decription]\n"
                    + "      ,[Image]\n"
                    + "      ,[CategoryID]\n"
                    + "      ,[WarehouseID]\n"
                    + "  FROM [dbo].[Product]";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Product p = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9));
                list.add(p);

            }
        } catch (Exception e) {
        }
        return list;

    }
    
    public ArrayList<Product> getProductByCategoryID(int categoryID){
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product WHERE CategoryID = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, categoryID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                Product p = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
        
    }
    
        public Product getProductsById(int productID) {
            ArrayList<Product> list = new ArrayList<>();
        
        try {
            String sql = "select * from Product where ProductID = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productID);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {                
                Product p = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9));
                return p;
             }
             
        } catch (SQLException e) {
        }
        return null;
    }
        
    public Product getProductDetail(String txt) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from Product where ProductID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, txt);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                Product p = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9));
                return p;
             }
        } catch (SQLException e) {
        }
        return null;
    }

}
