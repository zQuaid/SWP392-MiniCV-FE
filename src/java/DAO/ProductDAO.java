/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Cart;
import Model.Category;
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

    public List<Category> getListCategory() {
        ArrayList<Category> list = new ArrayList<>();
        try {
            String sql = "SELECT [CategoryID]\n"
                    + "      ,[CategoryName]\n"
                    + "  FROM [dbo].[Category]";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCategoryID(rs.getInt("CategoryID"));
                c.setCategoryName(rs.getString("CategoryName"));
                list.add(c);
            }
        } catch (Exception e) {
        }

        return list;

    }

    public ArrayList<Product> getTopProduct() {
        ArrayList<Product> list = new ArrayList<>();

        try {
            String sql = "select top(3) * from Product order by Price desc";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setDiscount(rs.getInt("Discount"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setDescription(rs.getString("Decription"));
                p.setImage(rs.getString("Image"));
                p.getWarehouse();
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
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setDiscount(rs.getInt("Discount"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setDescription(rs.getString("Decription"));
                p.setImage(rs.getString("Image"));
                p.getWarehouse();
                list.add(p);

            }
        } catch (Exception e) {
        }
        return list;

    }

    public List<Product> getProductByCategoryID(int categoryID) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT [ProductID]\n"
                + "      ,[ProductName]\n"
                + "      ,[Price]\n"
                + "      ,[Discount]\n"
                + "      ,[Quantity]\n"
                + "      ,[Decription]\n"
                + "      ,[Image]\n"
                + "      ,[CategoryID]\n"
                + "      ,[WarehouseID]\n"
                + "  FROM [dbo].[Product]"
                + "  WHERE 1=1 ";

        if (categoryID != 0) {
            sql += " and CategoryID=" + categoryID;
        }
        try {

            PreparedStatement st = connection.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setDiscount(rs.getInt("Discount"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setDescription(rs.getString("Decription"));
                p.setImage(rs.getString("Image"));
                p.getWarehouse();
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
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setDiscount(rs.getInt("Discount"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setDescription(rs.getString("Decription"));
                p.setImage(rs.getString("Image"));
                p.getWarehouse();
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
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setDiscount(rs.getInt("Discount"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setDescription(rs.getString("Decription"));
                p.setImage(rs.getString("Image"));
                p.getWarehouse();
                return p;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public List<Product> search(String txt, int index) throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "select * from\n"
                + "(select ROW_NUMBER () over (order by ProductID asc) as r, * \n"
                + "from Product where [ProductName] like ?) as x\n"
                + "where r between ? * 3 - 2 and ? * 3";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + txt + "%");
            st.setInt(2, index);
            st.setInt(3, index);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setPrice(rs.getString("Price"));
                p.setDiscount(rs.getInt("Discount"));
                p.setQuantity(rs.getInt("Quantity"));
                p.setDescription(rs.getString("Decription"));
                p.setImage(rs.getString("Image"));
                p.getWarehouse();
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    public int count(String txt) throws SQLException {
        try {
            String sql = "select count (*) from Product where [ProductName] like ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + txt + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return 0;
    }

    public List<Cart> getCartProducts(ArrayList<Cart> cartList) {
        List<Cart> products = new ArrayList<Cart>();
        try {
            if (cartList.size() > 0) {
                for (Cart item : cartList) {
                    String sql = "Select * from Product where ProductID =?";
                    PreparedStatement st = connection.prepareStatement(sql);
                    st.setInt(1, item.getProductID());
                    ResultSet rs = st.executeQuery();
                    while (rs.next()) {
                        Cart row = new Cart();
                        row.setProductID(rs.getInt("ProductID"));
                        row.setProductName(rs.getString("ProductName"));
                        row.setPrice(String.valueOf(Integer.parseInt(rs.getString("Price")) * item.getQuantityAdd()));
                        row.setDiscount(rs.getInt("Discount"));
                        row.setQuantity(rs.getInt("Quantity"));
                        row.setDescription(rs.getString("Decription"));
                        row.setImage(rs.getString("Image"));
                        row.getWarehouse();
                        row.setQuantityAdd(item.getQuantityAdd());
                        products.add(row);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    public double getTotalCartPrice(ArrayList<Cart> carList) {
        double sum = 0;
        try {
            if (carList.size() > 0) {
                for (Cart item : carList) {
                    String sql = "Select Price from Product where ProductID =?";
                    PreparedStatement st = connection.prepareStatement(sql);
                    st.setInt(1, item.getProductID());
                    ResultSet rs = st.executeQuery();

                    while (rs.next()) {
                        sum += rs.getInt("Price") * item.getQuantityAdd();
                    }
                }

            }

        } catch (Exception e) {
        }
        return sum;
    }

}
