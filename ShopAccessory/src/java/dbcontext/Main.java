/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import dao.ProductDAO;

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
//        BannerDAO dao = new BannerDAO();
//        System.out.println(""+productDAO.SearchProduct("chuồng"));
        System.out.println(""+productDAO.getMostProducts());
    }

}
