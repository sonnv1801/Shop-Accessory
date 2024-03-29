/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDao;
import entity.Order;
import entity.OrderDetails;
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
public class OrderServlet extends HttpServlet {

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
            out.println("<title>Servlet OrderServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OrderServlet at " + request.getContextPath() + "</h1>");
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
                    listOrders(request, response);
                    break;
                case "VIEW":
                    System.out.println("ok roi");
                    viewOrder(request, response);
                    break;
                case "UPDATE":
                    updateOrder(request, response);
                    break;
                case "DELIVERY":
                    deliveryOrder(request, response);
                    break;
                case "DELETE":
                    deleteOrder(request, response);
                    break;
                default:
                    listOrders(request, response);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
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

    private void listOrders(HttpServletRequest request, HttpServletResponse response) throws Exception {
        OrderDao newsDao = new OrderDao();
        List<Order> list = newsDao.getAllOrder();
        request.setAttribute("listOrders", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Orders.jsp");
        dispatcher.forward(request, response);
    }

    private void updateOrder(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String TheOrderId = request.getParameter("orderId");
        new OrderDao().updateOrder(TheOrderId);
        listOrders(request, response);
    }

    private void deliveryOrder(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String TheOrderId = request.getParameter("orderId");
        new OrderDao().deliveryOrder(TheOrderId);
        listOrders(request, response);
    }

    private void deleteOrder(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String TheOrderId = request.getParameter("orderId");
        new OrderDao().deleteOrder(TheOrderId);
        listOrders(request, response);
    }

    private void viewOrder(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String TheOrderId = request.getParameter("orderId");
        OrderDetails order = new OrderDao().viewOrder(TheOrderId);
        request.setAttribute("THE_ORDER", order);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewOrder.jsp");
        dispatcher.forward(request, response);
    }

}
