<%-- 
    Document   : QlAdmin
    Created on : Jul 8, 2022, 2:20:53 PM
    Author     : PC
--%>

<%@page import="dao.QlAdminDao"%>
<%@page import="entity.Admin"%>
<%@page import="java.util.List"%>
<%@page import="dbcontext.DbCon"%>
<%@page import="dao.AdminDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="./css/inclusesAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page QLADmin</title>
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
                        <button type="button" class="btn btn-secondary button-add-a dmin" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Thêm Tin Tức</button>
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Thêm Tin Tức</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        <p style="text-align: center; font-size: 15px; font-family: cursive; color: palevioletred" role="alert">
                                            ${loginFail}
                                        </p>
                                    </div>
                                    <div class="modal-body">
                                        <form action="NewsServlet" method="GET">
                                            <input type="hidden" name="command" value="ADD" />
                                            <div class="mb-3">
                                                <label for="recipient-name" class="col-form-label">Người Đăng</label>
                                                <input type="text" name="poster" class="form-control" id="recipient-name" value="${userLogin.username}" required disabled>
                                            </div>
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
                                            <button type="submit" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                            <button type="submit" class="btn btn-primary">Save</button>
                                        </form>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div class="container table-all" style="overflow: auto; height: 500px;">
                            <div class="table-body">
                                <h4>Danh Sách Tin Tức</h4>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">#</th>
                                            <th scope="col">Tiêu Đề</th>
                                            <th scope="col">Nội Dung</th>
                                            <th scope="col">Ngày Tạo</th>
                                            <th scope="col">Hình Ảnh</th>
                                            <th scope="col">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="news" items="${listNews}">
                                            <c:url var="tempLink" value="NewsServlet">
                                                <c:param name="command" value="LOAD"
                                                         ></c:param>
                                                <c:param name="newsId" value="${news.id}"
                                                         ></c:param>

                                            </c:url>
                                            <c:url var="deleteLink" value="NewsServlet">
                                                <c:param name="command" value="DELETE"
                                                         ></c:param>
                                                <c:param name="newsId" value="${news.id}"
                                                         ></c:param>

                                            </c:url>
                                            <tr>
                                                <th scope="row">${news.id}</th>
                                                <th >${news.title}</th>
                                                <th >${news.des}</th>
                                                <th >${news.dateSubmit}</th>
                                                <th><img src="./images/${news.image}" alt="image" style="width: 90px"/></th>
                                                <td>
                                                    <a href="${deleteLink}" onclick="if (!(confirm('Bạn có chắc chắn là xóa Tin Tức với id ${admin.id} này không?')))
                                                                return false"><button style="background-color: red; color: white; border: none">Xóa <i class="fa fa-remove"></i></button></a>
                                                    <a href="${tempLink}"><button style="background-color: green; color: white; border: none" data-bs-toggle="modal" data-bs-target="#staticBackdrop">Sửa <i class="fa fa-edit"></i></button></a>

                                                </c:forEach>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script
        src="<%=request.getContextPath()%>/resources/js/QlAdmin.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
