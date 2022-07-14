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
    private int idconvat;
    private String name;

    public ProductType() {
    }

    public ProductType(int idprt, int idconvat, String name) {
        this.idprt = idprt;
        this.idconvat = idconvat;
        this.name = name;
    }

    public int getIdprt() {
        return idprt;
    }

    public void setIdprt(int idprt) {
        this.idprt = idprt;
    }

    public int getIdconvat() {
        return idconvat;
    }

    public void setIdconvat(int idconvat) {
        this.idconvat = idconvat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductType{" + "idprt=" + idprt + ", idconvat=" + idconvat + ", name=" + name + '}';
    }
    
    
}
