/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AccountDAO extends DBContext{
    public List<Account> getUserList(){
        List<Account> users = new ArrayList<>();
        String sql = "SELECT * FROM Account WHERE RoleID = 3";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("UserID"));
                a.setUsername(rs.getString("Username"));
                a.setPassword(rs.getString("Password"));
                a.setFirstName(rs.getString("FirstName"));
                a.setLastName(rs.getString("LastName"));
                a.setEmail(rs.getString("Email"));
                a.setPhone(rs.getString("Phone"));
                a.setAddress(rs.getString("Address"));
                a.setGender(rs.getBoolean("Gender"));
                a.setDob(rs.getDate("DOB"));
                a.setBonusPoint(rs.getInt("BonusPoint"));
                a.setTrust(rs.getString("Trust"));
                a.setCitizenID(rs.getString("CitizenID"));
                a.setAccImage(rs.getString("AccImage"));
                users.add(a);
            }
        } catch (SQLException e) {
            
        }
        return users;
    }
    
    public Account getAccount(int userID){
        Account a = new Account();
        String sql = "SELECT * FROM Account WHERE UserID = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, userID);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                a.setId(rs.getInt("UserID"));
                a.setUsername(rs.getString("Username"));
                a.setPassword(rs.getString("Password"));
                a.setFirstName(rs.getString("FirstName"));
                a.setLastName(rs.getString("LastName"));
                a.setEmail(rs.getString("Email"));
                a.setPhone(rs.getString("Phone"));
                a.setAddress(rs.getString("Address"));
                a.setGender(rs.getBoolean("Gender"));
                a.setDob(rs.getDate("DOB"));
                a.setBonusPoint(rs.getInt("BonusPoint"));
                a.setTrust(rs.getString("Trust"));
                a.setCitizenID(rs.getString("CitizenID"));
                a.setAccImage(rs.getString("AccImage"));
            }
        }catch(SQLException e){
            
        }
        return a;
    }
    
    public List<Account> getStaffList(){
        List<Account> staffs = new ArrayList<>();
        String sql = "SELECT * FROM Account WHERE RoleID = 2";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("UserID"));
                a.setUsername(rs.getString("Username"));
                a.setPassword(rs.getString("Password"));
                a.setFirstName(rs.getString("FirstName"));
                a.setLastName(rs.getString("LastName"));
                a.setEmail(rs.getString("Email"));
                a.setPhone(rs.getString("Phone"));
                a.setAddress(rs.getString("Address"));
                a.setGender(rs.getBoolean("Gender"));
                a.setDob(rs.getDate("DOB"));
                a.setSalary(rs.getString("Salary"));
                a.setWorkingShift(rs.getString("WorkingShift"));
                a.setCitizenID(rs.getString("CitizenID"));
                a.setAccImage(rs.getString("AccImage"));
                staffs.add(a);
            }
        } catch (SQLException e) {
            
        }
        return staffs;
    }
}
