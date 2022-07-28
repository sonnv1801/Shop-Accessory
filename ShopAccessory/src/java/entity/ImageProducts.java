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
public class ImageProducts {
    private int idimgproduct;
    private int idproduct;
    private String image;

    public ImageProducts(){
        
    }
    
    public ImageProducts(int ididimgproduct, int idproduct, String image) {
        this.idimgproduct = ididimgproduct;
        this.idproduct = idproduct;
        this.image = image;
    }

    
//    Start getter

    public int getIdimgproduct() {
        return idimgproduct;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public String getImage() {
        return image;
    }
    
//    Start Setter

    public void setIdimgproduct(int idimgproduct) {
        this.idimgproduct = idimgproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
