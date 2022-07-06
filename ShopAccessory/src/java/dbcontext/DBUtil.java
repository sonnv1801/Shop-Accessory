/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

import static dbcontext.DatabaseInfor.driverName;
import static dbcontext.DatabaseInfor.pass;
import static dbcontext.DatabaseInfor.url;
import static dbcontext.DatabaseInfor.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DBUtil extends DatabaseInfor {

    private static DBUtil instance;

    public DBUtil() {
    }

    public Connection getConnection() throws Exception {
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;

    }

    //Get instance of dbms only one time
    public static DBUtil getInstance() {
        if (instance == null) {
            instance = new DBUtil();
        }
        return instance;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
