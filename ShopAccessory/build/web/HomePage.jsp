<%-- 
    Document   : HomePage
    Created on : Jul 6, 2022, 10:54:03 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
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
                    ['Admin', 11],
                    ['Users', 5],
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
                    ['Sản Phẩm', 4],
                    ['Đơn Hàng', 2],
                    ['Tin Tức', 7]
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
        ss
                    <h1>${userLogin.id}</h1>
                    <h1>${userLogin.avatar}</h1>
        <div class="container-fluid backgroud-all">
            <div class="row">
                <div class="col-xl-3">
                    <%@include file="./inclusesAdmin.jsp" %>
                </div>
                <div class="col-xl-9">
                    <div class="navbar-admin">
                        <i class="fa fa-bars"></i>
                        <i class="fa fa-user-circle" ><p style="color: #ffcf00; display: inline-block; padding: 0px 13px; text-transform: uppercase">${userLogin.username}</p></i>
                    </div>
                    <div style="margin: 55px 0px;">
                        <div class="row card-top">
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title">Giỏ Hàng</h5>
                                        <i class="fa fa-shopping-cart"></i>
                                        <hr/>
                                        <p class="card-text">Tổng Sản Phẩm: 7</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title">700.0000</h5>
                                        <i class="fa fa-money"></i>
                                        <hr/>
                                        <p class="card-text">Lợi Nhuận Tháng Này <i class="fa fa-arrow-up"></i> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title">256</h5>
                                        <i class="fa fa-eye"></i>
                                        <hr/>
                                        <p class="card-text">Lượt Xem <i class="fa fa-arrow-up"></i> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-3">
                                <div class="card text-bg-light mb-3" style="max-width: 18rem;">
                                    <div class="card-body">
                                        <h5 class="card-title">100</h5>
                                        <i class="fa fa-envira"></i>
                                        <hr/>
                                        <p class="card-text">Sản Phẩm Bán Ra <i class="fa fa-arrow-up"></i> </p>
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
