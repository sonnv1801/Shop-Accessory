/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDao;
import dao.NewsDao;
import dao.QlAdminDao;
import entity.Admin;
import entity.News;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
public class PosterAdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static NewsDao newsDao = new NewsDao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PosterAdminServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PosterAdminServlet at " + request.getContextPath() + "</h1>");
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
                    listAdmins(request, response);
                    break;
                default:
                    listAdmins(request, response);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
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
        String idAdmin = request.getParameter("poster");
        String title = request.getParameter("title");
        String des = request.getParameter("des");
        String daySubmit = request.getParameter("daySubmit");
        String image = request.getParameter("image");
        
        News news = new News(idAdmin,des, daySubmit, title, image);
        
        if (newsDao.addNews(news)) {
            request.setAttribute("trueAdd", "Thêm Thành Công");
            
            try {
                listAdmins(request, response);
            } catch (Exception ex) {
                Logger.getLogger(PosterAdminServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            request.setAttribute("AddAd", news);
            request.setAttribute("flaseAdd", "Thêm Không Thành Công");
            request.getRequestDispatcher("AddNews.jsp").forward(request, response);
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

    private void listAdmins(HttpServletRequest request, HttpServletResponse response) throws Exception {
        QlAdminDao adminDao = new QlAdminDao();
        List<Admin> list = adminDao.getAdmins();
        request.setAttribute("list", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("AddNews.jsp");
        dispatcher.forward(request, response);

    }

}
