/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import dao.AdminDao;
import dao.HomePageAdminDao;
import dao.NewsDao;
import dao.OrderDao;
import dao.ProductAdminDao;
import dao.ProductTypeDao;
import dao.ProductsDAO;
import dao.QlAdminDao;
import dao.UsersDao;
import entity.Admin;
import entity.ImageProducts;
import entity.News;
import entity.Product;
import entity.test;
import java.util.List;

/**
 *
 * @author Van Son
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        AdminDao dao = new AdminDao();
//        Boolean check = dao.login(new Admin("adim", "12345"));
//        System.out.println(""+check);
//        
//        check = dao.registerUser(new Admin("image2","Nguyen Van Son","adim","12345"));
//       System.out.println("Insert: "+check);

//        AdminDao dao = new AdminDao();
//        System.out.println("" + dao.getAdmins());
//       QlAdminDao dao = new QlAdminDao();
//        System.out.println(""+ dao.getAdmins());
//        
////        dao.addAdmin(new Admin("image5", "Son", "v2", "12345"));
////        System.out.println("ok");
//        
//     dao.updateAdmin(new Admin(7, "image2", "Van Son 1", "son47788@donga.edu.vn", "12345"));
//      System.out.println(""+ dao.getAdmins());
//      dao.deleteAdmin("12");
//        NewsDao dao = new NewsDao();
//        dao.addNews(new News("1", "Noi Dung Des", "7/11/2002", "Tieu De", "image1.png"));
//        System.out.println("ok");
//
//        System.out.println("" + dao.getAllNews());
//        dao.updateNews(new News(1, "Noi Dung Des", "Noi Dung Title", "image1.png"));
//      System.out.println(""+ dao.getNews());
//        System.out.println("" + dao.getNews("2"));
//        dao.deleteNews("1");
//        System.out.println("" + dao.getAllNews());
//        ProductTypeDao dao = new ProductTypeDao();
//        System.out.println(""+ dao.getAllTypes());
//            UsersDao dao = new UsersDao();
//            
//            System.out.println(""+ dao.getAllUsers());
//            
//            dao.deleteUsers("3");
//            
//            System.out.println(""+ dao.getAllUsers());
//               OrderDao dao =  new OrderDao();
//               System.out.println("" + dao.getAllOrder());
//               dao.updateOrder("1");
//                dao.deleteOrder("7");
//                
//                System.out.println("" + dao.getAllOrder());
//
//                     ProductsDAO productDAO = new ProductsDAO();
//            productDAO.InsertProduct(new Product(1, 2, "1111", "1111", 1, 1, "1", "L"), "imag2");
//            productDAO.updateProduct(new Product(701,"ok1", "ok1", 32, 22424, "green", "L"));
//            productDAO.updateImg(new ImageProducts(695,"img5.png"));
//       System.out.println("" + productDAO.getAllProducts());
//            ProductTypeDao dao = new ProductTypeDao();
//            System.out.println("" + dao.getAllTypes());
//            HomePageAdminDao homedao = new HomePageAdminDao();
//            System.out.println("" + homedao.countAdmin());
//        
//                ProductAdminDao dao = new ProductAdminDao();
//                dao.updateProduct(new test(1,"fdsgsdhsdgdgsafsg"));
//                   dao.updateProduct(new Product(707, "ffsaf", "sadsa", 4, 4343, "ok", "okx"));
//                dao.delete("1");
//                    System.out.println(""+ dao.getPr("707"));
        OrderDao dao = new OrderDao();
        System.out.println("" + dao.viewOrder("1"));

    }

}
