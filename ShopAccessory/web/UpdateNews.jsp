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
                    <div class="navbar-admin">
                        <i class="fa fa-bars"></i>
                    </div>
                    <div class="container backgroud-all-update">
                        <h1>UPDATE Tin Tức</h1>
                         <form action="NewsServlet" method="GET">
                            <input type="hidden" name="command" value="UPDATE">
                            <input type="hidden" name="newsId"  required value="${THE_NEWS.id}">
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Tiêu Đề</label>
                                <input type="text" name="title" required value="${THE_NEWS.title}" class="form-control" id="recipient-name" placeholder="Nhập tiêu đề">
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Nội Dung</label>
                                <input type="text" name="des" required value="${THE_NEWS.des}" class="form-control" id="recipient-name" placeholder="Nhập nội dung">
                            </div>
                            <div class="mb-3">
                                <label for="recipient-name" class="col-form-label">Hình Ảnh</label>
                                <input type="file" name="image" required value="${THE_NEWS.image}" class="form-control" id="recipient-name" placeholder="Nhập hình ảnh">
                            </div>
                          
                            <button type="submit" class="btn btn-success">Save</button>
                            <a id="back" href="NewsServlet"><i class="fa fa-arrow-circle-o-left" style="font-size:36px"></i></a>
                        </form>
                        
                    </div>
                </div>
            </div>
</div>
    </body>
</html>
