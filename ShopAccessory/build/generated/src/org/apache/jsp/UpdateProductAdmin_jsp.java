package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;

public final class UpdateProductAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/inclusesAdmin.jsp");
    _jspx_dependants.add("/dayandclockAdmin.jsp");
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
      out.write("        <link href=\"./css/HomePageAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"./css/QlAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"./css/inclusesAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"./css/UpdateAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Page Update Product</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid backgroud-all\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-3\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"./css/inclusesAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Page Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"menu-left\">\n");
      out.write("            <div class=\"menu-top\">\n");
      out.write("                <img src=\"./images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userLogin.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"image\" style=\"width: 44px;\" alt=\"imageUser\"/>\n");
      out.write("                <h4>Admin Web Accessory</h4>\n");
      out.write("                <hr/>\n");
      out.write("                <h6>Menu Admin</h6>\n");
      out.write("                <ul class=\"menu-body\">\n");
      out.write("                    <li><a href=\"HomePage.jsp\"><i class=\"fa fa-th-large\"><span>Tổng Quan</span></i></a></li>\n");
      out.write("                    <li><a href=\"AdminControllerServlet\"><i class=\"fa fa-user-plus\"><span>Quản Lý Admin</span></i></a></li>\n");
      out.write("                    <li><a href=\"UsersServlet\"><i class=\"fa fa-users\"><span>Quản Lý Users</span></i></a></li>\n");
      out.write("                    <li><a href=\"ProductsServlet\"><i class=\"fa fa-th-list\"><span>Danh Sách Sản Phẩm</span></i></a></li>\n");
      out.write("                    <li><a href=\"OrderServlet\"><i class=\"fa fa-shopping-cart\"><span>Đơn Hàng</span></i></a></li>\n");
      out.write("                    <li><a href=\"NewsServlet\"><i class=\"fa fa-newspaper-o\"><span>Tin Tức</span></i></a></li>\n");
      out.write("                    <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/LogoutAdmin\"><i class=\"fa fa-sign-out\"><span>Đăng Xuất</span></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-9\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    long millis = System.currentTimeMillis();
    java.util.Date date = new java.util.Date(millis);
    SimpleDateFormat datetoday = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String today = datetoday.format(date);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar-admin\">\n");
      out.write("            <div class=\"navbar-admin\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("                <i class=\"fa fa-user-circle\"><p style=\"color: #ffcf00; display: inline-block; padding: 0px 13px; text-transform: uppercase\">Xin Chào: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userLogin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></i>\n");
      out.write("                <i class=\"fa fa-calendar\" style=\" font-size: 20px;\"><p style=\"color: #ffcf00; display: inline-block; padding: 0px 13px; text-transform: uppercase;\">");
      out.print( today);
      out.write("</p></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    <div class=\"container backgroud-all-update\">\n");
      out.write("                        <h1>UPDATE Product</h1>\n");
      out.write("                         <form action=\"NewsServlet\" method=\"GET\">\n");
      out.write("                            <input type=\"hidden\" name=\"command\" value=\"UPDATE\">\n");
      out.write("                            <input type=\"hidden\" name=\"newsId\"  required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${THE_NEWS.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                           <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Tên Sản Phẩm</label>\n");
      out.write("                                    <input type=\"text\" name=\"name\" required class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tên sản phẩm\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Mô Tả</label>\n");
      out.write("                                    <input type=\"text\" name=\"description\" required class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập mô tả\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Số Lượng</label>\n");
      out.write("                                    <input type=\"number\" name=\"quantity\" required class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập số lượng\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Giá</label>\n");
      out.write("                                    <input type=\"number\" name=\"price\" required class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập giá tiền\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Màu</label>\n");
      out.write("                                    <input type=\"text\" name=\"color\" required class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tên màu\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Kích Cỡ</label>\n");
      out.write("                                    <input type=\"text\" name=\"size\" required class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập kích cỡ\">\n");
      out.write("                                </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\">Save</button>\n");
      out.write("                            <a id=\"back\" href=\"NewsServlet\"><i class=\"fa fa-arrow-circle-o-left\" style=\"font-size:36px\"></i></a>\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</div>\n");
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
