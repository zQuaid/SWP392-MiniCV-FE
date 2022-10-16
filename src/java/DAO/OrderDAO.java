/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Bill;
import Model.OrderInfo;
import Model.Product;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class OrderDAO extends DBContext {

    public ArrayList<Bill> getOrder(String userid) {
        ArrayList<Bill> list = new ArrayList<>();
        String sql = "select Bill.OrderID,OrderInfor.UserID,Product.ProductName, OrderInfor.ShippingAddress,OrderInfor.Date,Bill.Quantity,OrderInfor.TotalPrice,Product.Image,Product.ProductID  from "
                + "((Bill inner join OrderInfor on Bill.OrderID  = OrderInfor.OrderID) inner join Product on Bill.ProductID= Product.ProductID)"
                + "where OrderInfor.UserID= ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, userid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Bill a = new Bill();
                Product b = new Product();
                OrderInfo c = new OrderInfo();
                c.setOrderID(rs.getInt(1));
                c.setUserID(rs.getInt(2));
                b.setProductName(rs.getString(3));
                c.setShippingAddress(rs.getString(4));
                c.setDate(rs.getDate(5));
                a.setQuantity(rs.getInt(6));
                c.setTotalPrice(rs.getInt(7));
                b.setImage(rs.getString(8));
                b.setProductID(rs.getInt(9));
                a.setOrderInfo(c);
                a.setProduct(b);
                list.add(a);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    public void addOrderinfo(Date Date,String Coupon,int UserID,String ShippingAddress,int BonusPoint,int TotalPrice,String ShippingUnit,String Status,int Price) {
        String sql = "insert into OrderInfor(Date,Coupon,UserID,ShippingAddress,BonusPoint,TotalPrice,ShippingUnit,Status,Price) values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setDate(1,Date);
            st.setString(2,Coupon);
            st.setInt(3,UserID);
            st.setString(4, ShippingAddress);
            st.setInt(5, BonusPoint);
            st.setInt(6, TotalPrice);
            st.setString(7, ShippingUnit);
            st.setString(8,Status);
            st.setInt(9,Price);
            st.executeUpdate();
        } catch (SQLException e) {
        }
    }
    public void addBill( String ProductID,String Quantity) {
        String sql = "insert into OrderInfor(OrderID,ProductID,Quantity) values(?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            
            st.setString(1,ProductID );
            st.setString(2,Quantity);
            
            st.executeUpdate();
             
        } catch (SQLException e) {
        }
    }
      public ArrayList<Bill> getOrderbyOrderid(String orderid) {
        ArrayList<Bill> list = new ArrayList<>();
        String sql = "select Bill.OrderID,OrderInfor.UserID,Product.ProductName, OrderInfor.ShippingAddress,OrderInfor.Date,Bill.Quantity,OrderInfor.TotalPrice,Product.Image,Product.ProductID,Product.Price  from "
                + "((Bill inner join OrderInfor on Bill.OrderID  = OrderInfor.OrderID) inner join Product on Bill.ProductID= Product.ProductID)"
                + "where OrderInfor.OrderID= ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, orderid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Bill a = new Bill();
                Product b = new Product();
                OrderInfo c = new OrderInfo();
                c.setOrderID(rs.getInt(1));
                c.setUserID(rs.getInt(2));
                b.setProductName(rs.getString(3));
                c.setShippingAddress(rs.getString(4));
                c.setDate(rs.getDate(5));
                a.setQuantity(rs.getInt(6));
                c.setTotalPrice(rs.getInt(7));
                b.setImage(rs.getString(8));
                b.setProductID(rs.getInt(9));
                b.setPrice(rs.getString(10));
                a.setOrderInfo(c);
                a.setProduct(b);
                list.add(a);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    

    public int getOrderBySuccess(int userId) {
        int orderSuccess = 0;
        String sql = "SELECT * FROM OrderInfor WHERE Status = 'Success' AND UserID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, userId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                orderSuccess += 1;
            }
        } catch (SQLException e) {
        }
        return orderSuccess;
    }

    public int getOrderByPending(int userId) {
        int orderPending = 0;
        String sql = "SELECT * FROM OrderInfor WHERE Status = 'Pending' AND UserID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, userId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                orderPending += 1;
            }
        } catch (SQLException e) {
        }
        return orderPending;
    }

    public int getOrderByCanceled(int userId) {
        int orderCanceled = 0;
        String sql = "SELECT * FROM OrderInfor WHERE Status = 'Canceled' AND UserID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, userId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                orderCanceled += 1;
            }
        } catch (SQLException e) {
        }
        return orderCanceled;
    }
}
