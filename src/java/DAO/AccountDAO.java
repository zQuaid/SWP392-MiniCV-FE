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
}
