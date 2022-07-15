/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author PC
 */
public class Order {
    private int idorder;
    private int idproduct;
    private int iduser;
    private int total;
    private String datecreate;
    private int condition;

    public Order() {
    }

    public Order(int idorder, int idproduct, int iduser, int total, String datecreate, int condition) {
        this.idorder = idorder;
        this.idproduct = idproduct;
        this.iduser = iduser;
        this.total = total;
        this.datecreate = datecreate;
        this.condition = condition;
    }

    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(String datecreate) {
        this.datecreate = datecreate;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Order{" + "idorder=" + idorder + ", idproduct=" + idproduct + ", iduser=" + iduser + ", total=" + total + ", datecreate=" + datecreate + ", condition=" + condition + '}';
    }
    
    
    
}
