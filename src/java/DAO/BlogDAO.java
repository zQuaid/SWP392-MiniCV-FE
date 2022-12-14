/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Blog;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mihxdat
 */
public class BlogDAO extends DBContext {

    public ArrayList<Blog> getAllBlog() {
        ArrayList<Blog> list = new ArrayList<>();

        try {
            String sql = "SELECT [BlogID]\n"
                    + "      ,[BlogTitle]\n"
                    + "      ,[Decription]\n"
                    + "      ,[UserID]\n"
                    + "      ,[CommentID]\n"
                    + "  FROM [dbo].[Blog]";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                list.add(b);

            }
        } catch (Exception e) {
        }
        return list;

    }

    public Blog getBlogDetail(String txt) {
        ArrayList<Blog> list = new ArrayList<>();
        String sql = "select * from Blog where BlogID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, txt);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                return b;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public Blog getBlogById(int blogID) {
        ArrayList<Blog> list = new ArrayList<>();

        try {
            String sql = "select * from Blog where BlogID = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, blogID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                return b;
            }

        } catch (SQLException e) {
        }
        return null;
    }

}
