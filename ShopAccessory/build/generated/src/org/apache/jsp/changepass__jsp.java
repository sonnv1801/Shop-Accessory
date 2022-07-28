package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepass__jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link\r\n");
      out.write("    href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\"\r\n");
      out.write("    rel=\"stylesheet\"\r\n");
      out.write("    integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\"\r\n");
      out.write("    crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("  <!-- JavaScript Bundle with Popper -->\r\n");
      out.write("    <script\r\n");
      out.write("    src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("    integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\"\r\n");
      out.write("    crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <title>Change Password</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <section style=\"background-color: #eee;\">\r\n");
      out.write("        <div class=\"container py-5\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col\">\r\n");
      out.write("              <nav aria-label=\"breadcrumb\" class=\"bg-light rounded-3 p-3 mb-4\">\r\n");
      out.write("                <ol class=\"breadcrumb mb-0\">\r\n");
      out.write("                  <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                  <li class=\"breadcrumb-item\"><a href=\"#\">User</a></li>\r\n");
      out.write("                  <li class=\"breadcrumb-item active\" aria-current=\"page\">Change Password</li>\r\n");
      out.write("                </ol>\r\n");
      out.write("              </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      \r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-4\">\r\n");
      out.write("              <div class=\"card mb-4\">\r\n");
      out.write("                <div class=\"card-body text-center\">\r\n");
      out.write("                  <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3.webp\" alt=\"avatar\"\r\n");
      out.write("                    class=\"rounded-circle img-fluid\" style=\"width: 150px;\">\r\n");
      out.write("                  <h5 class=\"my-3\">John Smith</h5>\r\n");
      out.write("                  <p class=\"text-muted mb-1\">Age:</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-center mb-2\">\r\n");
      out.write("                  <a href=\"./profile.html\" type=\"button\" class=\"btn btn-outline-primary ms-1\">Back</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-8\">\r\n");
      out.write("              <div class=\"card mb-4\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <form class=\"form-inline\" action=\"ChangePassword\" method=\"post\">\r\n");
      out.write("                    <div id=\"changepass\" class=\"card-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-sm-3\">\r\n");
      out.write("                            <p class=\"mb-0\">Current Password</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-sm-9\">\r\n");
      out.write("                              <input type=\"password\" name=\"password\" class=\"form-control\" id=\"inputPasswordOld\" required=\"\">\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-sm-3\">\r\n");
      out.write("                            <p class=\"mb-0\">New Password</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-sm-9\">\r\n");
      out.write("                            <input type=\"password\" name=\"newpassword\" class=\"form-control\" id=\"inputPasswordOld\" required=\"\">\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                          <div class=\"col-sm-3\">\r\n");
      out.write("                            <p class=\"mb-0\">Repeat Password</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-sm-9\">\r\n");
      out.write("                              <input type=\"password\" name=\"repeatpassword\" class=\"form-control\" id=\"inputPasswordOld\" required=\"\">\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <div class=\"d-flex justify-content-center mb-2\">\r\n");
      out.write("                          <button type=\"submit\" class=\"btn btn-primary\">Save</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("</body>\r\n");
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
