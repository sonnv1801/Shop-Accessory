<%-- 
    Document   : QLUsers
    Created on : Jul 7, 2022, 9:40:24 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page QlUsers</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <div class="container-fluid backgroud-all">
            <div class="row">
                <div class="col-xl-3">
                    <%@include file="inclusesAdmin.jsp" %>
                </div>
                <div class="col-xl-9">
                    <div class="navbar-admin">
                        <i class="fa fa-bars"></i>
                    </div>
                    <div style="margin: 55px 0px;">


                        <div class="container table-all">
                            <div class="table-body">
                                <div class="ex1">
                                    <h4>Danh Sách Users</h4>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th scope="col">#</th>
                                                <th scope="col">Name</th>
                                                <th scope="col">Age</th>
                                                <th scope="col">UserName</th>
                                                <th scope="col">Address</th>
                                                <th scope="col">Phone</th>
                                                <th scope="col">Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="user" items="${listUsers}">
                                                <c:url var="deleteLink" value="UsersServlet">
                                                    <c:param name="command" value="DELETE"
                                                             ></c:param>
                                                    <c:param name="userId" value="${user.iduser}"
                                                             ></c:param>

                                                </c:url>
                                                <tr>
                                                    <th scope="row">${user.iduser}</th>
                                                    <td>${user.name}</td>
                                                    <td>${user.age}</td>
                                                    <td>${user.username}</td>
                                                    <td>${user.address}</td>
                                                    <td>${user.phone}</td>
                                                    <td>
                                                        <a href="${deleteLink}" onclick="if (!(confirm('Bạn có chắc chắn là xóa Users với id ${user.iduser} này không?')))
                                                               return false"><button style="background-color: red; color: white; border: none">Xóa <i class="fa fa-remove"></i></button></a>

                                                    </c:forEach>
                                                </td>
                                            </tr>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>

