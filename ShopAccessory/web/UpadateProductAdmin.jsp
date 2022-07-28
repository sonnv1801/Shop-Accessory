<%-- 
    Document   : update-student-form
    Created on : May 9, 2022, 8:16:08 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/inclusesAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/UpdateAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page Update Admin</title>
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
                    <div class="container backgroud-all-update">
                        <h1>UPDATE Product</h1>
                        <form action="ProductsServlet" method="GET">
                            <input type="hidden" name="command" value="UPDATE">
                            <input type="hidden" name="newsId"  required value="${THE_PR.idproduct}">
                             <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">ID Sản Phẩm</label>
                                <input type="text" name="name" required class="form-control" id="recipient-name" placeholder="Nhập tên sản phẩm" value="${THE_PR.idproduct.toString().trim()}" disabled>
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Tên Sản Phẩm</label>
                                <input type="text" name="name" required class="form-control" id="recipient-name" placeholder="Nhập tên sản phẩm" value="${THE_PR.name.trim()}">
                            </div>
                           <div class="mb-3">
                                <label for="message-text" class="col-form-label">Mô Tả</label>
                                <textarea class="form-control" name="description" id="message-text" required >${THE_PR.description.toString().trim()}</textarea>
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Số Lượng</label>
                                <input type="number" name="quantity" required class="form-control" id="recipient-name" placeholder="Nhập số lượng" value="${THE_PR.quantity.toString().trim()}">
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Giá</label>
                                <input type="number" name="price" required class="form-control" id="recipient-name" placeholder="Nhập giá tiền" value="${THE_PR.price.toString().trim()}">
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Màu</label >
                                <input type="text" name="color" required class="form-control" id="recipient-name" placeholder="Nhập tên màu" value="${THE_PR.color.trim()}">
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Kích Cỡ</label>
                                <select class="form-select" name="size" aria-label="Default select example" required>
                                    <option value="">${THE_PR.size}</option>
                                    <option value="L">Lớn</option>
                                    <option value="M">Vừa</option>
                                    <option value="S">Nhỏ</option>
                                </select>
                            </div>

                            <button type="submit" class="btn btn-success">Save</button>
                            <a id="back" href="ProductsServlet"><i class="fa fa-arrow-circle-o-left" style="font-size:36px"></i></a>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
