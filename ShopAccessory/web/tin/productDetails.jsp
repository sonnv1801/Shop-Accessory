<%-- 
    Document   : productDetails
    Created on : Jul 12, 2022, 3:52:30 PM
    Author     : Tin_Ngo
--%>


<%@page import="entity.Color"%>
<%@page import="entity.Product"%>
<%@page import="java.sql.Connection"%>
<%@page import="dbcontext.DBUtil"%>
<%@page import="dao.ProductsDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    DBUtil db = new DBUtil();
    ProductsDAO productDao = new ProductsDAO();
    int idproduct = Integer.parseInt(request.getParameter("idproduct"));
    Product product = productDao.GetProductDetails(idproduct);
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sản phẩm chi tiết</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="./css/bootstrap-5/js/bootstrap.min.js">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
        <link rel="stylesheet" href="./css/productDetails.css">
    <body>
        <div class="main">
            <div class="wrap">
                <div class="row">
                    <!--  -->
                    <div class="col-3">
                        <!-- item subnav 1 -->
                        <div class="subnav">
                            <div class="subnav__content">
                                <div class="subnav__header">
                                    <h2>Sản phẩm</h2>
                                </div>
                                <div class="subnav__item__wrap">
                                    <ul class="subnav__item">
                                        <!-- Item java-->
                                        <c:forEach var="pro" items="${ProductsLimit}">
                                            <li class="subnav__item__li subnav__item__li--le">
                                                <img src="./images/products/${pro.image}" alt="">
                                                <div class="sbnav__item__descripts">
                                                    <a href="<%=request.getContextPath()%>/ProductsControl?idproduct=${pro.idproduct}">${pro.name}</a>
                                                    <p>${pro.price}.000₫</p>
                                                </div>
                                            </li>
                                        </c:forEach> 
                                            
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <!-- item subnav 2 -->
                        <div class="subnav">
                            <div class="subnav__content">
                                <div class="subnav__header">
                                    <h2>Bài viết mới nhất</h2>
                                </div>
                                <div class="subnav__item__wrap">
                                    <ul class="subnav__item">
                                        <c:forEach var="news" items="${NewsLimit}">
                                            <li class="subnav__item__li subnav__item__li--chan">
                                                <img class="subnav__item__img--new" src="./images/news/${news.image}" alt="">
                                                <div class="sbnav__item__descripts sbnav__item__descripts--new">
                                                    <a href="#">${news.title}</a>
                                                </div>
                                            </li>
                                        </c:forEach>
                                                
                                    </ul>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!--  -->
                    <div class="col-9">
                        <div class="body">
                            <div class="row">
                                <div class="col-6">
                                    <div class="body_img">
                                        <div class="body_img_details">
                                            <img class="image-show" src="" alt="">
                                            <!-- Mũi tên hover -->
                                            <!-- <div class="body_img_details__arrow">
                                                <i class="ti-angle-left"></i>
                                                <i class="ti-angle-right"></i>
                                                <i class="ti-zoom-in"></i>
                                            </div> -->
                                        </div>
                                        <div class="body_img_multi-img">
