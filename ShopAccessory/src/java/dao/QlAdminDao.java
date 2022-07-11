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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class QlAdminDao {


    public List<Admin> getAdmins() throws Exception {
        List<Admin> sl = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "Select * from Admin";
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String avatar = rs.getString(2);
                String name = rs.getString(3);
                String username = rs.getString(4);
                String password = rs.getString(5);
                Admin student = new Admin(id, avatar, name, username, password);
                sl.add(student);
            }
            rs.close();
            statement.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return sl;
    }

    public void addAdmin(Admin admin) throws Exception {

        String sql = "INSERT INTO Admin (avatar, name, username, password)\n"
                + "VALUES (?,?,?,?);";
        DBUtil db = DBUtil.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        try {

            con = db.getConnection();;
            statement = con.prepareStatement(sql);
            statement.setString(1, admin.getAvatar());
            statement.setString(2, admin.getName());
            statement.setString(3, admin.getUsername());
            statement.setString(4, admin.getPassword());

            statement.execute();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void updateAdmin(Admin admin) throws Exception {
        String sql = "UPDATE Admin \n"
                + "SET avatar=?, name=?, username=?, password=? \n"
                + "WHERE IDAdmin = ?;";
        DBUtil db = DBUtil.getInstance();
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = db.getConnection();
            statement = con.prepareStatement(sql);

            statement.setString(1, admin.getAvatar());
            statement.setString(2, admin.getName());
            statement.setString(3, admin.getUsername());
            statement.setString(4, admin.getPassword());
            statement.setInt(5, admin.getId());
            statement.execute();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public Admin getAdmin(String idd) {
        List<Admin> sl = new ArrayList<>();
        int id = Integer.parseInt(idd);
        DBUtil db = DBUtil.getInstance();

        Admin admin = null;
        String sql = "Select * from Admin where IDAdmin=?";
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {

                String avatar = rs.getString(2);
                String name = rs.getString(3);
                String username = rs.getString(4);
                 String password = rs.getString(5);
                admin = new Admin(id, avatar, name, username, password);

            }
            rs.close();
            statement.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return admin;
    }

    
    public void deleteAdmin(String idd) throws Exception {
        String sql = "DELETE FROM Admin WHERE IDAdmin =?";
         DBUtil db = DBUtil.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        try {

           con = db.getConnection();
            statement = con.prepareStatement(sql);
            // Convert String idd to int id
            int id = Integer.parseInt(idd);
            // set paramenter in the sql
            statement.setInt(1, id);
            statement.execute();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
