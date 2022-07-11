package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.QlAdminDao;
import entity.Admin;
import java.util.List;
import dbcontext.DbCon;
import dao.AdminDao;

public final class QlAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin/inclusesAdmin.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div>");

    QlAdminDao pd = new QlAdminDao(DbCon.getConnection());
    List<Admin> products = pd.getAdmins();
    
      out.write("</div>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../css/HomePageAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/QlAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Page QLADmin</title>\n");
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
      out.write("\n");
      out.write("        <div class=\"menu-left\">\n");
      out.write("            <div class=\"menu-top\">\n");
      out.write("                <img src=\"../images/iconUsers.png\" alt=\"imageUser\"/>\n");
      out.write("                <h4>Admin Web Accessory</h4>\n");
      out.write("                <hr/>\n");
      out.write("                <h6>Menu Admin</h6>\n");
      out.write("                <ul class=\"menu-body\">\n");
      out.write("                    <li><a href=\"HomePage.jsp\"><i class=\"fa fa-th-large\"><span>Tổng Quan</span></i></a></li>\n");
      out.write("                    <li><a href=\"QlAdmin.jsp\"><i class=\"fa fa-user-plus\"><span>Quản Lý Admin</span></i></a></li>\n");
      out.write("                    <li><a href=\"QLUsers.jsp\"><i class=\"fa fa-users\"><span>Quản Lý Users</span></i></a></li>\n");
      out.write("                    <li><a href=\"DSProducts.jsp\"><i class=\"fa fa-th-list\"><span>Danh Sách Sản Phẩm</span></i></a></li>\n");
      out.write("                    <li><a href=\"Order.jsp\"><i class=\"fa fa-shopping-cart\"><span>Đơn Hàng</span></i></a></li>\n");
      out.write("                    <li><a href=\"News.jsp\"><i class=\"fa fa-newspaper-o\"><span>Tin Tức</span></i></a></li>\n");
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
      out.write("                    <div class=\"navbar-admin\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin: 55px 0px;\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary button-add-admin\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" data-bs-whatever=\"@mdo\">Thêm Admin</button>\n");
      out.write("                        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                            <div class=\"modal-dialog\">\n");
      out.write("                                <div class=\"modal-content\">\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Thêm Admin</h5>\n");
      out.write("                                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                                        <p style=\"text-align: center; font-size: 15px; font-family: cursive; color: palevioletred\" role=\"alert\">\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginFail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form action=\"");
      out.print(request.getContextPath());
      out.write("/AddAdmin\" method=\"post\"\n");
      out.write("                                              onsubmit=\"return validateRegister()\" name=\"frm-register\">\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label for=\"recipient-name\" class=\"col-form-label\">Hình Ảnh</label>\n");
      out.write("                                                <input type=\"text\" name=\"avatar\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tên hình ảnh\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label for=\"recipient-name\" class=\"col-form-label\">Tên Admin</label>\n");
      out.write("                                                <input type=\"text\" name=\"name\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tên Admin\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label for=\"recipient-name\" class=\"col-form-label\">Tên Đăng Nhập</label>\n");
      out.write("                                                <input type=\"text\" name=\"username\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tên đăng nhập\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"mb-3\">\n");
      out.write("                                                <label for=\"recipient-name\" class=\"col-form-label\">Mật Khẩu</label>\n");
      out.write("                                                <input type=\"password\" name=\"password\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập mật khẩu\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"modal-footer\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary\">Save</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"container table-all\">\n");
      out.write("                            <div class=\"table-body\">\n");
      out.write("                                <h4>Danh Sách Admin</h4>\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"col\">#</th>\n");
      out.write("                                            <th scope=\"col\">Tên Đăng Nhập</th>\n");
      out.write("                                            <th scope=\"col\">Tên Admin</th>\n");
      out.write("                                            <th scope=\"col\">Action</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 if (!products.isEmpty()) {
                                                for (Admin p : products) {
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">");
      out.print( p.getId());
      out.write("</th>\n");
      out.write("                                            <td>");
      out.print( p.getUsername());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( p.getName());
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                    <a href=\"DeleteAdmin?id=");
      out.print( p.getId());
      out.write("\"><button style=\"background-color: red; color: white; border: none\">Xóa <i class=\"fa fa-remove\"></i></button></a>\n");
      out.write("                                    <a href=\"#\"><button style=\"background-color: green; color: white; border: none\" data-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\">Sửa <i class=\"fa fa-edit\"></i></button></a>\n");
      out.write("\n");
      out.write("                                    ");
}
                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"modal fade\" id=\"staticBackdrop\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("                                        <div class=\"modal-dialog\">\n");
      out.write("                                            <div class=\"modal-content\">\n");
      out.write("                                                <div class=\"modal-header\">\n");
      out.write("                                                    <h5 class=\"modal-title\" id=\"staticBackdropLabel\" style=\"color: black\">Sửa Admin</h5>\n");
      out.write("                                                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-body\">\n");
      out.write("                                                    <form>\n");
      out.write("                                                        <div class=\"mb-3\">\n");
      out.write("                                                            <label for=\"recipient-name\" class=\"col-form-label\" style=\"color: black\">ID</label>\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" id=\"recipient-name\" value=\"1\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"mb-3\">\n");
      out.write("                                                            <label for=\"recipient-name\" class=\"col-form-label\" style=\"color: black\">Tên Đăng Nhập</label>\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tên đăng nhập\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"mb-3\">\n");
      out.write("                                                            <label for=\"recipient-name\" class=\"col-form-label\" style=\"color: black\">Tên Admin</label>\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập tên Admin\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"mb-3\">\n");
      out.write("                                                            <label for=\"recipient-name\" class=\"col-form-label\" style=\"color: black\">Mật Khẩu</label>\n");
      out.write("                                                            <input type=\"password\" class=\"form-control\" id=\"recipient-name\" placeholder=\"Nhập mật khẩu\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-footer\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-primary\">Save</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script\n");
      out.write("        src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/QlAdmin.js\"></script>\n");
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
