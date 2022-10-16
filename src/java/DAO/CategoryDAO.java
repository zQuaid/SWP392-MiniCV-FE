/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Product;
import Model.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
<<<<<<< HEAD
 * @author mihxdat
 */
public class CategoryDAO extends DBContext {
    public List<Product> getNewProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select top 10 * from Product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductId"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setDescription(rs.getString("Description"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setImage(rs.getString("Image"));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }
     public List<Category> getAllCategory(){
        List<Category> list = new ArrayList<>();
        String sql = "SELECT * FROM Category";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Category c = new Category();
                c.setCategoryID(rs.getInt("CategoryID"));
                c.setCategoryName(rs.getString("CategoryName"));
                list.add(c);
            }
            
        }catch(SQLException e){
            
        }return list;
    }
}


