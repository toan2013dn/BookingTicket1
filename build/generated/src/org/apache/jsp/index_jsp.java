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
      out.write("<body class=\"main-layout\">\n");
      out.write("  <!-- loader  -->\n");
      out.write("  <div class=\"loader_bg\">\n");
      out.write("    <div class=\"loader\"><img src=\"images/loading.gif\" alt=\"#\" /></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- end loader --> \n");
      out.write("  <!-- header -->\n");
      out.write("  <header>\n");
      out.write("    <!-- header inner -->\n");
      out.write("    <div class=\"header-top\">\n");
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
      out.write("                      <li class=\"active\"> <a href=\"index.html\">Home</a> </li>\n");
      out.write("                  \n");
      out.write("                      <li> <a href=\"about.html\">About</a> </li>\n");
      out.write("                      <li> <a href=\"./concert\">Concerts </a> </li>\n");
      out.write("                      <li> <a href=\"gallery.html\">Gallery</a> </li>\n");
      out.write("                      <li> <a href=\"contact.html\">Contact</a> </li>\n");
      out.write("      \n");
      out.write("                      <li > <a   href=\"login.html\">login</a> </li>\n");
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
      out.write("                      <li class=\"action-profile\">\n");
      out.write("                        <div class=\"profile\" onclick=\"menuToggle();\">\n");
      out.write("                          <img src=\"images/up.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"menu-profile\">\n");
      out.write("                          <h3>Son Tung<br><span>MTP</span></h3>\n");
      out.write("                          <ul>\n");
      out.write("                            <li><img src=\"images/user.png\"><a href=\"profile.html\">My profile</a></li>\n");
      out.write("                            <li><img src=\"images/edit.png\"><a href=\"profile.html\">Edit profile</a></li>\n");
      out.write("                            <li><img src=\"images/question.png\"><a href=\"about.html\">Help</a></li>\n");
      out.write("                            <li><img src=\"images/log-out.png\"><a href=\"###\">Log out</a></li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                      </li>\n");
      out.write("                     </ul>\n");
      out.write("                   </nav>\n");
      out.write("                \n");
      out.write("               </div> \n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("     </div>\n");
      out.write("     <!-- end header inner -->\n");
      out.write("\n");
      out.write("     <!-- end header -->\n");
      out.write("     <section class=\"slider_section\">\n");
      out.write("      <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"carousel-item active\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"carousel-caption\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"text-bg\">\n");
      out.write("                      <span>The Best</span>\n");
      out.write("                      <h1>SINGER EVER</h1>\n");
      out.write("                      <p>Son Tung MTP is a talented singer in many different genres of music. He once achieved a score of 25.5 at the Ho Chi Minh City Conservatory, the valedictorian score at that time.</p>\n");
      out.write("                      <a href=\"#\">Music & Entertainment</a>\n");
      out.write("                      <a href=\"#\" id=\"button\" class=\"button\"> Buy Tickets </a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("\n");
      out.write("            <div class=\"container \">\n");
      out.write("              <div class=\"carousel-caption\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"text-bg\">\n");
      out.write("                        <span>The Best</span>\n");
      out.write("                      <h1>LIVE SHOW EVER</h1>\n");
      out.write("                      <p>Son Tung's most impressive saying clearly shows his personality: \"If you want to sit in a position that no one can sit, you must bear the feeling that no one can stand.\" </p>\n");
      out.write("                      <a href=\"https://mtpentertainment.com/gallery/\">Music & Entertainment</a><a href=\"#\" id=\"button\">Buy Tickets </a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <i class=\"fa fa-long-arrow-left\" aria-hidden=\"true\"></i>\n");
      out.write("     \n");
      out.write("    </a>\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("        <i class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></i>\n");
      out.write("      \n");
      out.write("    </a>\n");
      out.write("   </div>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("</section>\n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("<!-- pop -->\n");
      out.write("<div class=\"bg-modal\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"close\">\n");
      out.write("        +\n");
      out.write("      </div>\n");
      out.write("      <img src=\"images/logo.png\" alt=\"\">\n");
      out.write("      <form action=\"\">\n");
      out.write("        <input class=\"pop\" type=\"text\" placeholder=\"Ticket\">\n");
      out.write("        <input class=\"pop\" type=\"text\" placeholder=\"E-mail\">\n");
      out.write("        <a href=\"cart.html\" id=\"button\" class=\"buttonBuy\">Buy</a>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- pop -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- about  -->\n");
      out.write("<div id=\"about\" class=\"about\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row display_boxflex\">\n");
      out.write("      <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("        <div class=\"about-box\">\n");
      out.write("          <h2>About Us</h2>\n");
      out.write("          <p>We are passionate people who always accompany you, we are here to make it easy for you to interact with your idols. Contact us to book your tickets today.</p>\n");
      out.write("          <a href=\"https://mtpentertainment.com/\">Read More</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("        <div class=\"about-box\">\n");
      out.write("          <figure><img src=\"images/about.png\" alt=\"#\" /></figure>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- end abouts -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- upcoming -->\n");
      out.write("<div id=\"upcoming\" class=\"upcoming\">\n");
      out.write("  <div class=\"container-fluid padding_left3\">\n");
      out.write("    <div class=\"row display_boxflex\">\n");
      out.write("      <div class=\"col-xl-5 col-lg-5 col-md-5 col-sm-12\">\n");
      out.write("       <div class=\"box_text\">\n");
      out.write("          <div class=\"titlepage\">\n");
      out.write("            <h2>Upcoming Concerts</h2>\n");
      out.write("          </div>\n");
      out.write("          <p>If you have been through Skytour on MTP entertainment or on Netflix and want to see it live once. So don't worry, at the end of this year, Son Tung plans to make a big music show around Vietnam called Skytour2. Let's wait together. </p>\n");
      out.write("          <a href=\"concerts.html\">Read More</a>\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("    \n");
      out.write("      <div class=\"col-xl-7 col-lg-7 col-md-7 col-sm-12 border_right\">\n");
      out.write("         <div class=\"upcomimg\">\n");
      out.write("           <figure><img src=\"images/up.jpg\" alt=\"#\"/></figure>\n");
      out.write("        </div>\n");
      out.write("          </div>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- end upcoming -->\n");
      out.write("\n");
      out.write("<!-- Gallery -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"gallery\" class=\"Gallery\">\n");
      out.write("  <div class=\"container\"> \n");
      out.write("    <div class=\"row display_boxflex\">\n");
      out.write("      <div class=\"col-xl-8 col-lg-8 col-md-8 col-sm-12\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 margi_bott\">\n");
      out.write("            <div class=\"Gallery_img\">\n");
      out.write("              <figure><img src=\"images/Gallery1.jpg\" alt=\"#\"/></figure>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"hover_box\">\n");
      out.write("             \n");
      out.write("              <ul class=\"icon_hu\">\n");
      out.write("                 <h3>Work night</h3>\n");
      out.write("                <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("                 <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 margi_bott\">\n");
      out.write("            <div class=\"Gallery_img\">\n");
      out.write("              <figure><img src=\"images/Gallery2.jpg\" alt=\"#\"/></figure>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"hover_box\">\n");
      out.write("             \n");
      out.write("              <ul class=\"icon_hu\">\n");
      out.write("                 <h3>\"Muon roi ma sao con\"</h3>\n");
      out.write("                <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("                 <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12 margi_bott1\">\n");
      out.write("            <div class=\"Gallery_img\">\n");
      out.write("              <figure><img src=\"images/Gallery3.jpg\" alt=\"#\"/></figure>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"hover_box\">\n");
      out.write("             \n");
      out.write("              <ul class=\"icon_hu\">\n");
      out.write("                 <h3>Korea</h3>\n");
      out.write("                <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("                 <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-12\">\n");
      out.write("            <div class=\"Gallery_img\">\n");
      out.write("              <figure><img src=\"images/Gallery4.jpg\" alt=\"#\"/></figure>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"hover_box\">\n");
      out.write("             \n");
      out.write("              <ul class=\"icon_hu\">\n");
      out.write("                 <h3>Music night</h3>\n");
      out.write("                <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("                 <li><a href=\"#\"><img src=\"icon/h.png\" alt=\"#\"/></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("        <div class=\"Gallery_text\">\n");
      out.write("          <div class=\"titlepage\">\n");
      out.write("            <h2>Gallery</h2>\n");
      out.write("          </div>\n");
      out.write("          <p>Here are some images related to Son Tung MTP. Let's have a look together.</p>\n");
      out.write("          <a href=\"https://mtpentertainment.com/gallery/\">Read More</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- end Gallery --> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                <input class=\"newslatter\" placeholder=\"ENTER YOUR MAIL\" type=\"text\" name=\" ENTER YOUR MAIL\">\n");
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
      out.write("                            <a href=\"#\"><img src=\"icon/call.png\" alt=\"#\" /></a>+840932542806 </li>\n");
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
      out.write("          <script src=\"js/modalHome.js\"></script>\n");
      out.write("          <script src=\"js/search.js\"></script>\n");
      out.write("          <script src=\"js/profile-box.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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
}