<!--                                        <img class="image-1 body_img_multi-img--js" src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/Dogs-Winter-Jacket-1-100x100.jpg" alt="">
                                            <img class="image-2 body_img_multi-img--js body_img_multi-img--disable" src="data:image/jpeg;base64,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" alt="">
                                            <img class="image-3 body_img_multi-img--js body_img_multi-img--disable" src="data:image/jpeg;base64,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" alt="">
                                            <img class="image-4 body_img_multi-img--js body_img_multi-img--disable" src="data:image/jpeg;base64,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" alt="">-->
                                            <% int check = 1; %>
                                            <c:forEach var="imgs" items="${ProductImages}">
                                                <% if(check == 1){ %>
                                                    <img class="image-<%=check%> body_img_multi-img--js" src="./images/products/${imgs.image}" alt="">
                                                <% }else{ %>
                                                    <img class="image-<%=check%> body_img_multi-img--js body_img_multi-img--disable" src="./images/products/${imgs.image}" alt="">
                                                <% } %>
                                                <% check++;%>
                                            </c:forEach> 
                                                    
                                        </div>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="body__content_wrap">
                                        <div class="body__header">
                                            <div class="pathMini">
                                                <a href="#">Trang chủ</a> 
                                                &ensp;/&ensp;
                                                <a href="#">Demo</a>
                                            </div>
                                            <div class="header--title">
                                                <h1><%=product.getName() %></h1>
                                            </div>
                                        </div>
        
                                        <div class="is-divider small"></div>
        
                                        <div class="body__content">
                                            <div class="body__content__price">
                                                <%=product.getPrice()+".000₫" %>
                                            </div>
                                            <div class="body__content__descriptions">
                                                 <%=product.getDescription() %>
                                            </div>

                                            <div id="form__select">
                                                <form action="<%=request.getContextPath()%>/Cart" method="post">
                                                    <table>
                                                    <% if(product.getColor()!=null || product.getSize()!=null){ %>
                                                        <!-- tr màu -->
                                                        <tr>   
                                                            <td class="label">
                                                                Màu sắc
                                                            </td>
                                                            <td>
<!--                                                                    <div class="box-select">
                                                                        <span>Chọn một tùy chọn</span> 
                                                                    </div>
                                                                    <i class="fa-solid fa-angle-down"></i>
                                                                    <div class="box-select--option-show box-select--option-color">
                                                                        <ul>
                                                                            <li> Chọn một màu tùy chọn </li>
                                                                           
                                                                        </ul>
                                                                    </div>-->
                                                                    <select name="color" class="box-select--wrap box-select--wrap--color">
                                                                        <option value="" disabled selected>None</option>
                                                                        <c:forEach var="c" items="${AllColor}">
                                                                            <option value="${c.color}">${c.color}</option>
                                                                        </c:forEach>
                                                                    </select>
                                                                      
                                                                
                                                            </td>
                                                        </tr>
                                                        <!-- tr size -->
                                                        <tr>
                                                            <td class="label">
                                                                Size
                                                            </td>
                                                            <td>
<!--                                                                    <div class="box-select">
                                                                        <span>Chọn một tùy chọn</span> 
                                                                    </div>
                                                                    <i class="fa-solid fa-angle-down"></i>
                                                                    <div class="box-select--option-show box-select--option-size">
                                                                        <ul>
                                                                            <li> Chọn một size tùy chọn </li>
                                                                        </ul>
                                                                    </div>-->
                                                                    <select name="size" class="box-select--wrap box-select--wrap--color">
                                                                        <option value="" disabled selected>None</option>
                                                                        <c:forEach var="s" items="${AllSize}">
                                                                            <option value="${s.size}">${s.size}</option>
                                                                        </c:forEach>
                                                                    </select>
                                                            </td>
                                                        </tr>
                                                    <a class="delete_form" href="#">Xóa</a>
                                                    <% } %>
                                                        <!-- End color, size -->
                                                        <tr>
                                                            <td>
                                                                <div class="buttonTru">
                                                                    -
                                                                </div>
                                                                <input type="text" name="quantityPurchased" class="number" value="1">
                                                                <div class="buttonCong">
                                                                    +
                                                                </div>
                                                            </td>
                                                            <td>
                                                                <div class="btnBuy">
<!--                                                                <a href="">MUA HÀNG</a>-->
                                                                    <input type="hidden" name="idproduct" value="<%=product.getIdproduct()%>" />
                                                                    <input type="hidden" name="idamin" value="<%=product.getIdadmin()%>">
                                                                    <input type="hidden" name="idprt" value="<%=product.getIdprt()%>">
                                                                    <input type="hidden" name="name" value="<%=product.getName()%>">
                                                                    <input type="hidden" name="desc" value="<%=product.getDescription()%> ">
                                                                    <input type="hidden" name="quantity" value="<%=product.getQuantity()%>">
                                                                    <input type="hidden" name="price" value="<%=product.getPrice()%>">
