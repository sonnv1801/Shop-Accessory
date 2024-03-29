package org.apache.jsp.tin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Color;
import entity.Product;
import java.sql.Connection;
import dbcontext.DBUtil;
import dao.ProductsDAO;

public final class productDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_varStatus_end_begin.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    DBUtil db = new DBUtil();
    ProductsDAO productDao = new ProductsDAO();
    int idproduct = Integer.parseInt(request.getParameter("idproduct"));
    Product product = productDao.GetProductDetails(idproduct);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sản phẩm chi tiết</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/bootstrap-5/js/bootstrap.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/productDetails.css\">\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!--  -->\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <!-- item subnav 1 -->\n");
      out.write("                        <div class=\"subnav\">\n");
      out.write("                            <div class=\"subnav__content\">\n");
      out.write("                                <div class=\"subnav__header\">\n");
      out.write("                                    <h2>Sản phẩm</h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"subnav__item__wrap\">\n");
      out.write("                                    <ul class=\"subnav__item\">\n");
      out.write("                                        <!-- Item java-->\n");
      out.write("                                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("pro");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProductsLimit}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                            <li class=\"subnav__item__li subnav__item__li--le\">\n");
            out.write("                                                <img src=\"./images/products/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\">\n");
            out.write("                                                <div class=\"sbnav__item__descripts\">\n");
            out.write("                                                    <a href=\"");
            out.print(request.getContextPath());
            out.write("/ProductsControl?idproduct=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.idproduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a>\n");
            out.write("                                                    <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(".000₫</p>\n");
            out.write("                                                </div>\n");
            out.write("                                            </li>\n");
            out.write("                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write(" \n");
      out.write("                                            \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- item subnav 2 -->\n");
      out.write("                        <div class=\"subnav\">\n");
      out.write("                            <div class=\"subnav__content\">\n");
      out.write("                                <div class=\"subnav__header\">\n");
      out.write("                                    <h2>Bài viết mới nhất</h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"subnav__item__wrap\">\n");
      out.write("                                    <ul class=\"subnav__item\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                \n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--  -->\n");
      out.write("                    <div class=\"col-9\">\n");
      out.write("                        <div class=\"body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"body_img\">\n");
      out.write("                                        <div class=\"body_img_details\">\n");
      out.write("                                            <img class=\"image-show\" src=\"\" alt=\"\">\n");
      out.write("                                            <!-- Mũi tên hover -->\n");
      out.write("                                            <!-- <div class=\"body_img_details__arrow\">\n");
      out.write("                                                <i class=\"ti-angle-left\"></i>\n");
      out.write("                                                <i class=\"ti-angle-right\"></i>\n");
      out.write("                                                <i class=\"ti-zoom-in\"></i>\n");
      out.write("                                            </div> -->\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"body_img_multi-img\">\n");
      out.write("<!--                                        <img class=\"image-1 body_img_multi-img--js\" src=\"http://mauweb.monamedia.net/petcare/wp-content/uploads/2019/10/Dogs-Winter-Jacket-1-100x100.jpg\" alt=\"\">\n");
      out.write("                                            <img class=\"image-2 body_img_multi-img--js body_img_multi-img--disable\" src=\"data:image/jpeg;base64,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\" alt=\"\">\n");
      out.write("                                            <img class=\"image-3 body_img_multi-img--js body_img_multi-img--disable\" src=\"data:image/jpeg;base64,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\" alt=\"\">\n");
      out.write("                                            <img class=\"image-4 body_img_multi-img--js body_img_multi-img--disable\" src=\"data:image/jpeg;base64,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\" alt=\"\">-->\n");
      out.write("                                            ");
 int check = 1; 
      out.write("\n");
      out.write("                                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_2.setParent(null);
      _jspx_th_c_forEach_2.setVar("imgs");
      _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ProductImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                                ");
 if(check == 1){ 
            out.write("\n");
            out.write("                                                    <img class=\"image-");
            out.print(check);
            out.write(" body_img_multi-img--js\" src=\"./images/products/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imgs.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\">\n");
            out.write("                                                ");
 }else{ 
            out.write("\n");
            out.write("                                                    <img class=\"image-");
            out.print(check);
            out.write(" body_img_multi-img--js body_img_multi-img--disable\" src=\"./images/products/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imgs.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\">\n");
            out.write("                                                ");
 } 
            out.write("\n");
            out.write("                                                ");
 check++;
            out.write("\n");
            out.write("                                            ");
            int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
      }
      out.write(" \n");
      out.write("                                                    \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"body__content_wrap\">\n");
      out.write("                                        <div class=\"body__header\">\n");
      out.write("                                            <div class=\"pathMini\">\n");
      out.write("                                                <a href=\"#\">Trang chủ</a> \n");
      out.write("                                                &ensp;/&ensp;\n");
      out.write("                                                <a href=\"#\">Demo</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"header--title\">\n");
      out.write("                                                <h1>");
      out.print(product.getName() );
      out.write("</h1>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("        \n");
      out.write("                                        <div class=\"is-divider small\"></div>\n");
      out.write("        \n");
      out.write("                                        <div class=\"body__content\">\n");
      out.write("                                            <div class=\"body__content__price\">\n");
      out.write("                                                ");
      out.print(product.getPrice()+".000₫" );
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"body__content__descriptions\">\n");
      out.write("                                                 ");
      out.print(product.getDescription() );
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div id=\"form__select\">\n");
      out.write("                                                <form action=\"");
      out.print(request.getContextPath());
      out.write("/Cart\" method=\"post\">\n");
      out.write("                                                    <table>\n");
      out.write("                                                    ");
 if(product.getColor()!=null || product.getSize()!=null){ 
      out.write("\n");
      out.write("                                                        <!-- tr màu -->\n");
      out.write("                                                        <tr>   \n");
      out.write("                                                            <td class=\"label\">\n");
      out.write("                                                                Màu sắc\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("<!--                                                                    <div class=\"box-select\">\n");
      out.write("                                                                        <span>Chọn một tùy chọn</span> \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <i class=\"fa-solid fa-angle-down\"></i>\n");
      out.write("                                                                    <div class=\"box-select--option-show box-select--option-color\">\n");
      out.write("                                                                        <ul>\n");
      out.write("                                                                            <li> Chọn một màu tùy chọn </li>\n");
      out.write("                                                                           \n");
      out.write("                                                                        </ul>\n");
      out.write("                                                                    </div>-->\n");
      out.write("                                                                    <select name=\"color\" class=\"box-select--wrap box-select--wrap--color\">\n");
      out.write("                                                                        <option value=\"\" disabled selected>None</option>\n");
      out.write("                                                                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                    </select>\n");
      out.write("                                                                      \n");
      out.write("                                                                \n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        <!-- tr size -->\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td class=\"label\">\n");
      out.write("                                                                Size\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("<!--                                                                    <div class=\"box-select\">\n");
      out.write("                                                                        <span>Chọn một tùy chọn</span> \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <i class=\"fa-solid fa-angle-down\"></i>\n");
      out.write("                                                                    <div class=\"box-select--option-show box-select--option-size\">\n");
      out.write("                                                                        <ul>\n");
      out.write("                                                                            <li> Chọn một size tùy chọn </li>\n");
      out.write("                                                                        </ul>\n");
      out.write("                                                                    </div>-->\n");
      out.write("                                                                    <select name=\"size\" class=\"box-select--wrap box-select--wrap--color\">\n");
      out.write("                                                                        <option value=\"\" disabled selected>None</option>\n");
      out.write("                                                                        ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                                    </select>\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    <a class=\"delete_form\" href=\"#\">Xóa</a>\n");
      out.write("                                                    ");
 } 
      out.write("\n");
      out.write("                                                        <!-- End color, size -->\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                <div class=\"buttonTru\">\n");
      out.write("                                                                    -\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <input type=\"text\" name=\"quantityPurchased\" class=\"number\" value=\"1\">\n");
      out.write("                                                                <div class=\"buttonCong\">\n");
      out.write("                                                                    +\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                <div class=\"btnBuy\">\n");
      out.write("<!--                                                                <a href=\"\">MUA HÀNG</a>-->\n");
      out.write("                                                                    <input type=\"hidden\" name=\"idproduct\" value=\"");
      out.print(product.getIdproduct());
      out.write("\" />\n");
      out.write("                                                                    <input type=\"hidden\" name=\"idamin\" value=\"");
      out.print(product.getIdadmin());
      out.write("\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"idprt\" value=\"");
      out.print(product.getIdprt());
      out.write("\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"name\" value=\"");
      out.print(product.getName());
      out.write("\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"desc\" value=\"");
      out.print(product.getDescription());
      out.write(" \">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"quantity\" value=\"");
      out.print(product.getQuantity());
      out.write("\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"price\" value=\"");
      out.print(product.getPrice());
      out.write("\">\n");
      out.write("<!--                                                                    <input type=\"hidden\" name=\"color\" value=\"");
      out.print(product.getColor());
      out.write("\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"size\" value=\"");
      out.print(product.getSize());
      out.write("\">-->\n");
      out.write("                                                                    <input type=\"hidden\" name=\"nameprt\" value=\"");
      out.print(product.getNamecategory());
      out.write("\">\n");
      out.write("                                                                    <input type=\"hidden\" name=\"image\" value=\"");
      out.print(product.getImage());
      out.write("\">\n");
      out.write("                                                                    <input class=\"btn_buy_input\" type=\"submit\" value=\"Mua Hàng\"/>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </table>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <!--  -->\n");
      out.write("                                            <div class=\"payments\">\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <!--\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <h6>Tính phí ship tự động</h6>\n");
      out.write("                                                        <img src=\"./images/ship/logo-ghn.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/ship/logo-ghtk.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/ship/logo-ninja-van.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/ship/logo-shipchung.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/ship/logo-viettle-post.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/ship/logo-vn-post.jpg\" alt=\"\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-6\">\n");
      out.write("                                                        <h6>Thanh toán</h6>\n");
      out.write("                                                        <img src=\"./images/bank/logo-acb.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/bank/logo-mastercard.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/bank/logo-paypal.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/bank/logo-techcombank.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/bank/logo-vcb.jpg\" alt=\"\">\n");
      out.write("                                                        <img src=\"./images/bank/logo-vib.jpg\" alt=\"\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <h6 class=\"SloganBank\">\"Hãy trở thành Affilicate của chúng tôi để tìm thêm thu nhập thụ động, kiếm tiền online\"</h6>\n");
      out.write("                                                    <div class=\"button-regist-aff\">\n");
      out.write("                                                        <a href=\"#\">Đăng ký Affilicate</a> \n");
      out.write("                                                    </div>\n");
      out.write("                                                    -->\n");
      out.write("                                                    <hr class=\"hr--First\"/>\n");
      out.write("                                                    <div class=\"maSP\">\n");
      out.write("                                                        Mã: ");
      out.print(product.getIdproduct() );
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <hr/>\n");
      out.write("                                                    <div class=\"category\">\n");
      out.write("                                                        Danh mục: <a href=\"#\">");
      out.print(product.getNamecategory() );
      out.write("</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <hr/>\n");
      out.write("\n");
      out.write("                            <!--  -->\n");
      out.write("\n");
      out.write("                            <div class=\"body__footer\">\n");
      out.write("                                <div class=\"btn__footer btn__mota\">\n");
      out.write("                                    Mô tả\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"btn__footer btn__thongtinbosung btn__footer--hidden\">\n");
      out.write("                                    Thông Tin Bổ Sung\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"btn__footer btn__Danhgia btn__footer--hidden\">\n");
      out.write("                                    ");
 int num = 0; 
      out.write("\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_5.setParent(null);
      _jspx_th_c_forEach_5.setVar("cmts");
      _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllComments}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
        if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                       ");
 num+=1; 
            out.write("\n");
            out.write("                                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_5.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
      }
      out.write("\n");
      out.write("                                    Đánh Giá (");
      out.print(num);
      out.write(")\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Nội dung cho từng nút bấm -->\n");
      out.write("                            <div class=\"content_mota\">\n");
      out.write("                                <p class=\"text__footer\">\n");
      out.write("                                    ");
      out.print(product.getDescription() );
      out.write("\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!--  -->\n");
      out.write("                            <div class=\"content_thongtinbosung btn__hidden\">\n");
      out.write("                                <div class=\"row color\">\n");
      out.write("                                    <div class=\"col-6 color_title\">MÀU SẮC</div>\n");
      out.write("                                    <div class=\"col-6 color_content\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <hr/>\n");
      out.write("                                <div class=\"row size-wrap\">\n");
      out.write("                                    <div class=\"col-6 size_title\">SIZE</div>\n");
      out.write("                                    <div class=\"col-6 size_content\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--  -->\n");
      out.write("                            <div class=\"content_evaluate btn__hidden\">\n");
      out.write("                                <div class=\"content_evaluate__header\">\n");
      out.write("                                    <h1>Đánh giá</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"content_evaluate__content\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"content_evaluate__add-evaluate\">\n");
      out.write("                                    <div class=\"evaluate_header\">\n");
      out.write("                                        <h1>Hãy là người đầu tiên nhận xét <br/> “");
      out.print(product.getName() );
      out.write("”</h1> \n");
      out.write("                                    </div>\n");
      out.write("                                    <form action=\"AddComment\" method=\"post\" class=\"form-add-evaluate\" accept-charset=\"UTF-8\">\n");
      out.write("                                        <div class=\"evaluate_start\">\n");
      out.write("                                            <h6>Đánh giá của bạn</h6>\n");
      out.write("                                            <div class=\"evaluate_start--action one-start\" onclick=\"selectedOneStar()\">\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"evaluate_start--action two-start\" onclick=\"selectedTwoStar()\">\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"evaluate_start--action three-start\" onclick=\"selectedThreeStar()\">\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"evaluate_start--action four-start\" onclick=\"selectedFourStar()\">\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"evaluate_start--action five-start\" onclick=\"selectedFiveStar()\">\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                                <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- phần dữ liệu thêm -->\n");
      out.write("                                            <input type=\"hidden\" class=\"StarSelected\" name=\"star\" value=\"0\">\n");
      out.write("                                            <input type=\"hidden\" class=\"\" name=\"idproduct\" value=\"");
      out.print(idproduct);
      out.write("\">\n");
      out.write("                                            <input type=\"hidden\" class=\"\" name=\"iduser\" value=\"3\">\n");
      out.write("                                            <!-- Hết phần dữ liệu thêm -->\n");
      out.write("                                        </div>\n");
      out.write("                                        <br/>\n");
      out.write("                                        <br/>\n");
      out.write("                                        <div class=\"evaluate_text\">\n");
      out.write("                                            <h6>\n");
      out.write("                                                Nhận xét của bạn *\n");
      out.write("                                            </h6>\n");
      out.write("                                            <textarea id=\"\" name=\"comments\" rows=\"4\" cols=\"50\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--\n");
      out.write("                                        <div class=\"evaluate__info\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <h6>Tên *</h6>\n");
      out.write("                                                    <input type=\"text\" name=\"name\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <h6>Email *</h6>\n");
      out.write("                                                    <input type=\"text\" name=\"email\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        -->\n");
      out.write("                                        <div class=\"evaluate__button\">\n");
      out.write("                                            <input type=\"submit\" value=\"Gửi đi\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--  -->\n");
      out.write("\n");
      out.write("                            <hr/>\n");
      out.write("\n");
      out.write("                            <div class=\"similar-products\">\n");
      out.write("                                <div class=\"similar-products__header\">\n");
      out.write("                                    <h1>Sản phẩm tương tự</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"similar-products__body\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <!-- Item sản phẩm tương tự -->\n");
      out.write("                                        ");
 int a = 0;
      out.write("\n");
      out.write("                                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_10.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_10.setParent(null);
      _jspx_th_c_forEach_10.setVar("p");
      _jspx_th_c_forEach_10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SimilarProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_10 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_10 = _jspx_th_c_forEach_10.doStartTag();
        if (_jspx_eval_c_forEach_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                            ");
            if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_10, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
              return;
            out.write("\n");
            out.write("                                            ");
            if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_10, _jspx_page_context, _jspx_push_body_count_c_forEach_10))
              return;
            out.write("\n");
            out.write("                                            \n");
            out.write("                                            <!-- check_num là lấy id trước, check_id là lấy id hiện tại\n");
            out.write("                                                nếu 2 cái bằng nhau là trùng sản phẩm nên không hiển thị -->\n");
            out.write("                                            ");
 if(a<3){ 
            out.write("\n");
            out.write("                                                ");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_if_2.setPageContext(_jspx_page_context);
            _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
            _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check_id != check_num}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
            int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
            if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n");
                out.write("                                                    <div class=\"col-4\">\n");
                out.write("                                                        ");
 a+=1; 
                out.write("\n");
                out.write("                                                        <div class=\"similar-products__item\">\n");
                out.write("                                                            <div class=\"similar-products__item__img\">\n");
                out.write("                                                                <img src=\"./images/products/");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\" alt=\"\">\n");
                out.write("                                                            </div>\n");
                out.write("                                                            <div class=\"similar-products__item__content\">\n");
                out.write("                                                                <a class=\"similar-products__item__content--name\" href=\"#\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("</a>\n");
                out.write("                                                                <p class=\"similar-products__item__content--price\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write(".000₫</p>\n");
                out.write("                                                                <a class=\"similar-products__item__content--button\" \n");
                out.write("                                                                   href=\"");
                out.print(request.getContextPath());
                out.write("/ProductsControl?idproduct=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                out.write("\">\n");
                out.write("                                                                    Mua Hàng\n");
                out.write("                                                                </a>\n");
                out.write("                                                            </div>\n");
                out.write("                                                        </div>\n");
                out.write("                                                    </div>\n");
                out.write("                                                ");
                int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
              return;
            }
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
            out.write("\n");
            out.write("                                            ");
 } 
            out.write("\n");
            out.write("                                            \n");
            out.write("                                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_10.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_10[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_10.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_10.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_10);
      }
      out.write("\n");
      out.write("                                        <!-- item sản phẩm tương tự -->\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // xử lý nhận dữ liệu (số sao) comments\n");
      out.write("            var StarSelected = document.querySelector('.StarSelected')\n");
      out.write("            function selectedOneStar(){\n");
      out.write("                StarSelected.setAttribute(\"value\", 1)\n");
      out.write("            }\n");
      out.write("            function selectedTwoStar(){\n");
      out.write("                StarSelected.setAttribute(\"value\", 2)\n");
      out.write("            }\n");
      out.write("            function selectedThreeStar(){\n");
      out.write("                StarSelected.setAttribute(\"value\", 3)\n");
      out.write("            }\n");
      out.write("            function selectedFourStar(){\n");
      out.write("                StarSelected.setAttribute(\"value\", 4)\n");
      out.write("            }\n");
      out.write("            function selectedFiveStar(){\n");
      out.write("                StarSelected.setAttribute(\"value\", 5)\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            // Xử lý khi nhấn vào mô tả, thông tin bổ sung, đánh giá\n");
      out.write("\n");
      out.write("            const btnMota = document.querySelector('.btn__mota')\n");
      out.write("            const btnThongtinbosung = document.querySelector('.btn__thongtinbosung')\n");
      out.write("            const btnDanhgia = document.querySelector('.btn__Danhgia')\n");
      out.write("            const btnAlls = document.querySelectorAll('.btn__footer')\n");
      out.write("           // btn__footer  btn__footer--hidden\n");
      out.write("           function addAllDisableButton(){\n");
      out.write("                for (const btn of btnAlls) {\n");
      out.write("                    btn.classList.add('btn__footer--hidden')\n");
      out.write("                }\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           const content_mota = document.querySelector('.content_mota')\n");
      out.write("           const content_evaluate = document.querySelector('.content_evaluate')\n");
      out.write("           const content_thongtinbosung = document.querySelector('.content_thongtinbosung')\n");
      out.write("\n");
      out.write("           function hiddenAllContent(){\n");
      out.write("                content_evaluate.classList.add('btn__hidden')\n");
      out.write("                content_mota.classList.add('btn__hidden')\n");
      out.write("                content_thongtinbosung.classList.add('btn__hidden')\n");
      out.write("           }    \n");
      out.write("\n");
      out.write("           btnMota.addEventListener('click', function(){\n");
      out.write("                addAllDisableButton()\n");
      out.write("                hiddenAllContent()\n");
      out.write("                content_mota.classList.remove('btn__hidden')\n");
      out.write("                btnMota.classList.remove('btn__footer--hidden')\n");
      out.write("            })\n");
      out.write("\n");
      out.write("            btnThongtinbosung.addEventListener('click', function(){\n");
      out.write("                addAllDisableButton()\n");
      out.write("                hiddenAllContent()\n");
      out.write("                content_thongtinbosung.classList.remove('btn__hidden')\n");
      out.write("                btnThongtinbosung.classList.remove('btn__footer--hidden')\n");
      out.write("            })\n");
      out.write("           \n");
      out.write("            btnDanhgia.addEventListener('click', function(){\n");
      out.write("                addAllDisableButton()\n");
      out.write("                hiddenAllContent()\n");
      out.write("                content_evaluate.classList.remove('btn__hidden')\n");
      out.write("                btnDanhgia.classList.remove('btn__footer--hidden')\n");
      out.write("            })\n");
      out.write("\n");
      out.write("              //  Xử lý với đánh giá sao \n");
      out.write("            const oneStar = document.querySelector('.one-start')\n");
      out.write("            const twoStar = document.querySelector('.two-start')\n");
      out.write("            const threeStar = document.querySelector('.three-start')\n");
      out.write("            const fourStar = document.querySelector('.four-start')\n");
      out.write("            const fiveStar = document.querySelector('.five-start')\n");
      out.write("            const allStar = document.querySelectorAll('.evaluate_start--action ')\n");
      out.write("\n");
      out.write("            function removeAll(){\n");
      out.write("                oneStar.classList.remove('evaluate_start--action--selected')\n");
      out.write("                twoStar.classList.remove('evaluate_start--action--selected')\n");
      out.write("                threeStar.classList.remove('evaluate_start--action--selected')\n");
      out.write("                fourStar.classList.remove('evaluate_start--action--selected')\n");
      out.write("                fiveStar.classList.remove('evaluate_start--action--selected')\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function selectedStar_one() {\n");
      out.write("                removeAll()\n");
      out.write("                oneStar.classList.toggle('evaluate_start--action--selected')\n");
      out.write("            }\n");
      out.write("            function selectedStar_two() {\n");
      out.write("                removeAll()\n");
      out.write("                twoStar.classList.toggle('evaluate_start--action--selected')\n");
      out.write("            }\n");
      out.write("            function selectedStar_three() {\n");
      out.write("                removeAll()\n");
      out.write("                threeStar.classList.toggle('evaluate_start--action--selected')\n");
      out.write("            }\n");
      out.write("            function selectedStar_four() {\n");
      out.write("                removeAll()\n");
      out.write("                fourStar.classList.toggle('evaluate_start--action--selected')\n");
      out.write("            }\n");
      out.write("            function selectedStar_five() {\n");
      out.write("                removeAll()\n");
      out.write("                fiveStar.classList.toggle('evaluate_start--action--selected')\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            oneStar.addEventListener('click', selectedStar_one)\n");
      out.write("            twoStar.addEventListener('click', selectedStar_two)\n");
      out.write("            threeStar.addEventListener('click', selectedStar_three)\n");
      out.write("            fourStar.addEventListener('click', selectedStar_four)\n");
      out.write("            fiveStar.addEventListener('click', selectedStar_five)\n");
      out.write("\n");
      out.write("            \n");
      out.write("            // cộng trừ khi click   \n");
      out.write("            const btnTru = document.querySelector('.buttonTru')\n");
      out.write("            const btnCong = document.querySelector('.buttonCong')\n");
      out.write("            const inputNumber = document.querySelector('input.number')\n");
      out.write("            var number = inputNumber.getAttribute(\"value\")\n");
      out.write("            console.log(number)\n");
      out.write("            btnCong.addEventListener('click', function(){\n");
      out.write("                number++;\n");
      out.write("                if(number > ");
      out.print(product.getQuantity());
      out.write(") number = ");
      out.print(product.getQuantity());
      out.write(";\n");
      out.write("                inputNumber.setAttribute(\"value\", number)\n");
      out.write("            })\n");
      out.write("\n");
      out.write("            btnTru.addEventListener('click', function(){\n");
      out.write("                number--;\n");
      out.write("                if(number<=0) number = 0;\n");
      out.write("                inputNumber.setAttribute(\"value\", number)\n");
      out.write("            })\n");
      out.write("            \n");
      out.write("            \n");
      out.write("      \n");
      out.write("        // xử lý với ảnh\n");
      out.write("            const imgs = document.querySelectorAll('.body_img_multi-img--js')\n");
      out.write("            function addAllClassDisable(){\n");
      out.write("                for (const img of imgs) {\n");
      out.write("                    img.classList.add('body_img_multi-img--disable')\n");
      out.write("                }\n");
      out.write("            }    \n");
      out.write("            const img1 = document.querySelector('.image-1')\n");
      out.write("            const img2 = document.querySelector('.image-2')\n");
      out.write("            const img3 = document.querySelector('.image-3')\n");
      out.write("            const img4 = document.querySelector('.image-4')\n");
      out.write("\n");
      out.write("            const imgshow = document.querySelector('.image-show')\n");
      out.write("            var pathImg1 = img1.getAttribute('src')\n");
      out.write("            imgshow.setAttribute('src', pathImg1);\n");
      out.write("                \n");
      out.write("            function showImg4(){\n");
      out.write("                addAllClassDisable()\n");
      out.write("                img4.classList.remove('body_img_multi-img--disable')\n");
      out.write("                var pathImg4 = img4.getAttribute('src')\n");
      out.write("                imgshow.setAttribute('src', pathImg4);\n");
      out.write("            }\n");
      out.write("            function showImg3(){\n");
      out.write("                addAllClassDisable()\n");
      out.write("                img3.classList.remove('body_img_multi-img--disable')\n");
      out.write("                var pathImg3 = img3.getAttribute('src')\n");
      out.write("                imgshow.setAttribute('src', pathImg3);\n");
      out.write("            }\n");
      out.write("            function showImg2(){\n");
      out.write("                addAllClassDisable()\n");
      out.write("                img2.classList.remove('body_img_multi-img--disable')\n");
      out.write("                var pathImg2= img2.getAttribute('src')\n");
      out.write("                imgshow.setAttribute('src', pathImg2);\n");
      out.write("            }\n");
      out.write("            function showImg1(){\n");
      out.write("                addAllClassDisable()\n");
      out.write("                img1.classList.remove('body_img_multi-img--disable')\n");
      out.write("                var pathImg1 = img1.getAttribute('src')\n");
      out.write("                imgshow.setAttribute('src', pathImg1);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            img1.addEventListener('click', showImg1)\n");
      out.write("            img2.addEventListener('click', showImg2)\n");
      out.write("            img3.addEventListener('click', showImg3)\n");
      out.write("            img4.addEventListener('click', showImg4)\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("news");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${NewsLimit}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li class=\"subnav__item__li subnav__item__li--chan\">\n");
          out.write("                                                <img class=\"subnav__item__img--new\" src=\"./images/news/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                <div class=\"sbnav__item__descripts sbnav__item__descripts--new\">\n");
          out.write("                                                    <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${news.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                </div>\n");
          out.write("                                            </li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("c");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllColor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("s");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllSize}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setVar("c");
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllColor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setVar("s");
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllSize}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllComments!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_8.setVar("cmts");
    _jspx_th_c_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllComments}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
      if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"row show_name-cmt\">\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmts.namUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"show_star-cmt\">\n");
          out.write("                                                ");
          if (_jspx_meth_c_forEach_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_8, _jspx_page_context, _jspx_push_body_count_c_forEach_8))
            return true;
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"row show__cmt\">\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmts.comment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_8.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_8);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_9.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_8);
    _jspx_th_c_forEach_9.setBegin(1);
    _jspx_th_c_forEach_9.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cmts.star}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_9.setVarStatus("no");
    int[] _jspx_push_body_count_c_forEach_9 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_9 = _jspx_th_c_forEach_9.doStartTag();
      if (_jspx_eval_c_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <i class=\"fa-solid fa-star\"></i>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_9.doFinally();
      _jspx_tagPool_c_forEach_varStatus_end_begin.reuse(_jspx_th_c_forEach_9);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllComments == null || AllComments=='' || AllComments.isEmpty()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <span>Chưa có đánh giá nào</span>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
    _jspx_th_c_set_0.setScope("request");
    _jspx_th_c_set_0.setVar("check_num");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check_id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_10);
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setVar("check_id");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
