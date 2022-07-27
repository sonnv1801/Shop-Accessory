package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Trang Chủ</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/trangchu.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slideshow.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/gioithieu.css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.leanhduc.pro.vn/utilities/animation/shake-effect/style.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    <div class=\"header-parent\">\r\n");
      out.write("        <div class=\"header-child1 header-padding\">\r\n");
      out.write("            <ul class=\"header-ul ul-child1\">\r\n");
      out.write("                <li class=\"header-li\">\r\n");
      out.write("                    <i class=\"fa-solid fa-house-chimney-user\"></i>\r\n");
      out.write("                    <span class=\"home\">Home</span>\r\n");
      out.write("                    <span>: 319 - C16 Lý Thường Kiệt, P.15, Q.11, Tp.HCM</span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"header-ul ul-child1\">\r\n");
      out.write("                <li class=\"header-li\">Open</li>\r\n");
      out.write("                <li class=\"header-li\">Mail</li>\r\n");
      out.write("                <li class=\"header-li\">\r\n");
      out.write("                    <a href=\"LoginAdmin.jsp\" style=\"text-decoration: none;color: rgb(108, 100, 101);\">\r\n");
      out.write("                        <i class=\"fa-solid fa-arrow-right-to-bracket\"></i>\r\n");
      out.write("                        Login\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\">\r\n");
      out.write("            <div class=\"header-child2 header-padding\">\r\n");
      out.write("                <ul class=\"header-ul ul-child2\">\r\n");
      out.write("                    <li class=\"header-li\">\r\n");
      out.write("                        <a href=\"TrangchuController\"><img class=\"img-logo\" id=\"subnavbar\" src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/11/Pet-Care-1.png\" alt=\"\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"header-ul ul-child2\">\r\n");
      out.write("                    <li class=\"header-li\">\r\n");
      out.write("                        <i style=\"color:#ffca44;\" class=\"fa-solid fa-phone-volume rung\"></i>\r\n");
      out.write("                        <span style=\"color: grey;\">Call Us <a href=\"#\" style=\"font-weight: bold;color: #fff; text-decoration: none;font-size: 17px\">090511111</a></span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"header-li\">\r\n");
      out.write("                        <i style=\"color:#ffca44;\" class=\"fa-solid fa-cart-arrow-down rung\"></i>\r\n");
      out.write("                        Cart\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"header-li search-item\">\r\n");
      out.write("                        <i style=\"color:#ffca44;\" class=\"fa-solid fa-magnifying-glass rung\"></i>\r\n");
      out.write("                        Search\r\n");
      out.write("                        <div class=\"search-child\">\r\n");
      out.write("                            <div class=\"container-search\">\r\n");
      out.write("                                <input type=\"text\" name=\"search\" placeholder=\"Enter....\">\r\n");
      out.write("                                <a href=\"#\"><i style=\"color:#ffca44;\" class=\"fa-solid fa-magnifying-glass\"></i></a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header-child3 header-padding\">\r\n");
      out.write("                <ul class=\"header-ul ul-child3\">\r\n");
      out.write("                    <li class=\"header-li\">\r\n");
      out.write("                        <a href=\"#\">Trang chủ</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"header-li\">\r\n");
      out.write("                        <a href=\"gioithieu.jsp\">giới thiệu</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"header-li menu-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"a-special\">\r\n");
      out.write("                            Cửa hàng\r\n");
      out.write("                            <i class=\"fa-solid fa-angle-down\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"menu-child\">\r\n");
      out.write("                            <ul class=\"ul-menu-child\">\r\n");
      out.write("                                <li>Giỏ hàng</li>\r\n");
      out.write("                                <li>Thanh toán</li>\r\n");
      out.write("                                <li>Kiểm tra đơn hàng</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"header-li\">\r\n");
      out.write("                        <a href=\"#\">tin tức</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"header-li\">\r\n");
      out.write("                        <a href=\"#\">Liên hệ</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- slide show -->\r\n");
      out.write("        <div class=\"slideshow-container\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <!-- end slide show -->\r\n");
      out.write("        <!-- body -->\r\n");
      out.write("        <div class=\"content-container\" id=\"container1\">\r\n");
      out.write("            <div class=\"view-content\">\r\n");
      out.write("                <div class=\"banner-view\" id=\"img1\">\r\n");
      out.write("                    <div class=\"text-banner-view\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-dog-small.png\" alt=\"\" class=\"banner-img\" >\r\n");
      out.write("                        <div class=\"banner-view-flex\">\r\n");
      out.write("                            <p>Tiết kiệm</p>\r\n");
      out.write("                            <h2>25%</h2>\r\n");
      out.write("                            <h3>Thức ăn chó<br> mèo</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"banner-view\" id=\"img2\">\r\n");
      out.write("                    <div class=\"text-banner-view\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-cat.png\" alt=\"\" class=\"banner-img\" >\r\n");
      out.write("                        <div class=\"banner-view-flex\">\r\n");
      out.write("                            <p>Tư vấn</p>\r\n");
      out.write("                            <h2>MIỄN PHÍ</h2>\r\n");
      out.write("                            <h3>Tư vấn</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"banner-view\" id=\"img3\">\r\n");
      out.write("                    <div class=\"text-banner-view\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/slider-dog.png\" >\r\n");
      out.write("                        <div class=\"banner-view-flex\">\r\n");
      out.write("                            <p>có hạn!<br>tiết kiệm đến</p>\r\n");
      out.write("                            <h2>45%</h2>\r\n");
      out.write("                            <h3>Nhiều hơn </h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content-container\" id=\"container2\">\r\n");
      out.write("            <h1>Sản phẩm hiện tại</h1>\r\n");
      out.write("            <div class=\"content-view\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content-container\" id=\"container3\">\r\n");
      out.write("            <div class=\"links-view\">\r\n");
      out.write("                <div class=\"image-link\">\r\n");
      out.write("                    <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt1.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"image-link\">\r\n");
      out.write("                    <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt2.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"image-link\">\r\n");
      out.write("                    <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt3.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"image-link\">\r\n");
      out.write("                    <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/ntt4.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content-container\" id=\"container2\">\r\n");
      out.write("            <h1>Sản phẩm hiện tại</h1>\r\n");
      out.write("            <div class=\"content-view\">\r\n");
      out.write("                <div class=\"products-view\">\r\n");
      out.write("                    <div class=\"product-image\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/sec3-1.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-information\">\r\n");
      out.write("                        <span id=\"span1\">phụ kiện</span>\r\n");
      out.write("                        <span id=\"span2\">Cổ áo da nguyên bản</span>\r\n");
      out.write("                        <span id=\"span3\">$130.00</span>\r\n");
      out.write("                        <a href=\"#\">Giỏ hàng</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"products-view\">\r\n");
      out.write("                    <div class=\"product-image\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/sec3-1.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-information\">\r\n");
      out.write("                        <span id=\"span1\">phụ kiện</span>\r\n");
      out.write("                        <span id=\"span2\">Cổ áo da nguyên bản</span>\r\n");
      out.write("                        <span id=\"span3\">$130.00</span>\r\n");
      out.write("                        <a href=\"#\">Giỏ hàng</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"products-view\">\r\n");
      out.write("                    <div class=\"product-image\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/sec3-1.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-information\">\r\n");
      out.write("                        <span id=\"span1\">phụ kiện</span>\r\n");
      out.write("                        <span id=\"span2\">Cổ áo da nguyên bản</span>\r\n");
      out.write("                        <span id=\"span3\">$130.00</span>\r\n");
      out.write("                        <a href=\"#\">Giỏ hàng</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"products-view\">\r\n");
      out.write("                    <div class=\"product-image\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/sec3-1.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"product-information\">\r\n");
      out.write("                        <span id=\"span1\">phụ kiện</span>\r\n");
      out.write("                        <span id=\"span2\">Cổ áo da nguyên bản</span>\r\n");
      out.write("                        <span id=\"span3\">$130.00</span>\r\n");
      out.write("                        <a href=\"#\">Giỏ hàng</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content-container\" id=\"container4\">\r\n");
      out.write("            <div class=\"promotions-view\">\r\n");
      out.write("                <div class=\"item-promotion\" id=\"item-promotion1\">\r\n");
      out.write("                    <h2>Giảm thêm 40%</h2>\r\n");
      out.write("                    <p>trên hóa đơn $100,sử dụng mã giảm giá</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"item-promotion\" id=\"item-promotion2\">\r\n");
      out.write("                    <h2>Miễn phí ship</h2>\r\n");
      out.write("                    <p>trên hóa đơn $49~có giới hạn</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content-container\" id=\"container5\">\r\n");
      out.write("            <div class=\"list-view\">\r\n");
      out.write("                <div class=\"category-list\">\r\n");
      out.write("                    <h2>Sản phẩm giảm giá</h2>\r\n");
      out.write("                    <div class=\"list-item\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/10/food_2-150x150.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"item-flex\">\r\n");
      out.write("                            <ul class=\"ul-item\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <h5>Thức ăn bình thường</h5>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <del>105,000đ</del>\r\n");
      out.write("                                    <span>100.000đ</span>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"category-list\">\r\n");
      out.write("                    <h2>Sản phẩm mới</h2>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"category-list\">\r\n");
      out.write("                    <h2>Sản phẩm mua nhiều</h2>\r\n");
      out.write("                    <div class=\"list-item\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/10/food_2-150x150.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"item-flex\">\r\n");
      out.write("                            <ul class=\"ul-item\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <h5>Thức ăn bình thường</h5>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <del>105,000đ</del>\r\n");
      out.write("                                    <span>100.000đ</span>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"category-list\">\r\n");
      out.write("                    <h2>Sản phẩm tự chọn</h2>\r\n");
      out.write("                    <div class=\"list-item\">\r\n");
      out.write("                        <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2018/10/food_2-150x150.jpg\" alt=\"\">\r\n");
      out.write("                        <div class=\"item-flex\">\r\n");
      out.write("                            <ul class=\"ul-item\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <h5>Thức ăn bình thường</h5>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <del>105,000đ</del>\r\n");
      out.write("                                    <span>100.000đ</span>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end body -->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"footer-top\">\r\n");
      out.write("        <div class=\"footer-child\" id=\"footer1\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/Pet-Care-1.png\" alt=\"\"></li>\r\n");
      out.write("                <li>Đăng ký để nhận được được thông tin mới nhất từ chúng tôi.</li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"email-footer\">\r\n");
      out.write("                        <input type=\"text\" name=\"email\" placeholder=\"Email..\">\r\n");
      out.write("                        <i class=\"fa-solid fa-paper-plane\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-child\" id=\"footer2\">\r\n");
      out.write("            <h2>Liên hệ</h2>\r\n");
      out.write("            <ul class=\"ul-footer\">\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <i class=\"fa-solid fa-location-dot\"></i>\r\n");
      out.write("                    <span>319 C16 Lý Thường Kiệt, Phường 15, Quận 11, Tp.HCM</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <i class=\"fa-solid fa-location-dot\"></i>\r\n");
      out.write("                    <span>076 922 0162</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <i class=\"fa-solid fa-envelope-open-text\"></i>\r\n");
      out.write("                    <div class=\"span-flex\">\r\n");
      out.write("                        <span>demonhunterg@gmail.com</span><br>\r\n");
      out.write("                        <span>mon@mona.media</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <i class=\"fa-solid fa-sack-dollar\"></i>\r\n");
      out.write("                    <span>demonhunterp</span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-child\" id=\"footer3\">\r\n");
      out.write("            <h2>Hỗ trợ</h2>\r\n");
      out.write("            <ul class=\"ul-footer\">\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <span>FAQ</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <span>Chăm sóc khách hàng</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <span>Vận chuyển và Đổi trả hàng</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <span>Liên hệ</span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-child\" id=\"footer4\">\r\n");
      out.write("            <h2>Thông tin</h2>\r\n");
      out.write("            <ul class=\"ul-footer\">\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <span>Trong những năm tới, người nostrud tập thể dục, khu học chánh có thể không hoạt động aliquip.</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"li-footer2\">\r\n");
      out.write("                    <span><i class=\"fa-brands fa-facebook\"></i>\r\n");
      out.write("                        <i class=\"fa-brands fa-twitter\"></i></span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <h3>© Bản quyền thuộc về . Thiết kế website TTS FPT</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <button onclick=\"topFunction()\" class=\"back-to-top\" id=\"totop\">\r\n");
      out.write("        <i class=\"fa-solid fa-angles-up\"></i>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/slideshow.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/scrollnavba.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/backtoptop.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("lb");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listbanner}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <!-- Kết hợp hình ảnh và nội dung cho mội phần tử trong slideshow-->\r\n");
          out.write("                <div class=\"mySlides fade\">\r\n");
          out.write("                    <div class=\"numbertext\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lb.idbanner}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" / 2</div>\r\n");
          out.write("                    <img class=\"slide-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lb.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                </div>\r\n");
          out.write("                <!-- Nút điều khiển mũi tên-->\r\n");
          out.write("                <a class=\"prev\" onclick=\"plusSlides(-1)\">❮</a>\r\n");
          out.write("                <a class=\"next\" onclick=\"plusSlides(1)\">❯</a>\r\n");
          out.write("                <div class=\"content-up-image\">\r\n");
          out.write("                    <div class=\"content-right\">\r\n");
          out.write("                        <h3>Mua hàng Online!</h3>\r\n");
          out.write("                        <h2>Tiết kiệm tiền</h2>\r\n");
          out.write("                        <p>Tiết kiệm tối đa cho bạn</p>\r\n");
          out.write("                        <p>Tại cửa hàng và trực tuyến</p>\r\n");
          out.write("                        <a href=\"#\" class=\"button-effect\">Bắt đầu</a>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <div class=\"content-left\">\r\n");
          out.write("                        <div class=\"button-circle\">\r\n");
          out.write("                            <span>save up to</span>\r\n");
          out.write("                            <h3>$25</h3>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("ll");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listlimit}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"products-view\">\r\n");
          out.write("                        <div class=\"product-image\">\r\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <div class=\"product-information\">\r\n");
          out.write("                            <span id=\"span1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.namecategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            <span id=\"span2\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            <span id=\"span3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ll.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("đ</span>\r\n");
          out.write("                            <a href=\"#\">Giỏ hàng</a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("ln");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listnew}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"list-item\">\r\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ln.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\r\n");
          out.write("                        <div class=\"item-flex\">\r\n");
          out.write("                            <ul class=\"ul-item\">\r\n");
          out.write("                                <li>\r\n");
          out.write("                                    <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ln.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                                </li>\r\n");
          out.write("                                <li>\r\n");
          out.write("                                    <del>105,000đ</del>\r\n");
          out.write("                                    <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ln.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("đ</span>\r\n");
          out.write("                                </li>\r\n");
          out.write("                            </ul>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
