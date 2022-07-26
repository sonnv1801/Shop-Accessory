/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDao;
import dbcontext.DbCon;
import entity.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
@WebServlet(name = "LoginAdminServlet", urlPatterns = {"/LoginAdminServlet"})
public class LoginAdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *
     */
    private static AdminDao userDao = new AdminDao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginAdmin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginAdmin at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
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
<<<<<<< HEAD
//       response.setContentType("text/html;charset=UTF-8");
//        try ( PrintWriter out = response.getWriter()) {
//            String email = request.getParameter("username");
//            String password = request.getParameter("password");
//            
//            try {
//                AdminDao udao = new AdminDao(DbCon.getConnection());
//                Admin user = udao.userLogin(email, password);
//                
//                if(user != null) {
//                    request.getSession().setAttribute("auth", user);
//                    response.sendRedirect("./admin/HomePage.jsp");
//                } else {
//                     request.setAttribute("loginFail", "User name or password is incorrect");
//                     request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
//                }
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//        }

//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        Admin user = new Admin(username, password);
//        if (userDao.login(user)) {
//            HttpSession session = request.getSession();
//           
//           session.setAttribute("userLogin", user);            
//           response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
//        } else {
//            request.setAttribute("LoginAdmin", user);
//            request.setAttribute("loginFail", "User name or password is incorrect");
//            request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
//        }

//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        Admin user = new Admin(username, password);
//        if (userDao.login(user) != -1) {
//            HttpSession session = request.getSession();
//           int iduser = userDao.login(user);
//           Admin user2 = new Admin(iduser, username, password);
//           session.setAttribute("userLogin", user2);            
//           response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
//        } else {
//            request.setAttribute("LoginAdmin", user);
//            request.setAttribute("loginFail", "User name or password is incorrect");
//            request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
//        }
            
=======
      
>>>>>>> main
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin user = new Admin(username, password);
        if (userDao.login(user) != "") {
            HttpSession session = request.getSession();
           String fullUser = userDao.login(user);
           String[] string = fullUser.split("--");
           int iduser = Integer.parseInt(string[0]);
           String image = string[1];
            System.out.println("image là:" + image);
           Admin user2 = new Admin(iduser, image, username, password);
           session.setAttribute("userLogin", user2);            
           response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
        } else {
            request.setAttribute("LoginAdmin", user);
            request.setAttribute("loginFail", "User name or password is incorrect");
            request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
        }
    }
    
    /**
     * String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin user = new Admin("admin", "12345");
        if (userDao.login(user) != -1) {
            HttpSession session = request.getSession();
           int iduser = userDao.login(user);
           Admin user2 = new Admin(iduser, username, password);
           session.setAttribute("userLogin", user2);            
           response.sendRedirect(request.getContextPath() + "/HomePage.jsp");
        } else {
            request.setAttribute("LoginAdmin", user);
            request.setAttribute("loginFail", "User name or password is incorrect");
            request.getRequestDispatcher("LoginAdmin.jsp").forward(request, response);
        }
     */

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
