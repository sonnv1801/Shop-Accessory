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
public class Users {
    private int iduser;
    private int idconvat;
    private String avatar;
    private String name;
    private String age;
    private String username;
    private String password;
    private String address;
    private String phone;

    public Users() {
    }

    public Users(int iduser, int idconvat, String avatar, String name, String age, String username, String password, String address, String phone) {
        this.iduser = iduser;
        this.idconvat = idconvat;
        this.avatar = avatar;
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }
    
    public Users(int iduser, String avatar, String name, String age, String username, String password, String address, String phone) {
        this.iduser = iduser;
        this.avatar = avatar;
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdconvat() {
        return idconvat;
    }

    public void setIdconvat(int idconvat) {
        this.idconvat = idconvat;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Users{" + "iduser=" + iduser + ", idconvat=" + idconvat + ", avatar=" + avatar + ", name=" + name + ", age=" + age + ", username=" + username + ", password=" + password + ", address=" + address + ", phone=" + phone + '}';
    }

            
}
