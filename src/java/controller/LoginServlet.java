/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import DAO.AdminDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import Model.Account;

/**
 *
 * @author trung
 */
@WebServlet(name="LoginServlet", urlPatterns={"/login"})
public class LoginServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String u = request.getParameter("user");
        String p = request.getParameter("pass");
        String r = request.getParameter("rem");
        
        //tạo 3 cookie: username, password, remember
        Cookie cu = new Cookie("cuser", u);
        Cookie cp = new Cookie("cpass", p);
        Cookie cr = new Cookie("crem", r);
        if (r != null) {
            //có chọn, muốn lưu lại
            cu.setMaxAge(60 * 60 * 24 * 7); // 7 ngày
            cp.setMaxAge(60 * 60 * 24 * 7);
            cr.setMaxAge(60 * 60 * 24 * 7);
        } else {
            //Kh muốn lưu lại, xóa đi
            cu.setMaxAge(0);
            cp.setMaxAge(0);
            cr.setMaxAge(0);
        }
        response.addCookie(cu);
        response.addCookie(cp);
        response.addCookie(cr);

        AdminDAO d = new AdminDAO();
        Account a = d.check(u, p);
        HttpSession session = request.getSession();
        if (a == null) {
            //Chưa có tài khoản
            request.setAttribute("error", "Username or password incorrect!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            request.setAttribute("error", "Username or password incorrect!!");
            request.getRequestDispatcher("admin.jsp").forward(request, response);
        } else {
            //Tìm thấy tài khoản
            //Tạo session
            session.setAttribute("account", a);
            response.sendRedirect("home");
             session.setAttribute("admin", a);
            response.sendRedirect("dashboard");
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
