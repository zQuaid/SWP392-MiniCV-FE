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


public class ProductDAO extends DBContext {

//    public Product getProduct(int productid) {
//
//        String sql = "select * from Product where ProductID = ?";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, productid);
//            ResultSet rs = st.executeQuery();
//            if (rs.next()) {
//                Product a = new Product();
//                a.setProductID(rs.getInt(1));
//                a.setProductName(rs.getString(2));
//                a.setPrice(rs.getInt(3));
//                a.setDiscount(rs.getInt(4));
//                a.setQuantity(rs.getInt(5));
//                a.setDescription(rs.getString(6));
//                a.setImage(rs.getString(7));
//                a.setCategoryID(rs.getInt(8));
//                a.setWarehouseID(rs.getInt(9));
//                return a;
//            }
//
//        } catch (SQLException e) {
//
//        }
//        return null;
//    }

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

//    public ArrayList<Product> getTopProduct() {
//        ArrayList<Product> list = new ArrayList<>();
//
//        try {
//            String sql = "select top(3) * from Product order by Price desc";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                list.add(p);
//            }
//        } catch (Exception e) {
//
//        }
//        return list;
//
//    }

//    public ArrayList<Product> getAllProduct() {
//        ArrayList<Product> list = new ArrayList<>();
//
//        try {
//            String sql = "SELECT [ProductID]\n"
//                    + "      ,[ProductName]\n"
//                    + "      ,[Price]\n"
//                    + "      ,[Discount]\n"
//                    + "      ,[Quantity]\n"
//                    + "      ,[Decription]\n"
//                    + "      ,[Image]\n"
//                    + "      ,[CategoryID]\n"
//                    + "      ,[WarehouseID]\n"
//                    + "  FROM [dbo].[Product]";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                list.add(p);
//
//            }
//        } catch (Exception e) {
//        }
//        return list;
//
//    }

//    public List<Product> getProductByCategoryID(int categoryID) {
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "SELECT [ProductID]\n"
//                + "      ,[ProductName]\n"
//                + "      ,[Price]\n"
//                + "      ,[Discount]\n"
//                + "      ,[Quantity]\n"
//                + "      ,[Decription]\n"
//                + "      ,[Image]\n"
//                + "      ,[CategoryID]\n"
//                + "      ,[WarehouseID]\n"
//                + "  FROM [dbo].[Product]"
//                + "  WHERE 1=1 ";
//
//        if (categoryID != 0) {
//            sql += " and CategoryID=" + categoryID;
//        }
//        try {
//
//            PreparedStatement st = connection.prepareStatement(sql);
//            
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product();
//                p.setProductID(rs.getInt("ProductID"));
//                p.setProductName(rs.getString("ProductName"));
//                p.setPrice(rs.getInt("Price"));
//                p.setDiscount(rs.getInt("Discount"));
//                p.setQuantity(rs.getInt("Quantity"));
//                p.setDescription(rs.getString("Decription"));
//                p.setImage(rs.getString("Image"));
//                p.setWarehouseID(rs.getInt("WarehouseID"));
//                list.add(p);
//            }
//        } catch (Exception e) {
//        }
//        return list;
//
//    }

//    public Product getProductsById(int productID) {
//        ArrayList<Product> list = new ArrayList<>();
//
//        try {
//            String sql = "select * from Product where ProductID = ?";
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, productID);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                return p;
//            }
//
//        } catch (SQLException e) {
//        }
//        return null;
//    }

//    public Product getProductDetail(String txt) {
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "select * from Product where ProductID = ?";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, txt);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                return p;
//            }
//        } catch (SQLException e) {
//        }
//        return null;
//    }

//    public List<Product> search(String txt, int index) throws SQLException {
//        List<Product> list = new ArrayList<>();
//        String sql = "select * from\n"
//                + "(select ROW_NUMBER () over (order by ProductID asc) as r, * \n"
//                + "from Product where [ProductName] like ?) as x\n"
//                + "where r between ? * 3 - 2 and ? * 3";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, "%" + txt + "%");
//            st.setInt(2, index);
//            st.setInt(3, index);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(2),
//                        rs.getString(3),
//                        rs.getString(4),
//                        rs.getInt(5),
//                        rs.getInt(6),
//                        rs.getString(7),
//                        rs.getString(8),
//                        rs.getInt(9),
//                        rs.getInt(10));
//                list.add(p);
//            }
//        } catch (SQLException e) {
//        }
//        return list;
//
//    }

