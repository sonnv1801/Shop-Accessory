/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NewsDao;
import entity.News;
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
public class NewsServlet extends HttpServlet {

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
            out.println("<title>Servlet NewsServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewsServlet at " + request.getContextPath() + "</h1>");
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
                    listNews(request, response);
                    break;
                case "ADD":
                    addNews(request, response);
                    break;
                case "LOAD":
                    loadNews(request, response);
                    break;
                case "UPDATE":
                    updateNews(request, response);
                    break;
                case "DELETE":
                    deleteNews(request, response);
                    break;
                default:
                    listNews(request, response);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(NewsDao.class.getName()).log(Level.SEVERE, null, ex);
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

    private void listNews(HttpServletRequest request, HttpServletResponse response) throws Exception {
        NewsDao newsDao = new NewsDao();
        List<News> list = newsDao.getAllNews();
        request.setAttribute("listNews", list);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("News.jsp");
        dispatcher.forward(request, response);
    }

    private void addNews(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        String idAdmin = request.getParameter("poster");
        String title = request.getParameter("title");
        String des = request.getParameter("des");
        String daySubmit = request.getParameter("daySubmit");
        String image = request.getParameter("image");

        News news = new News(idAdmin, des,daySubmit, title, image);
        NewsDao newsDao = new NewsDao();
        newsDao.addNews(news);
        listNews(request, response);
    }
    
    private void loadNews(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String TheNewsId = request.getParameter("newsId");
        News news = new NewsDao().getNews(TheNewsId);
        News s = (News) news;
        request.setAttribute("THE_NEWS", news);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("UpdateNews.jsp");
        dispatcher.forward(request, response);
    }
     private void updateNews(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("newsId"));
        String title = request.getParameter("title");
        String des = request.getParameter("des");
        String image = request.getParameter("image");
        News news = new News(id, title, des, image);
        new NewsDao().updateNews(news);
        listNews(request, response);
    }

      private void deleteNews(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String TheNewsId = request.getParameter("newsId");
        new NewsDao().deleteNews(TheNewsId);
        listNews(request, response);
    }
}
