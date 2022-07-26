/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Tin_Ngo
 */
import dbcontext.DBUtil;
import entity.Color;
import entity.Comments;
import entity.ImageProducts;
import entity.News;
import java.util.List;
import entity.Product;
import entity.Size;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductsDAO {
        
    public List<Product> selectLimitProduct(int limit) throws Exception {
       DBUtil db = DBUtil.getInstance();
       String query = "SELECT Products.*,ProductType.name,ProductImage.image FROM ((Products\n" +
                      "INNER JOIN ProductType ON Products.idprt = ProductType.idprt)\n" +
                      "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)";
       List<Product> listProducts = new ArrayList<>();
       Connection conn = null;
       try{
           conn = db.getConnection();
           PreparedStatement ps = conn.prepareStatement(query);
           ResultSet rs = ps.executeQuery();
           int num = 0;
           while(rs.next() && num<limit){
                listProducts.add(new Product(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getInt(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getInt(6),
                                    rs.getInt(7),
                                    rs.getString(8),
                                    rs.getString(9),
                                    rs.getString(10),
                                    rs.getString(11)));
               num++;
           }
            rs.close();
            ps.close();
            conn.close();
       }catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return listProducts;
   }
    
    
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Products.*,ProductType.name,ProductImage.image FROM ((Products\n" +
                      "INNER JOIN ProductType ON Products.idprt = ProductType.idprt)\n" +
                      "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)";

        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getInt(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getInt(6),
                                    rs.getInt(7),
                                    rs.getString(8),
                                    rs.getString(9),
                                    rs.getString(10),
                                    rs.getString(11)));
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }
    

    
    
    public List<ImageProducts> getImageOfProduct(int idproduct) throws Exception{
        List<ImageProducts> images = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT * FROM ProductImage WHERE idproduct=?";
        Connection conn = null;
        
        try {
            conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,idproduct);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                images.add(new ImageProducts(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return images;
    }
    
    
    public Product GetProductDetails(int idproduct)throws Exception{
        Product product = null;
        DBUtil db = new DBUtil();
        String sql = "SELECT TOP 1 Products.*,ProductType.name,ProductImage.image FROM ((Products \n"+
                    "INNER JOIN ProductType ON Products.idprt = ProductType.idprt) \n" +
                    "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)\n"+
                    "WHERE Products.idproduct = ?";
        try{
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idproduct);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                product = new Product(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),rs.getInt(6), rs.getInt(7),rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error ở đây dao.ProductsDAO.GetProductDetails()");
        }
        return product;
    }
    
    public List<Color> GetAllColor() throws Exception{
        List<Color> colors = new ArrayList<>();
        DBUtil db = new DBUtil();
        String sql = "SELECT DISTINCT color FROM Products WHERE color IS NOT NULL";
        try{
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                colors.add(new Color(rs.getString(1)));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return colors;
    }
    
    
     public List<Size> GetAllSize() throws Exception{
        List<Size> sizes = new ArrayList<>();
        DBUtil db = new DBUtil();
        String sql = "SELECT DISTINCT size FROM Products WHERE size IS NOT NULL";
        try{
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sizes.add(new Size(rs.getString(1)));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return sizes;
    }
     
     
     public List<Comments> getCommentProduct(int idproduct){
        List<Comments> cmt = new ArrayList<>();
        DBUtil db = new DBUtil();
        String sql = "SELECT Comments.*, Users.name FROM Comments \n" +
                        "INNER JOIN Users ON Comments.iduser = Users.iduser\n" +
                        "WHERE Comments.idproduct = ?";
         try {
             Connection conn =db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setInt(1, idproduct);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                cmt.add(new Comments(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6)));
             }
         } catch (Exception e) {
         }
        
        return cmt;
     }
     
     
     public List<News> getLimiNew(int limit){
         List<News> news = new ArrayList<>();
         DBUtil db = new DBUtil();
         String query = "SELECT TOP (?) * FROM News";
         try{
             Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ps.setInt(1, limit);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 news.add(new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         return news;
     }
     
    
    public boolean addCommentsProduct(Comments cmt){
        DBUtil db = new DBUtil();
        String query = "INSERT INTO Comments(iduser,comment, idproduct, star) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, cmt.getIduser());
            ps.setString(2, cmt.getComment());
            ps.setInt(3, cmt.getIdproduct());
            ps.setInt(4, cmt.getStar());
            
            int check = ps.executeUpdate();
            if(check == 1){
                return true;
            }
        } catch (Exception e) {
            System.out.println("dao.ProductsDAO.addCommentsProduct()");
            e.printStackTrace();
        }
        return false;
    }
    
    
    public List<Product> getSimilarProduct(int idproduct){
        DBUtil db = new DBUtil();
        List<Product> products = new ArrayList<>();
       //String query = "SELECT TOP(3) * FROM Products WHERE idprt=?";
//        String query = "SELECT TOP(3) * FROM Products "
//                + "WHERE idprt=(SELECT idprt FROM Products where idproduct =?) and idproduct NOT LIKE ?";
        String query = "SELECT Products.*, ProductType.name,ProductImage.image FROM ((Products\n" +
"                    LEFT JOIN ProductType ON Products.idprt = ProductType.idprt)\n" +
"                    LEFT JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)\n" +
"                    WHERE Products.idprt=(SELECT idprt FROM Products where idproduct =?) and Products.idproduct NOT LIKE ?";
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idproduct);
            ps.setInt(2, idproduct);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                products.add(new Product(rs.getInt(1), rs.getInt(2), 
                        rs.getInt(3), rs.getString(4), rs.getString(5),
                        rs.getInt(6), rs.getInt(7), rs.getString(8), 
                        rs.getString(9), rs.getString(10), rs.getString(11)));
                System.out.println("test"+rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    
//    public static void main(String[] args){
//        ProductsDAO p = new ProductsDAO();
//        p.getSimilarProduct(7);
//    }
}
