<%-- 
    Document   : history
    Created on : Jul 27, 2022, 9:06:19 AM
    Author     : Tin_Ngo
--%>

<%@page import="java.io.PrintWriter"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Lịch Sử Mua Hàng</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/bootstrap-5/js/bootstrap.min.js">
        <link rel="stylesheet" href="./css/history.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    </head>
<body>
    <c:if test="${orderSuccess!=null}">
        <script>
            alert("Bạn đã đặt hàng thành công");
        </script>
    </c:if>
    <%
        PrintWriter pw = response.getWriter();
        String result = request.getParameter("result");
        if(result.equals("success") ){
            pw.println("<script>alert('Bạn đã đặt hàng thành công!');</script>");
        }
        if(result.equals("error")){
            pw.println("<script>alert('Đặt hàng thất bại, hãy thử thao tác lại!');</script>");
        }
    %>
    <div class="thanhtoan__main">
        <div class="row">
            <!--  -->
            <div class="col-3">
                <div class="pay__infomation">
                    <h4>THÔNG TIN NGƯỜI DÙNG</h4>
                    <div class="pay__infomation__fullname">
                        <div class="row">
                            <div class="col-6 div__form pay__infomation__firstname">
                                <p>Tên *</p>
                                <input disable type="text" value="${User.name}">
                            </div>
                            <div class="col-6 div__form pay__infomation__lastname">
                                <p>Tuổi *</p>
                                <input disable type="text" value="${User.age}">
                            </div>
                        </div>
                    </div>
                    <div class="div__form pay__nation">
                        <p>Địa chỉ *</p>
                        <input disable type="text" name="address" placeholder="Địa chỉ" value="${User.address}">
                    </div>
                    <div class="div__form pay__phone">
                        <p>Số điện thoại *</p>
                        <input disable type="text" name="phone" value="${User.phone}">
                    </div>
                </div>
                    <br/>
                    
                <a href="HomePage" type="button" class="btn btn-outline-warning">
                    Về Trang Chủ
                </a>
            </div>
            <!--  -->
            <div class="col-9">
                <div class="your__order">
                    <form action="#" method="post">
                        <input type="hidden" name="iduser" value="${User.iduser}" />
                        <div class="your__order__header">
                            <table class="table">
                                <thead>
                                  <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Tên sản phẩm</th>
                                    <th scope="col">Số lượng</th>
                                    <th scope="col">Đơn giá</th>
                                    <th scope="col">Tổng tiền</th>
                                    <th scope="col">Ngày mua</th>
                                    <th scope="col">Tình trạng</th>
                                  </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="item" items="${ListOrderdetails}">
                                        <tr class="information_history">
                                          <th scope="row">1</th>
                                          <td>
                                              <a class="information_history__a" href="<%=request.getContextPath()%>/ProductsControl?idproduct=${item.idproduct}">
                                                  ${item.nameSP}
                                              </a>
                                          </td>
                                          <td>${item.quantity}</td>
                                          <td class="information_history--price">${item.price}.000đ</td>
                                          <td class="information_history--price">${item.total}.000đ</td>
                                          <td>${item.datecreate}</td>
                                          <td>
                                              <c:if test="${item.condition==0}"> Đã đặt hàng </c:if>
                                              <c:if test="${item.condition==1}"> Đã xử lý </c:if>
                                              <c:if test="${item.condition==2}"> Đang giao </c:if>
                                              <c:if test="${item.condition==3}"> Hoàn thành </c:if>
                                          </td>
                                        </tr>
                                        <tr style="border-top: none;">
                                              <!-- giao diện giao hàng -->
                                            <td colspan="7">
                                                <div style="position: relative;" class="card-body p-5">
                                                    <ul id="progressbar-2" class="d-flex justify-content-between mx-0 mt-0 mb-5 px-0 pt-0 pb-2">
                                                      <li class="active text-center" id="step1"></li>
                                                      <li class="active text-center" id="step2"></li>
                                                      <li class="active text-center" id="step3"></li>
                                                      <li class="active text-center" id="step4"></li>
                                                    </ul>
                                                    
                                                    <c:if test="${item.condition==0}">
                                                        <div class="abc abc_1 opacity_important">&ensp;</div>
                                                    </c:if>
                                                    <c:if test="${item.condition==1}">
                                                        <div class="abc abc_2 opacity_important">&ensp;</div>
                                                    </c:if>
                                                    <c:if test="${item.condition==2}">
                                                        <div class="abc abc_3 opacity_important">&ensp;</div>
                                                    </c:if>
                                                    <c:if test="${item.condition==3}">
                                                        <div class="abc abc_4 opacity_important">&ensp;</div>
                                                    </c:if>
                                                    <div style="font-size: 10px;" class="d-flex justify-content-between">
                                                      <div class="d-lg-flex align-items-center">
                                                        <i class="fas fa-clipboard-list fa-3x me-lg-4 mb-3 mb-lg-0"></i>
                                                        <div>
                                                          <p class="fw-bold mb-1">Order</p>
                                                          <p class="fw-bold mb-0">Đã đặt hàng</p>
                                                        </div>
                                                      </div>
                                                      <div class="d-lg-flex align-items-center">
                                                        <i class="fas fa-box-open fa-3x me-lg-4 mb-3 mb-lg-0"></i>
                                                        <div>
                                                          <p class="fw-bold mb-1">Order</p>
                                                          <p class="fw-bold mb-0">Đã xử lý</p>
                                                        </div>
                                                      </div>
                                                      <div class="d-lg-flex align-items-center">
                                                        <i class="fas fa-shipping-fast fa-3x me-lg-4 mb-3 mb-lg-0"></i>
                                                        <div>
                                                          <p class="fw-bold mb-1">Order</p>
                                                          <p class="fw-bold mb-0">Đang giao</p>
                                                        </div>
                                                      </div>
                                                      <div class="d-lg-flex align-items-center">
                                                        <i class="fas fa-home fa-3x me-lg-4 mb-3 mb-lg-0"></i>
                                                        <div>
                                                          <p class="fw-bold mb-1">Order</p>
                                                          <p class="fw-bold mb-0">Hoàn thành</p>
                                                        </div>
                                                      </div>
                                                    </div>

                                                  </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
</body>
</ht
