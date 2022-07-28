/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ProductDAO {

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Products.*,ProductType.name,ProductImage.image FROM ((Products\n"
                + "INNER JOIN ProductType ON Products.idprt = ProductType.idprt)\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)";

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

    public List<Product> getProductLimit() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Products.*,ProductType.name,ProductImage.image FROM ((Products\n"
                + "INNER JOIN ProductType ON Products.idprt = ProductType.idprt)\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct) ORDER BY Products.idproduct\n"
                + "OFFSET 0 ROWS\n"
                + "FETCH NEXT 4 ROWS ONLY;";

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

    public List<Product> getMostProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Products.*,ProductType.name,ProductImage.image FROM ((Products\n"
                + "INNER JOIN ProductType ON Products.idprt = ProductType.idprt)\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)\n"
                + "ORDER BY Products.quantity DESC\n"
                + "OFFSET 0 ROWS\n"
                + "FETCH NEXT 4 ROWS ONLY;";

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

    public List<Product> getAllMostProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Products.*,ProductType.name,ProductImage.image FROM ((Products\n"
                + "INNER JOIN ProductType ON Products.idprt = ProductType.idprt)\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)\n"
                + "ORDER BY Products.quantity DESC\n";

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

    public List<Product> getAllAppreciateProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Products.*, ProductImage.image FROM  (Products INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct),\n"
                + "	(SELECT count(Comments.idcmt) as tongstart , Comments.idproduct as x , sum(Comments.start) as y\n"
                + "	FROM Comments group by Comments.idproduct ) truyvancon1\n"
                + "	where truyvancon1.x = Products.idproduct and y > 5  Order by tongstart DESC";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public List<Product> getDiscountProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SElECT  Products.*,ProductImage.image FROM (Products\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct) order by NewID() \n"
                + "OFFSET 0 ROWS\n"
                + "FETCH NEXT 3 ROWS ONLY;";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public List<Product> getNewProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT TOP 3 Products.*,ProductImage.image FROM (Products\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct)  ORDER BY Products.idproduct DESC";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public List<Product> getBestSellerProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Top 3 Products.*, ProductImage.image FROM  (Products INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct),\n"
                + "(SELECT count(Orders.idorder) as tongbill , Orders.idproduct as x  FROM Orders group by Orders.idproduct ) truyvancon1\n"
                + "where truyvancon1.x = Products.idproduct Order by tongbill DESC";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public List<Product> getRandomProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SElECT  Products.*,ProductImage.image FROM (Products\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct) order by NewID() \n"
                + "OFFSET 0 ROWS\n"
                + "FETCH NEXT 3 ROWS ONLY;";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public List<Product> SearchProduct(String s) {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT Products.*,ProductType.name,ProductImage.image FROM ((Products\n"
                + "INNER JOIN ProductType ON Products.idprt = ProductType.idprt)\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct) WHERE Products.name LIKE (?)";

        Connection con = null;
        try {

            con = db.getConnection();

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, '%' + s + '%');

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

    public List<Product> getProductPriceASC() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SElECT  Products.*,ProductImage.image FROM (Products\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct) order by Products.price ASC ";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public List<Product> getProductPriceDESC() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SElECT  Products.*,ProductImage.image FROM (Products\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct) order by Products.price DESC ";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public List<Product> getAllNewProducts() {
        List<Product> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SElECT Top 8  Products.*,ProductImage.image FROM (Products\n"
                + "INNER JOIN ProductImage ON Products.idproduct = ProductImage.idproduct) order by Products.idproduct DESC ";

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
                        rs.getString(10)));

            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }

    public void InsertProduct() {
        DBUtil db = DBUtil.getInstance();
        String sql = "INSERT Products(idadmin,idprt,name,description,quantity,price,color,size) VALUES (1,1,'chuồng','áadas',2,5000,'red','L');\n";

        Connection con = null;
        Product product = null;
        try {

            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);

            statement.execute();
            lastID();
            InsertImageProduct();

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public static int count;

    public void lastID() {

        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT MAX(idproduct) as lastID From Products";

        Connection con = null;
        Product product = null;
        try {

            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
            }

            System.out.println("lastID =" + count);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public void InsertImageProduct() {
        DBUtil db = DBUtil.getInstance();
        String sql = "INSERT ProductImage(idproduct,image) VALUES (?,?)";

        Connection con = null;
        try {

            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, count);
            statement.setString(2, "555.png");

            statement.execute();
            System.out.println("ok");

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

}
