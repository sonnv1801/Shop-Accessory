<%-- 
    Document   : Order
    Created on : Jul 7, 2022, 10:14:58 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="../css/QlAdmin.css" rel="stylesheet" type="text/css"/>
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
                                    <h4>Danh Sách Đơn Hàng</h4>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th scope="col">#</th>
                                                <th scope="col">Name</th>
                                                <th scope="col">UserName</th>
                                                <th scope="col">Address</th>
                                                <th scope="col">Phone</th>
                                                <th scope="col">Ghi Chú</th>
                                                <th scope="col">Hình Thức Thanh Toán</th>
                                                <th scope="col">Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">1</th>
                                                <td>Nguyễn Văn Sơn</td>
                                                <td>VanSon</td>
                                                <td>Quảng Ngãi</td>
                                                <td>0375521434</td>
                                                <td>Đặt Hàng</td>
                                                <td>COD</td>
                                                
                                                <td>
                                                    <a href="#"><button style="background-color: red; color: white; border: none">Xóa <i class="fa fa-remove"></i></button></a>
                                                   
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

