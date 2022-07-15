/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.ProductType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ProductTypeDao {

    public List<ProductType> getAllTypes() {
        List<ProductType> sl = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "Select * from ProductType";
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                int idconvat = rs.getInt(2);
                String name = rs.getString(3);
                ProductType productType = new ProductType(id, idconvat, name);
                sl.add(productType);
            }
            rs.close();
            statement.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(ProductTypeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sl;
    }

}
