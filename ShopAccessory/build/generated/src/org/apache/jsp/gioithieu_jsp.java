package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gioithieu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Giới thiệu</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                                <form action=\"SearchController\" method=\"get\">\r\n");
      out.write("                                    <input type=\"text\" name=\"search\" placeholder=\"Enter....\">\r\n");
      out.write("                                    <button type=\"submit\"><i style=\"color:#ffca44;\" class=\"fa-solid fa-magnifying-glass\"></i></button>\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
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
      out.write("\n");
      out.write("        <div class=\"introduce-container\">\n");
      out.write("            <div class=\"layer-banner\">\n");
      out.write("                <div class=\"text-fill-banner\">\n");
      out.write("                    <h1>Axiom yêu khách hàng của họ</h1>\n");
      out.write("                    <span>Đó là lý do tại sao chúng tôi tạo ra các thiết kế sáng sủa, bắt mắt và làm cao cấp<br>\n");
      out.write("                        mã chất lượng để bạn quá hài lòng với các sản phẩm của chúng tôi.</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"layer-container content1\">\n");
      out.write("                <div class=\"content-top\">\n");
      out.write("                    <h1>Vài nét về Pet Care</h1>\n");
      out.write("                    <p>Mua sản phẩm từ Axiom có nghĩa là giao phó<br>\n");
      out.write("                        danh tiếng của bạn đến một trong những studio web tốt nhất.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-bottom\">\n");
      out.write("                    <div class=\"bottom1\">\n");
      out.write("                        <i class=\"fa-solid fa-handshake-angle big-img\"></i>\t\n");
      out.write("                        <h2>phù hợp cho bất kỳ mục đích nào</h2>\n");
      out.write("                        <p>Công ty Axiom thực hiện công việc của mình với một khách hàng, chúng tôi đảm bảo rằng chủ đề Thú cưng sẽ là bất kỳ loại trang web nào bạn muốn.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"bottom2\">\n");
      out.write("                        <i class=\"fa-solid fa-computer big-img\"></i>\n");
      out.write("                        <h2>Đáp ứng 100%</h2>\n");
      out.write("                        <p>Thú cưng sẽ tự động được điều chỉnh theo bất kỳ độ phân giải nào mà bạn không phải lo lắng về việc tạo phiên bản cho mỗi màn hình.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"bottom3\">\n");
      out.write("                        <i class=\"fa-solid fa-paper-plane big-img\"></i>\n");
      out.write("                        <h2>cập nhật và hỗ trợ miễn phí</h2>\n");
      out.write("                        <p>Chúng tôi tạo ra các chủ đề của chúng tôi với suy nghĩ của khách hàng, do đó nhóm của chúng tôi làm việc chăm chỉ để cung cấp cho bạn sự hỗ trợ kỹ thuật tốt nhất trên thế giới.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"layer-container content2\">\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <h3>CHÚNG TÔI LÀ AI,CHÚNG TÔI LÀM GÌ</h3>\n");
      out.write("                    <h1>chúng tôi là ai</h1>\n");
      out.write("                    <p>Mua sản phẩm web từ công ty Axiom có nghĩa là giao phó danh tiếng của bạn cho một trong những studio web tốt nhất trong lĩnh vực này. Nhóm của chúng tôi tạo ra các chủ đề của chúng tôi với suy nghĩ của khách hàng, do đó bộ óc sáng tạo của chúng tôi làm việc chăm chỉ để cung cấp cho bạn sự hỗ trợ kỹ thuật tốt nhất trên toàn thế giới.</p>\n");
      out.write("                    <a href=\"#\">Nhiều hơn</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/main_right.jpg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
