<%-- 
    Document   : QLUsers
    Created on : Jul 7, 2022, 9:40:24 AM
    Author     : PC
--%>

<%@page import="dao.OrderDao"%>
<%@page import="dbcontext.DBUtil"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page Đơn Hàng</title>
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
                     <%@include file="dayandclockAdmin.jsp" %>
                    <div style="margin: 55px 0px;">
                        <div class="container table-all">
                            <div class="table-body">
                                <div class="ex1">
                                    <h4>Danh Sách Order</h4>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th scope="col">#</th>
                                                <th scope="col">ID Product</th>
                                                <th scope="col">ID User</th>
                                                <th scope="col">Tổng Tiền</th>
                                                <th scope="col">Ngày Mua</th>
                                                <th scope="col">Tình Trạng</th>
                                                <th scope="col">Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:set scope="request" var="sothutu" value="0"></c:set>
                                            <c:forEach var="order" items="${listOrders}">
                                                <c:set scope="request" var="sothutu" value="${sothutu + 1}"></c:set>
                                                <c:url var="update" value="OrderServlet">
                                                    <c:param name="command" value="UPDATE"
                                                             ></c:param>
                                                    <c:param name="orderId" value="${order.idorder}"
                                                             ></c:param>

                                                </c:url>

                                                <c:url var="delivery" value="OrderServlet">
                                                    <c:param name="command" value="DELIVERY"
                                                             ></c:param>
                                                    <c:param name="orderId" value="${order.idorder}"
                                                             ></c:param>

                                                </c:url>

                                                <c:url var="delete" value="OrderServlet">
                                                    <c:param name="command" value="DELETE"
                                                             ></c:param>
                                                    <c:param name="orderId" value="${order.idorder}"
                                                             ></c:param>

                                                </c:url>

                                                <tr>
                                                    <th scope="row">${sothutu}</th>
                                                    <td>${order.idproduct}</td>
                                                    <td>${order.idorder}</td>
                                                    <td>
                                                        ${ order.total } VNĐ
                                                    </td>
                                                    <td>${order.datecreate}</td>
                                                    <td>
                                                        <c:if test="${order.condition == 0}">
                                                            <a href="${update}" onclick="if (!(confirm('Bạn có chắc chắn là Xác Nhận Đơn Hàng với id ${order.idorder} này không?')))
                                                                        return false"><button type="button" class="btn btn-danger">Chờ Xử Lý </button></a>
                                                        </c:if>

                                                        <c:if test="${order.condition == 1}">
                                                            <a href="${delivery}" onclick="if (!(confirm('Bạn có chắc chắn là Xác Nhận Vận Chuyển Đơn Hàng với id ${order.idorder} này không?')))
                                                                        return false"><button type="button" class="btn btn-success">Đã Xử Lý</button></a>
                                                        </c:if> 

                                                        <c:if test="${order.condition == 2}">
                                                            <button type="button" style="background-color: #fd630d; color: white; border: none" class="btn btn-info" disabled>Đã Vận Chuyển</button>
                                                        </c:if> 

                                                    </td>


                                                    <td>
                                                        <c:if test="${order.condition == 0}">
                                                            <a href="${delete}" onclick="if (!(confirm('Bạn có chắc chắn là xóa Đơn Hàng với id ${order.idorder} này không?')))
                                                                        return false"><button style="background-color: red; color: white; border: none">Xóa <i class="fa fa-remove"></i></button></a>
                                                                </c:if> 
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

