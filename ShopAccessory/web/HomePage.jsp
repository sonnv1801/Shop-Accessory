<%-- 
    Document   : HomePage
    Created on : Jul 6, 2022, 10:54:03 PM
    Author     : PC
--%>

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

<%

    DBUtil db = new DBUtil();
    HomePageAdminDao count = new HomePageAdminDao();
    int dataAdmin = count.countAdmin();

    int dataProducts = count.countProducts();

    int dataTotal = count.sumTotal();

    DecimalFormat formatter = new DecimalFormat("###,###,###");
    String sum = formatter.format(dataTotal);

    int dataUsers = count.countUsers();

    int dataNews = count.countNews();

    int dataOrders = count.countOrders();

%>


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
        <title>Page Home</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script type="text/java script" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript">
            google.charts.load('current', {'packages': ['corechart']});
            google.charts.setOnLoadCallback(drawChart);

            function drawChart() {

                var data = google.visualization.arrayToDataTable([
                    ['Task', 'Hours per Day'],
                    ['Admin', <%= dataAdmin%>],
                    ['Users', <%= dataUsers%>],
                ]);

                var options = {
                    title: 'Danh Mục Tài Khoản'
                };

                var chart = new google.visualization.PieChart(document.getElementById('piechart'));

                chart.draw(data, options);
            }
        </script>

        <script type="text/javascript">
            google.charts.load("current", {packages: ["corechart"]});
            google.charts.setOnLoadCallback(drawChart);
            function drawChart() {
                var data = google.visualization.arrayToDataTable([
                    ['Task', 'Hours per Day'],
                    ['Sản Phẩm', <%= dataProducts%>],
                    ['Đơn Hàng', <%= dataOrders%>],
                    ['Tin Tức', <%= dataNews%>]
                ]);

                var options = {
                    title: 'Danh Mục Sản Phẩm',
                    pieHole: 0.4,
                };

                var chart = new google.visualization.PieChart(document.getElementById('donutchart'));
                chart.draw(data, options);
            }
        </script>
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
                        <div class="row card-top">
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title">Giỏ Hàng</h5>
                                        <i class="fa fa-shopping-cart"></i>
                                        <hr/>
                                        <p class="card-text">Tổng Sản Phẩm: <%= dataProducts%></p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title"><%= sum + ""%> VNĐ</h5>
                                        <i class="fa fa-money"></i>
                                        <hr/>
                                        <p class="card-text">Lợi Nhuận Tháng Này <i class="fa fa-arrow-up"></i> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title"><%= dataUsers%></h5>
                                        <i class="fa fa-eye"></i>
                                        <hr/>
                                        <p class="card-text">Người Đăng Ký <i class="fa fa-arrow-up"></i> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title"><%= dataNews%></h5>
                                        <i class="fa fa-envira"></i>
                                        <hr/>
                                        <p class="card-text">Tổng Bài Viết <i class="fa fa-arrow-up"></i> </p>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-xl-6">
                            <div id="piechart" class="chart"></div>
                        </div>
                        <div class="col-xl-6">
                            <div id="donutchart" class="chart"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
