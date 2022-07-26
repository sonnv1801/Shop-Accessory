<%-- 
    Document   : cart
    Created on : Jul 12, 2022, 4:22:39 PM
    Author     : Tin_Ngo
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Giỏ hàng</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/bootstrap-5/js/bootstrap.min.js">
        <link rel="stylesheet" href="./css/cart.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    </head>
<body>
    <div id="cart">
        <div class="main_cart">
            <div class="row">
                <div class="col-7 table-cart-wrap">
                    <table class="table__cart">
                        <thead class="table__cart__header">
                            <tr>
                                <td>
                                    SẢN PHẨM
                                </td>
                                <td>
                                    GIÁ
                                </td>
                                <td>
                                    SỐ LƯỢNG
                                </td>
                                <td>
                                    TỔNG
                                </td>
                            </tr>
                        </thead>
                        <tbody class="table__cart__body">
                            <c:set var="AllNameProductCart" value=""></c:set>
                            <c:set var="AllNameProductCart__Main" value=""></c:set>
                            <!-- item 1 - Cop thẻ tr để có các mục tiếp theo-->
                            <c:set var="total" value="0"></c:set>
                            <c:forEach var="item" items="${sessionScope.cart}">
                                <tr>
                                    <td>
                                        <div class="cart-product">
                                            <div class="title_product">
                                                <a href="<%=request.getContextPath()%>/Cart?action=remove&idproduct=${item.idproduct}">
                                                    <i class="fa-solid fa-xmark"></i>
                                                </a>
                                            </div>
                                            <div class="image_product">
                                                <img src="./images/products/${item.image}" alt="">
                                            </div>
                                            <div class="content-product">
                                                <c:set var="AllNameProductCart" value="${AllNameProductCart}${item.name}--${item.quantityPurchased}---"></c:set>
                                                <c:set var="AllNameProductCart__Main" value="${AllNameProductCart__Main}${item.name}--${item.idproduct}--${item.quantityPurchased}--${item.price}---"></c:set>
                                                <h6 class="name-product">${item.name}</h6>
                                                <h6 class="description-product">Màu Sắc: ${item.color} Size: ${item.size}</h6>
                                            </div>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="cart_price">
                                            ${item.price}.000đ
                                        </div>
                                    </td>
                                    <td>
                                        <!--item.quantityPurchased-->
                                        <div class="buttonTru">
                                            <a href="<%=request.getContextPath()%>/Cart?action=updateCart&quantity=${item.quantityPurchased-1}&idproduct=${item.idproduct}">
                                                -
                                            </a>
                                        </div>
                                        <c:if test="${item.quantityPurchased > 0}">
                                            <input type="text" class="number" value="${item.quantityPurchased}">
                                        </c:if>
                                            
                                        <div class="buttonCong">
                                            <a href="<%=request.getContextPath()%>/Cart?action=updateCart&quantity=${item.quantityPurchased+1}&idproduct=${item.idproduct}">
                                                +
                                            </a>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="cart_price">
                                           ${item.quantityPurchased * item.price}.000đ
                                            <c:set var="total" value="${total + item.quantityPurchased * item.price }"></c:set>
                                        </div>
                                    </td>
                                </tr>
                            </c:forEach>
                            <c:if test="${total==0}">
                                <tr>
                                    <td style="margin: 0; padding: 0; height: 60px;">
                                        <i><h5>Hiện giỏ hàng chưa có sản phẩm nào</h5></i>
                                    </td>
                                </tr>
                            </c:if>
                            <!--  -->
                        </tbody>
                        <tfoot>
                            <tr style="border-bottom: 2px solid #ececec;">
                            </tr>
                        </tfoot>
                    </table>
                    <div class="button_cart button_cart_home">
                        <a href="#">
                            <i class="ti-arrow-left"></i>
                            TIẾP TỤC XEM SẢN PHẨM
                        </a>
                    </div>
<!--                    <div class="button_cart button_cart_updateCart">
                        <a href="#">
                            CẬP NHẬT GIỎ HÀNG
                        </a>
                    </div>-->
                </div>

                <!-- Col - 5 -->
                <div class="col-5">
                    <table class="table__cart">
                        <thead class="table__cart__header">
                            <tr>
                                <td colspan="2">
                                    CỘNG GIỎ HÀNG
                                </td>
                            </tr>
                        </thead>
                        <tbody class="table__sum-cart__body">
                            <!-- item 1 - Cop thẻ tr để có các mục tiếp theo-->
                            <tr class="calc_price tamtinh">
                                <td>
                                    Tạm tính
                                </td>
                                <td class="tamtinh__price">
                                    ${total}.000 đ 
                                </td>
                            </tr>
                            <tr class="sum-cart__ship giaohang">
                                <td>
                                    Giao hàng
                                </td>
                                <td class="giaohang_text">
                                    <p>Giao hàng miễn phí</p>
                                    <p>Tính phí giao hàng</p>
                                </td>
                            </tr>
                            <tr class="calc_price tong-price">
                                <td>
                                    Tổng
                                </td>
                                <td class="sum__price">
                                    ${total}.000 đ 
                                </td>
                            </tr>
                            <tr class="sum-cart__button">
                                <td colspan="2">
                                    <div class="sum-cart__button__wrap">
                                        <form class="formToPay" action="<%=request.getContextPath()%>/Pay" method="post">
                                            <input style="color: #000;" type="hidden" name="AllNameProduct" value="${AllNameProductCart}"/>
                                            <input style="color: #000;" type="hidden" name="AllNameProduct__Main" value="${AllNameProductCart__Main}"/>
                                            <input style="color: #000;" type="hidden" name="TotalPrice" value="${total}" />
                                            <c:if test="${total > 0}">
                                                <input class="sum-cart__button__btn" type="submit" value="Tiến Hành Thanh Toán"/>
                                            </c:if>
                                            <c:if test="${total <= 0}">
                                                <input onclick="return false" class="sum-cart__button__btn sum-cart__button__btn--disable" type="submit" value="Tiến Hành Thanh Toán"/>
                                            </c:if>
                                        </form>
<!--                                         test 
                                        <div class="sum-cart__button__btn">
                                            <a href="equest.getContextPath()/Pay">TIẾN HÀNH THANH TOÁN</a>
                                        </div>
                                        AllNameProductCart
                                        total
                                    <p> <i class="ti-tag"></i> Phiếu ưu đãi</p>

                                         test -->
                                    </div>
                                </td>
                            </tr>
                            <!-- Khuyến  mãi -->
                            <!--
                            <tr class="sum-cart__uudai">
                                <td colspan="2">
                                    <input class="uudai__text" type="text" placeholder="Mã ưu đãi">
                                    <input class="uudai__btn" type="submit" value="Áp Dụng">
                                </td>
                            </tr>
                            <!--  -->
                        </tbody>
                        <tfoot>
                            <tr style="border-bottom: 2px solid #ececec;">
                            </tr>
                        </tfoot>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <!-- JAVASCRIPT -->

    <script>
         // cộng trừ khi click
        const btnTru = document.querySelector('.buttonTru')
        const btnCong = document.querySelector('.buttonCong')
        const inputNumber = document.querySelector('input.number')
        var number = inputNumber.getAttribute("value")
        console.log(number)
        btnCong.addEventListener('click', function(){
            number++;
            inputNumber.setAttribute("value", number)
        })

        btnTru.addEventListener('click', function(){
            number--;
            if(number<=0) number = 0;
            inputNumber.setAttribute("value", number)
        })
    </script>
    
</body>
</html>
