/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import dao.ProductTypeDao;
import entity.ProductType;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "SearchController", urlPatterns = {"/SearchController"})
public class SearchController extends HttpServlet {

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
            out.println("<title>Servlet SearchController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchController at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("utf-8");
        String action;
        if (request.getParameter("find") != null) {
            action = request.getParameter("find");
        } else {
            action = request.getContextPath();
        }
        try {
            switch (action) {    
                case "priceASC":
                    findProductPriceASC(request, response);
                    break;
                case "priceDESC":
                    findProductPriceDESC(request, response);
                    break;
                case "new":
                    findAllNewProducts(request, response);
                    break;
                case "most":
                    findMostProducts(request, response);
                    break;
                 case "appreciate":
                    findAppreciateProducts(request, response);
                    break;
                default:
                    searchProducts(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
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

    private void searchProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getAllCategory(request, response);
        getMostProducts(request, response);
        String s = request.getParameter("search");

        ProductDAO productDAO = new ProductDAO();
        List<Product> productSearch = productDAO.SearchProduct(s);

        request.setAttribute("productsearch", productSearch);
        request.setAttribute("value", s);
        request.getRequestDispatcher("SearchPage.jsp").forward(request, response);
    }

    private void findProductPriceASC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getMostProducts(request, response);
        getAllCategory(request, response);
        ProductDAO productDAO = new ProductDAO();
        List<Product> listASC = productDAO.getProductPriceASC();
        request.setAttribute("productsearch", listASC);
        request.getRequestDispatcher("SearchPage.jsp").forward(request, response);
    }

    private void findProductPriceDESC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getMostProducts(request, response);
        getAllCategory(request, response);
        ProductDAO productDAO = new ProductDAO();
        List<Product> listDESC = productDAO.getProductPriceDESC();
        request.setAttribute("productsearch", listDESC);
        request.getRequestDispatcher("SearchPage.jsp").forward(request, response);
    }

    private void findAllNewProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getMostProducts(request, response);
        getAllCategory(request, response);
        ProductDAO productDAO = new ProductDAO();
        List<Product> listAllNew = productDAO.getAllNewProducts();
        request.setAttribute("productsearch", listAllNew);
        request.getRequestDispatcher("SearchPage.jsp").forward(request, response);
    }
    
    private void findMostProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getMostProducts(request, response);
        getAllCategory(request, response);
        ProductDAO productDAO = new ProductDAO();
        List<Product> listMost = productDAO.getAllMostProducts();
        request.setAttribute("productsearch", listMost);
        request.getRequestDispatcher("SearchPage.jsp").forward(request, response);
    }
    
    private void findAppreciateProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getMostProducts(request, response);
        getAllCategory(request, response);
        ProductDAO productDAO = new ProductDAO();
        List<Product> listMost = productDAO.getAllAppreciateProducts();
        request.setAttribute("productsearch", listMost);
        request.getRequestDispatcher("SearchPage.jsp").forward(request, response);
    }
    
    
    private void getAllCategory(HttpServletRequest request, HttpServletResponse response){
        ProductTypeDao productTypeDAO = new ProductTypeDao();
        List<ProductType> type = productTypeDAO.getAllTypes();
        request.setAttribute("type", type);
    }
    
     private void getMostProducts(HttpServletRequest request, HttpServletResponse response){
        ProductDAO productDAO = new ProductDAO();
        List<Product> listMost = productDAO.getMostProducts();
        request.setAttribute("listmost", listMost);
    }
    
}
