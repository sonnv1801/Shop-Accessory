/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class HomePageAdminDao {

    public int countAdmin() {
        DBUtil db = DBUtil.getInstance();
        String sql = " SELECT COUNT(idadmin) AS COUNT_Admin FROM Admin";
        Connection con = null;

        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return -1;
    }

    public int countProducts() {
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT COUNT(idproduct) AS COUNT_Product FROM Products";
        Connection con = null;

        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return -1;
    }

    public int sumTotal() {
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT SUM(total) AS SUM_Total From Orders";
        Connection con = null;

        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return -1;
    }

    public int countUsers() {
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT COUNT(iduser) AS COUNT_User From Users";
        Connection con = null;

        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return -1;
    }
    
     public int countNews() {
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT COUNT(idnews) AS COUNT_News From News";
        Connection con = null;

        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return -1;
    }
     
      public int countOrders() {
        DBUtil db = DBUtil.getInstance();
        String sql = "SELECT COUNT(idorder) AS COUNT_Orders From Orders";
        Connection con = null;

        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return -1;
    }
}
