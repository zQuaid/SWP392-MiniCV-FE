/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
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
 * @author PC
 */
@WebServlet(name = "ChangePassword", urlPatterns = {"/changepass"})
public class ChangePasswordServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
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
            out.println("<title>Servlet ChangePassword</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ChangePassword at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("change.jsp").forward(request, response);
        String userName = request.getParameter("userName");
        String oldPassWord = request.getParameter("oldPassWord");
        String newPassWord = request.getParameter("newPassWord");
        String reNewPassWord = request.getParameter("reNewPassWord");

        try {
            Account a = new Account();
            AccountDAO accountDAO = new AccountDAO();
            a.setUsername(userName);
            a = accountDAO.getAccount(userName);
            HttpSession session = request.getSession();
            if (oldPassWord == null && newPassWord == null && reNewPassWord == null) {
                request.setAttribute("error", "Password not empty!!");
                request.getRequestDispatcher("changepassword.jsp").forward(request, response);
            } else if (!newPassWord.equals(reNewPassWord)) {
                request.setAttribute("error", "Password does not match!!");
                request.getRequestDispatcher("changepassword.jsp").forward(request, response);
            } else if (!newPassWord.equals(a.getPassword())) {
                request.setAttribute("error", "OldPassword incorrect!!");
                request.getRequestDispatcher("changepassword.jsp").forward(request, response);
            } else {
                Account acc = new Account();
                a.setPassword(newPassWord);
                accountDAO.update(acc);
                request.setAttribute("success", "Password updateSucces!!");
                request.getRequestDispatcher("homepage.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        response.sendRedirect("homepage");
        request.getRequestDispatcher("homepage.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
