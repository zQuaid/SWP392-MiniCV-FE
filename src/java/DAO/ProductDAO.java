/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
<<<<<<< HEAD
import Model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author citih
 */
public class ProductDAO extends DBContext{
    public Product getProduct(int productid){
        
        String sql = "select * from Product where ProductID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product a = new Product();
                a.setProductID(rs.getInt(1));
                a.setProductName(rs.getString(2));
                a.setPrice(rs.getInt(3));
                a.setDiscount(rs.getInt(4));
                a.setQuantity(rs.getInt(5));
                a.setDescription(rs.getString(6));
                a.setImage(rs.getString(7));
                a.setCategoryID(rs.getInt(8));
                a.setWarehouseID(rs.getInt(9));
                
                
                return a;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    
=======
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
    
    public void addProduct(Product p){
        String sql = "INSERT INTO Product (ProductName, Price, Discount, Quantity, Product.Decription , Product.Image, CategoryID, WarehouseID) VALUES  (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getProductName());
            st.setString(2, p.getPrice());
            st.setInt(3, p.getDiscount());
            st.setInt(4, p.getQuantity());
            st.setString(5, p.getDescription());
            st.setString(6, p.getImage());
            st.setInt(7, p.getCategory().getCategoryID());
            st.setInt(8, p.getWarehouse().getWarehouseID());
            st.executeUpdate();
            }catch(SQLException e){    
        }
    }
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a
}
