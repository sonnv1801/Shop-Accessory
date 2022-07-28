package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("    <title>User Profile</title>\r\n");
      out.write("    <script>\r\n");
      out.write("      function changeInfor(){\r\n");
      out.write("        var infor=document.getElementById(\"infor\");\r\n");
      out.write("        var changeinfor=document.getElementById(\"changeinfor\");\r\n");
      out.write("        var back=document.getElementById(\"back\");\r\n");
      out.write("        var btnchangeinfor=document.getElementById(\"btnchangeinfor\");\r\n");
      out.write("        infor.style.display=\"none\";\r\n");
      out.write("        changeinfor.style.display=\"\";\r\n");
      out.write("        back.style.display=\"\";\r\n");
      out.write("        btnchangeinfor.style.display=\"none\";\r\n");
      out.write("      }\r\n");
      out.write("      function back(){\r\n");
      out.write("        var infor=document.getElementById(\"infor\");\r\n");
      out.write("        var changeinfor=document.getElementById(\"changeinfor\");\r\n");
      out.write("        var back=document.getElementById(\"back\");\r\n");
      out.write("        var btnchangeinfor=document.getElementById(\"btnchangeinfor\");\r\n");
      out.write("        infor.style.display=\"\";\r\n");
      out.write("        changeinfor.style.display=\"none\";\r\n");
      out.write("        back.style.display=\"none\";\r\n");
      out.write("        btnchangeinfor.style.display=\"\";\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
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
      out.write("                  <li class=\"breadcrumb-item active\" aria-current=\"page\">User Profile</li>\r\n");
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
      out.write("                  <a class=\"btn btn-outline-primary ms-1\" href=\"changepass.jsp\" type=\"button\">Change Password</a>\r\n");
      out.write("                  <button id=\"btnchangeinfor\" onclick=\"changeInfor()\" type=\"button\" class=\"btn btn-outline-primary ms-1\">Change Information</button>\r\n");
      out.write("                  <button id=\"back\" onclick=\"back()\" style=\"display: none;\" type=\"button\" class=\"btn btn-outline-primary ms-1\">Back</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-8\">\r\n");
      out.write("              <div class=\"card mb-4\">\r\n");
      out.write("                <div id=\"infor\" class=\"card-body\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <p class=\"mb-0\">Full Name</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9\">\r\n");
      out.write("                      <p class=\"text-muted mb-0\">Johnatan Smith</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <p class=\"mb-0\">User name</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9\">\r\n");
      out.write("                      <p class=\"text-muted mb-0\">JohnatanS_2002</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <p class=\"mb-0\">Password</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9\">\r\n");
      out.write("                      <input style=\"border: none; background-color: white;\" type=\"password\" name=\"\" id=\"\" value=\"12345\" disabled>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <p class=\"mb-0\">Phone</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9\">\r\n");
      out.write("                      <p class=\"text-muted mb-0\">(097) 234-5678</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                      <p class=\"mb-0\">Address</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9\">\r\n");
      out.write("                      <p class=\"text-muted mb-0\">Bay Area, San Francisco, CA</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"changeinfor\" class=\"card-body\" style=\"display: none;\">\r\n");
      out.write("                  <form class=\"form-inline\" action=\"\" method=\"post\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                      <div class=\"col-sm-3\">\r\n");
      out.write("                        <p class=\"mb-0\">Current Phone</p>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-sm-9\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"inputPasswordOld\" required=\"\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                      <div class=\"col-sm-3\">\r\n");
      out.write("                        <p class=\"mb-0\">Phone</p>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-sm-9\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"inputPasswordOld\" required=\"\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                      <div class=\"col-sm-3\">\r\n");
      out.write("                        <p class=\"mb-0\">Address</p>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-sm-9\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"inputPasswordOld\" required=\"\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <div class=\"d-flex justify-content-center mb-2\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn btn-primary\">Save</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("                </div>\r\n");
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
