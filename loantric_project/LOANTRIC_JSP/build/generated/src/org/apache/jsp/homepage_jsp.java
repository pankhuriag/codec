package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Loantric</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".mh{\n");
      out.write("  background-color: #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  .modal-header, h4, .close {\n");
      out.write("      background-color: #5cb85c;\n");
      out.write("      color:white !important;\n");
      out.write("      text-align: center;\n");
      out.write("      font-size: 30px;\n");
      out.write("  }\n");
      out.write("  .modal-footer {\n");
      out.write("      background-color: #f9f9f9;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("\n");
      out.write(".shiftimg{\n");
      out.write("\tmargin-left:201px;\n");
      out.write("\t}\n");
      out.write(".thumbnail{\n");
      out.write(" display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("}\n");
      out.write(".font{\n");
      out.write("padding-top: 7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar{\n");
      out.write("margin-bottom: 0;\n");
      out.write("border-radius: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbarcolor{\n");
      out.write("background-color: #FF8C00;\n");
      out.write("border-color: transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write("textcolor{\n");
      out.write("color: #00000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" footer {\n");
      out.write("      background-color: #191970;\n");
      out.write("      color: white;\n");
      out.write("      padding-top: 8px;\n");
      out.write("    }\n");
      out.write("  .carousel-inner > .item > img,\n");
      out.write("  .carousel-inner > .item > a > img {\n");
      out.write("      width: 30%;\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse navbarcolor\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <p class=\"font\"><font size=\"5\" color=\"white\">&nbsp&nbsp&nbsp&nbsp<u>LOANTRIC</u></font>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-xs-6\">\n");
      out.write("    <form class=\"navbar-form navbar-left\"  action=\"searchtry.jsp\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" size=\"40\" placeholder=\"Search\" name=\"search\">\n");
      out.write("        <div class=\"input-group-btn\">\n");
      out.write("          <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("            <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\t<ul class=\"nav navbar-nav navbar-right textcolor\">\n");
      out.write("<li><a href=\"login.html\"><span class=\"glyphicon glyphicon-check\" style=\"color:white\"></span>&nbsp&nbsp<font color=\"white\">Check Eligibility</font></a></li>\n");
      out.write("<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal1\"><span class=\"glyphicon glyphicon-usd\" style=\"color:white\"></span>&nbsp&nbsp<font color=\"white\">Wallet</font></a>\n");
      out.write("<!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal1\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\" modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("          <p>Please Login</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span> Cancel</button>\n");
      out.write("          <a href=\"login.html\" type=\"submit\" class=\"btn btn-primary btn-default pull-right\"><span class=\"glyphicon glyphicon-user\"></span> Login</a>\n");
      out.write("          \n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("</li>\n");
      out.write("<li><a href=\"#\"  data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-user\"style=\"color:white\"></span>&nbsp&nbsp<font color=\"white\">Sign-up</font></a>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-user\"></span>Sign-up</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("            <form role=\"form\" action=\"signupinsert.jsp\">\n");
      out.write("\t\t  <div class=\"form-group\">\n");
      out.write("              <label for=\"fname\"><span class=\"glyphicon glyphicon-user\"></span> First name</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"fname\" placeholder=\"First name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"lname\"><span class=\"glyphicon glyphicon-user\"></span> Last name</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"lname\" placeholder=\"Last name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"emi\"><span class=\"glyphicon glyphicon-envelope\"></span> Email-id</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"emi\" placeholder=\"Email\">\n");
      out.write("            </div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("              <label for=\"npsw\"><span class=\"glyphicon glyphicon-eye-open\"></span> Password</label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" name=\"npsw\" placeholder=\"Password\">\n");
      out.write("            </div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("              <label for=\"psw\"><span class=\"glyphicon glyphicon-eye-open\"></span> Re-enter Password</label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" name=\"psw\" placeholder=\"Re-enter Password\">\n");
      out.write("            </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success btn-block\"><span class=\"glyphicon glyphicon-off\"></span> Sign-up</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span> Cancel</button>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("</li>\n");
      out.write("<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal11\"><span class=\"glyphicon glyphicon-log-in\"style=\"color:white\"></span>&nbsp&nbsp<font color=\"white\">Login</font></a>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write(" <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal11\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-lock\"></span> Login</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("            <form role=\"form\" action=\"login-check.jsp\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"inputEmail\" placeholder=\"Enter email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"psw\"><span class=\"glyphicon glyphicon-eye-open\"></span> Password</label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" name=\"inputPassword\" placeholder=\"Enter password\">\n");
      out.write("            </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success btn-block\"><span class=\"glyphicon glyphicon-off\"></span> Login</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\"></span> Cancel</button>\n");
      out.write("          <p><a href=\"#\">Forgot Password?</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\"#myBtn\").click(function(){\n");
      out.write("        $(\"#myModal\").modal();\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("  </div>\n");
      out.write("</p>\n");
      out.write("</nav>\n");
      out.write("<div class=\"row-content\">\n");
      out.write("<ul class=\"nav nav-pills nav-justified\">\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("      <a class=\"btn\" href=\"login.html\"><font color=\"#191970\"><b>Home loans</b></font></a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("        <a class=\"btn\" href=\"login.html\"><font color=\"#191970\"><b>Agriculture loans</b></font></a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("      <a class=\"btn\" href=\"login.html\"><font color=\"#191970\"><b>Education loans</b></font></a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("      <a class=\"btn\" href=\"login.html\"><font color=\"#191970\"><b>Personal loans</b></font></a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("      <a class=\"btn\" href=\"login.html\"><font color=\"#191970\"><b>Others</b></font></a>\n");
      out.write("    </li>\n");
      out.write("    </ul></div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("  <br>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\t\t<div class=\"item active\">\n");
      out.write("        <img src=\"p1.jpg\" alt=\"Chania\" width=\"10%\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <!--<h3>Chania</h3>\n");
      out.write("          <p>The atmosphere in Chania has a touch of Florence and Venice.</p>-->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"p2.jpg\" alt=\"Flower\" width=\"10%\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <!--<h3>Flowers</h3>\n");
      out.write("          <p>Beautiful flowers in Kolymbari, Crete.</p>-->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"p3.jpg\" alt=\"Flower\" width=\"10%\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <!--<h3>Flowers</h3>\n");
      out.write("          <p>Beautiful flowers in Kolymbari, Crete.</p>-->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"container text-center\">\n");
      out.write("  <h3>LOANTRIC</h3>\n");
      out.write("  <p><em>Get what you desire!!</em></p>\n");
      out.write("  <p>This website concentrates on giving proper information on all loans under government.</p>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"shiftimg\">\n");
      out.write(" <div class=\"row\" >\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("        <a href=\"p1.jpg\" target=\"_blank\">\n");
      out.write("          <img src=\"p1.jpg\" alt=\"Lights\" class=\"img-responsive\" style=\"width:87%\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("        <a href=\"p2.jpg\" target=\"_blank\">\n");
      out.write("          <img src=\"p2.jpg\" alt=\"Nature\" class=\"img-responsive\" style=\"width:100%\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"thumbnail\">\n");
      out.write("        <a href=\"p3.jpg\" target=\"_blank\">\n");
      out.write("          <img src=\"p3.jpg\" alt=\"Fjords\" class=\"img-responsive\" style=\"width:100%\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\t<footer class=\"container-fluid text-center\">\n");
      out.write("  <p>T&C applied | Disclaimer | Fair Practices | Code of Commitment | Privacy | Customer Services Policy</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
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
