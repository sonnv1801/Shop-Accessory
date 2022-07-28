/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.HistoryDao;
import entity.OrderDetails;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tin_Ngo
 */
@WebServlet(name = "HistoryControl", urlPatterns = {"/HistoryControl"})
public class HistoryControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HistoryControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HistoryControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        int iduser = Integer.parseInt(session.getAttribute("iduser").toString());
        
        HistoryDao dao = new HistoryDao();
        Users user = dao.getUser(iduser);
        request.setAttribute("User", user);
        
        List<OrderDetails> ListOrderdetails = dao.getOrerDetails(iduser);
        System.out.println("mmmmkkkkk"+ListOrderdetails);
        request.setAttribute("ListOrderdetails", ListOrderdetails);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("tin/history.jsp"); //tin/productDetails.jsp
        dispatcher.forward(request, response);
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

}
