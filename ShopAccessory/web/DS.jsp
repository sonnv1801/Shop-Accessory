<%-- 
    Document   : DS
    Created on : Jul 8, 2022, 2:20:53 PM
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
        <link href="./css/inclusesAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page Sản Phẩm</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body style="font-family: cursive;">
        <div class="container-fluid backgroud-all">
            <div class="row">
                <div class="col-xl-3">
                    <%@include file="inclusesAdmin.jsp" %>
                </div>
                <div class="col-xl-9">
                    <div class="navbar-admin">
                        <div class="navbar-admin">
                            <i class="fa fa-bars"></i>
                            <i class="fa fa-user-circle"><p style="color: #33ccff; display: inline-block; padding: 0px 13px; text-transform: uppercase;">Xin Chào: ${userLogin.username}</p></i>
                        </div>
                    </div>
                    <div style="margin: 55px 0px;">
                        <a href="AddProductAdmin"><button type="button" class="btn btn-secondary button-add-a dmin" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Thêm Sản Phẩm</button></a>
                       
                        <div class="container table-all" style="overflow: auto; min-height: 500px;">
                            <div class="table-body">
                                <h4>Danh Sách Products</h4>
                                <table class="table">
                                    <thead>
                                       <tr>
                                            <th scope="col">#</th>
                                            <th scope="col">Tên Sản Phẩm</th>
                                            <th scope="col">Mô Tả</th>
                                            <th scope="col">Số lượng</th>
                                            <th scope="col">Giá</th>
                                            <th scope="col">Màu</th>
                                            <th scope="col">Kích Thước</th>
                                            <th scope="col">Hình Ảnh</th>
                                            <th scope="col">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="product" items="${listProducts}">

                                            <tr>
                                                <th scope="row">${product.idproduct}</th>
                                                <th>${product.name}</th>
                                                <th>${product.description}</th>
                                                <th>${product.quantity}</th>
                                                <th>${product.price}</th>
                                                <th>${product.color}</th>
                                                <th>${product.size}</th>
                                               <th><img src="./images/products/${product.image}" alt="image" style="width: 90px"/></th>
                                                <td>
                                                    <a href="${deleteLink}" onclick="if (!(confirm('Bạn có chắc chắn là xóa Products này không?')))
                                                                return false"><button style="background-color: red; color: white; border: none">Xóa <i class="fa fa-remove"></i></button></a>
                                                    <a href="${tempLink}"><button style="background-color: green; color: white; border: none" data-bs-toggle="modal" data-bs-target="#staticBackdrop">Sửa <i class="fa fa-edit"></i></button></a>
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
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
