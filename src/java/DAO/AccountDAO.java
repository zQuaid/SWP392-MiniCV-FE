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
<<<<<<< HEAD
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

}

