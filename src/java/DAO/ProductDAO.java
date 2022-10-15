/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Category;
import Model.Product;
import Model.Warehouse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductDAO extends DBContext{
    public List<Product> getProductList(){
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM (Product INNER JOIN Warehouse ON Product.WarehouseID = Warehouse.WarehouseID) INNER JOIN Category ON Product.CategoryID = Category.CategoryID ";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product p = new Product();
                Category c = new Category();
                Warehouse w = new Warehouse();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setDescription(rs.getString("Decription"));
                p.setImage(rs.getString("Image"));
                p.setDiscount(rs.getInt("Discount"));
                c.setCategoryID(rs.getInt("CategoryID"));
                c.setCategoryName(rs.getString("CategoryName"));
                w.setWarehouseID(rs.getInt("WarehouseID"));
                w.setWarehouseName(rs.getString("WarehouseName"));
                p.setCategory(c);
                p.setWarehouse(w);
                list.add(p);
            }
        }catch(SQLException e){
        }
        return list;
    }
}
