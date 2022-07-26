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
public class Comments {
    private int idcmt;
    private int iduser;
    private String comment;
    private int idproduct;
    private int star;
    
    private String namUser;
    

    public Comments() {
    }

    // không có idcmt
    public Comments(int iduser, String comment, int idproduct, int star) {
        this.iduser = iduser;
        this.comment = comment;
        this.idproduct = idproduct;
        this.star = star;
    }
    
    // main - giống trong database
    public Comments(int idcmt, int iduser, String comment, int idproduct, int star) {
        this.idcmt = idcmt;
        this.iduser = iduser;
        this.comment = comment;
        this.idproduct = idproduct;
        this.star = star;
    }
    
    // có tên user

    public Comments(int idcmt, int iduser, String comment, int idproduct, int star, String namUser) {
        this.idcmt = idcmt;
        this.iduser = iduser;
        this.comment = comment;
        this.idproduct = idproduct;
        this.star = star;
        this.namUser = namUser;
    }
    
    
//    Start GETTER

    public int getStar() {
        return star;
    }

    public String getNamUser() {
        return namUser;
    }

    public int getIdcmt() {
        return idcmt;
    }

    public int getIduser() {
        return iduser;
    }

    public String getComment() {
        return comment;
    }

    public int getIdproduct() {
        return idproduct;
    }
    
    // Start SETTER

    public void setStar(int star) {
        this.star = star;
    }

    public void setNamUser(String namUser) {
        this.namUser = namUser;
    }

    public void setIdcmt(int idcmt) {
        this.idcmt = idcmt;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }
    
    
    
}
