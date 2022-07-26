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
public class Order {
    private int idorder;
    private int idproduct;
    private int iduser;
    private int total;
    private String datecreate;
    private int condition;
    
    private String nameSP;
    private int soluongmua;
    private int price;
    
    public Order() {
    }
    
    // chi tiết
    public Order(int price, int quantity) {
        this.price = price;
        this.soluongmua = quantity;
    }

    //order thường
    public Order(int idproduct, int iduser, int total, String datecreate, int condition) {
        this.idproduct = idproduct;
        this.iduser = iduser;
        this.total = total;
        this.datecreate = datecreate;
        this.condition = condition;
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

    public String getNameSP() {
        return nameSP;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public int getPrice() {
        return price;
    }

    public void setNameSP(String nameSP) {
        this.nameSP = nameSP;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
