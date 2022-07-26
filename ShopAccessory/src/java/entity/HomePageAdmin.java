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
public class HomePageAdmin {
    private int countAdmin;

    public HomePageAdmin() {
    }

    public HomePageAdmin(int countAdmin) {
        this.countAdmin = countAdmin;
    }

    public int getCountAdmin() {
        return countAdmin;
    }

    public void setCountAdmin(int countAdmin) {
        this.countAdmin = countAdmin;
    }

    @Override
    public String toString() {
        return "HomePageAdmin{" + "countAdmin=" + countAdmin + '}';
    }
    
    
}
