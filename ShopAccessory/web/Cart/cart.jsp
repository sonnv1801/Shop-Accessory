<%-- 
    Document   : cart
    Created on : Jul 12, 2022, 4:22:39 PM
    Author     : Tin_Ngo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Giỏ hàng</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/bootstrap-5/js/bootstrap.min.js">
        <link rel="stylesheet" href="./css/style.css">
        <link rel="stylesheet" href="./css/themify-icons/themify-icons.css">
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
                            <!-- item 1 - Cop thẻ tr để có các mục tiếp theo-->
                            <tr>
                                <td>
                                    <div class="cart-product">
                                        <div class="title_product">
                                            <i class="ti-close"></i>
                                        </div>
                                        <div class="image_product">
                                            <img src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/sec3-4.jpg" alt="">
                                        </div>
                                        <div class="content-product">
                                            <h6 class="name-product">Áo Khoác mùa đông</h6>
                                            <h6 class="description-product">Màu Sắc: Đa Màu Size: Nhỏ</h6>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="cart_price">
                                        74,000 đ
                                    </div>
                                </td>
                                <td>
                                    <div class="buttonTru">
                                        -
                                    </div>
                                    <input type="text" class="number" value="1">
                                    <div class="buttonCong">
                                        +
                                    </div>
                                </td>
                                <td>
                                    <div class="cart_price">
                                        74,000 đ
                                    </div>
                                </td>
                            </tr>
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
                    <div class="button_cart button_cart_updateCart">
                        <a href="#">
                            CẬP NHẬT GIỎ HÀNG
                        </a>
                    </div>
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
                                    310,000 đ 
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
                                    310,000 đ 
                                </td>
                            </tr>
                            <tr class="sum-cart__button">
                                <td colspan="2">
                                    <div class="sum-cart__button__wrap">
                                        <div class="sum-cart__button__btn">
                                            <a href="#">TIẾN HÀNH THANH TOÁN</a>
                                        </div>
                                        <p> <i class="ti-tag"></i> Phiếu ưu đãi</p>
                                    </div>
                                </td>
                            </tr>
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
