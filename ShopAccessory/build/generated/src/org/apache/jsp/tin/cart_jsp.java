package org.apache.jsp.tin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>Giỏ hàng</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-5/js/bootstrap.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/cart.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/themify-icons/themify-icons.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"cart\">\n");
      out.write("        <div class=\"main_cart\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-7 table-cart-wrap\">\n");
      out.write("                    <table class=\"table__cart\">\n");
      out.write("                        <thead class=\"table__cart__header\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    SẢN PHẨM\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    GIÁ\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    SỐ LƯỢNG\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    TỔNG\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody class=\"table__cart__body\">\n");
      out.write("                            <!-- item 1 - Cop thẻ tr để có các mục tiếp theo-->\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <div class=\"cart-product\">\n");
      out.write("                                        <div class=\"title_product\">\n");
      out.write("                                            <i class=\"ti-close\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"image_product\">\n");
      out.write("                                            <img src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/sec3-4.jpg\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"content-product\">\n");
      out.write("                                            <h6 class=\"name-product\">Áo Khoác mùa đông</h6>\n");
      out.write("                                            <h6 class=\"description-product\">Màu Sắc: Đa Màu Size: Nhỏ</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <div class=\"cart_price\">\n");
      out.write("                                        74,000 đ\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <div class=\"buttonTru\">\n");
      out.write("                                        -\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"text\" class=\"number\" value=\"1\">\n");
      out.write("                                    <div class=\"buttonCong\">\n");
      out.write("                                        +\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <div class=\"cart_price\">\n");
      out.write("                                        74,000 đ\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <!--  -->\n");
      out.write("                        </tbody>\n");
      out.write("                        <tfoot>\n");
      out.write("                            <tr style=\"border-bottom: 2px solid #ececec;\">\n");
      out.write("                            </tr>\n");
      out.write("                        </tfoot>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"button_cart button_cart_home\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"ti-arrow-left\"></i>\n");
      out.write("                            TIẾP TỤC XEM SẢN PHẨM\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button_cart button_cart_updateCart\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            CẬP NHẬT GIỎ HÀNG\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Col - 5 -->\n");
      out.write("                <div class=\"col-5\">\n");
      out.write("                    <table class=\"table__cart\">\n");
      out.write("                        <thead class=\"table__cart__header\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    CỘNG GIỎ HÀNG\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody class=\"table__sum-cart__body\">\n");
      out.write("                            <!-- item 1 - Cop thẻ tr để có các mục tiếp theo-->\n");
      out.write("                            <tr class=\"calc_price tamtinh\">\n");
      out.write("                                <td>\n");
      out.write("                                    Tạm tính\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"tamtinh__price\">\n");
      out.write("                                    310,000 đ \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"sum-cart__ship giaohang\">\n");
      out.write("                                <td>\n");
      out.write("                                    Giao hàng\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"giaohang_text\">\n");
      out.write("                                    <p>Giao hàng miễn phí</p>\n");
      out.write("                                    <p>Tính phí giao hàng</p>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"calc_price tong-price\">\n");
      out.write("                                <td>\n");
      out.write("                                    Tổng\n");
      out.write("                                </td>\n");
      out.write("                                <td class=\"sum__price\">\n");
      out.write("                                    310,000 đ \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"sum-cart__button\">\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    <div class=\"sum-cart__button__wrap\">\n");
      out.write("                                        <div class=\"sum-cart__button__btn\">\n");
      out.write("                                            <a href=\"#\">TIẾN HÀNH THANH TOÁN</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p> <i class=\"ti-tag\"></i> Phiếu ưu đãi</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"sum-cart__uudai\">\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    <input class=\"uudai__text\" type=\"text\" placeholder=\"Mã ưu đãi\">\n");
      out.write("                                    <input class=\"uudai__btn\" type=\"submit\" value=\"Áp Dụng\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <!--  -->\n");
      out.write("                        </tbody>\n");
      out.write("                        <tfoot>\n");
      out.write("                            <tr style=\"border-bottom: 2px solid #ececec;\">\n");
      out.write("                            </tr>\n");
      out.write("                        </tfoot>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- JAVASCRIPT -->\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("         // cộng trừ khi click\n");
      out.write("        const btnTru = document.querySelector('.buttonTru')\n");
      out.write("        const btnCong = document.querySelector('.buttonCong')\n");
      out.write("        const inputNumber = document.querySelector('input.number')\n");
      out.write("        var number = inputNumber.getAttribute(\"value\")\n");
      out.write("        console.log(number)\n");
      out.write("        btnCong.addEventListener('click', function(){\n");
      out.write("            number++;\n");
      out.write("            inputNumber.setAttribute(\"value\", number)\n");
      out.write("        })\n");
      out.write("\n");
      out.write("        btnTru.addEventListener('click', function(){\n");
      out.write("            number--;\n");
      out.write("            if(number<=0) number = 0;\n");
      out.write("            inputNumber.setAttribute(\"value\", number)\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("</body>\n");
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
