<%-- 
    Document   : index
    Created on : Jul 6, 2022, 8:29:56 AM
    Author     : PC
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Chủ</title>
        <link rel="stylesheet" href="css/trangchu.css">
        <link rel="stylesheet" href="css/slideshow.css">
        <link rel="stylesheet" href="css/gioithieu.css">
        <link rel="stylesheet" href="css/search.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link rel="stylesheet" href="https://cdn.leanhduc.pro.vn/utilities/animation/shake-effect/style.css"/>
        <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>

        <!-- slide show -->
        <div class="slideshow-container">
            <c:forEach var="lb" items="${listbanner}">
                <!-- Kết hợp hình ảnh và nội dung cho mội phần tử trong slideshow-->
                <div class="mySlides fade">
                    <div class="numbertext">${lb.idbanner} / 2</div>
                    <img class="slide-img" src="${lb.image}">
                </div>
                <!-- Nút điều khiển mũi tên-->
                <a class="prev" onclick="plusSlides(-1)">❮</a>
                <a class="next" onclick="plusSlides(1)">❯</a>
                <div class="content-up-image">
                    <div class="content-right">
                        <h3>Mua hàng Online!</h3>
                        <h2>Tiết kiệm tiền</h2>
                        <p>Tiết kiệm tối đa cho bạn</p>
                        <p>Tại cửa hàng và trực tuyến</p>
                        <a href="#" class="button-effect">
                            <span></span>
                            <span></span>	
                            <span></span>
                            <span></span>
                            Bắt đầu
                        </a>
                    </div>
                    <div class="content-left">
                        <div class="button-circle">
                            <span>save up to</span>
                            <h3>$25</h3>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <br>
        <!-- end slide show -->
        <!-- body -->
        <div class="content-container" id="container1">
            <div class="view-content">
                <div class="banner-view" id="img1">
                    <div class="text-banner-view">
                        <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-dog-small.png" alt="" class="banner-img" >
                        <div class="banner-view-flex">
                            <p>Tiết kiệm</p>
                            <h2>25%</h2>
                            <h3>Thức ăn chó<br> mèo</h3>
                        </div>
                    </div>
                </div>
                <div class="banner-view" id="img2">
                    <div class="text-banner-view">
                        <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-cat.png" alt="" class="banner-img" >
                        <div class="banner-view-flex">
                            <p>Tư vấn</p>
                            <h2>MIỄN PHÍ</h2>
                            <h3>Tư vấn</h3>
                        </div>
                    </div>
                </div>
                <div class="banner-view" id="img3">
                    <div class="text-banner-view">
                        <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-dog.png" >
                        <div class="banner-view-flex">
                            <p>có hạn!<br>tiết kiệm đến</p>
                            <h2>45%</h2>
                            <h3>Nhiều hơn </h3>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="content-container" id="container2">
            <h1>Sản phẩm hiện tại</h1>
            <div class="content-view">
                <c:forEach var="ll" items="${listlimit}">
                    <div class="products-view">
                        <div class="product-image">
                            <img src="${ll.image}" alt="">
                        </div>
                        <div class="product-information">
                            <span id="span1">${ll.namecategory}</span>
                            <span id="span2">${ll.name}</span>
                            <span id="span3">${ll.price}đ</span>
                            <a href="#">Giỏ hàng</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="content-container" id="container3">
            <div class="links-view">
                <div class="image-link">
                    <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt1.png" alt="">
                </div>
                <div class="image-link">
                    <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt2.png" alt="">
                </div>
                <div class="image-link">
                    <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt3.png" alt="">
                </div>
                <div class="image-link">
                    <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt4.png" alt="">
                </div>
            </div>
        </div>
        <div class="content-container" id="container2">
            <h1>Sản phẩm phổ biến </h1>
            <div class="content-view">
                 <c:forEach var="lm" items="${listmost}">
                    <div class="products-view">
                        <div class="product-image">
                            <img src="${lm.image}" alt="">
                        </div>
                        <div class="product-information">
                            <span id="span1">${lm.namecategory}</span>
                            <span id="span2">${lm.name}</span>
                            <span id="span3">${lm.price}đ</span>
                            <a href="#">Giỏ hàng</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="content-container" id="container4">
            <div class="promotions-view">
                <div class="item-promotion" id="item-promotion1">
                    <h2>Giảm thêm 40%</h2>
                    <p>trên hóa đơn $100,sử dụng mã giảm giá</p>
                </div>
                <div class="item-promotion" id="item-promotion2">
                    <h2>Miễn phí ship</h2>
                    <p>trên hóa đơn $49~có giới hạn</p>
                </div>
            </div>
        </div>
        <div class="content-container" id="container5">
            <div class="list-view">
                <div class="category-list">
                    <h2>Sản phẩm giảm giá</h2>
                    <c:forEach var="ld" items="${listdiscount}">
                        <div class="list-item">
                            <img src="${ld.image}" alt="">
                            <div class="item-flex">
                                <ul class="ul-item">
                                    <li>
                                        <h5>${ld.name}</h5>
                                    </li>
                                    <li>
                                        <del>105,000đ</del>
                                        <span>${ld.price}đ</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </c:forEach>

                </div>
                <div class="category-list">
                    <h2>Sản phẩm mới</h2>
                    <c:forEach var="ln" items="${listnew}">
                        <div class="list-item">
                            <img src="${ln.image}" alt="">
                            <div class="item-flex">
                                <ul class="ul-item">
                                    <li>
                                        <h5>${ln.name}</h5>
                                    </li>
                                    <li>
                                        <del>105,000đ</del>
                                        <span>${ln.price}đ</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </c:forEach>


                </div>
                <div class="category-list">
                    <h2>Sản phẩm mua nhiều</h2>
                   <c:forEach var="lbs" items="${listbestseller}">
                        <div class="list-item">
                            <img src="${lbs.image}" alt="">
                            <div class="item-flex">
                                <ul class="ul-item">
                                    <li>
                                        <h5>${lbs.name}</h5>
                                    </li>
                                    <li>
                                        <del>105,000đ</del>
                                        <span>${lbs.price}đ</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <div class="category-list">
                    <h2>Sản phẩm tự chọn</h2>
                     <c:forEach var="lr" items="${listrandom}">
                        <div class="list-item">
                            <img src="${lr.image}" alt="">
                            <div class="item-flex">
                                <ul class="ul-item">
                                    <li>
                                        <h5>${lr.name}</h5>
                                    </li>
                                    <li>
                                        <del>105,000đ</del>
                                        <span>${lr.price}đ</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </c:forEach>

                </div>

            </div>
        </div>
        <!-- end body -->
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
