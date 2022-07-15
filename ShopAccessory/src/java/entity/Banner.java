/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Banner {
    private int idbanner;
    private String image;
    private int idadmin;

    public Banner() {
    }

    
    
    public Banner(int idbanner, String image, int idadmin) {
        this.idbanner = idbanner;
        this.image = image;
        this.idadmin = idadmin;
    }

    public int getIdbanner() {
        return idbanner;
    }

    public void setIdbanner(int idbanner) {
        this.idbanner = idbanner;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    @Override
    public String toString() {
        return "Banner{" + "idbanner=" + idbanner + ", image=" + image + ", idadmin=" + idadmin + '}';
    }
    
    
}
