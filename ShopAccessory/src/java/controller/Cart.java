/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "Cart", urlPatterns = {"/Cart"})
public class Cart extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cart</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cart at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action;
        if(request.getParameter("action")!=null){
            action = request.getParameter("action");
        }else{
            action = request.getContextPath();
        }
        try {
            switch(action){
                case "remove":
                    System.out.println("Remove");
                    doGet_Remove(request, response);
                    break;
                case "updateCart":
                    doGet_Update(request, response);
                    System.out.println("Update Cart");
                    break;
                default:
                    RequestDispatcher dispatcher = request.getRequestDispatcher("tin/cart.jsp"); //tin/productDetails.jsp
                    dispatcher.forward(request, response);
                    System.out.println("Default");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        
        int quantityPurchased = Integer.parseInt(request.getParameter("quantityPurchased")); 
        int idproduct = Integer.parseInt(request.getParameter("idproduct")); 
        int idamin = Integer.parseInt(request.getParameter("idamin"));
        int idprt = Integer.parseInt(request.getParameter("idprt"));
        String name = request.getParameter("name");
        String desc = request.getParameter("desc");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int price = Integer.parseInt(request.getParameter("price"));
        String color = request.getParameter("color");
        String size = request.getParameter("size");
        String image = request.getParameter("image");
        String nameprt = request.getParameter("nameprt");
        
        int SumPrice = 0;
      
        HttpSession session = request.getSession();
        // nếu giỏ hàng hiện tại đang null thì thêm vào
        if(session.getAttribute("cart") == null){
            List<Product> cart = new ArrayList<Product>();
            cart.add(new Product(idproduct, idamin, 
                                            idprt, name, desc, quantity, 
                                            price, color, size, nameprt, image, quantityPurchased));
            session.setAttribute("cart", cart);
            // session.setAttribute("cart", null);
        // nếu giỏ hàng hiện tại đang có sản phẩm 
        }else{
            List<Product> cart = (List<Product>)session.getAttribute("cart");
            int index = isExisting(request.getParameter("idproduct"), cart);
            // nếu sản phẩm định thêm chưa có ở giỏ hàng thì thêm bình thường
            if(index==-1){
                cart.add(new Product(idproduct, idamin, 
                                            idprt, name, desc, quantity, 
                                            price, color, size, nameprt, image, quantityPurchased));
            // nếu sản phẩm định thêm đã có ở giỏ hàng thì set quantityPurchased cộng thêm số lượng đã chọn mua thêm
            // nghĩa là cho số lượng mua tăng lên 1 khi sản phẩm đã có ở giỏ hàng
            }else{
                int new_quantityPurchased = cart.get(index).getQuantityPurchased() + quantityPurchased;
                cart.get(index).setQuantityPurchased(new_quantityPurchased);
            }
            session.setAttribute("cart", cart);
        }
        response.sendRedirect("Cart");
        response.setContentType("text/json; charset=UTF-8");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("tin/cart.jsp"); //tin/productDetails.jsp
//        dispatcher.forward(request, response);
    }
    
    protected void doGet_Update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	HttpSession session = request.getSession();
        int quantityRecieve = Integer.parseInt(request.getParameter("quantity"));
        int idproduct = Integer.parseInt(request.getParameter("idproduct"));
        //nếu số lượng sản phẩm nhỏ hơn 0 thì xóa khỏi giỏ hàng
        if(quantityRecieve <= 0){
            List<Product> cart = (List<Product>) session.getAttribute("cart");
            int index = isExisting(request.getParameter("idproduct"), cart);
            cart.remove(index);
            session.setAttribute("cart", cart);
            RequestDispatcher dispatcher = request.getRequestDispatcher("tin/cart.jsp"); //tin/productDetails.jsp
            dispatcher.forward(request, response);
        }
        List<Product> cart = (List<Product>)session.getAttribute("cart");
        int index = isExisting(String.valueOf(idproduct), cart);
	cart.get(index).setQuantityPurchased(quantityRecieve);
        
        session.setAttribute("cart", cart);
        
        
        System.out.println(cart.get(index).getQuantity());
        response.sendRedirect("Cart");
        
        
    }
    
    protected void doGet_Remove(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Product> cart = (List<Product>) session.getAttribute("cart");
		int index = isExisting(request.getParameter("idproduct"), cart);
		cart.remove(index);
		session.setAttribute("cart", cart);
                
		RequestDispatcher dispatcher = request.getRequestDispatcher("tin/cart.jsp"); //tin/productDetails.jsp
                dispatcher.forward(request, response);
	}
    
    	private int isExisting(String id, List<Product> cart) {
		for (int i = 0; i < cart.size(); i++) {
			if (String.valueOf(cart.get(i).getIdproduct()).equalsIgnoreCase(id)) {
				return i;
			}
                        
//                        if (id.equals(cart.get(i).getIdproduct()) ) {
//				return i;
//			}
		}
		return -1;
	}

    /*
    
            int quantityPurchased = Integer.parseInt(request.getParameter("quantityPurchased")); 
        int idproduct = Integer.parseInt(request.getParameter("idproduct")); 
        int idamin = Integer.parseInt(request.getParameter("idamin"));
        int idprt = Integer.parseInt(request.getParameter("idprt"));
        String name = request.getParameter("name");
        String desc = request.getParameter("desc");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int price = Integer.parseInt(request.getParameter("price"));
        String color = request.getParameter("color");
        String size = request.getParameter("size");
        String image = request.getParameter("image");
        String nameprt = request.getParameter("nameprt");
        
        Product productCart = new Product(idproduct, idamin, 
                                            idprt, name, desc, quantity, 
                                            price, color, size, nameprt, image);
        // thao tác với session
        HttpSession session = request.getSession();
        session.setAttribute("productCart", productCart);
        session.setAttribute("quantityPurchased", quantityPurchased);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("tin/cart.jsp"); //tin/productDetails.jsp
        dispatcher.forward(request, response);
    
    */
        
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
