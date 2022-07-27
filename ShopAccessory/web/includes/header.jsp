<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="wrapper">
    <div class="header-parent">
        <div class="header-child1 header-padding">
            <ul class="header-ul ul-child1">
                <li class="header-li">
                    <i class="fa-solid fa-house-chimney-user"></i>
                    <span class="home">Home</span>
                    <span>: 319 - C16 Lý Thường Kiệt, P.15, Q.11, Tp.HCM</span>
                </li>
            </ul>
            <ul class="header-ul ul-child1">
                <li class="header-li">Open</li>
                <li class="header-li">Mail</li>
                <li class="header-li">
                    <a href="LoginAdmin.jsp" style="text-decoration: none;color: rgb(108, 100, 101);">
                        <i class="fa-solid fa-arrow-right-to-bracket"></i>
                        Login
                    </a>
                </li>
            </ul>
        </div>
        <div id="navbar">
            <div class="header-child2 header-padding">
                <ul class="header-ul ul-child2">
                    <li class="header-li">
                        <a href="TrangchuController"><img class="img-logo" id="subnavbar" src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/11/Pet-Care-1.png" alt=""></a>
                    </li>
                </ul>
                <ul class="header-ul ul-child2">
                    <li class="header-li">
                        <i style="color:#ffca44;" class="fa-solid fa-phone-volume rung"></i>
                        <span style="color: grey;">Call Us <a href="#" style="font-weight: bold;color: #fff; text-decoration: none;font-size: 17px">090511111</a></span>
                    </li>
                    <li class="header-li">
                        <i style="color:#ffca44;" class="fa-solid fa-cart-arrow-down rung"></i>
                        Cart
                    </li>
                    <li class="header-li search-item">
                        <i style="color:#ffca44;" class="fa-solid fa-magnifying-glass rung"></i>
                        Search
                        <div class="search-child">
                            <div class="container-search">
                                <form action="SearchController" method="get">
                                    <input type="text" name="search" placeholder="Enter....">
                                    <button type="submit"><i style="color:#ffca44;" class="fa-solid fa-magnifying-glass"></i></button>

                                </form>

                            </div>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="header-child3 header-padding">
                <ul class="header-ul ul-child3">
                    <li class="header-li">
                        <a href="TrangchuController">Trang chủ</a>
                    </li>
                    <li class="header-li">
                        <a href="gioithieu.jsp">giới thiệu</a>
                    </li>
                    <li class="header-li menu-item">
                        <a href="#" class="a-special">
                            Cửa hàng
                            <i class="fa-solid fa-angle-down"></i>
                        </a>
                        <div class="menu-child">
                            <ul class="ul-menu-child">
                                <li><a href="#">Giỏ hàng</a></li>
                                <li><a href="#">Thanh toán</a></li>
                                <li><a href="#">Kiểm tra đơn hàng</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="header-li">
                        <a href="#">tin tức</a>
                    </li>
                    <li class="header-li">
                        <a href="#">Liên hệ</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>
</html>
