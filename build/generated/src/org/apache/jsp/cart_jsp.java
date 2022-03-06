package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- basic -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <!-- mobile metas -->\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("  <!-- site metas -->\n");
      out.write("  <title>MTB</title>\n");
      out.write("  <meta name=\"keywords\" content=\"\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <!-- fevicon -->\n");
      out.write("  <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\n");
      out.write("  <!-- bootstrap css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <!-- style css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  <!-- Responsive-->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/responsive.css\">  \n");
      out.write("  <!-- Scrollbar Custom CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("  <!-- Tweaks for older IEs-->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<!-- body -->\n");
      out.write("\n");
      out.write("<body class=\"main-layout contineer_page\">\n");
      out.write("  <!-- loader  -->\n");
      out.write("  <div class=\"loader_bg\">\n");
      out.write("    <div class=\"loader\"><img src=\"images/loading.gif\" alt=\"#\" /></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- end loader -->\n");
      out.write("  <!-- header -->\n");
      out.write("  <header>\n");
      out.write("    <!-- header inner -->\n");
      out.write("     <div class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xl-2 col-lg-2 col-md-2 col-sm-3 col logo_section\">\n");
      out.write("              <div class=\"full\">\n");
      out.write("                <div class=\"center-desk\">\n");
      out.write("                  <div class=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"#\" /></a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-10 col-lg-10 col-md-10 col-sm-9\">\n");
      out.write("              \n");
      out.write("               <div class=\"menu-area\">\n");
      out.write("                <div class=\"limit-box\">\n");
      out.write("                  <nav class=\"main-menu \">\n");
      out.write("                    <ul class=\"menu-area-main\">\n");
      out.write("                      <li class=\"active\"> <a href=\"index.jsp\">Home</a> </li>\n");
      out.write("                  \n");
      out.write("                      <li> <a href=\"about.jsp\">About</a> </li>\n");
      out.write("                      <li> <a href=\"./concert\">Concerts </a> </li>\n");
      out.write("                      <li> <a href=\"gallery.jsp\">Gallery</a> </li>\n");
      out.write("                      <li> <a href=\"contact.jsp\">Contact</a> </li>\n");
      out.write("                      ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                      ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     </ul>\n");
      out.write("                   </nav>\n");
      out.write("                \n");
      out.write("               </div> \n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <!-- end header inner -->\n");
      out.write("\n");
      out.write("     <!-- end header -->\n");
      out.write("     \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- cart -->\n");
      out.write("<div id=\"cart\" class=\"cart\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      \n");
      out.write("    <div class=\"title\">\n");
      out.write("      <h1>Cart</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"cart\">\n");
      out.write("  \n");
      out.write("      <div class=\"products\">\n");
      out.write("  \n");
      out.write("        <div class=\"product\">\n");
      out.write("  \n");
      out.write("          <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("  \n");
      out.write("          <div class=\"product-info\">\n");
      out.write("  \n");
      out.write("            <h3 class=\"product-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("  \n");
      out.write("            <h4 class=\"product-price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.cprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("đ</h4>\n");
      out.write("  \n");
      out.write("            <p class=\"product-quantity\">Số lượng: <input type=\"text\" name=\"qtt\">  \n");
      out.write("            <p class=\"product-remove\">\n");
      out.write("  \n");
      out.write("              <i class=\"fa fa-trash\" aria-hidden=\"true\"></i>\n");
      out.write("  \n");
      out.write("              <a href=\"checkout?cid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <span class=\"remove\">Proceed To Payment</span></a>\n");
      out.write("  \n");
      out.write("            </p>\n");
      out.write("  \n");
      out.write("          </div>\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("      \n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- cart -->\n");
      out.write("\n");
      out.write("    <!--  footer -->\n");
      out.write("    <footr>\n");
      out.write("      <div class=\"footer \">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("              <form class=\"contact_bg\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                <div class=\"titlepage\">\n");
      out.write("                  <h2>Contact us</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <input class=\"contactus\" placeholder=\"Your Name\" type=\"text\" name=\"Your Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <input class=\"contactus\" placeholder=\"Your Email\" type=\"text\" name=\"Your Email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <input class=\"contactus\" placeholder=\"Your Phone\" type=\"text\" name=\"Your Phone\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <textarea class=\"textarea\" placeholder=\"Message\" type=\"text\" name=\"Message\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                  <button class=\"send\">Send</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12 border_top\">\n");
      out.write("              <form class=\"news\">\n");
      out.write("               <h3>E-mail</h3>\n");
      out.write("               <input class=\"newslatter\" placeholder=\"ENTER YOUR MAIL\">\n");
      out.write("                <button class=\"submit\">Subscribe</button>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 \">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 \">\n");
      out.write("                  <div class=\"address\">\n");
      out.write("                    <ul class=\"loca\">\n");
      out.write("                      <li>\n");
      out.write("                        <a href=\"https://www.google.com/maps/place/19+H%E1%BB%93+T%C6%B0%C6%A1ng,+Thanh+Kh%C3%AA+%C4%90%C3%B4ng,+Thanh+Kh%C3%AA,+%C4%90%C3%A0+N%E1%BA%B5ng+550000,+Vietnam/@16.0631575,108.1810338,17z/data=!4m5!3m4!1s0x31421903c1e1af29:0xda107885bb737c88!8m2!3d16.0631575!4d108.1832278\"><img src=\"icon/loc.png\" alt=\"#\" /></a>Locations\n");
      out.write("                   \n");
      out.write("                        <li>\n");
      out.write("                          \n");
      out.write("                            <a href=\"#\"><img src=\"icon/call.png\" alt=\"#\" /></a>+ <input type=\"text\" name=\"not\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.nOt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly required> </li>\n");
      out.write("                          <li>\n");
      out.write("                            <a href=\"#\"><img src=\"icon/email.png\" alt=\"#\" /></a>MTB@gmail.com </li>\n");
      out.write("                          </ul>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                       <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 \">\n");
      out.write("                           <ul class=\"social_link\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                          </ul>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("               <div class=\"container\">\n");
      out.write("              <!-- <div class=\"copyright\">\n");
      out.write("               \n");
      out.write("                  <p>Copyright 2019 All Right Reserved By <a href=\"https://html.design/\">Free  html Templates</a></p>\n");
      out.write("                </div> -->\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </footr>\n");
      out.write("          <!-- end footer -->\n");
      out.write("          <!-- Javascript files-->\n");
      out.write("          <script src=\"js/jquery.min.js\"></script>\n");
      out.write("          <script src=\"js/popper.min.js\"></script>\n");
      out.write("          <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("          <script src=\"js/jquery-3.0.0.min.js\"></script>\n");
      out.write("          <script src=\"js/plugin.js\"></script>\n");
      out.write("          <script src=\"js/modal.js\"></script>\n");
      out.write("          <script src=\"js/search.js\"></script>\n");
      out.write("          <script src=\"js/profile-box.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          <!-- sidebar -->\n");
      out.write("          <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("          <script src=\"js/custom.js\"></script>\n");
      out.write("          <script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <li > <a href=\"./login\">login</a> </li>\n");
        out.write("                      ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <li class=\"search-toggle\">\n");
        out.write("                        <div class=\"search-container\">\n");
        out.write("                          <div id=\"search-group\" class=\"search-group close-search\">\n");
        out.write("                            <div class=\"toggle-target-container\">\n");
        out.write("                              <div class=\"toggle-target\"><input   type=\"text\" class=\"search-text\" placeholder=\"Search\"></div>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"search-button-container\">\n");
        out.write("                              <span class=\"input-group-addon search-button\"><i class=\"fa fa-search\" id=\"search-icon\"></i></span>\n");
        out.write("                            </div>\n");
        out.write("                          </div>\n");
        out.write("                        </div>\n");
        out.write("                      </li>\n");
        out.write("                       ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                      ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      <li class=\"action-profile\">\n");
        out.write("                        <div class=\"profile\" onclick=\"menuToggle();\">\n");
        out.write("                          <img src=\"images/up.jpg\">\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"menu-profile\">\n");
        out.write("                            <h3>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<br><span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></h3>\n");
        out.write("                          <ul>\n");
        out.write("                            <li><img src=\"images/user.png\"><a href=\"profile.jsp\">My profile</a></li>\n");
        out.write("                            <li><img src=\"images/edit.png\"><a href=\"./editprofile\">Edit profile</a></li>\n");
        out.write("                            <li><img src=\"images/question.png\"><a href=\"about.jsp\">Help</a></li>\n");
        out.write("                            <li><img src=\"images/log-out.png\"><a href=\"./logout\">Log out</a></li>\n");
        out.write("                          </ul>\n");
        out.write("                        </div>\n");
        out.write("                      </li>\n");
        out.write("                       ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
