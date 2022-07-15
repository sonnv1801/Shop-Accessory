/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.ProductDAO.count;
import dbcontext.DBUtil;
import entity.Banner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class BannerDAO {
    public List<Banner> getAllBanner(){
        List<Banner> list = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT * FROM Banner";
        
        Connection con = null;
        try {

            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
           
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                list.add(new Banner(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
        
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return list;
    }
}
