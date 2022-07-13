/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcontext;

/**
 *
 * @author Van Son
 */
public interface DatabaseInfor {
    public static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String url="jdbc:sqlserver://127.0.0.1:1434;databaseName=doanFPT;";
//    public static String url="jdbc:sqlserver://LAPTOP-CTQVN7ME\\SQLEPRESS;databaseName=doanFPT;integratedSecurity=true;";
    public static String user="sa";
    public static String pass="abc123";
}
