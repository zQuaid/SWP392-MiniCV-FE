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
 * @author trung
 */
public class AdminDAO extends DBContext {

    public Account check(String username, String password) {
        ArrayList<Account> list = new ArrayList<>();
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
                + "  FROM [dbo].[Account]\n"
                + "  WHERE [Username] = ? AND [Password] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getBoolean(9),
                rs.getDate(10),
                rs.getString(11),
                rs.getInt(12),
                rs.getString(13),
                rs.getString(14),
                rs.getString(15),
                rs.getString(16),
                rs.getString(17));

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

    public Account getAccount(String username) {
        String sql = "select * from Account where username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account p = new Account();
                p.setUsername(rs.getString("Username"));
                p.setPassword(rs.getString("Password"));
                p.setFirstName(rs.getString("FirstName"));
                p.setLastName(rs.getString("LirstName"));
                p.setPhone(rs.getString("Phone"));
                p.setGender(rs.getBoolean("Gender"));
                p.setEmail(rs.getString("Email"));
                p.setRoleID(rs.getString("RoleID"));
                return p;
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