<!--                                                                    <input type="hidden" name="color" value="<%=product.getColor()%>">
                                                                    <input type="hidden" name="size" value="<%=product.getSize()%>">-->
                                                                    <input type="hidden" name="nameprt" value="<%=product.getNamecategory()%>">
                                                                    <input type="hidden" name="image" value="<%=product.getImage()%>">
                                                                    <input class="btn_buy_input" type="submit" value="Mua Hàng"/>
                                                                </div>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </form>
                                            </div>

                                            <!--  -->
                                            <div class="payments">

                                                <div class="row">
                                                    <!--
                                                    <div class="col-6">
                                                        <h6>Tính phí ship tự động</h6>
                                                        <img src="./images/ship/logo-ghn.jpg" alt="">
                                                        <img src="./images/ship/logo-ghtk.jpg" alt="">
                                                        <img src="./images/ship/logo-ninja-van.jpg" alt="">
                                                        <img src="./images/ship/logo-shipchung.jpg" alt="">
                                                        <img src="./images/ship/logo-viettle-post.jpg" alt="">
                                                        <img src="./images/ship/logo-vn-post.jpg" alt="">
                                                    </div>
                                                    <div class="col-6">
                                                        <h6>Thanh toán</h6>
                                                        <img src="./images/bank/logo-acb.jpg" alt="">
                                                        <img src="./images/bank/logo-mastercard.jpg" alt="">
                                                        <img src="./images/bank/logo-paypal.jpg" alt="">
                                                        <img src="./images/bank/logo-techcombank.jpg" alt="">
                                                        <img src="./images/bank/logo-vcb.jpg" alt="">
                                                        <img src="./images/bank/logo-vib.jpg" alt="">
                                                    </div>
                                                    <h6 class="SloganBank">"Hãy trở thành Affilicate của chúng tôi để tìm thêm thu nhập thụ động, kiếm tiền online"</h6>
                                                    <div class="button-regist-aff">
                                                        <a href="#">Đăng ký Affilicate</a> 
                                                    </div>
                                                    -->
                                                    <hr class="hr--First"/>
                                                    <div class="maSP">
                                                        Mã: <%=product.getIdproduct() %>
                                                    </div>
                                                    <hr/>
                                                    <div class="category">
                                                        Danh mục: <a href="#"><%=product.getNamecategory() %></a>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <hr/>

                            <!--  -->

                            <div class="body__footer">
                                <div class="btn__footer btn__mota">
                                    Mô tả
                                </div>
                                <div class="btn__footer btn__thongtinbosung btn__footer--hidden">
                                    Thông Tin Bổ Sung
                                </div>
                                <div class="btn__footer btn__Danhgia btn__footer--hidden">
                                    <% int num = 0; %>
                                    <c:forEach var="cmts" items="${AllComments}">
                                       <% num+=1; %>
                                    </c:forEach>
                                    Đánh Giá (<%=num%>)
                                </div>
                            </div>

                            <!-- Nội dung cho từng nút bấm -->
                            <div class="content_mota">
                                <p class="text__footer">
                                    <%=product.getDescription() %>
                                </p>

                            </div>
                            <!--  -->
                            <div class="content_thongtinbosung btn__hidden">
                                <div class="row color">
                                    <div class="col-6 color_title">MÀU SẮC</div>
                                    <div class="col-6 color_content">
                                    <c:forEach var="c" items="${AllColor}">
                                        ${c.color}
                                    </c:forEach>
                                    </div>
                                    
                                </div>
                                <hr/>
                                <div class="row size-wrap">
                                    <div class="col-6 size_title">SIZE</div>
                                    <div class="col-6 size_content">
                                        <c:forEach var="s" items="${AllSize}">
                                            ${s.size}
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                            <!--  -->
                            <div class="content_evaluate btn__hidden">
                                <div class="content_evaluate__header">
                                    <h1>Đánh giá</h1>
                                </div>
                                <div class="content_evaluate__content">
                                    <c:if test="${AllComments!=null}">
                                        <c:forEach var="cmts" items="${AllComments}">
                                            <div class="row show_name-cmt">
                                                ${cmts.namUser}
                                            </div>
                                            <div class="show_star-cmt">
                                                <c:forEach begin="1" end="${cmts.star}" varStatus="no">
                                                    <i class="fa-solid fa-star"></i>
                                                </c:forEach>
                                            </div>
                                            <div class="row show__cmt">
                                                ${cmts.comment}
                                            </div>
                                        </c:forEach>
                                    </c:if>
                                    <c:if test="${AllComments == null || AllComments=='' || AllComments.isEmpty()}">
                                        <span>Chưa có đánh giá nào</span>
                                    </c:if>
                                    
                                </div>
                                <div class="content_evaluate__add-evaluate">
                                    <div class="evaluate_header">
                                        <h1>Hãy là người đầu tiên nhận xét <br/> “<%=product.getName() %>”</h1> 
                                    </div>
                                    <form action="AddComment" method="post" class="form-add-evaluate" accept-charset="UTF-8">
                                        <div class="evaluate_start">
                                            <h6>Đánh giá của bạn</h6>
                                            <div class="evaluate_start--action one-start" onclick="selectedOneStar()">
                                                <i class="fa-solid fa-star"></i>
                                            </div>
                                            <div class="evaluate_start--action two-start" onclick="selectedTwoStar()">
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </div>
                                            <div class="evaluate_start--action three-start" onclick="selectedThreeStar()">
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </div>
                                            <div class="evaluate_start--action four-start" onclick="selectedFourStar()">
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </div>
                                            <div class="evaluate_start--action five-start" onclick="selectedFiveStar()">
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                                <i class="fa-solid fa-star"></i>
                                            </div>
                                            <!-- phần dữ liệu thêm -->
                                            <input type="hidden" class="StarSelected" name="star" value="0">
                                            <input type="hidden" class="" name="idproduct" value="<%=idproduct%>">
                                            <input type="hidden" class="" name="iduser" value="3">
                                            <!-- Hết phần dữ liệu thêm -->
                                        </div>
                                        <br/>
                                        <br/>
                                        <div class="evaluate_text">
                                            <h6>
                                                Nhận xét của bạn *
                                            </h6>
                                            <textarea id="" name="comments" rows="4" cols="50"></textarea>
                                        </div>
                                        <!--
                                        <div class="evaluate__info">
                                            <div class="row">
                                                <div class="col-6">
                                                    <h6>Tên *</h6>
                                                    <input type="text" name="name">
                                                </div>
                                                <div class="col-6">
                                                    <h6>Email *</h6>
                                                    <input type="text" name="email">
                                                </div>
                                            </div>
                                        </div>
                                        -->
                                        <div class="evaluate__button">
                                            <input type="submit" value="Gửi đi"/>
                                        </div>
                                    </form>
                                </div>
                            </div>

                            <!--  -->

                            <hr/>

                            <div class="similar-products">
                                <div class="similar-products__header">
                                    <h1>Sản phẩm tương tự</h1>
                                </div>
                                <div class="similar-products__body">
                                    <div class="row">
                                        <!-- Item sản phẩm tương tự -->
                                        <% int a = 0;%>
                                        <c:forEach var="p" items="${SimilarProducts}">
                                            <c:set scope="request" var="check_num" value="${check_id}" />
                                            <c:set scope="request" var="check_id" value="${p.idproduct}" />
                                            
                                            <!-- check_num là lấy id trước, check_id là lấy id hiện tại
                                                nếu 2 cái bằng nhau là trùng sản phẩm nên không hiển thị -->
                                            <% if(a<3){ %>
                                                <c:if test="${check_id != check_num}">
                                                    <div class="col-4">
                                                        <% a+=1; %>
                                                        <div class="similar-products__item">
                                                            <div class="similar-products__item__img">
                                                                <img src="./images/products/${p.image}" alt="">
                                                            </div>
                                                            <div class="similar-products__item__content">
                                                                <a class="similar-products__item__content--name" href="#">${p.name}</a>
                                                                <p class="similar-products__item__content--price">${p.price}.000₫</p>
                                                                <a class="similar-products__item__content--button" 
                                                                   href="<%=request.getContextPath()%>/ProductsControl?idproduct=${p.idproduct}">
                                                                    Mua Hàng
                                                                </a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </c:if>
                                            <% } %>
                                            
                                        </c:forEach>
                                        <!-- item sản phẩm tương tự -->

                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script>
            // xử lý nhận dữ liệu (số sao) comments
            var StarSelected = document.querySelector('.StarSelected')
            function selectedOneStar(){
                StarSelected.setAttribute("value", 1)
            }
            function selectedTwoStar(){
                StarSelected.setAttribute("value", 2)
            }
            function selectedThreeStar(){
                StarSelected.setAttribute("value", 3)
            }
            function selectedFourStar(){
                StarSelected.setAttribute("value", 4)
            }
            function selectedFiveStar(){
                StarSelected.setAttribute("value", 5)
            }
            
            
            
            // Xử lý khi nhấn vào mô tả, thông tin bổ sung, đánh giá

            const btnMota = document.querySelector('.btn__mota')
            const btnThongtinbosung = document.querySelector('.btn__thongtinbosung')
            const btnDanhgia = document.querySelector('.btn__Danhgia')
            const btnAlls = document.querySelectorAll('.btn__footer')
           // btn__footer  btn__footer--hidden
           function addAllDisableButton(){
                for (const btn of btnAlls) {
                    btn.classList.add('btn__footer--hidden')
                }
           }

           const content_mota = document.querySelector('.content_mota')
           const content_evaluate = document.querySelector('.content_evaluate')
           const content_thongtinbosung = document.querySelector('.content_thongtinbosung')

           function hiddenAllContent(){
                content_evaluate.classList.add('btn__hidden')
                content_mota.classList.add('btn__hidden')
                content_thongtinbosung.classList.add('btn__hidden')
           }    

           btnMota.addEventListener('click', function(){
                addAllDisableButton()
                hiddenAllContent()
                content_mota.classList.remove('btn__hidden')
                btnMota.classList.remove('btn__footer--hidden')
            })

            btnThongtinbosung.addEventListener('click', function(){
                addAllDisableButton()
                hiddenAllContent()
                content_thongtinbosung.classList.remove('btn__hidden')
                btnThongtinbosung.classList.remove('btn__footer--hidden')
            })
           
            btnDanhgia.addEventListener('click', function(){
                addAllDisableButton()
                hiddenAllContent()
                content_evaluate.classList.remove('btn__hidden')
                btnDanhgia.classList.remove('btn__footer--hidden')
            })

              //  Xử lý với đánh giá sao 
            const oneStar = document.querySelector('.one-start')
            const twoStar = document.querySelector('.two-start')
            const threeStar = document.querySelector('.three-start')
            const fourStar = document.querySelector('.four-start')
            const fiveStar = document.querySelector('.five-start')
            const allStar = document.querySelectorAll('.evaluate_start--action ')

            function removeAll(){
                oneStar.classList.remove('evaluate_start--action--selected')
                twoStar.classList.remove('evaluate_start--action--selected')
                threeStar.classList.remove('evaluate_start--action--selected')
                fourStar.classList.remove('evaluate_start--action--selected')
                fiveStar.classList.remove('evaluate_start--action--selected')
            }

            function selectedStar_one() {
                removeAll()
                oneStar.classList.toggle('evaluate_start--action--selected')
            }
            function selectedStar_two() {
                removeAll()
                twoStar.classList.toggle('evaluate_start--action--selected')
            }
            function selectedStar_three() {
                removeAll()
                threeStar.classList.toggle('evaluate_start--action--selected')
            }
            function selectedStar_four() {
                removeAll()
                fourStar.classList.toggle('evaluate_start--action--selected')
            }
            function selectedStar_five() {
                removeAll()
                fiveStar.classList.toggle('evaluate_start--action--selected')
            }

            oneStar.addEventListener('click', selectedStar_one)
            twoStar.addEventListener('click', selectedStar_two)
            threeStar.addEventListener('click', selectedStar_three)
            fourStar.addEventListener('click', selectedStar_four)
            fiveStar.addEventListener('click', selectedStar_five)

            
            // cộng trừ khi click   
            const btnTru = document.querySelector('.buttonTru')
            const btnCong = document.querySelector('.buttonCong')
            const inputNumber = document.querySelector('input.number')
            var number = inputNumber.getAttribute("value")
            console.log(number)
            btnCong.addEventListener('click', function(){
                number++;
                if(number > <%=product.getQuantity()%>) number = <%=product.getQuantity()%>;
                inputNumber.setAttribute("value", number)
            })

            btnTru.addEventListener('click', function(){
                number--;
                if(number<=0) number = 0;
                inputNumber.setAttribute("value", number)
            })
            
            
      
        // xử lý với ảnh
            const imgs = document.querySelectorAll('.body_img_multi-img--js')
            function addAllClassDisable(){
                for (const img of imgs) {
                    img.classList.add('body_img_multi-img--disable')
                }
            }    
            const img1 = document.querySelector('.image-1')
            const img2 = document.querySelector('.image-2')
            const img3 = document.querySelector('.image-3')
            const img4 = document.querySelector('.image-4')

            const imgshow = document.querySelector('.image-show')
            var pathImg1 = img1.getAttribute('src')
            imgshow.setAttribute('src', pathImg1);
                
            function showImg4(){
                addAllClassDisable()
                img4.classList.remove('body_img_multi-img--disable')
                var pathImg4 = img4.getAttribute('src')
                imgshow.setAttribute('src', pathImg4);
            }
            function showImg3(){
                addAllClassDisable()
                img3.classList.remove('body_img_multi-img--disable')
                var pathImg3 = img3.getAttribute('src')
                imgshow.setAttribute('src', pathImg3);
            }
            function showImg2(){
                addAllClassDisable()
                img2.classList.remove('body_img_multi-img--disable')
                var pathImg2= img2.getAttribute('src')
                imgshow.setAttribute('src', pathImg2);
            }
            function showImg1(){
                addAllClassDisable()
                img1.classList.remove('body_img_multi-img--disable')
                var pathImg1 = img1.getAttribute('src')
                imgshow.setAttribute('src', pathImg1);
            }
            
            img1.addEventListener('click', showImg1)
            img2.addEventListener('click', showImg2)
            img3.addEventListener('click', showImg3)
            img4.addEventListener('click', showImg4)
            
        </script>
    </body>

</html>
