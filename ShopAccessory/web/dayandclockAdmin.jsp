<%-- 
    Document   : dayandclockAdmin
    Created on : Jul 26, 2022, 8:55:11 AM
    Author     : PC
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    long millis = System.currentTimeMillis();
    java.util.Date date = new java.util.Date(millis);
    SimpleDateFormat datetoday = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String today = datetoday.format(date);
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="navbar-admin">
            <div class="navbar-admin">
                <i class="fa fa-bars"></i>
                <i class="fa fa-user-circle"><p style="color: #ffcf00; display: inline-block; padding: 0px 13px; text-transform: uppercase">Xin Chào: ${userLogin.name}</p></i>
                <i class="fa fa-calendar" style=" font-size: 20px;"><p style="color: #ffcf00; display: inline-block; padding: 0px 13px; text-transform: uppercase;"><%= today%></p></i>
            </div>
        </div>
    </body>
</html>
