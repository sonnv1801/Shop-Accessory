/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import dao.BannerDAO;
import dao.ProductDAO;
import entity.Banner;
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
        ProductDAO productDAO = new ProductDAO();
//        System.out.println(productDAO.getNewProducts());
//        productDAO.InsertProduct();
        BannerDAO dao = new BannerDAO();
        System.out.println(""+dao.getAllBanner());
    }

}