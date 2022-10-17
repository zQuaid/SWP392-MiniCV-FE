/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class OrderDAO extends DBContext{
    public int getOrderBySuccess(int userId){
        int orderSuccess = 0;
        String sql = "SELECT * FROM OrderInfor WHERE Status = 'Success' AND UserID = ?";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, userId);
        ResultSet rs = st.executeQuery();
            while(rs.next()){
                orderSuccess +=1;
            }
        }catch(SQLException e){
        }
        return orderSuccess;
    }
    
    public int getOrderByPending(int userId){
        int orderPending = 0;
        String sql = "SELECT * FROM OrderInfor WHERE Status = 'Pending' AND UserID = ?";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, userId);
        ResultSet rs = st.executeQuery();
            while(rs.next()){
                orderPending +=1;
            }
        }catch(SQLException e){
        }
        return orderPending;
    }
    
    public int getOrderByCanceled(int userId){
        int orderCanceled = 0;
        String sql = "SELECT * FROM OrderInfor WHERE Status = 'Canceled' AND UserID = ?";   
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, userId);
        ResultSet rs = st.executeQuery();
            while(rs.next()){
                orderCanceled +=1;
            }
        }catch(SQLException e){
        }
        return orderCanceled;
    }
}
