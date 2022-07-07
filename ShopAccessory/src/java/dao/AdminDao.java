/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class AdminDao {
     private Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public AdminDao(Connection con) {
        this.con = con;
    }

     public Admin userLogin(String username, String password) {
        Admin user = null;
        try {
            query = "select * from Admin where username=? and password=?";
            pst = this.con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                user = new Admin();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
            }
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return user;
    }
}