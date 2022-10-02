/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
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
    
}
