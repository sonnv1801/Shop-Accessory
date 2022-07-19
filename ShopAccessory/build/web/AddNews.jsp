<%-- 
    Document   : AddNews
    Created on : Jul 8, 2022, 2:20:53 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/UpdateAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/inclusesAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page News</title>
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
                    <div class="navbar-admin">
                        <div class="navbar-admin">
                            <i class="fa fa-bars"></i>
                            <i class="fa fa-user-circle"><p style="color: #33ccff; display: inline-block; padding: 0px 13px; text-transform: uppercase;">Xin Chào: ${userLogin.username}</p></i>
                        </div>
                    </div>
                    <div style="margin: 55px 0px;">
                        <div class="container backgroud-all-update">
                            <h1>Add News</h1>
                            <form action="<%=request.getContextPath()%>/PosterAdminServlet" method="post"
                                  onsubmit="return validateRegister()" name="frm-register">
                                <h1 style="text-align: center;
                                    font-size: 23px;
                                    font-family: cursive;
                                    color: #83ea87;">${trueAdd}</h1>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Tiêu Đề</label>
                                    <input type="text" name="title" class="form-control" id="recipient-name" placeholder="Nhập tiêu đề" required>
                                </div>
                                <div class="mb-3">
                                    <label for="message-text" class="col-form-label">Nội Dung</label>
                                    <textarea class="form-control" name="des" id="message-text" required ></textarea>
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Ngày Tạo</label>
                                    <input type="date" name="daySubmit" class="form-control" id="recipient-name" required>
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Link Hình Ảnh</label>
                                    <input type="file" name="image" class="form-control" id="recipient-name" placeholder="Nhập link hình ảnh" required>
                                </div>
                                <div class="mb-3">
                                    <label for="recipient-name" class="col-form-label">Người Đăng</label>
                                    <select class="form-select" name="poster" aria-label="Default select example" required>
                                        <option value="">Chọn Người Đăng</option>
                                        <c:forEach var="news" items="${list}">
                                            <option value="${news.id}">${news.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <button type="submit" class="btn btn-success">Save</button>
                                <a id="back" href="NewsServlet"><i class="fa fa-arrow-circle-o-left" style="font-size:36px"></i></a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script
        src="<%=request.getContextPath()%>/resources/js/AddAd.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
