<%-- 
    Document   : News
    Created on : Jul 7, 2022, 10:36:51 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/HomePageAdmin.css" rel="stylesheet" type="text/css"/>
        <link href="../css/QlAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page QlUsers</title>
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
                        <button type="button" class="btn btn-secondary button-add-admin" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Thêm Tin Tức</button>
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Thêm Tin Tức</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form>
                                            <div class="mb-3">
                                                <label for="recipient-name" class="col-form-label">Tiêu Đề</label>
                                                <input type="text" class="form-control" id="recipient-name" placeholder="Nhập tiêu đề">
                                            </div>
                                            <div class="mb-3">
                                                <label for="message-text" class="col-form-label">Nội Dung</label>
                                                <textarea class="form-control" id="message-text"></textarea>
                                            </div>
                                            <div class="mb-3">
                                                <label for="recipient-name" class="col-form-label">Ngày Tạo</label>
                                                <input type="date" class="form-control" id="recipient-name">
                                            </div>
                                            <div class="mb-3">
                                                <label for="recipient-name" class="col-form-label">Link Hình Ảnh</label>
                                                <input type="text" class="form-control" id="recipient-name" placeholder="Nhập link hình ảnh">
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
                                <div class="ex1">
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
                                            <tr>
                                                <th scope="row">1</th>
                                                <td>Nguyễn Văn Sơn</td>
                                                <td>Phụ Kiện Hot</td>
                                                <td>18/10/2001</td>
                                                <td><img src="https://pyxis.nymag.com/v1/imgs/cfe/0c6/9e86db4238775a4d667aecb95a0ba01f58-astronaut.2x.h473.w710.jpg" alt="Accsessory" style="width: 100px"/></td>
                                                <td>
                                                    <a href="#"><button style="background-color: red; color: white; border: none">Xóa <i class="fa fa-remove"></i></button></a>
                                                    <a href="#"><button style="background-color: green; color: white; border: none" data-bs-toggle="modal" data-bs-target="#staticBackdrop">Sửa <i class="fa fa-edit"></i></button></a>
                                                    <!-- Modal -->
                                                    <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                                        <div class="modal-dialog">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <h5 class="modal-title" id="staticBackdropLabel" style="color: black">Sửa Tin Tức</h5>
                                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <form>
                                                                        <div class="mb-3">
                                                                            <label for="recipient-name" class="col-form-label" style="color: black">ID</label>
                                                                            <input type="text" class="form-control" id="recipient-name" value="1">
                                                                        </div>
                                                                        <div class="mb-3">
                                                                            <label for="recipient-name" class="col-form-label" style="color: black">Tiêu Đề</label>
                                                                            <input type="text" class="form-control" id="recipient-name" placeholder="Nhập tiêu đề">
                                                                        </div>
                                                                        <div class="mb-3">
                                                                            <label for="message-text" class="col-form-label" style="color: black" >Nội Dung</label>
                                                                            <textarea class="form-control" id="message-text"></textarea>
                                                                        </div>
                                                                        <div class="mb-3">
                                                                            <label for="recipient-name" class="col-form-label" style="color: black">Ngày Tạo</label>
                                                                            <input type="date" class="form-control" id="recipient-name" >
                                                                        </div>
                                                                        <div class="mb-3">
                                                                            <label for="recipient-name" class="col-form-label" style="color: black">Link Hình Ảnh</label>
                                                                            <input type="text" class="form-control" id="recipient-name" placeholder="Nhập link hình ảnh">
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
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>


