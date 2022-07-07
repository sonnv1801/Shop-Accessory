<%-- 
    Document   : QlAdmin
    Created on : Jul 7, 2022, 8:44:12 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="../css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page QLADmin</title>
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
                    <div style="margin: 55px 0px;">
                        <button type="button" class="btn btn-secondary button-add-admin" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Thêm Admin</button>
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Thêm Admin</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form>
                                            <div class="mb-3">
                                                <label for="recipient-name" class="col-form-label">Tên Đăng Nhập</label>
                                                <input type="text" class="form-control" id="recipient-name" placeholder="Nhập tên đăng nhập">
                                            </div>
                                            <div class="mb-3">
                                                <label for="recipient-name" class="col-form-label">Tên Admin</label>
                                                <input type="text" class="form-control" id="recipient-name" placeholder="Nhập tên Admin">
                                            </div>
                                            <div class="mb-3">
                                                <label for="recipient-name" class="col-form-label">Mật Khẩu</label>
                                                <input type="password" class="form-control" id="recipient-name" placeholder="Nhập mật khẩu">
                                            </div>
                                        </form>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                        <button type="button" class="btn btn-primary">Save</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="container table-all">
                            <div class="table-body">
                                <h4>Danh Sách Admin</h4>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">#</th>
                                            <th scope="col">Tên Đăng Nhập</th>
                                            <th scope="col">Tên Admin</th>
                                            <th scope="col">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td>admin</td>
                                            <td>Nguyễn Văn Sơn</td>
                                            <td>
                                                <a href="#"><button style="background-color: red; color: white; border: none">Xóa <i class="fa fa-remove"></i></button></a>
                                                <a href="#"><button style="background-color: green; color: white; border: none" data-bs-toggle="modal" data-bs-target="#staticBackdrop">Sửa <i class="fa fa-edit"></i></button></a>
                                                <!-- Modal -->
                                                <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title" id="staticBackdropLabel" style="color: black">Sửa Admin</h5>
                                                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                            </div>
                                                            <div class="modal-body">
                                                                <form>
                                                                    <div class="mb-3">
                                                                        <label for="recipient-name" class="col-form-label" style="color: black">ID</label>
                                                                        <input type="text" class="form-control" id="recipient-name" value="1">
                                                                    </div>
                                                                    <div class="mb-3">
                                                                        <label for="recipient-name" class="col-form-label" style="color: black">Tên Đăng Nhập</label>
                                                                        <input type="text" class="form-control" id="recipient-name" placeholder="Nhập tên đăng nhập">
                                                                    </div>
                                                                    <div class="mb-3">
                                                                        <label for="recipient-name" class="col-form-label" style="color: black">Tên Admin</label>
                                                                        <input type="text" class="form-control" id="recipient-name" placeholder="Nhập tên Admin">
                                                                    </div>
                                                                    <div class="mb-3">
                                                                        <label for="recipient-name" class="col-form-label" style="color: black">Mật Khẩu</label>
                                                                        <input type="password" class="form-control" id="recipient-name" placeholder="Nhập mật khẩu">
                                                                    </div>
                                                                </form>
                                                            </div>
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                                                <button type="button" class="btn btn-primary">Save</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
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
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>
