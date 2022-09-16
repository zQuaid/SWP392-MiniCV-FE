/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author citih
 */
public class AccountDAO extends DBContext{
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
}