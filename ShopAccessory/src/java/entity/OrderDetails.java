/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Tin_Ngo
 */



public class OrderDetails {
    private int idorder;
    private int idproduct;
    private int iduser;
    private int total;
    private String datecreate;
    private int condition;
    private int idod;
    private int price;
    private int quantity;
    private String nameSP;

    
    /*
    // lấy từ sql sau
    SELECT Orders.*, OrderDetail.idod, OrderDetail.price, OrderDetail.quantity, Products.name FROM Orders
    INNER JOIN OrderDetail ON Orders.idorder = OrderDetail.idorder
    INNER JOIN Products ON Orders.idproduct = Products.idproduct
    WHERE iduser = 2
    */
    public OrderDetails(int idorder, int idproduct, int iduser, int total, String datecreate, int condition, int idod, int price, int quantity, String nameSP) {
        this.idorder = idorder;
        this.idproduct = idproduct;
        this.iduser = iduser;
        this.total = total;
        this.datecreate = datecreate;
        this.condition = condition;
        this.idod = idod;
        this.price = price;
        this.quantity = quantity;
        this.nameSP = nameSP;
    }

    public String getNameSP() {
        return nameSP;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }
    
    public int getIdorder() {
        return idorder;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public int getIduser() {
        return iduser;
    }

    public int getTotal() {
        return total;
    }

    public String getDatecreate() {
        return datecreate;
    }

    public int getCondition() {
        return condition;
    }

    public int getIdod() {
        return idod;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDatecreate(String datecreate) {
        this.datecreate = datecreate;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setIdod(int idod) {
        this.idod = idod;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
