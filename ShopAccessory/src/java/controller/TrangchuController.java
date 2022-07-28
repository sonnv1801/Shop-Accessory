/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BannerDAO;
import dao.ProductDAO;
import entity.Banner;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "TrangchuController", urlPatterns = {"/TrangchuController"})
public class TrangchuController extends HttpServlet {

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
            out.println("<title>Servlet TrangchuController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TrangchuController at " + request.getContextPath() + "</h1>");
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
        if (request.getParameter("action") != null) {
            action = request.getParameter("action");
        } else {
            action = request.getContextPath();
        }
        try {
            switch (action) {
                case "index":
                    initData(request, response);
                    break;
                case "recommend":
                    navigationRecommend(request, response);
                    break;
                default:
                    initData(request, response);
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

    private void initData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDAO productDAO = new ProductDAO();
        BannerDAO bannerDAO = new BannerDAO();
        List<Product> listNew = productDAO.getNewProducts();
        List<Product> listLimit = productDAO.getProductLimit();
        List<Product> listMost = productDAO.getMostProducts();
        List<Product> listBestSeller = productDAO.getBestSellerProducts();
        List<Product> listRandom = productDAO.getRandomProducts();
        List<Product> listDiscount = productDAO.getDiscountProducts();

        List<Banner> listBanner = bannerDAO.getAllBanner();

        request.setAttribute("listnew", listNew);
        request.setAttribute("listlimit", listLimit);
        request.setAttribute("listmost", listMost);
        request.setAttribute("listbestseller", listBestSeller);
        request.setAttribute("listrandom", listRandom);
        request.setAttribute("listdiscount", listDiscount);
        request.setAttribute("listbanner", listBanner);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private void navigationRecommend(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("gioithieu.jsp"); //tin/productDetails.jsp
        dispatcher.forward(request, response);
    }

    
}
