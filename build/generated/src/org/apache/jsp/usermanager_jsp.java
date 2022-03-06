package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usermanager_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/ad77abeb9b.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc !=null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("        <div class=\"container-x1\">\n");
      out.write("            <div class=\"table-title\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <h1>MTB's User Management</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-7\">\n");
      out.write("                        <a href=\"#\" class=\"btn btn-secondary\">\n");
      out.write("                            <i class=\"fa-solid fa-square-plus\"></i>\n");
      out.write("                            <span>Add New User</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <table class=\"table table-striped table-hover\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>#</th>\n");
      out.write("<!--                    <th>Name</th> -->\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Phone</th>\n");
      out.write("                    <th>Manage</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <div><td>Name</td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div> \n");
      out.write("                <div><td>Email</td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div> \n");
      out.write("                <div><td>Phone</td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.phonenumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.phonenumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div> \n");
      out.write("                    <td>D</td>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-info btn-circle btn-lg btn-circle\"><i class=\"fa fa-key\"></i> </button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-info btn-circle btn-lg btn-circle ml-2\"><i class=\"fa fa-trash\"></i> </button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-info btn-circle btn-lg btn-circle ml-2\"><i class=\"fa fa-edit\"></i> </button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-info btn-circle btn-lg btn-circle ml-2\"><i class=\"fa fa-upload\"></i> </button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </c:if>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
