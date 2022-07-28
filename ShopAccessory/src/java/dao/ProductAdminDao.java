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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ProductAdminDao {

    public void updateProduct(Product product) throws Exception {

        String sql = "UPDATE Products \n"
                + "SET name=?, description=?, quantity=?, price=?, color=?, size=? \n"
                + "WHERE idproduct = ?";
        DBUtil db = DBUtil.getInstance();
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = db.getConnection();
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
}
