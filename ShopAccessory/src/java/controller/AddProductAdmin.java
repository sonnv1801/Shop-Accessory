/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductTypeDao;
import dao.ProductsDAO;
import dao.QlAdminDao;
import entity.Admin;
import entity.Product;
import entity.ProductType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class AddProductAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static ProductsDAO productDao = new ProductsDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddProductAdmin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddProductAdmin at " + request.getContextPath() + "</h1>");
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
                    GetAllType(request, response);
                    break;
                case "LOAD":
                    loadProducts(request, response);
                default:
                    GetAllType(request, response);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AddProductAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
        int idadmin = Integer.parseInt(request.getParameter("poster"));
        int idprt = Integer.parseInt(request.getParameter("type"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int price = Integer.parseInt(request.getParameter("price"));
        String color = request.getParameter("color");
        String size = request.getParameter("size");
        String image = request.getParameter("image");

        Product product = new Product(idadmin, idprt, name, description, quantity, price, color, size);

        if (productDao.InsertProduct(product, image)) {
            request.setAttribute("trueAdd", "Thêm Thành Công");
            try {
                GetAllType(request, response);
            } catch (Exception ex) {
                Logger.getLogger(PosterAdminServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            request.setAttribute("DS", product);
            request.setAttribute("loi", "Them khong thanh cong");
            request.getRequestDispatcher("Products.jsp").forward(request, response);
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

    private void GetAllType(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProductTypeDao adminDao = new ProductTypeDao();
        List<ProductType> list = adminDao.getAllTypes();
        request.setAttribute("listType", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Products.jsp");
        dispatcher.forward(request, response);
    }
    
    
    private void loadProducts(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int theProductId = Integer.parseInt(request.getParameter("productId"));
        Product product = new ProductsDAO().GetProductDetails(theProductId);
        Product s = (Product) product;
        request.setAttribute("THE_PRODUCT", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("UpadateProductAdmin.jsp");
        dispatcher.forward(request, response);
    }

}
