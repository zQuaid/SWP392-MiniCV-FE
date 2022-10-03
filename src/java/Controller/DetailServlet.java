/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import DAO.ProductDAO;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mihxdat
 */
@WebServlet(name="DetailServlet", urlPatterns={"/detail"})
public class DetailServlet extends HttpServlet {
   
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
            out.println("<title>Servlet DetailServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DetailServlet at " + request.getContextPath () + "</h1>");
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
            String id_raw = request.getParameter("id");
        int id;
        try {
            ProductDAO productDAO = new ProductDAO();
            Cookie arr[] = request.getCookies();
            List<Product> list = new ArrayList<>();
            for (Cookie o : arr) {
                if (o.getName().equals("id")) {
                    String txt[] = o.getValue().split(",");
                    for (String s : txt) {
                        list.add(productDAO.getProductDetail(s));
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                int count = 1;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).getProductID() == list.get(j).getProductID()) {
                        count++;
                        list.remove(j);
                        j--;
                        list.get(i).setQuantity(count);
                    }
                }
            }
            for (Cookie o : arr) {
                o.setMaxAge(0);
                response.addCookie(o);
            }
            int n = list.size();
            request.setAttribute("size", n);
            id = Integer.parseInt(id_raw);
            Product p = productDAO.getProductsById(id);
            request.setAttribute("detail", p);
            request.getRequestDispatcher("detail.jsp").forward(request, response);
        } catch (Exception e) {
        }
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
        processRequest(request, response);
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
