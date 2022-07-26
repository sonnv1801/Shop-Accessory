/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
<<<<<<< HEAD
 * @author PC
=======
 * @author Tin_Ngo
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
 */
public class Order {
    private int idorder;
    private int idproduct;
    private int iduser;
    private int total;
    private String datecreate;
    private int condition;
<<<<<<< HEAD

    public Order() {
    }

    public Order(int idorder, int idproduct, int iduser, int total, String datecreate, int condition) {
        this.idorder = idorder;
=======
    
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
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
        this.idproduct = idproduct;
        this.iduser = iduser;
        this.total = total;
        this.datecreate = datecreate;
        this.condition = condition;
    }
<<<<<<< HEAD
=======
    
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac

    public int getIdorder() {
        return idorder;
    }

<<<<<<< HEAD
    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

=======
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
    public int getIdproduct() {
        return idproduct;
    }

<<<<<<< HEAD
    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

=======
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
    public int getIduser() {
        return iduser;
    }

<<<<<<< HEAD
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

=======
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
    public int getTotal() {
        return total;
    }

<<<<<<< HEAD
    public void setTotal(int total) {
        this.total = total;
    }

=======
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
    public String getDatecreate() {
        return datecreate;
    }

<<<<<<< HEAD
    public void setDatecreate(String datecreate) {
        this.datecreate = datecreate;
    }

=======
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
    public int getCondition() {
        return condition;
    }

<<<<<<< HEAD
=======
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

>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
    public void setCondition(int condition) {
        this.condition = condition;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Order{" + "idorder=" + idorder + ", idproduct=" + idproduct + ", iduser=" + iduser + ", total=" + total + ", datecreate=" + datecreate + ", condition=" + condition + '}';
    }
    
    
    
=======
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
    
    
>>>>>>> d128c88d808bc64a2eaa8ed0ffaecb1ecc57faac
}
