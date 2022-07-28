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
public class test {

    private int idproduct;
    private int idadmin;
    private int idprt;
    private String name;
    private String description;
    private int quantity;
    private int price;
    private String color;
    private String size;

    public test() {
    }

    public test(int idproduct, int idadmin, int idprt, String name, String description, int quantity, int price, String color, String size) {
        this.idproduct = idproduct;
        this.idadmin = idadmin;
        this.idprt = idprt;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public test(int idproduct, String name, String description, int quantity, int price, String color, String size) {
        this.idproduct = idproduct;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public test(int idproduct, String name) {
        this.idproduct = idproduct;
        this.name = name;
        
    }
   

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public int getIdprt() {
        return idprt;
    }

    public void setIdprt(int idprt) {
        this.idprt = idprt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "test{" + "idproduct=" + idproduct + ", idadmin=" + idadmin + ", idprt=" + idprt + ", name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price + ", color=" + color + ", size=" + size + '}';
    }

}
