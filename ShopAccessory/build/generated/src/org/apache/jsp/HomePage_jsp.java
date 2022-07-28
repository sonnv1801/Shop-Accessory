package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Admin;
import java.text.DecimalFormat;
import entity.HomePageAdmin;
import dao.HomePageAdminDao;
import dbcontext.DBUtil;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/./inclusesAdmin.jsp");
    _jspx_dependants.add("/dayandclockAdmin.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");


    DBUtil db = new DBUtil();
    HomePageAdminDao count = new HomePageAdminDao();
    int dataAdmin = count.countAdmin();

    int dataProducts = count.countProducts();

    int dataTotal = count.sumTotal();

    DecimalFormat formatter = new DecimalFormat("###,###,###");
    String sum = formatter.format(dataTotal);

    int dataUsers = count.countUsers();

    int dataNews = count.countNews();

    int dataOrders = count.countOrders();


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("        <link href=\"./css/HomePageAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Page Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <script type=\"text/java script\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            google.charts.load('current', {'packages': ['corechart']});\n");
      out.write("            google.charts.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("            function drawChart() {\n");
      out.write("\n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("                    ['Task', 'Hours per Day'],\n");
      out.write("                    ['Admin', ");
      out.print( dataAdmin);
      out.write("],\n");
      out.write("                    ['Users', ");
      out.print( dataUsers);
      out.write("],\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                var options = {\n");
      out.write("                    title: 'Danh Mục Tài Khoản'\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n");
      out.write("\n");
      out.write("                chart.draw(data, options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            google.charts.load(\"current\", {packages: [\"corechart\"]});\n");
      out.write("            google.charts.setOnLoadCallback(drawChart);\n");
      out.write("            function drawChart() {\n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("                    ['Task', 'Hours per Day'],\n");
      out.write("                    ['Sản Phẩm', ");
      out.print( dataProducts);
      out.write("],\n");
      out.write("                    ['Đơn Hàng', ");
      out.print( dataOrders);
      out.write("],\n");
      out.write("                    ['Tin Tức', ");
      out.print( dataNews);
      out.write("]\n");
      out.write("                ]);\n");
      out.write("\n");
      out.write("                var options = {\n");
      out.write("                    title: 'Danh Mục Sản Phẩm',\n");
      out.write("                    pieHole: 0.4,\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                var chart = new google.visualization.PieChart(document.getElementById('donutchart'));\n");
      out.write("                chart.draw(data, options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userLogin == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");

    response.sendRedirect("LoginAdmin.jsp");
    
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
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
      out.write("                    <div style=\"margin: 55px 0px;\">\n");
      out.write("                        <div class=\"row card-top\">\n");
      out.write("                            <div class=\"col-xl-3\">\n");
      out.write("                                <div class=\"card text-bg-light mb-3\" style=\"max-width: 18rem;\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"card-title\">Giỏ Hàng</h5>\n");
      out.write("                                        <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                        <hr/>\n");
      out.write("                                        <p class=\"card-text\">Tổng Sản Phẩm: ");
      out.print( dataProducts);
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3\">\n");
      out.write("                                <div class=\"card text-bg-light mb-3\" style=\"max-width: 18rem;\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"card-title\">");
      out.print( sum + "");
      out.write(" VNĐ</h5>\n");
      out.write("                                        <i class=\"fa fa-money\"></i>\n");
      out.write("                                        <hr/>\n");
      out.write("                                        <p class=\"card-text\">Lợi Nhuận Tháng Này <i class=\"fa fa-arrow-up\"></i> </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3\">\n");
      out.write("                                <div class=\"card text-bg-light mb-3\" style=\"max-width: 18rem;\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"card-title\">");
      out.print( dataUsers);
      out.write("</h5>\n");
      out.write("                                        <i class=\"fa fa-eye\"></i>\n");
      out.write("                                        <hr/>\n");
      out.write("                                        <p class=\"card-text\">Người Đăng Ký <i class=\"fa fa-arrow-up\"></i> </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3\">\n");
      out.write("                                <div class=\"card text-bg-light mb-3\" style=\"max-width: 18rem;\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"card-title\">");
      out.print( dataNews);
      out.write("</h5>\n");
      out.write("                                        <i class=\"fa fa-envira\"></i>\n");
      out.write("                                        <hr/>\n");
      out.write("                                        <p class=\"card-text\">Tổng Bài Viết <i class=\"fa fa-arrow-up\"></i> </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-6\">\n");
      out.write("                            <div id=\"piechart\" class=\"chart\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-6\">\n");
      out.write("                            <div id=\"donutchart\" class=\"chart\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
