/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.AccountDAO;
import Model.Account;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author Admin
 */
@WebServlet(name = "StafflistServlet", urlPatterns = {"/stafflist"})
public class StafflistServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StafflistServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StafflistServlet at " + request.getContextPath() + "</h1>");
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
        AccountDAO ud = new AccountDAO();
        List<Account> acc = ud.getStaffList();
        request.setAttribute("accList", acc);
        request.getRequestDispatcher("/stafflist.jsp").forward(request, response);
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
        String act = request.getParameter("act");
        if (act.equals("View Detail")) {
            AccountDAO ad = new AccountDAO();
            String sid = (String) request.getParameter("userid");
            int id = Integer.parseInt(sid);
            Account a = ad.getAccount(id);
            request.setAttribute("user", a);
            request.getRequestDispatcher("staffpage.jsp").forward(request, response);
        } else if (act.equals("Delete")) {
            AccountDAO ad = new AccountDAO();
            String sid = (String) request.getParameter("userid");
            int id = Integer.parseInt(sid);
            ad.deleteAccount(id);
            response.sendRedirect("stafflist");
        } else if (act.equals("update")){
            AccountDAO ad = new AccountDAO();
            String sid = (String) request.getParameter("userid");
            int id = Integer.parseInt(sid);
            String salary = (String) request.getParameter("newsalary");
            ad.updateSalary(id, salary);
            response.sendRedirect("stafflist");
        }
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