//    public ArrayList<Product> getTopProduct() {
//        ArrayList<Product> list = new ArrayList<>();
//
//        try {
//            String sql = "select top(3) * from Product order by Price desc";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                list.add(p);
//            }
//        } catch (Exception e) {
//
//        }
//        return list;
//
//    }

//    public ArrayList<Product> getAllProduct() {
//        ArrayList<Product> list = new ArrayList<>();
//
//        try {
//            String sql = "SELECT [ProductID]\n"
//                    + "      ,[ProductName]\n"
//                    + "      ,[Price]\n"
//                    + "      ,[Discount]\n"
//                    + "      ,[Quantity]\n"
//                    + "      ,[Decription]\n"
//                    + "      ,[Image]\n"
//                    + "      ,[CategoryID]\n"
//                    + "      ,[WarehouseID]\n"
//                    + "  FROM [dbo].[Product]";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                list.add(p);
//
//            }
//        } catch (SQLException e) {
//        }
//        return list;
//
//    }

//    public List<Product> getProductByCategoryID(int categoryID) {
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "SELECT [ProductID]\n"
//                + "      ,[ProductName]\n"
//                + "      ,[Price]\n"
//                + "      ,[Discount]\n"
//                + "      ,[Quantity]\n"
//                + "      ,[Decription]\n"
//                + "      ,[Image]\n"
//                + "      ,[CategoryID]\n"
//                + "      ,[WarehouseID]\n"
//                + "  FROM [dbo].[Product]"
//                + "  WHERE 1=1 ";
//
//        if (categoryID != 0) {
//            sql += " and CategoryID=" + categoryID;
//        }
//        try {
//
//            PreparedStatement st = connection.prepareStatement(sql);
//
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product();
//                p.setProductID(rs.getInt("ProductID"));
//                p.setProductName(rs.getString("ProductName"));
//                p.setPrice(rs.getInt("Price"));
//                p.setDiscount(rs.getInt("Discount"));
//                p.setQuantity(rs.getInt("Quantity"));
//                p.setDescription(rs.getString("Decription"));
//                p.setImage(rs.getString("Image"));
//                p.setWarehouseID(rs.getInt("WarehouseID"));
//                list.add(p);
//            }
//        } catch (SQLException e) {
//        }
//        return list;
//
//    }

//    public Product getProductsById(int productID) {
//        try {
//            String sql = "select * from Product where ProductID = ?";
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, productID);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                return p;
//            }
//
//        } catch (SQLException e) {
//        }
//        return null;
//    }

//    public Product getProductDetail(String txt) {
//        String sql = "select * from Product where ProductID = ?";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, txt);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getInt(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getInt(8),
//                        rs.getInt(9));
//                return p;
//            }
//        } catch (SQLException e) {
//        }
//        return null;
//    }

//    public List<Product> search(String txt, int index) throws SQLException {
//        List<Product> list = new ArrayList<>();
//        String sql = "select * from\n"
//                + "(select ROW_NUMBER () over (order by ProductID asc) as r, * \n"
//                + "from Product where [ProductName] like ?) as x\n"
//                + "where r between ? * 3 - 2 and ? * 3";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, "%" + txt + "%");
//            st.setInt(2, index);
//            st.setInt(3, index);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Product p = new Product(rs.getInt(2),
//                        rs.getString(3),
//                        rs.getInt(4),
//                        rs.getInt(5),
//                        rs.getInt(6),
//                        rs.getString(7),
//                        rs.getString(8),
//                        rs.getInt(9),
//                        rs.getInt(10));
//                list.add(p);
//            }
//        } catch (SQLException e) {
//        }
//        return list;
//    }

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
}
        
