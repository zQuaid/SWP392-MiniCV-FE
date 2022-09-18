/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author PC
 */
public class AccountDAO extends DBContext{
    public String getAccount(String username, String password) {
        String sql = "select * from Account_HE163615 where username = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Account c = new Account();
                c.setPassword(rs.getString("password"));
                return password;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void update(Account p) {
        String sql = "UPDATE [dbo].[Products_HE163615]\n"
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
}
