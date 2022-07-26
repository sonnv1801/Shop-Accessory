/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProductsDAO;
import entity.Color;
import entity.ImageProducts;
import entity.Product;
import entity.Size;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.swing.text.html.HTML;
/**
 *
 * @author Tin_Ngo
 */
@WebServlet(name = "ProductsControl", urlPatterns = {"/ProductsControl"})
public class ProductsControl extends HttpServlet {

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
            out.println("<title>Servlet ProductsControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductsControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        
        try {
            switch(action){
                case "/productdetails":
                    ShowLimitProduct(request, response);
                    break;
                default:
                    AllColor(request, response);
                    AllSize(request, response);
                    AllImageProduct(request, response);
                    ShowLimitProduct(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
//    ACTIONS
    
        
    // lấy tất cả ảnh của product
    public void AllImageProduct(HttpServletRequest request, HttpServletResponse response) 
            throws SecurityException,IOException, Exception{
        ProductsDAO productDao = new ProductsDAO();
        int idproduct = Integer.parseInt(request.getParameter("idproduct"));
        List<ImageProducts> images = productDao.getImageOfProduct(idproduct);
        request.setAttribute("ProductImages", images);
    }
    
    // lấy tất cả color của products
    public void AllColor(HttpServletRequest request, HttpServletResponse response) 
            throws SecurityException,IOException, Exception{
        ProductsDAO productDao = new ProductsDAO();
        List<Color> color = productDao.GetAllColor();
        request.setAttribute("AllColor", color);
    }
    
    
        // lấy tất cả size của products
    public void AllSize(HttpServletRequest request, HttpServletResponse response) 
            throws SecurityException,IOException, Exception{
        ProductsDAO productDao = new ProductsDAO();
        List<Size> size = productDao.GetAllSize();
        request.setAttribute("AllSize", size);
    }
    
    
    // đã bao gồm ảnh - xem hàm constructor trong entity
    public void ShowLimitProduct(HttpServletRequest request, HttpServletResponse response)
        throws SecurityException, IOException, Exception{
        ProductsDAO proDao = new ProductsDAO();
        List<Product> listProduct = proDao.selectLimitProduct(5);
        request.setAttribute("ProductsLimit", listProduct);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("tin/productDetails.jsp"); //tin/productDetails.jsp
        dispatcher.forward(request, response);
    }
   
}
