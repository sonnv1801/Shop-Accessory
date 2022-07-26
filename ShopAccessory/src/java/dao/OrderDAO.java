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

/**
 *
 * @author Tin_Ngo
 */
public class OrderDAO {
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
    
    public void AddOrderDetails(Order order){
        DBUtil db = new DBUtil();
        String query = "INSERT INTO OrderDetail(idorder, price, quantity) VALUES ((SELECT TOP 1 idorder FROM Orders ORDER BY idorder DESC), ?, ?)";
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, order.getPrice());
            ps.setInt(2, order.getSoluongmua());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
