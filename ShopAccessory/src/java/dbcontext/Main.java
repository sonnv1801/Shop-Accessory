/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import dao.AdminDao;
import dao.QlAdminDao;
import entity.Admin;
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
//        AdminDao dao = new AdminDao();
//        Boolean check = dao.login(new Admin("vson", "12345"));
//        System.out.println(""+check);
//        
//        check = dao.registerUser(new Admin("image2","Nguyen Van Son","adim","12345"));
//       System.out.println("Insert: "+check);

//        AdminDao dao = new AdminDao();
//        System.out.println("" + dao.getAdmins());

       QlAdminDao dao = new QlAdminDao();
        System.out.println(""+ dao.getAdmins());
        
//        dao.addAdmin(new Admin("image5", "Son", "v2", "12345"));
//        System.out.println("ok");
        
     dao.updateAdmin(new Admin(7, "image2", "Van Son 1", "son47788@donga.edu.vn", "12345"));
      System.out.println(""+ dao.getAdmins());

//      dao.deleteAdmin("12");
    }

}
