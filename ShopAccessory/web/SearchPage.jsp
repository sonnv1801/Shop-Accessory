<%-- 
    Document   : SearchPage
    Created on : Jul 25, 2022, 8:54:24 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
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
        <div class="page-title-search">
            <div class="flex-title-left">
                <span>Trang chủ / cửa hàng / </span><B>kết quả tìm kiếm '${value}'</B>
            </div>
            <div class="flex-title-right">
                <div>
                    <form class="text-title" method="get" action="<%=request.getContextPath()%>/SearchController?">
                        <span>Hiển thị một kết quả duy nhất</span>
                        <select name="find">
                            <option value="most">Thứ tự theo mức phổ biến</option>
                            <option value="appreciate">Thứ tự theo điểm đánh giá</option>
                            <option value="new">Mới nhất</option>
                            <option value="priceASC">Thứ tự theo giá: Từ thấp đến cao</option>
                            <option value="priceDESC">Thứ tự theo giá: Từ cao đến thấp</option>
                        </select>
                        <button type="submit">Lọc</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="row-category">
            <div class="display-child-category">
                <div class="child-category-top">
                    <div class="flex-list-display">
                        <c:forEach var="item" items="${productsearch}">
                            <div class="flexwrap-item-row">
                                <div class="entity-display">
                                    <img src="${item.image}" alt="">
                                    <div class="text-detail">
                                        <a href="#">${item.name}</a>
                                        <span>${item.price}đ</span>
                                        <a href="#">Mua hàng</a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="child-category-middle">
                        <h2>POST FOUND</h2>
                        <div class="post-found-list">
                            <div class="post-item">
                                <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/fosterling-1170x778-300x199.jpg" class="post-item-img" alt="">
                                <div class="post-item-text">
                                    <h3>Giống Hamster: Cái nào phù hợp với tôi</h3>
                                    <hr>
                                    <span>Qua nhiều năm, tôi sẽ đến, ai sẽ nostrud ra khỏi cô lợi thế</span>
                                    <div class="post-item-assign">
                                        <span>08</span>
                                        <span>th3</span>
                                    </div>
                                </div>

                            </div>
                            <div class="post-item">
                                <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/nursling1-1170x814-300x209.jpg" class="post-item-img" alt="">
                                <div class="post-item-text">
                                    <h3>Lịch tiêm phòng cho chó</h3>
                                    <hr>
                                    <span>Lịch tiêm phòng cho chó qua nhiều năm, tôi sẽ đến,ai sẽ nostrud aliquip</span>
                                    <div class="post-item-assign">
                                        <span>08</span>
                                        <span>th3</span>
                                    </div>
                                </div>
                            </div>
                            <div class="post-item">
                                <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/Pets-1170x718-300x184.jpg" class="post-item-img" alt="">
                                <div class="post-item-text">
                                    <h3>Một khoảng khắc tạm thời</h3>
                                    <hr>
                                    <span>Một khoảng khác tạm thời đối với giá của một cái hồ, tivi khối lượng</span>
                                    <div class="post-item-assign">
                                        <span>08</span>
                                        <span>th3</span>
                                    </div>
                                </div>
                            </div>
                            <div class="post-item">
                                <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/fosterling-1170x778-300x199.jpg" class="post-item-img" alt="">
                                <div class="post-item-text">
                                    <h3>Giống Hamster: Cái nào phù hợp với tôi</h3>
                                    <hr>
                                    <span>Qua nhiều năm, tôi sẽ đến, ai sẽ nostrud ra khỏi cô lợi thế</span>
                                    <div class="post-item-assign">
                                        <span>08</span>
                                        <span>th3</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="child-category-bottom">
                        <h2>PAGE FOUND</h2>
                    </div>
                </div>
            </div>
            <div class="display-category">
                <div class="category-top">
                    <h2>Danh mục sản phẩm</h2>
                    <div class="side-bar">
                        <div class="menu">
                            <div class="item"><a href="#" class="sub-btn sole"><i class="fa-solid fa-circle-check"></i></i>Demo</a>
                            </div>
                            <div class="item">
                                <a href="#" class="sub-btn sole2"><i class="fa-solid fa-circle-check"></i>Demo 02<i class="fas fa-angle-right dropdown"></i></a>
                                <div class="sub-menu">
                                    <c:forEach var="item" items="${type}">
                                         <a href="#" class="sub-item">${item.name}</a>
                                    </c:forEach>
                                   
                                </div>
                            </div>
                            <div class="item">
                                <a href="#" class="sub-btn sole"><i class="fa-solid fa-circle-check"></i>Demo 03<i class="fas fa-angle-right dropdown"></i></a>
                                <div class="sub-menu">
                                    <a href="#" class="sub-item">Danh mục con 04</a>
                                    <a href="#" class="sub-item">Danh mục con 05</a>
                                    <a href="#" class="sub-item">Danh mục con 06</a>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>
                <div class="category-middle">
                    <h2>Sản phẩm</h2>
                    <div class="recommend-product">
                        <c:forEach var="item" items="${listmost}">
                            <div class="product-container sole">
                                <img src="${item.image}" class="product-img" alt="">
                                <div class="product-text">
                                    <a href="#" title="">${item.name}</a>
                                    <span>${item.price}đ</span>
                                </div>
                            </div>
                        </c:forEach>


                    </div>
                </div>
                <div class="category-bottom">
                    <h2>Bài viết mới nhất</h2>
                    <div class="recommend-new">
                        <div class="new-container sole">
                            <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/nursling1-1170x814-300x209.jpg" class="new-img" alt="">
                            <div class="new-text">
                                <span>Lịch tiêm phòng cho chó</span>
                            </div>
                        </div>
                        <div class="new-container sole2">
                            <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/nursling1-1170x814-300x209.jpg" class="new-img" alt="">
                            <div class="new-text">
                                <span>Lịch tiêm phòng cho chó</span>
                            </div>
                        </div>
                        <div class="new-container sole">
                            <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/nursling1-1170x814-300x209.jpg" class="new-img" alt="">
                            <div class="new-text">
                                <span>Lịch tiêm phòng cho chó</span>
                            </div>
                        </div>
                        <div class="new-container sole2">
                            <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/nursling1-1170x814-300x209.jpg" class="new-img" alt="">
                            <div class="new-text">
                                <span>Lịch tiêm phòng cho chó</span>
                            </div>
                        </div>
                        <div class="new-container sole">
                            <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/03/nursling1-1170x814-300x209.jpg" class="new-img" alt="">
                            <div class="new-text">
                                <span>Lịch tiêm phòng cho chó</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="includes/footer.jsp" %>
    </body>
</html>
