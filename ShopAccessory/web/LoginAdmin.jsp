<%-- 
    Document   : LoginAdmin
    Created on : Jul 6, 2022, 8:53:17 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/LoginAdmin.css" rel="stylesheet" type="text/css"/>
        <title>Page Login Admin</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <div class="container-fluid backgroud-all">
            <div class="card">
                <div class="card-body">
                    <img src="./images/iconUsers.png" alt="imageUser"/>
                    <h3>Đăng Nhập</h3>
                    <p style="text-align: center; font-size: 15px; font-family: cursive; color: palevioletred" role="alert">
                        ${loginFail}
                    </p>
                    <form action="LoginAdminServlet" method="post">
                        <div class="input-group mb-3">
                            <span class="input-group-text" id="inputGroup-sizing-default"><i class="fa fa-user"></i></span>
                            <input type="text" name="username" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" placeholder="Nhập tên đăng nhập">
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text" id="inputGroup-sizing-default"><i class="fa fa-key"></i></span>
                            <input type="password" name="password" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" placeholder="Nhập mật khẩu">
                            <span class="input-group-text" id="inputGroup-sizing-default"><i class="fa fa-eye"></i></span>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                            <label class="form-check-label" for="flexCheckDefault">
                                Ghi Nhớ
                            </label>
                        </div>
                        <button type="submit" class="btn btn-secondary">Đăng Nhập</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
