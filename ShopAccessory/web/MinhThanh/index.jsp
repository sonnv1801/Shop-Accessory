<%-- 
    Document   : index
    Created on : Jul 12, 2022, 2:14:10 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <link rel="stylesheet" href="css/trangchu.css">
        <link rel="stylesheet" href="css/slideshow.css">
        <link rel="stylesheet" href="css/gioithieu.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link rel="stylesheet" href="https://cdn.leanhduc.pro.vn/utilities/animation/shake-effect/style.css"/>
    </head>
    <body>
        <%@include file="views/header.jsp" %>
        <%@include file="views/slide.jsp" %>
        <%@include file="views/body.jsp" %>
        <%@include file="views/footer.jsp" %>


        <script type="text/javascript" src="js/slideshow.js"></script>
        <script type="text/javascript" src="js/scrollnavba.js"></script>
        <script type="text/javascript" src="js/backtoptop.js"></script>
    </body>
</html>
