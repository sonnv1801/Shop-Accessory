package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- CSS only -->\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <!-- JavaScript Bundle with Popper -->\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"login.css\" />\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <script>\r\n");
      out.write("      function myFunction(){\r\n");
      out.write("        var x=document.getElementById(\"user-pw\");\r\n");
      out.write("        if(x.type===\"password\"){\r\n");
      out.write("          x.type=\"text\";\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("          x.type=\"password\";\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      function myFunction1(){\r\n");
      out.write("        var x=document.getElementById(\"user-pw1\");\r\n");
      out.write("        if(x.type===\"password\"){\r\n");
      out.write("          x.type=\"text\";\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("          x.type=\"password\";\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      function myFunction2(){\r\n");
      out.write("        var x=document.getElementById(\"user-pw2\");\r\n");
      out.write("        if(x.type===\"password\"){\r\n");
      out.write("          x.type=\"text\";\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("          x.type=\"password\";\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      //an form dang ky khi click vao dang nhap\r\n");
      out.write("      function functionHide1(){\r\n");
      out.write("        var x=document.getElementById(\"dangky\");\r\n");
      out.write("        var y=document.getElementById(\"dangnhap\");\r\n");
      out.write("        var maulogin=document.getElementById(\"login\");\r\n");
      out.write("        var mausignup=document.getElementById(\"signup\");\r\n");
      out.write("            x.style.display=\"none\";\r\n");
      out.write("            y.style.display=\"contents\";\r\n");
      out.write("            mausignup.style.backgroundColor=\"#D2D8D8\";\r\n");
      out.write("            maulogin.style.backgroundColor=\"#FFFFFF\";\r\n");
      out.write("      }\r\n");
      out.write("      //an form dang nhap khi click vao dang ky\r\n");
      out.write("      function functionHide2(){\r\n");
      out.write("        var x=document.getElementById(\"dangnhap\");\r\n");
      out.write("        var y=document.getElementById(\"dangky\");\r\n");
      out.write("        var maulogin=document.getElementById(\"login\");\r\n");
      out.write("        var mausignup=document.getElementById(\"signup\");\r\n");
      out.write("        y.style.display=\"contents\";\r\n");
      out.write("        x.style.display=\"none\"\r\n");
      out.write("        maulogin.style.backgroundColor=\"#D2D8D8\";\r\n");
      out.write("        mausignup.style.backgroundColor=\"#FFFFFF\";\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row_login_signup\">\r\n");
      out.write("        <div class=\"box_login_signin\" id=\"login\" onclick=\"functionHide1()\"><a href=\"#\">LOGIN</a></div>\r\n");
      out.write("        <div class=\"box_login_signin\" id=\"signup\" onclick=\"functionHide2()\"><a href=\"#\">SIGN UP</a></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"logmod__tab_lgm-1\" id=\"dangnhap\">\r\n");
      out.write("        <div class=\"desc\">\r\n");
      out.write("          <span>Enter your email and password <strong>to sign in</strong></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input\">\r\n");
      out.write("          <form action=\"#\" method=\"post\">\r\n");
      out.write("            <div class=\"input_full\">\r\n");
      out.write("              <div class=\"box_input\">\r\n");
      out.write("                <label style=\"font-weight:bold ;\" class=\"string_optional\" for=\"user-name\">Email*</label>\r\n");
      out.write("                <input class=\"string_optional\" autocomplete=\"off\" maxlength=\"255\" id=\"user-email\" placeholder=\"Email\" type=\"email\" size=\"50\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"input_full\">\r\n");
      out.write("              <div class=\"box_input\">\r\n");
      out.write("                <label style=\"font-weight:bold ;\" class=\"string_optional\" for=\"user-pw\">Password *</label>\r\n");
      out.write("                <input class=\"string_optional\" autocomplete=\"off\" maxlength=\"255\" id=\"user-pw\" placeholder=\"Password\" type=\"password\" size=\"50\">\r\n");
      out.write("                <span id=\"show_or_hide\" class=\"hide-password\" onclick=\"myFunction()\">Show</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"simform__actions\">\r\n");
      out.write("              <input class=\"submit\" name=\"commit\" type=\"submit\" value=\"Log In\" />\r\n");
      out.write("              <span class=\"simform__actions-sidetext\"><a class=\"special\" role=\"link\" href=\"#\">Forgot your password?<br>Click here</a></span>\r\n");
      out.write("            </div> \r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"logmod__alter\">\r\n");
      out.write("          <div class=\"facebook_google\">\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <div class=\"connect__icon\" style=\"background-color: #283D68;\"><i class=\"fa fa-facebook\" style=\"font-size:24px\"></i></div>\r\n");
      out.write("              <div class=\"connect__context\"><span>Sign in with <strong>Facebook</strong></span></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"facebook_google\">\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <div class=\"connect__icon\" style=\"background-color: #B52F1F;\"><i class=\"fa fa-google\" style=\"font-size:24px\"></i></div>\r\n");
      out.write("              <div class=\"connect__context\" style=\"background-color: #DD4B39;\"><span>Sign in with <strong>Google</strong></span></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"logmod__tab_lgm-2\" id=\"dangky\" style=\"display: none;\">\r\n");
      out.write("        <div class=\"desc\">\r\n");
      out.write("          <span>Enter your personal details to <strong>create an account</strong></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"input\">\r\n");
      out.write("          <form action=\"#\" method=\"post\">\r\n");
      out.write("            <div class=\"input_full\">\r\n");
      out.write("              <div class=\"box_input\">\r\n");
      out.write("                <label style=\"font-weight:bold ;\" class=\"string_optional\" for=\"user-name\">Email*</label>\r\n");
      out.write("                <input class=\"string_optional\" autocomplete=\"off\" maxlength=\"255\" id=\"user-email\" placeholder=\"Email\" type=\"email\" size=\"50\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"input_full\">\r\n");
      out.write("              <div class=\"box_input\">\r\n");
      out.write("                <label style=\"font-weight:bold ;\" class=\"string_optional\" for=\"user-pw\">Password *</label>\r\n");
      out.write("                <input class=\"string_optional\" autocomplete=\"off\" maxlength=\"255\" id=\"user-pw1\" placeholder=\"Password\" type=\"password\" size=\"50\">\r\n");
      out.write("                <span id=\"show_or_hide\"  class=\"hide-password\" onclick=\"myFunction1()\">Show</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"input_full\">\r\n");
      out.write("              <div class=\"box_input\">\r\n");
      out.write("                <label style=\"font-weight:bold ;\" class=\"string_optional\">REPEAT PASSWORD *</label>\r\n");
      out.write("                <input class=\"string_optional\" autocomplete=\"off\" maxlength=\"255\" id=\"user-pw2\" placeholder=\"Password\" type=\"password\" size=\"50\">\r\n");
      out.write("                <span id=\"show_or_hide\" class=\"hide-password\" onclick=\"myFunction2()\">Show</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"simform__actions\">\r\n");
      out.write("              <input class=\"submit\" name=\"commit\" type=\"submit\" value=\"Create Account\" />\r\n");
      out.write("              <span class=\"simform__actions-sidetext\">By creating an account you agree to our <a class=\"special\" target=\"_blank\" role=\"link\" href=\"#\"><br>Terms & Privacy</a></span>\r\n");
      out.write("            </div> \r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"logmod__alter\">\r\n");
      out.write("          <div class=\"facebook_google\">\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <div class=\"connect__icon\" style=\"background-color: #283D68;\"><i class=\"fa fa-facebook\" style=\"font-size:24px\"></i></div>\r\n");
      out.write("              <div class=\"connect__context\"><span>Create an account with  <strong>Facebook</strong></span></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"facebook_google\">\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <div class=\"connect__icon\" style=\"background-color: #B52F1F;\"><i class=\"fa fa-google\" style=\"font-size:24px\"></i></div>\r\n");
      out.write("              <div class=\"connect__context\" style=\"background-color: #DD4B39;\"><span>Create an account with  <strong>Google</strong></span></div>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
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
