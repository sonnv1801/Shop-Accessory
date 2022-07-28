/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.News;
import entity.Users;
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
public class UsersDao {

    public List<Users> getAllUsers() {
        List<Users> sl = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "Select * from Users";
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String avatar = rs.getString(2);
                String name = rs.getString(3);
                String age = rs.getString(4);
                String username = rs.getString(5);
                String password = rs.getString(6);
                String address = rs.getString(7);
                String phone = rs.getString(8);

                Users users = new Users(id, avatar, name, age, username, password, address, phone);
                sl.add(users);
            }
            rs.close();
            statement.close();
            con.close();
        } catch (Exception e) {
        }
        return sl;
    }
    
    
    public void deleteUsers(String idd) throws Exception {
         String sql = "DELETE FROM Users WHERE iduser =?";
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
            Logger.getLogger(NewsDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewsDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(NewsDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Users GetUser(int iduser) throws Exception {
        String sql = "SELECT * FROM Users WHERE iduser =?";
        DBUtil db = DBUtil.getInstance();
        Connection con = null;
        Users user=null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, iduser);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                user = new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewsDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
   
}
