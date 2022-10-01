/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;

import Model.OrderInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class OrderDAO extends DBContext{
    public List<OrderInfo> getOrder(String userid){
        List<OrderInfo> list = new ArrayList<>();
        String sql = "select * from OrderInfor where UserID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, userid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                OrderInfo a = new OrderInfo();
                a.setOrderID(rs.getInt(1));
                a.setProductID(rs.getInt(2));
                a.setDate(rs.getDate(3));
                a.setCoupon(rs.getString(4));
                a.setUserID(rs.getInt(5));
                a.setShippingUnit(rs.getString(6));
                a.setBonusPoint(rs.getInt(7));
                a.setTotalPrice(rs.getInt(8));
                a.setShippingUnit(rs.getString(9));
                a.setStatus(rs.getString(10));
                list.add(a);
            }
        } catch (SQLException e) {
        }
        return list;
    }
}
