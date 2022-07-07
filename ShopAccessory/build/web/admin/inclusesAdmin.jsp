<%-- 
    Document   : HomePageAdmin
    Created on : Jul 6, 2022, 9:53:27 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/inclusesAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page Home</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>

        <div class="menu-left">
            <div class="menu-top">
                <img src="../images/iconUsers.png" alt="imageUser"/>
                <h4>Admin Web Accessory</h4>
                <hr/>
                <h6>Menu Admin</h6>
                <ul class="menu-body">
                    <li><a href="HomePage.jsp"><i class="fa fa-th-large"><span>Tổng Quan</span></i></a></li>
                    <li><a href="QlAdmin.jsp"><i class="fa fa-user-plus"><span>Quản Lý Admin</span></i></a></li>
                    <li><a href="QLUsers.jsp"><i class="fa fa-users"><span>Quản Lý Users</span></i></a></li>
                    <li><a href="DSProducts.jsp"><i class="fa fa-th-list"><span>Danh Sách Sản Phẩm</span></i></a></li>
                    <li><a href="Order.jsp"><i class="fa fa-shopping-cart"><span>Đơn Hàng</span></i></a></li>
                    <li><a href="News.jsp"><i class="fa fa-newspaper-o"><span>Tin Tức</span></i></a></li>
                    <li><a href="LoginAdmin.jsp"><i class="fa fa-sign-out"><span>Đăng Xuất</span></i></a></li>
                </ul>
            </div>
        </div>

    </body>
</html>


