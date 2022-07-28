<%-- 
    Document   : HomePage
    Created on : Jul 6, 2022, 10:54:03 PM
    Author     : PC
--%>

<%@page import="dao.OrderDao"%>
<%@page import="entity.OrderDetails"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Admin"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="entity.HomePageAdmin"%>
<%@page import="dao.HomePageAdminDao"%>
<%@page import="dbcontext.DBUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>

<c:if test="${userLogin == null}">
    <%
        response.sendRedirect("LoginAdmin.jsp");
    %>
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <link href="./css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/ViewOrder.css" rel="stylesheet" type="text/css"/>
        <title>Page Home</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

    </head>
    <body>

        <div class="container-fluid backgroud-all">
            <div class="row">
                <div class="col-xl-3">
                    <%@include file="./inclusesAdmin.jsp" %>
                </div>
                <div class="col-xl-9">
                    <%@include file="dayandclockAdmin.jsp" %>
                    <div style="margin: 55px 0px;">
                        <div class="container">
                            <div class="row">
                                <div class="col-xl-8">
                                    <div class="card" style="margin:30px 0px; background-color: #00d5ffc2; box-shadow: 3px 3px 12px #255b73">
                                        <div class="card-body" style="color: white">
                                            <h5 class="card-title">Người Mua Hàng <i style="color: #d1ff00;text-transform: uppercase;">${THE_ORDER.nameUs}</i></h5>
                                            <table class="table" style="color: white; font-family: cursive">
                                                <thead>
                                                    <tr>
                                                        <th scope="col">Avatar</th>
                                                        <th scope="col">Tuổi</th>
                                                        <th scope="col">Địa Chỉ</th>
                                                        <th scope="col">Số Điện Thoại</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td><img src="./images/${THE_ORDER.avatarUs}" alt="image" style="width: 44px;"/></td>
                                                        <td>${THE_ORDER.ageUs}</td>

                                                        <td>${THE_ORDER.addressUs}</td>
                                                        <td>${THE_ORDER.phoneUs}</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                    <div class="card" style="margin:30px 0px; background-color: #00d5ffc2; box-shadow: 3px 3px 12px #255b73">
                                        <div class="card-body" style="color: white">
                                            <h5 class="card-title">Mặt Hàng Có Id <i style="color: #d1ff00;text-transform: uppercase;"># ${THE_ORDER.idproduct}</i></h5>
                                            <table class="table" style="color: white; font-family: cursive">
                                                <thead>
                                                    <tr>
                                                        <th scope="col">#</th>
                                                        <th scope="col">Tên Sản Phẩm</th>
                                                        <th scope="col">Số Lượng Trong Kho</th>
                                                        <th scope="col">Giá Sản Phẩm</th>
                                                        <th scope="col">Màu</th>
                                                        <th scope="col">Kích Cỡ</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <th scope="row">${THE_ORDER.idproduct}</th>
                                                        <td>${THE_ORDER.namePrd}</td>
                                                        <td>${THE_ORDER.quantityPrd - THE_ORDER.quantity}</td>

                                                        <td>${THE_ORDER.pricePrd} VNĐ</td>
                                                        <td>${THE_ORDER.colorPrd}</td>
                                                        <td>${THE_ORDER.sizePrd}</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-4">
                                    <div class="card" style="margin:30px 0px; box-shadow: 3px 3px 12px #255b73;">
                                        <div class="card-body">
                                            <h5 class="card-title" style="color: #00c2e9;font-family: 'FontAwesome';">Đơn Hàng Có Id # ${THE_ORDER.idorder}</h5>
                                            <div class="row">
                                                <div class="col-xl-6" style="color: #ec9314; font-family: cursive;">
                                                    <h6>Ngày Mua</h6>
                                                    <hr/>
                                                    <h6>Giá Sản Phẩm</h6>
                                                    <hr/>
                                                    <h6>Số Lượng Mua</h6>
                                                    <hr/>
                                                    <h6>Tổng Tiền</h6>
                                                    <hr/>
                                                    <h6>Trạng Thái Đơn Hàng</h6>
                                                </div>
                                                <div class="col-xl-6" style="color: #ff006c; font-family: cursive;">
                                                    <h6><i>${THE_ORDER.datecreate}</i></h6>
                                                    <hr/>
                                                    <h6><i>${THE_ORDER.price} VNĐ</i></h6>
                                                    <hr/>
                                                    <h6><i>X ${THE_ORDER.quantity}</i></h6>
                                                    <hr/>
                                                    <h6><i>${THE_ORDER.total} VNĐ</i></h6>
                                                    <hr/>
                                                    <c:if test="${THE_ORDER.condition == 0}">
                                                        <h6><i>Chờ Xử Lý</i></h6>
                                                        <div class="progress">
                                                            <div class="progress-bar" role="progressbar" aria-label="Example with label" style="width: 25%;" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">25%</div>
                                                        </div>
                                                    </c:if>

                                                    <c:if test="${THE_ORDER.condition == 1}">
                                                        <h6><i>Đã Xử Lý</i></h6>
                                                        <div class="progress">
                                                            <div class="progress-bar" role="progressbar" aria-label="Example with label" style="width: 50%;" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">50%</div>
                                                        </div>
                                                    </c:if> 

                                                    <c:if test="${THE_ORDER.condition == 2}">
                                                        <h6><i>Đang Vận Chuyển</i></h6>
                                                        <div class="progress">
                                                            <div class="progress-bar" role="progressbar" aria-label="Example with label" style="width: 75%;" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">75%</div>
                                                        </div>
                                                    </c:if> 
                                                    <c:if test="${THE_ORDER.condition == 3}">
                                                        <h6><i>Đang Vận Chuyển</i></h6>
                                                        <div class="progress">
                                                            <div class="progress-bar" role="progressbar" aria-label="Example with label" style="width: 100%;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100%</div>
                                                        </div>
                                                    </c:if> 
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>
                    </div>
                </div>
                </body>
                </html>
