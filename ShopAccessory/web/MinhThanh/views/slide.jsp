<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- slide show -->
<div class="slideshow-container">
    <!-- Kết hợp hình ảnh và nội dung cho mội phần tử trong slideshow-->
    <div class="mySlides fade">
        <div class="numbertext">2 / 2</div>
        <img class="slide-img" src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-shop-2.jpg">
    </div>
    <div class="mySlides fade">
        <div class="numbertext">1 / 2</div>
        <img class="slide-img" src="http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-shop-1.jpg">
    </div>
    <!-- Nút điều khiển mũi tên-->
    <a class="prev" onclick="plusSlides(-1)">❮</a>
    <a class="next" onclick="plusSlides(1)">❯</a>
    <div class="content-up-image">
        <div class="content-right">
            <h3>Mua hàng Online!</h3>
            <h2>Tiết kiệm tiền</h2>
            <p>Tiết kiệm tối đa cho bạn</p>
            <p>Tại cửa hàng và trực tuyến</p>
            <a href="#" class="button-effect">Bắt đầu</a>
        </div>
        <div class="content-left">
            <div class="button-circle">
                <span>save up to</span>
                <h3>$25</h3>
            </div>
        </div>
    </div>
</div>
<br>
<!-- Nút tròn điều khiển slideshow-->
<div class="dot-position" style="text-align:center">
    <span class="dot" onclick="currentSlide(1)"></span>
    <span class="dot" onclick="currentSlide(2)"></span>
</div>
<!-- end slide show -->