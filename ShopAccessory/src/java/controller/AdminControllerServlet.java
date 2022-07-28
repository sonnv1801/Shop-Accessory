/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDao;
import dao.ProductTypeDao;
import dao.QlAdminDao;
import entity.Admin;
import entity.ProductType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
public class AdminControllerServlet extends HttpServlet {

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
            out.println("<title>Servlet AdminControllerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminControllerServlet at " + request.getContextPath() + "</h1>");
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
                case "LOAD":
                    loadAdmin(request, response);
                    break;
                case "UPDATE":
                    updateAdmin(request, response);
                    break;
                case "DELETE":
                    deleteAdmin(request, response);
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

    private void listAdmins(HttpServletRequest request, HttpServletResponse response) throws Exception {
        QlAdminDao adminDao = new QlAdminDao();
        List<Admin> list = adminDao.getAdmins();
        request.setAttribute("adminlist", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("QlAdmin.jsp");
        dispatcher.forward(request, response);

    }

//    private void addAdmin(HttpServletRequest request,
//            HttpServletResponse response) throws Exception {
//        
//        String avatar = request.getParameter("avatar");
//        String name = request.getParameter("name");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        Admin admin = new Admin(avatar, name, username,password );
//        QlAdminDao adminDAO = new QlAdminDao();
//        adminDAO.addAdmin(admin);
//        listAdmins(request, response);
//    }
    private void loadAdmin(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        //read admin id from the form data
        String theAdminId = request.getParameter("adminId");

        //get admin from the database
        Admin admin = new QlAdminDao().getAdmin(theAdminId);
        //place admin in the request attribute
        Admin s = (Admin) admin;
        request.setAttribute("THE_ADMIN", admin);
        //send to jsp page: update-admin-form.jsp
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("UpdateAdmin.jsp");
        dispatcher.forward(request, response);
    }

    private void updateAdmin(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        // read admin info from the form data
        int id = Integer.parseInt(request.getParameter("adminId"));
        String avatar = request.getParameter("avatar");
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //create a new admin object
        Admin admin = new Admin(id, avatar, name, username, password);

        //perform update on database
        new QlAdminDao().updateAdmin(admin);
        //send them back to the "list admin" page
        listAdmins(request, response);
    }

    private void deleteAdmin(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String theAdminId = request.getParameter("adminId");

        // delete admin from the database
        new QlAdminDao().deleteAdmin(theAdminId);
        // send them back to the "list admin" pages
        listAdmins(request, response);
    }

}
