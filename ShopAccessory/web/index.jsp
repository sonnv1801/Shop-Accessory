<%-- 
    Document   : index
    Created on : Jul 6, 2022, 8:29:56 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h3>Number Format:</h3>
      <c:set var = "balance" value = "120000.2309" />
         
      <p>Formatted Number (1): <fmt:formatNumber value = "${balance}" 
         type = "currency"/></p>
         
      <p>Formatted Number (2): <fmt:formatNumber type = "number" 
         maxIntegerDigits = "3" value = "${balance}" /></p>
         
      <p>Formatted Number (3): <fmt:formatNumber type = "number" 
         maxFractionDigits = "3" value = "${balance}" /></p>
         
      <p>Formatted Number (4): <fmt:formatNumber type = "number" 
         groupingUsed = "false" value = "${balance}" /></p>
         
      <p>Formatted Number (5): <fmt:formatNumber type = "percent" 
         maxIntegerDigits="3" value = "${balance}" /></p>
         
      <p>Formatted Number (6): <fmt:formatNumber type = "percent" 
         minFractionDigits = "10" value = "${balance}" /></p>
         
      <p>Formatted Number (7): <fmt:formatNumber type = "percent" 
         maxIntegerDigits = "3" value = "${balance}" /></p>
         
      <p>Formatted Number (8): <fmt:formatNumber type = "number" 
         pattern = "###.###E0" value = "${balance}" /></p>
         
      <p>Currency in USA :
         <fmt:setLocale value = "en_US"/>
         <fmt:formatNumber value = "${balance}" type = "currency"/>
      </p>
    </body>
</html>
