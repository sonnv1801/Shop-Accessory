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
public class ProductType {
    private int idprt;
    private String name;

    public ProductType() {
    }

    public ProductType(int idprt, String name) {
        this.idprt = idprt;
        this.name = name;
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

    @Override
    public String toString() {
        return "ProductType{" + "idprt=" + idprt + ", name=" + name + '}';
    }

    
    
}
