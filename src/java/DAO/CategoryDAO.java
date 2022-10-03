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
import java.util.ArrayList;
import java.util.List;

/**
 *
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
                p.setPrice(rs.getInt("Price"));
                p.setDescription(rs.getString("Description"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setImage(rs.getString("Image"));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }
}