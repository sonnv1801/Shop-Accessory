package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h3>Number Format:</h3>\n");
      out.write("      <c:set var = \"balance\" value = \"120000.2309\" />\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (1): <fmt:formatNumber value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \n");
      out.write("         type = \"currency\"/></p>\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (2): <fmt:formatNumber type = \"number\" \n");
      out.write("         maxIntegerDigits = \"3\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></p>\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (3): <fmt:formatNumber type = \"number\" \n");
      out.write("         maxFractionDigits = \"3\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></p>\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (4): <fmt:formatNumber type = \"number\" \n");
      out.write("         groupingUsed = \"false\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></p>\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (5): <fmt:formatNumber type = \"percent\" \n");
      out.write("         maxIntegerDigits=\"3\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></p>\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (6): <fmt:formatNumber type = \"percent\" \n");
      out.write("         minFractionDigits = \"10\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></p>\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (7): <fmt:formatNumber type = \"percent\" \n");
      out.write("         maxIntegerDigits = \"3\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></p>\n");
      out.write("         \n");
      out.write("      <p>Formatted Number (8): <fmt:formatNumber type = \"number\" \n");
      out.write("         pattern = \"###.###E0\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /></p>\n");
      out.write("         \n");
      out.write("      <p>Currency in USA :\n");
      out.write("         <fmt:setLocale value = \"en_US\"/>\n");
      out.write("         <fmt:formatNumber value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${balance}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type = \"currency\"/>\n");
      out.write("      </p>\n");
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
