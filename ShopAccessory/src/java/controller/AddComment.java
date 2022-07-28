/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductsDAO;
import entity.Comments;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddComment", urlPatterns = {"/AddComment"})
public class AddComment extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        ProductsDAO productDao = new ProductsDAO();
//        int iduser = Integer.parseInt(request.getParameter("iduser"));
        int iduser = Integer.parseInt(session.getAttribute("iduser").toString());
        int idproduct = Integer.parseInt(request.getParameter("idproduct"));
        String comment = request.getParameter("comments");
        int star = Integer.parseInt(request.getParameter("star"));
        Comments cmt = new Comments(iduser, comment, idproduct, star);
        
        if (productDao.addCommentsProduct(cmt)) {
            System.out.println("Cập nhật thành công cmt");
            response.sendRedirect("ProductsControl?idproduct="+idproduct);
        } else {
           request.setAttribute("CommentFail", "Có lỗi xảy ra");
           request.getRequestDispatcher("/ProductsControl?idproduct="+idproduct).forward(request, response);
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

}
