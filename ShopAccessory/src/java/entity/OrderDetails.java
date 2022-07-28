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

    private String avatarUs;
    private String nameUs;
    private int ageUs;
    private String addressUs;
    private String phoneUs;

    private String namePrd;
    private String descriptionPrd;
    private int quantityPrd;
    private int pricePrd;
    private String colorPrd;
    private String sizePrd;

    public OrderDetails(int idorder, int idproduct, int total, String datecreate, int condition, int price, int quantity, String namePrd, String descriptionPrd, int quantityPrd, int pricePrd, String colorPrd, String sizePrd, String avatarUs, String nameUs, int ageUs, String addressUs, String phoneUs) {
        this.idorder = idorder;
        this.idproduct = idproduct;
        this.total = total;
        this.datecreate = datecreate;
        this.condition = condition;
        this.price = price;
        this.quantity = quantity;
        this.namePrd = namePrd;
        this.descriptionPrd = descriptionPrd;
        this.quantityPrd = quantityPrd;
        this.pricePrd = pricePrd;
        this.colorPrd = colorPrd;
        this.sizePrd = sizePrd;
        this.avatarUs = avatarUs;
        this.nameUs = nameUs;
        this.ageUs = ageUs;
        this.addressUs = addressUs;
        this.phoneUs = phoneUs;

    }

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

    public String getAvatarUs() {
        return avatarUs;
    }

    public void setAvatarUs(String avatarUs) {
        this.avatarUs = avatarUs;
    }

    public String getNameUs() {
        return nameUs;
    }

    public void setNameUs(String nameUs) {
        this.nameUs = nameUs;
    }

    public int getAgeUs() {
        return ageUs;
    }

    public void setAgeUs(int ageUs) {
        this.ageUs = ageUs;
    }

    public String getAddressUs() {
        return addressUs;
    }

    public void setAddressUs(String addressUs) {
        this.addressUs = addressUs;
    }

    public String getPhoneUs() {
        return phoneUs;
    }

    public void setPhoneUs(String phoneUs) {
        this.phoneUs = phoneUs;
    }

    public String getNamePrd() {
        return namePrd;
    }

    public void setNamePrd(String namePrd) {
        this.namePrd = namePrd;
    }

    public String getDescriptionPrd() {
        return descriptionPrd;
    }

    public void setDescriptionPrd(String descriptionPrd) {
        this.descriptionPrd = descriptionPrd;
    }

    public int getQuantityPrd() {
        return quantityPrd;
    }

    public void setQuantityPrd(int quantityPrd) {
        this.quantityPrd = quantityPrd;
    }

    public int getPricePrd() {
        return pricePrd;
    }

    public void setPricePrd(int pricePrd) {
        this.pricePrd = pricePrd;
    }

    public String getColorPrd() {
        return colorPrd;
    }

    public void setColorPrd(String colorPrd) {
        this.colorPrd = colorPrd;
    }

    public String getSizePrd() {
        return sizePrd;
    }

    public void setSizePrd(String sizePrd) {
        this.sizePrd = sizePrd;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "idorder=" + idorder + ", idproduct=" + idproduct + ", iduser=" + iduser + ", total=" + total + ", datecreate=" + datecreate + ", condition=" + condition + ", idod=" + idod + ", price=" + price + ", quantity=" + quantity + ", nameSP=" + nameSP + ", avatarUs=" + avatarUs + ", nameUs=" + nameUs + ", ageUs=" + ageUs + ", addressUs=" + addressUs + ", phoneUs=" + phoneUs + ", namePrd=" + namePrd + ", descriptionPrd=" + descriptionPrd + ", quantityPrd=" + quantityPrd + ", pricePrd=" + pricePrd + ", colorPrd=" + colorPrd + ", sizePrd=" + sizePrd + '}';
    }
}
