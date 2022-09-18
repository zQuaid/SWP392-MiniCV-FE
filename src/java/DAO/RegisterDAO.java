/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Account;

/**
 *
 * @author trung
 */
public class RegisterDAO extends DBContext {

    public Account checkAccountExist(String username) {
        String sql = "SELECT [Username]\n"
                + "      ,[Password]\n"
                + "      ,[FirstName]\n"
                + "      ,[LirstName]\n"
                + "      ,[Phone]\n"
                + "      ,[Gender]\n"
                + "      ,[Email]\n"
                + "      ,[RoleID]\n"
                + "  FROM [dbo].[Account]\n"
                + "  WHERE [username] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getBoolean(6),
                        rs.getString(7),
                        rs.getString(8));
                return a;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void create(String username, String password, String firstName,String lastName,
            String phone, boolean sex, String Email) {
        String sql = "INSERT INTO [dbo].[Account]\n"
                + "           ([Username]\n"
                + "           ,[Password]\n"
                + "           ,[FirstName]\n"
                + "           ,[LirstName]\n"
                + "           ,[Phone]\n"
                + "           ,[Gender]\n"
                + "           ,[Email]\n"
                + "           ,[RoleID])\n"
                + "     VALUES (?,?,?,?,?,?,?,1)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, firstName);
            st.setString(4, lastName);
            st.setString(5, phone);
            st.setBoolean(6, sex);
            st.setString(7, Email);
            st.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
