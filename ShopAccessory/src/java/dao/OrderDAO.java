/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.Order;
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
 * @author Tin_Ngo
 */
public class OrderDao {
    public void AddOrder(Order order){
        DBUtil db = new DBUtil();
        String query = "INSERT INTO Orders(idproduct, iduser, total, datecreate, condition) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, order.getIdproduct());
            ps.setInt(2, order.getIduser());
            ps.setInt(3, order.getTotal());
            ps.setString(4, order.getDatecreate());
            ps.setInt(5, order.getCondition());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public boolean AddOrderDetails(Order order){
        DBUtil db = new DBUtil();
        String query = "INSERT INTO OrderDetail(idorder, price, quantity) VALUES ((SELECT TOP 1 idorder FROM Orders ORDER BY idorder DESC), ?, ?)";
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, order.getPrice());
            ps.setInt(2, order.getSoluongmua());
            int result = ps.executeUpdate();
            if(result == 1){
                System.out.println("Đã insert vào OrderDetails");
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public List<Order> getAllOrder() {
        List<Order> sl = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "Select * from Orders";
        Connection con = null;

        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int idorder = rs.getInt(1);
                int idproduct = rs.getInt(2);
                int iduser = rs.getInt(3);
                int total = rs.getInt(4);
                String datecreate = rs.getString(5);
                int condition = rs.getInt(6);
                Order order = new Order(idorder, idproduct, iduser, total, datecreate, condition);
                sl.add(order);
            }
             rs.close();
            statement.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }
        return sl;
    }
    
     public void updateOrder(String idd) throws Exception {
        String sql = "UPDATE Orders SET condition=1 WHERE idorder=?";
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
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
     public void deliveryOrder(String idd) throws Exception {
        String sql = "UPDATE Orders SET condition=2 WHERE idorder=?";
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
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrderDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     
     public void deleteOrder(String idd) throws Exception {
        String sql = "DELETE FROM Orders WHERE idorder =?";
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
}
