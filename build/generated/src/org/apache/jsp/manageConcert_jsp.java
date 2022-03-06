package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageConcert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xl-2 col-lg-2 col-md-2 col-sm-3 col logo_section\">\n");
      out.write("              <div class=\"full\">\n");
      out.write("                <div class=\"center-desk\">\n");
      out.write("                  <div class=\"logo\">\n");
      out.write("                    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"#\" /></a>\n");
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
      out.write("                      <li> <a href=\"index.html\">Home</a> </li>\n");
      out.write("                   \n");
      out.write("                      <li> <a href=\"about.html\">About</a> </li>\n");
      out.write("                      <li> <a href=\"Concerts.html\">Concerts </a> </li>\n");
      out.write("                      <li> <a href=\"gallery.html\">Gallery</a> </li>\n");
      out.write("                      <li> <a href=\"contact.html\">Contact</a> </li>\n");
      out.write("      \n");
      out.write("                      <li > <a   href=\"login.html\">login</a> </li>\n");
      out.write("                      <!-- <li  > <a  class=\"last_manu\" href=\"#\"><img src=\"images/search_icon.png\" alt=\"#\" /></a> </li> -->\n");
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
      out.write("                      </li>  \n");
      out.write("                      <li class=\"action-profile\">\n");
      out.write("                        <div class=\"profile\" onclick=\"menuToggle();\">\n");
      out.write("                          <img src=\"images/up.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-profile\">\n");
      out.write("                          <h3>Son Tung<br><span>MTP</span></h3>\n");
      out.write("                          <ul>\n");
      out.write("                            <li><img src=\"images/user.png\"><a href=\"account_admin.html\">Account</a></li>\n");
      out.write("                            <li><img src=\"images/edit.png\"><a href=\"concert_admin.html\">Concert</a></li>\n");
      out.write("                            <li><img src=\"images/log-out.png\"><a href=\"###\">Log out</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                      </li>                   \n");
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
      out.write("   \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- <div class=\"backgro_mh\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("        <div class=\"heding\">\n");
      out.write("           <h2>About</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div> -->\n");
      out.write("\n");
      out.write("<!-- about  -->\n");
      out.write("<div id=\"stable\" class=\"stable\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("        <div class=\"about-box\">\n");
      out.write("            <div class=\"sticky-table\">\n");
      out.write("            <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Concert Name</th>\n");
      out.write("                    <th>Number of tickets</th>\n");
      out.write("                    <th>Price of tickets</th>\n");
      out.write("                    <th>Location</th>\n");
      out.write("                    <th>Action </th>\n");
      out.write("                    <th ></th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"o\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div class=\"user\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.nOt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.clocation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <div class=\"col-md-6\"><a href=\"loadConcert?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  class=\"edit\" data-toggle=\"modal\">Edit</a></div>\n");
      out.write("                        <div class=\"col-md-6\"><a href=\"deleteConcert?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  class=\"edit\" data-toggle=\"modal\">Remove</a></div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </c:forEach>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--  footer -->\n");
      out.write("    \n");
      out.write("              <!-- <div class=\"copyright\">\n");
      out.write("               \n");
      out.write("                  <p>Copyright 2019 All Right Reserved By <a href=\"https://html.design/\">Free  html Templates</a></p>\n");
      out.write("                </div> -->\n");
      out.write("\n");
      out.write("          <!-- end footer -->\n");
      out.write("          <!-- Javascript files-->\n");
      out.write("          <script src=\"js/jquery.min.js\"></script>\n");
      out.write("          <script src=\"js/popper.min.js\"></script>\n");
      out.write("          <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("          <script src=\"js/jquery-3.0.0.min.js\"></script>\n");
      out.write("          <script src=\"js/plugin.js\"></script>\n");
      out.write("          <script src=\"js/search.js\"></script>\n");
      out.write("          <script src=\"js/profile-box.js\"></script>\n");
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
}
