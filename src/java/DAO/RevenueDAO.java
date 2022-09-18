/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Revenue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class RevenueDAO extends DBContext{
    
    public int getTotalRevenue(int month, int year){
        int tRevenue = 0;
        String sql = "Select * from OrderInfor where Status = 'Success' AND MONTH(date)=? AND YEAR(date)=?"; 
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, month);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                int t = Integer.parseInt(rs.getString("TotalPrice"));
                tRevenue = tRevenue + t;
            }
        }catch(SQLException e){    
        }return tRevenue;
    }
    
    public boolean checkTargetRevenue(int month, int year){
        int count = 0;
        String sql = "Select * from Revenue WHERE MONTH(date) =? AND YEAR(date)=? ";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, month);
            st.setInt(2, year);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                count +=1;
            }
        }catch(SQLException e){
            
        }
        return count <= 0;
    }
    
    public void setTargetRevenue(int targetRevenue, int month, int year){
        int totalRevenue = getTotalRevenue(month, year);
        if(checkTargetRevenue(month, year) == true){
            String sql1 = "INSERT INTO Revenue(TargetRevenue, TotalRevenue, month, year ) Values = (?,?,?,?)";
            try{
            PreparedStatement st = connection.prepareStatement(sql1);
            st.setInt(1, targetRevenue);
            st.setInt(2, totalRevenue);
            st.setInt(3, month);
            st.setInt(4, year);
            st.executeUpdate();
            }catch(SQLException e){
                
            }
        }else{
            String sql2 = "UPDATE Revenue SET TargetRevenue = ?, totalRevenue = ? WHERE month = ? AND year=?";
            try{
            PreparedStatement st = connection.prepareStatement(sql2);
            st.setInt(1, targetRevenue);
            st.setInt(2, totalRevenue);
            st.setInt(3, month);
            st.setInt(4, year);
            st.executeUpdate();
            }catch(SQLException e){
                
            }
        }
    }
}
