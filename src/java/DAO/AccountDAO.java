/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Account;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author citih
 */
public class AccountDAO extends DBContext {

public void newPassword(String newPassword, String email) {
        try {

            String sql = "update Account set password = ? where email = ? ";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, newPassword);
            st.setString(2, email);
            st.executeUpdate();
            int rowCount = st.executeUpdate();
            if (rowCount > 0) {
                System.out.println("success");
            } else {
                System.out.println("fail");

            }

        } catch (SQLException e) {

        }
    }

        public Account getAccount(String username) {
        String sql = "select * from Account where username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account p = new Account();
                p.setUsername(rs.getString("username"));
                p.setPassword(rs.getString("password"));
                p.setFirstName(rs.getString("firstname"));
                p.setLastName(rs.getString("lastname"));
                p.setPhone(rs.getString("phone"));
                p.setGender(rs.getBoolean("gender"));
                p.setEmail(rs.getString("email"));
                p.setRoleID(rs.getString("roleId"));
                p.setCitizenID(rs.getString("CitizenID"));
                p.setId(rs.getInt("UserID"));
                p.setAccImage(rs.getString("accImage"));
                p.setAddress(rs.getString("Address"));
                p.setBonusPoint(rs.getInt("BonusPoint"));
                p.setDob(rs.getDate("DOB"));
                p.setSalary(rs.getString("Salary"));
                p.setTrust(rs.getString("Trust"));
                p.setWorkingShift(rs.getString("WorkingShift"));

                return p;
            }
        } catch (SQLException e) {
        }
        return null;
    }
        public Account getAccountbyUserid(String userid) {
        String sql = "select * from Account where UserID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, userid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account p = new Account();
                p.setUsername(rs.getString("username"));
                p.setPassword(rs.getString("password"));
                p.setFirstName(rs.getString("firstname"));
                p.setLastName(rs.getString("lastname"));
                p.setPhone(rs.getString("phone"));
                p.setGender(rs.getBoolean("gender"));
                p.setEmail(rs.getString("email"));
                p.setRoleID(rs.getString("roleId"));
                p.setCitizenID(rs.getString("CitizenID"));
                p.setId(rs.getInt("UserID"));
                p.setAccImage(rs.getString("accImage"));
                p.setAddress(rs.getString("Address"));
                p.setBonusPoint(rs.getInt("BonusPoint"));
                p.setDob(rs.getDate("DOB"));
                p.setSalary(rs.getString("Salary"));
                p.setTrust(rs.getString("Trust"));
                p.setWorkingShift(rs.getString("WorkingShift"));

                return p;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void update(Account p) {
        String sql = "UPDATE [dbo].[Product]\n"
                + "   SET [password] = ?\n"
                + " WHERE username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getPassword());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Account check(String username, String password) {
        String sql = "SELECT [UserID]\n"
                + "      ,[Username]\n"
                + "      ,[Password]\n"
                + "      ,[FirstName]\n"
                + "      ,[LastName]\n"
                + "      ,[Email]\n"
                + "      ,[Phone]\n"
                + "      ,[Address]\n"
                + "      ,[Gender]\n"
                + "      ,[DOB]\n"
                + "      ,[RoleID]\n"
                + "      ,[BonusPoint]\n"
                + "      ,[Trust]\n"
                + "      ,[Salary]\n"
                + "      ,[CitizenID]\n"
                + "      ,[WorkingShift]\n"
                + "      ,[AccImage]\n"
                + "  FROM [dbo].[Account]"
                + "  WHERE [Username] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(2, username);
            st.setString(3, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(8),
                        rs.getBoolean(7),
                        rs.getString(9),
                        rs.getString(11),
                        rs.getInt(10),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14)
                );
                return a;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    
    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM [dbo].[Account]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account p = new Account();
                p.setUsername(rs.getString("Username"));
                p.setPassword(rs.getString("Password"));
                p.setFirstName(rs.getString("FirstName"));
                p.setLastName(rs.getString("LirstName"));
                p.setPhone(rs.getString("Phone"));
                p.setGender(rs.getBoolean("Gender"));
                p.setEmail(rs.getString("Email"));
                p.setRoleID(rs.getString("RoleID"));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }

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
                a.setSalary(rs.getString("Salary"));
                a.setWorkingShift(rs.getString("WorkingShift"));
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
    
    public void deleteAccount(int userId){
        String sql = "DELETE From Account WHERE UserID = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, userId);
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }
    
    public void updateSalary(int userId, String salary){
        String sql = "UPDATE Account SET Salary = ? WHERE UserID = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, salary);
            st.setInt(2, userId);
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }
    
    public void addStaff(Account a, String date){
        String sql = "INSERT INTO Account (Username, Password, FirstName, LastName, Email, Phone, Address, Gender, DOB, RoleID,  Salary, CitizenID, WorkingShift, AccImage) VALUES  (?, ?, ?, ?, ?, ?, ?, ?, ?, 2, ?, ?, ?, ?)";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, a.getPassword());
            st.setString(3, a.getFirstName());
            st.setString(4, a.getLastName());
            st.setString(5, a.getEmail());
            st.setString(6, a.getPhone());
            st.setString(7, a.getAddress());
            st.setBoolean(8, a.isGender());
            st.setDate(9, Date.valueOf(date));
            st.setString(10, a.getSalary());
            st.setString(11, a.getCitizenID());
            st.setString(12, a.getWorkingShift());
            st.setString(13, a.getAccImage());
            st.executeUpdate();
            }catch(SQLException e){    
        }
    }
    
    public void updateAccount(Account a, String date){
        String sql = "UPDATE Account SET FirstName = ?, LastName = ?, Email = ?, Phone = ?, Address = ?, Gender = ?, DOB = ? WHERE UserID = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getFirstName());
            st.setString(2, a.getLastName());
            st.setString(3, a.getEmail());
            st.setString(4, a.getPhone());
            st.setString(5, a.getAddress());
            st.setBoolean(6, a.isGender());
            st.setDate(7, Date.valueOf(date));
            st.setInt(8, a.getId());
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }

}

