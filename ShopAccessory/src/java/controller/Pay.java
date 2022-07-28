/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDao;
import dao.ProductsDAO;
import dao.UsersDao;
import entity.Order;
import entity.Product;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "Pay", urlPatterns = {"/Pay"})
public class Pay extends HttpServlet {
    
    static String AllInforPay;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pay</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Pay at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        try {
            switch(action){
                case "ordered":
                    // lấy id user từ session
                    HttpSession session = request.getSession();
                    int iduser = Integer.parseInt(session.getAttribute("iduser").toString());
        
                    System.out.println(AllInforPay);
                    OrderDao orderDao = new OrderDao();
                    ProductsDAO productDao = new ProductsDAO();
                    String TotalPrice = request.getParameter("TotalPrice");
            //        request.setAttribute("TotalPrice", TotalPrice);
            //        request.setAttribute("AllNameProduct", AllNameProduct);
                    String[] item = AllInforPay.split("---");
                    for(int i = 0; i<item.length; i++){
                        int idproduct = 0, totalbuy = 0, soluongmua=0, condition = 0, price = 0;
                        String datecreate = getDayNow();
                        String[] subItem = item[i].split("--");
                        for(int j = 0; j<subItem.length; j++){
                            /*
                            if(j == 1) đây là tên sản phẩm
                            if(j==2) đây là id product
                            if(j==3) đây là số lượng mua
                            if(j==4) đây là đươn giá - lấy đơn giá nhân số lượng mua ra tổng tiền
                            */
                            
                            if(j==0){}
                            if(j==1){
                                idproduct = Integer.parseInt(subItem[1]);
                            }
                            if(j==2){
                                soluongmua = Integer.parseInt(subItem[2]);
                            }
                            if(j==3){
                                price = Integer.parseInt(subItem[3]);
                                totalbuy = price*soluongmua;
                            }
                        }
                        
                        // thêm vào bảng Orders
                        orderDao.AddOrder(new Order(idproduct, iduser, totalbuy, datecreate, 0));
                        // thêm vào Order Details
                        if(orderDao.AddOrderDetails(new Order(soluongmua, price))==true){
                            // cập nhật lại số lượng trong kho hàng khi khách hàng mua
                            productDao.updateQuantityProduct_Ordered(idproduct, soluongmua);
                            response.sendRedirect("HistoryControl?result=success");
                        }else{
                            response.sendRedirect("HistoryControl?result=error");
                        }
                        
                        HuyeSessionCart(request, response);
                    }
                    
//                    RequestDispatcher dispatcher = request.getRequestDispatcher("HistoryControl"); //tin/productDetails.jsp
//                    dispatcher.forward(request, response);
                    response.sendRedirect("HistoryControl");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // lấy id user từ session
        HttpSession session = request.getSession();
        int iduser = Integer.parseInt(session.getAttribute("iduser").toString());
        
        UsersDao udao = new UsersDao();
        Users user=null;
        try {
            user = udao.GetUser(iduser);
        } catch (Exception ex) {
            Logger.getLogger(Pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("User", user);
        
        
        // phần order
        String AllNameProduct = request.getParameter("AllNameProduct");
        String AllNameProduct__Main = request.getParameter("AllNameProduct__Main");
        AllInforPay = AllNameProduct__Main;
        String TotalPrice = request.getParameter("TotalPrice");
//        request.setAttribute("TotalPrice", TotalPrice);
//        request.setAttribute("AllNameProduct", AllNameProduct);
        String item = AllNameProduct.replaceAll("---", "<br/>");
        String item2 = item.replaceAll("--", "x");
        
        request.setAttribute("StringItem", item2);
        request.setAttribute("totalPrice", TotalPrice);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("tin/pay.jsp"); //tin/productDetails.jsp
        dispatcher.forward(request, response);
    }
    
    public String getDayNow(){
         LocalDateTime current = LocalDateTime.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         String formatted = current.format(formatter);
         return formatted;
    }
    
    public void HuyeSessionCart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("cart", null);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
