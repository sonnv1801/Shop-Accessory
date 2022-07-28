/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbcontext.DBUtil;
import entity.Order;
import entity.OrderDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Tin_Ngo
 */
<<<<<<< HEAD
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
=======
public class OrderDao {

    public void AddOrder(Order order) {
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

    public void AddOrderDetails(Order order) {
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

    public List<Order> getAllOrder() {
        List<Order> sl = new ArrayList<>();
        DBUtil db = DBUtil.getInstance();
        String sql = "Select * from Orders ORDER BY condition ASC";
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
>>>>>>> Admin
        try {
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, order.getPrice());
            ps.setInt(2, order.getSoluongmua());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
<<<<<<< HEAD
=======

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

    public OrderDetails viewOrder(String idd) {
        int id = Integer.parseInt(idd);
        DBUtil db = DBUtil.getInstance();
        OrderDetails order = null;
        String sql = "SELECT * FROM Orders\n"
                + "INNER JOIN OrderDetail ON Orders.idorder = OrderDetail.idorder\n"
                + "INNER JOIN Products ON Orders.idproduct = Products.idproduct\n"
                + "INNER JOIN Users ON Orders.iduser = Users.iduser\n"
                + "WHERE Orders.idorder = ?";
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int idproduct = rs.getInt(2);
                int total = rs.getInt(4);
                String datecreate = rs.getString(5);
                int condition = rs.getInt(6);
                int pricedt = rs.getInt(9);
                int quantitydt = rs.getInt(10);

                String nameprd = rs.getString(14);
                String descriptionprd = rs.getString(15);
                int quantity = rs.getInt(16);
                int priceprd = rs.getInt(17);
                String colorprd = rs.getString(18);
                String sizePrd = rs.getString(19);

                String avatarus = rs.getString(21);
                String nameus = rs.getString(22);
                int ageus = rs.getInt(23);
                String addressus = rs.getString(26);
                String phoneus = rs.getString(27);

                order = new OrderDetails(id, idproduct, total, datecreate, condition, pricedt, quantitydt, nameprd, descriptionprd, quantity, priceprd, colorprd, sizePrd, avatarus, nameus, ageus, addressus, phoneus);

            }
            rs.close();
            statement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return order;
    }

>>>>>>> Admin
}
