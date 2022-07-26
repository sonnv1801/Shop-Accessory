package org.apache.jsp.tin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sản phẩm chi tiết</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-5/js/bootstrap.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/pay.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/themify-icons/themify-icons.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"thanhtoan__main\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!--  -->\n");
      out.write("            <div class=\"col-7\">\n");
      out.write("                <div class=\"pay__infomation\">\n");
      out.write("                    <h4>THÔNG TIN THANH TOÁN</h4>\n");
      out.write("                    <div class=\"pay__infomation__fullname\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-6 div__form pay__infomation__firstname\">\n");
      out.write("                                <p>Tên *</p>\n");
      out.write("                                <input type=\"text\" name=\"firstname\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6 div__form pay__infomation__lastname\">\n");
      out.write("                                <p>Họ *</p>\n");
      out.write("                                <input type=\"text\" name=\"lastname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"div__form pay__nation\">\n");
      out.write("                        <p>Quốc gia *</p>\n");
      out.write("                        <select name=\"\" id=\"\" class=\"pay__nation__select\">\n");
      out.write("                            <option value=\"VietNam\">Việt Nam</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"div__form pay__nation\">\n");
      out.write("                        <p>Địa chỉ *</p>\n");
      out.write("                        <input type=\"text\" name=\"address\" placeholder=\"Địa chỉ\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"div__form pay__city\">\n");
      out.write("                        <p>Tỉnh / Thành phố *</p>\n");
      out.write("                        <input type=\"text\" name=\"city\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"div__form pay__phone\">\n");
      out.write("                        <p>Số điện thoại *</p>\n");
      out.write("                        <input type=\"text\" name=\"phone\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"div__form pay__mail\">\n");
      out.write("                        <p>Địa chỉ mail *</p>\n");
      out.write("                        <input type=\"text\" name=\"mail\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"div__form pay__note\">\n");
      out.write("                        <p>Ghi chú đơn hàng (tùy chọn)</p>\n");
      out.write("                        <textarea name=\"pay_note\" id=\"pay_note\" cols=\"90\" rows=\"5\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--  -->\n");
      out.write("            <div class=\"col-5\">\n");
      out.write("                <div class=\"your__order\">\n");
      out.write("                    <div class=\"your__order__header\">\n");
      out.write("                        <h4>ĐƠN HÀNG CỦA BẠN</h4>\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\"table_header\">\n");
      out.write("                                    <td class=\"column_left\">\n");
      out.write("                                        SẢN PHẨM    \n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"column_right\">\n");
      out.write("                                        TỔNG\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr class=\"table_body\">\n");
      out.write("                                    <td class=\"column_left\">\n");
      out.write("                                        Giường thú cưng x2   \n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"column_right column_right--price\">\n");
      out.write("                                        310,000₫\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"table_body\">\n");
      out.write("                                    <td class=\"column_left\">\n");
      out.write("                                        Tạm tính  \n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"column_right column_right--price\">\n");
      out.write("                                        310,000₫\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"table_body\">\n");
      out.write("                                    <td class=\"column_left\">\n");
      out.write("                                        Giao hàng  \n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"column_right\">\n");
      out.write("                                        <span> giao hàng miễn phí</span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"table_body\">\n");
      out.write("                                    <td class=\"column_left\">\n");
      out.write("                                        Tổng  \n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"column_right column_right--price\">\n");
      out.write("                                        310,000₫\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            <tfoot>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <div class=\"btn-order\">\n");
      out.write("                                            <a href=\"#\">Đặt hàng</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tfoot>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
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
