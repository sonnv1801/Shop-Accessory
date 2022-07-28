/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.Order;
import entity.OrderDetails;
import entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tin_Ngo
 */
public class HistoryDao {
    public Users getUser(int id){
        DBUtil db = new DBUtil();
        String sql = "SELECT * FROM Users WHERE iduser=?";
        Users user = null;
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                user = new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            }
        } catch (Exception e) {
            System.out.println("Lỗi HistoryDao");
        }
        return user;
    }
    
    public List<OrderDetails> getOrerDetails(int id){
        DBUtil db = new DBUtil();
        List<OrderDetails> lst = new ArrayList<>();
        String sql = "SELECT Orders.*, OrderDetail.idod, OrderDetail.price, OrderDetail.quantity, Products.name FROM Orders\n" +
                    "INNER JOIN OrderDetail ON Orders.idorder = OrderDetail.idorder\n" +
                    "INNER JOIN Products ON Orders.idproduct = Products.idproduct\n" +
                    "WHERE iduser = ?";
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                lst.add(new OrderDetails(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("lỗi history dao"+e);
        }
        return lst;
    }
}
