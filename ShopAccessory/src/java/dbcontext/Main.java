/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import dao.AdminDao;
import dao.QlAdminDao;
import entity.Admin;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Van Son
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        DBUtil db =DBUtil.getInstance();
        Connection con = db.getConnection();
        if (con != null) {
            System.out.println("ok");
        }else{
            System.out.println("fail");
        }
    }

}
