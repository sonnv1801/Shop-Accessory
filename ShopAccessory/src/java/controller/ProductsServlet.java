/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductAdminDao;
import dao.ProductsDAO;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class ProductsServlet extends HttpServlet {

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
            out.println("<title>Servlet ProductsServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductsServlet at " + request.getContextPath() + "</h1>");
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
        try {
            String theCommand = request.getParameter("command");
            if (theCommand == null) {
                theCommand = "LIST";
            }
            switch (theCommand) {
                case "LIST":
                    listProducts(request, response);
                    break;
                case "LOAD":
                    loadProduct(request, response);
                    break;
                case "UPDATE":
                    updateProduct(request, response);
                    break;
                case "DELETE":
                    deleteProduct(request, response);
                    break;
                default:
                    listProducts(request, response);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        processRequest(request, response);
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

    private void listProducts(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProductsDAO newsDao = new ProductsDAO();
        List<Product> list = newsDao.getAllProducts();
        request.setAttribute("listProducts", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("DS.jsp");
        dispatcher.forward(request, response);
    }
    
    
    private void loadProduct(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String ThePrId = request.getParameter("newId");
        Product pr = new ProductAdminDao().getPr(ThePrId);
        Product p = (Product) pr;
        request.setAttribute("THE_PR", pr);
        RequestDispatcher dispatcher = request.getRequestDispatcher("UpadateProductAdmin.jsp");
        dispatcher.forward(request, response);
    }

    private void updateProduct(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("newsId"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int price = Integer.parseInt(request.getParameter("price"));
        String color = request.getParameter("color");
        String size = request.getParameter("size");
        
        Product product = new Product(id, name, description, quantity, price, color, size);
        new ProductAdminDao().updateProduct(product);
        response.sendRedirect("ProductsServlet");
    }
    
    private void deleteProduct(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String thePrId = request.getParameter("prId");
        new ProductAdminDao().deleteProduct(thePrId);
        listProducts(request, response);
    }

}
