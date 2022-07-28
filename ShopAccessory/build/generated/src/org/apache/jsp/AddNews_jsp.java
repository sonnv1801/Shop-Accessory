package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class AddNews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/inclusesAdmin.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
 long millis = System.currentTimeMillis();
    java.sql.Date date = new java.sql.Date(millis);

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"./css/HomePageAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"./css/QlAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"./css/UpdateAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"./css/inclusesAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Page News</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"font-family: cursive;\">\n");
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
      out.write("                     <div class=\"navbar-admin\">\n");
      out.write("            <div class=\"navbar-admin\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("                <i class=\"fa fa-user-circle\"><p style=\"color: #ffcf00; display: inline-block; padding: 0px 13px; text-transform: uppercase\">Xin Chào: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userLogin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></i>\n");
      out.write("                <i class=\"fa fa-calendar\" style=\" font-size: 20px;\"><p style=\"color: #ffcf00; display: inline-block; padding: 0px 13px; text-transform: uppercase;\">");
      out.print( date);
      out.write("</p></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                    <div style=\"margin: 55px 0px;\">\n");
      out.write("                        <div class=\"container backgroud-all-update\">\n");
      out.write("                            <h1>Add News</h1>\n");
      out.write("                            <form action=\"");
      out.print(request.getContextPath());
      out.write("/PosterAdminServlet\" method=\"post\"\n");
      out.write("                                  onsubmit=\"return validateRegister()\" name=\"frm-register\">\n");
      out.write("                                <h1 style=\"text-align: center;\n");
      out.write("                                    font-size: 23px;\n");
      out.write("                                    font-family: cursive;\n");
      out.write("                                    color: #83ea87;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trueAdd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Tiêu Đề</label>\n");
      out.write("                                    <input type=\"text\" name=\"title\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tiêu đề\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"message-text\" class=\"col-form-label\">Nội Dung</label>\n");
      out.write("                                    <textarea class=\"form-control\" name=\"des\" id=\"message-text\" required ></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Ngày Tạo</label>\n");
      out.write("                                    <input type=\"date\" name=\"daySubmit\" value=\"");
      out.print( date);
      out.write("\" class=\"form-control\" id=\"recipient-name\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Link Hình Ảnh</label>\n");
      out.write("                                    <input type=\"file\" name=\"image\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập link hình ảnh\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"recipient-name\" class=\"col-form-label\">Người Đăng</label>\n");
      out.write("                                    <select class=\"form-select\" name=\"poster\" aria-label=\"Default select example\" required>\n");
      out.write("                                        <option value=\"\">Chọn Người Đăng</option>\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userLogin.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userLogin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\">Save</button>\n");
      out.write("                                <a id=\"back\" href=\"NewsServlet\"><i class=\"fa fa-arrow-circle-o-left\" style=\"font-size:36px\"></i></a>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script\n");
      out.write("        src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/AddAd.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
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
