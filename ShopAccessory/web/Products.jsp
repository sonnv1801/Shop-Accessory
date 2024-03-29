<%-- 
    Document   : QlAdmin
    Created on : Jul 8, 2022, 2:20:53 PM
    Author     : PC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<c:if test="${userLogin == null}">
    <%
        response.sendRedirect("LoginAdmin.jsp");
    %>
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/UpdateAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/inclusesAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page Add Products</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body style="font-family: cursive;">
        <div class="container-fluid backgroud-all">
            <div class="row">
                <div class="col-xl-3">
                    <%@include file="inclusesAdmin.jsp" %>
                </div>
                <div class="col-xl-9">
                    <%@include file="dayandclockAdmin.jsp" %>
                    <div style="margin: 55px 0px;">
                        <div class="container backgroud-all-update">
                            <h1>Add Products</h1>
                            <form action="<%=request.getContextPath()%>/AddProductAdmin" method="post"
                                  onsubmit="return validateRegister()" name="frm-register">
                                <h1 style="text-align: center;
                                    font-size: 23px;
                                    font-family: cursive;
                                    color: #83ea87;">${trueAdd}</h1>

                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Người Đăng</label>
                                    <select class="form-select" name="poster" aria-label="Default select example" required>
                                        <option value="">Chọn Người Đăng</option>
                                        <option value="1">${userLogin.name}</option>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Loại Sản Phẩm</label>
                                    <select class="form-select" name="type" aria-label="Default select example" required>
                                        <option value="">Chọn Loại Sản Phẩm</option>
                                        <c:forEach var="news" items="${listType}">
                                            <option value="${news.idprt}">${news.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Tên Sản Phẩm</label>
                                    <input type="text" name="name" required class="form-control" id="recipient-name" placeholder="Nhập tên sản phẩm">
                                </div>
                                <div class="mb-3">
                                    <label for="message-text" class="col-form-label">Mô Tả</label>
                                    <textarea class="form-control" name="description" id="message-text" required >${THE_PR.description.toString().trim()}</textarea>
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Số Lượng</label>
                                    <input type="number" name="quantity" required class="form-control" id="recipient-name" placeholder="Nhập số lượng">
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Giá</label>
                                    <input type="number" name="price" required class="form-control" id="recipient-name" placeholder="Nhập giá tiền">
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Màu</label>
                                    <input type="text" name="color" required class="form-control" id="recipient-name" placeholder="Nhập tên màu">
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Kích Cỡ</label>
                                    <select class="form-select" name="size" aria-label="Default select example" required>
                                        <option value="">Chọn Kích Cỡ</option>
                                        <option value="L">Lớn</option>
                                        <option value="M">Vừa</option>
                                        <option value="S">Nhỏ</option>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Hình Ảnh</label>
                                    <input type="file" required name="image" class="form-control" id="recipient-name" placeholder="Nhập tên hình ảnh">
                                </div>
                                <button type="submit" class="btn btn-success">Save</button>
                                <a id="back" href="ProductsServlet"><i class="fa fa-arrow-circle-o-left" style="font-size:36px"></i></a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
