package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"./css/LoginAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Page Login Admin</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid backgroud-all\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <img src=\"./images/iconUsers.png\" alt=\"imageUser\"/>\r\n");
      out.write("                    <h3>Đăng Nhập</h3>\r\n");
      out.write("                    <p style=\"text-align: center; font-size: 15px; font-family: cursive; color: palevioletred\" role=\"alert\">\r\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginFail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <form action=\"");
      out.print(request.getContextPath());
      out.write("/LoginAdmin\" method=\"post\" name=\"frm-login\" onsubmit = \"return validateLogin()\">\r\n");
      out.write("                        <div class=\"input-group mb-3\">\r\n");
      out.write("                            <span class=\"input-group-text\" id=\"inputGroup-sizing-default\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                            <input type=\"text\" name=\"username\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-default\" placeholder=\"Nhập tên đăng nhập\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userRegister.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group mb-3\">\r\n");
      out.write("                            <span class=\"input-group-text\" id=\"inputGroup-sizing-default\"><i class=\"fa fa-key\"></i></span>\r\n");
      out.write("                            <input type=\"password\" name=\"password\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-default\" placeholder=\"Nhập mật khẩu\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userRegister.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            <span class=\"input-group-text\" id=\"inputGroup-sizing-default\"><i class=\"fa fa-eye\"></i></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-check\">\r\n");
      out.write("                            <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"flexCheckDefault\">\r\n");
      out.write("                            <label class=\"form-check-label\" for=\"flexCheckDefault\">\r\n");
      out.write("                                Ghi Nhớ\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-secondary\">Đăng Nhập</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/LoginAdmin.js\"></script>\r\n");
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
}
