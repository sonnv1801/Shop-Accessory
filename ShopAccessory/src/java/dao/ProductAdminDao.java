/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.ImageProducts;
import entity.Product;
import entity.test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ProductAdminDao {

    public void updateProduct(Product product) throws Exception {
        DBUtil db = DBUtil.getInstance();
        String sql = "UPDATE Products SET name=?, description=?, quantity=?, price=?, color=?, size=? Where idproduct=? ";

        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = db.getConnection();
            System.out.println("kết nối ok");
            statement = con.prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setInt(3, product.getQuantity());
            statement.setInt(4, product.getPrice());
            statement.setString(5, product.getColor());
            statement.setString(6, product.getSize());
            statement.setInt(7, product.getIdproduct());
            statement.execute();
        } catch (ClassNotFoundException ex) {
            System.out.println("error" + ex);

        }
    }

    public void deleteProduct(String idd) throws Exception {
        String sql = "DELETE FROM Products WHERE idproduct =?";
        DBUtil db = DBUtil.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = db.getConnection();
            statement = con.prepareStatement(sql);
            int id = Integer.parseInt(idd);
            statement.setInt(1, id);
            statement.execute();
        } catch (ClassNotFoundException ex) {
            System.out.println("error" + ex);
        }
    }

    public void updateImg(ImageProducts img) throws Exception {
        DBUtil db = DBUtil.getInstance();
        String sql = "UPDATE ProductImage \n"
                + "SET image=? \n"
                + "WHERE idimgproduct = ?;";

        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = db.getConnection();
            statement = con.prepareStatement(sql);
            statement.setString(1, img.getImage());
            statement.setInt(2, img.getIdimgproduct());
            statement.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductsDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Product getPr(String idd) {
        List<Product> sl = new ArrayList<>();
        int id = Integer.parseInt(idd);
        DBUtil db = DBUtil.getInstance();

        Product pr = null;
        String sql = "Select * from Products where idproduct=?";
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                String name = rs.getString(4);
                String description = rs.getString(5);
                int quantity = rs.getInt(6);
                int price = rs.getInt(7);
                String color = rs.getString(8);
                String size = rs.getString(9);
                pr = new Product(id, name, description, quantity, price, color, size);
            }
            rs.close();
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Update error" + e);
        }
        return pr;
    }
    
    
    
}
