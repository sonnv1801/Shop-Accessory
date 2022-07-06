package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePageAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../css/inclusesAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Page Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid backgroud-all\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-3\">\n");
      out.write("                    <div class=\"menu-left\">\n");
      out.write("                        <div class=\"menu-top\">\n");
      out.write("                            <img src=\"../images/iconUsers.png\" alt=\"imageUser\"/>\n");
      out.write("                            <h4>Admin Web Accessory</h4>\n");
      out.write("                            <hr/>\n");
      out.write("                            <h6>Menu Admin</h6>\n");
      out.write("                            <ul class=\"menu-body\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-th-large\"><span>Tổng Quan</span></i></a></li>\n");
      out.write("                                <li><a href=\"QlAdmin.jsp\"><i class=\"fa fa-user-plus\"><span>Quản Lý Admin</span></i></a></li>\n");
      out.write("                                <li><a href=\"QLUsers.jsp\"><i class=\"fa fa-users\"><span>Quản Lý Users</span></i></a></li>\n");
      out.write("                                <li><a href=\"DSProducts.jsp.jsp\"><i class=\"fa fa-th-list\"><span>Danh Sách Sản Phẩm</span></i></a></li>\n");
      out.write("                                <li><a href=\"Order.jsp\"><i class=\"fa fa-shopping-cart\"><span>Đơn Hàng</span></i></a></li>\n");
      out.write("                                <li><a href=\"News.jsp\"><i class=\"fa fa-newspaper-o\"><span>Tin Tức</span></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-3\">\n");
      out.write("                    <h1>ok</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
