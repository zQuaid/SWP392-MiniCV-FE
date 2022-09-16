/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import context.DBContext;
import model.Account;
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
        String sql = "SELECT [username]\n"
                + "      ,[password]\n"
                + "      ,[fullname]\n"
                + "      ,[phone]\n"
                + "      ,[gender]\n"
                + "      ,[email]\n"
                + "      ,[roleId]\n"
                + "  FROM [dbo].[Account_HE163615]\n"
                + "  WHERE [username] = ? and [password] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getString(6),
                        rs.getInt(7));
                return a;
            }
        } catch (SQLException e) {
        }
        return null;
    }
    
    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM [dbo].[Account_HE163615]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account p = new Account();
                p.setUsername(rs.getString("username"));
                p.setPassword(rs.getString("password"));
                p.setFullname(rs.getString("fullname"));
                p.setPhone(rs.getString("phone"));
                p.setGender(rs.getBoolean("gender"));
                p.setEmail(rs.getString("email"));
                p.setRoleId(rs.getInt("roleId"));
                list.add(p);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
    public Account getAccount(String username) {
        String sql = "select * from Account_HE163615 where username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account p = new Account();
                p.setUsername(rs.getString("username"));
                p.setPassword(rs.getString("password"));
                p.setFullname(rs.getString("fullname"));
                p.setPhone(rs.getString("phone"));
                p.setGender(rs.getBoolean("gender"));
                p.setEmail(rs.getString("email"));
                p.setRoleId(rs.getInt("roleId"));
                return p;
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
