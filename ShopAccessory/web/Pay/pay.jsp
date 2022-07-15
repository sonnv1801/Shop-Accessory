<%-- 
    Document   : pay
    Created on : Jul 12, 2022, 4:25:44 PM
    Author     : Tin_Ngo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sản phẩm chi tiết</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/bootstrap-5/js/bootstrap.min.js">
        <link rel="stylesheet" href="./css/style.css">
        <link rel="stylesheet" href="./css/themify-icons/themify-icons.css">
    </head>
<body>

    <div class="thanhtoan__main">
        <div class="row">
            <!--  -->
            <div class="col-7">
                <div class="pay__infomation">
                    <h4>THÔNG TIN THANH TOÁN</h4>
                    <div class="pay__infomation__fullname">
                        <div class="row">
                            <div class="col-6 div__form pay__infomation__firstname">
                                <p>Tên *</p>
                                <input type="text" name="firstname">
                            </div>
                            <div class="col-6 div__form pay__infomation__lastname">
                                <p>Họ *</p>
                                <input type="text" name="lastname">
                            </div>
                        </div>
                    </div>
                    <div class="div__form pay__nation">
                        <p>Quốc gia *</p>
                        <select name="" id="" class="pay__nation__select">
                            <option value="VietNam">Việt Nam</option>
                        </select>
                    </div>
                    <div class="div__form pay__nation">
                        <p>Địa chỉ *</p>
                        <input type="text" name="address" placeholder="Địa chỉ">
                    </div>
                    <div class="div__form pay__city">
                        <p>Tỉnh / Thành phố *</p>
                        <input type="text" name="city">
                    </div>
                    <div class="div__form pay__phone">
                        <p>Số điện thoại *</p>
                        <input type="text" name="phone">
                    </div>
                    <div class="div__form pay__mail">
                        <p>Địa chỉ mail *</p>
                        <input type="text" name="mail">
                    </div>
                    <div class="div__form pay__note">
                        <p>Ghi chú đơn hàng (tùy chọn)</p>
                        <textarea name="pay_note" id="pay_note" cols="90" rows="5"></textarea>
                    </div>
                </div>
            </div>
            <!--  -->
            <div class="col-5">
                <div class="your__order">
                    <div class="your__order__header">
                        <h4>ĐƠN HÀNG CỦA BẠN</h4>
                        <table>
                            <thead>
                                <tr class="table_header">
                                    <td class="column_left">
                                        SẢN PHẨM    
                                    </td>
                                    <td class="column_right">
                                        TỔNG
                                    </td>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="table_body">
                                    <td class="column_left">
                                        Giường thú cưng x2   
                                    </td>
                                    <td class="column_right column_right--price">
                                        310,000₫
                                    </td>
                                </tr>
                                <tr class="table_body">
                                    <td class="column_left">
                                        Tạm tính  
                                    </td>
                                    <td class="column_right column_right--price">
                                        310,000₫
                                    </td>
                                </tr>
                                <tr class="table_body">
                                    <td class="column_left">
                                        Giao hàng  
                                    </td>
                                    <td class="column_right">
                                        <span> giao hàng miễn phí</span>
                                    </td>
                                </tr>
                                <tr class="table_body">
                                    <td class="column_left">
                                        Tổng  
                                    </td>
                                    <td class="column_right column_right--price">
                                        310,000₫
                                    </td>
                                </tr>
                            <tfoot>
                                <tr>
                                    <td>
                                        <div class="btn-order">
                                            <a href="#">Đặt hàng</a>
                                        </div>
                                    </td>
                                </tr>
                            </tfoot>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</body>
</html>