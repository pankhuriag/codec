package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class HomeLoan_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Home Loans</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write(".active{\r\n");
      out.write("  color: #ffa500;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("     hr {\r\n");
      out.write("  height:0; \r\n");
      out.write("  border:0; \r\n");
      out.write("  border-top:1px solid #083972; \r\n");
      out.write("}\r\n");
      out.write("    .modal-header, .close\r\n");
      out.write("    {\r\n");
      out.write("      background-color: #191970;\r\n");
      out.write("      color:white !important;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      font-size: 30px;\r\n");
      out.write("    }\r\n");
      out.write("    .modal-footer {\r\n");
      out.write("      background-color: #191970;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .button{\r\n");
      out.write("  background-color: #FFFFFF;\r\n");
      out.write("  border-color: transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button2\r\n");
      out.write("{\r\n");
      out.write("  background-color: #191970;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */\r\n");
      out.write("    .row.content {height: 1500px}\r\n");
      out.write("    \r\n");
      out.write("    /* Set gray background color and 100% height */\r\n");
      out.write("    .sidenav {\r\n");
      out.write("      background-color: #f1f1f1;\r\n");
      out.write("      height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    /* Set black background color, white text and some padding */\r\n");
      out.write("    footer {\r\n");
      out.write("      background-color: #555;\r\n");
      out.write("      color: white;\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .navbar{\r\n");
      out.write("margin-bottom: 0;\r\n");
      out.write("border-radius: 0;\r\n");
      out.write("background-color: #FF8C00;\r\n");
      out.write("border-color: transparent;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".font{\r\n");
      out.write("padding-top: 7px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button1{\r\n");
      out.write("    width: 300px;\r\n");
      out.write("}\r\n");
      out.write("    \r\n");
      out.write("    /* On small screens, set height to 'auto' for sidenav and grid */\r\n");
      out.write("    @media screen and (max-width: 767px) {\r\n");
      out.write("      .sidenav {\r\n");
      out.write("        height: auto;\r\n");
      out.write("        padding: 15px;\r\n");
      out.write("      }\r\n");
      out.write("      .row.content {height: auto;} \r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("  <p class=\"font\"><font size=\"5\" color=\"white\">&nbsp&nbsp&nbsp&nbsp<u>LOANTRIC</u></font>\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class=\"col-xs-6\">\r\n");
      out.write("    <form class=\"navbar-form navbar-left\">\r\n");
      out.write("      <div class=\"input-group\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" size=\"40\" placeholder=\"Search\" name=\"search\">\r\n");
      out.write("        <div class=\"input-group-btn\">\r\n");
      out.write("          <button class=\"btn btn-default\" type=\"submit\">\r\n");
      out.write("            <i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("          </button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("  <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("<li><a href=\"#\"  data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-check\" style=\"color: white\"></span>&nbsp&nbsp<font color=\"white\">Check Eligibility</font></a>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("    \r\n");
      out.write("      <!-- Modal content-->\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\" style=\"padding:35px 50px;\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-ok\"></span> Eligibility-Check</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\r\n");
      out.write("        ");

            String driverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/loans";
            String user = "root";
            String psw = "root";

            Connection con = null;
            PreparedStatement ps1 = null;
            
            String lnid1=request.getParameter("id1");
            String lnid2=request.getParameter("id2");

            PreparedStatement ps2 = null;
            PreparedStatement ps3 = null;
            ResultSet rs2 = null;
            ResultSet rs3 = null;

            String wallet1 = null;
            String wallet2 = null;
            String wallet3 = null;
    
            try
            {
                Class.forName(driverName);
                con = DriverManager.getConnection(url,user,psw);
                String sql1 = "SELECT * FROM loans.all_loans";
                ps1 = con.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
        
        
      out.write("\r\n");
      out.write("        <form class=\"form-signin\" method=\"post\" action=\"loandisplay.jsp\">\r\n");
      out.write("    <div style=\"padding-bottom: 20px\">\r\n");
      out.write("    <p style=\"font-size: 20px;color: #7c3168;font-weight: bold;\">Select Loan Scheme :</p>\r\n");
      out.write("        <select name=\"id1\">\r\n");
      out.write("        ");

            while(rs1.next())
            {
                String fname1 = rs1.getString("Loan_Name");
                String id1 = rs1.getString("LoanID");
        
      out.write("\r\n");
      out.write("        <option value=\"");
      out.print(id1 );
      out.write('"');
      out.write('>');
      out.print(fname1 );
      out.write("</option>\r\n");
      out.write("        ");

            }
            rs1.close();
}catch(SQLException sqe)
        { 
            out.println(sqe);
        }
        
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <p style=\"font-size: 20px;color: #7c3168;font-weight: bold;\">Salary :</p>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"salary\" placeholder=\"Enter Your Salary\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-top: 25px\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success btn-block button1\"><span class=\"glyphicon glyphicon-check\"></span> Check Eligibility</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left button\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\" style=\"color: black\"></span><font color=\"black\"><b> Cancel</b></font></button>\r\n");
      out.write("            </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</li>\r\n");
      out.write("<li><a href=\"wishlist.jsp\"><span class=\"glyphicon glyphicon-usd\" style=\"color: white\"></span>&nbsp&nbsp<font color=\"white\">Wallet</font></a></li>\r\n");
      out.write("<li><a href=\"homepage.jsp\" style=\"color: white\"><span class=\"glyphicon glyphicon-log-in\"></span>&nbsp&nbsp<font color=\"white\">Logout</font></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <div class=\"row content\">\r\n");
      out.write("    <div class=\"col-sm-2 sidenav\">\r\n");
      out.write("        <br>\r\n");
      out.write("      <!--<h4><font face=\"Berlin sans fb demi\"><b>LOANTRIC</b></font></h4>-->\r\n");
      out.write("      <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("        <li class=\"btn btn-warning\"><font color=\"white\"><b>Home Loan</b></font></li>\r\n");
      out.write("        <li><a href=\"AgriLoan.jsp\"><b>Agriculture Loan</b></a></li>\r\n");
      out.write("        <li><a href=\"EduLoan.jsp\"><b>Education Loan</b></a></li>\r\n");
      out.write("        <li><a href=\"PersonalLoan.jsp\"><b>Personal Loan</b></a></li>\r\n");
      out.write("        <li><a href=\"OtherLoan.jsp\"><b>Others</b></a></li>\r\n");
      out.write("        <!--<br>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <li><a href=\"#\"><b>Compare</b></a></li>-->\r\n");
      out.write("      </ul><br>\r\n");
      out.write("      <!--<div class=\"input-group\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search Blog..\">\r\n");
      out.write("        <span class=\"input-group-btn\">\r\n");
      out.write("          <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("            <span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("        </span>\r\n");
      out.write("      </div>-->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-sm-9\">\r\n");
      out.write("      <!--<h4><small>RECENT POSTS</small></h4>\r\n");
      out.write("      <hr>-->\r\n");
      out.write("      <h2>Aditya Birla Housing Finance LTD (ABHF)</h2>\r\n");
      out.write("      <!--<h5><span class=\"glyphicon glyphicon-time\"></span> Post by Jane Dane, Sep 27, 2015.</h5>\r\n");
      out.write("      <h5><span class=\"label label-danger\">Food</span> <span class=\"label label-primary\">Ipsum</span></h5><br>-->\r\n");
      out.write("      <h4>\r\n");
      out.write("        The Aditya Birla Group is in the League of Fortune 500. Anchored by an extraordinary force of over 120,000 employees, belonging to 42 nationalities. Over 50 per cent of its revenues flow from its overseas operations spanning 35 countries.\r\n");
      out.write("        <br>\r\n");
      out.write("        Loan tenture upto 30 years.Quick and transparent processing.Door step services.Choose between simple EMIs or structured repayements.Nil pre-payement charges for floating rate homeloans.Attractive balance transfer option available.\r\n");
      out.write("      </h4>\r\n");
      out.write("      <br>\r\n");
      out.write("      <form name=\"id\" method=\"post\" action=\"walletaddtry.jsp\">\r\n");
      out.write("          <input type=\"hidden\" name=\"loanname\" value=\"Aditya Birla Housing Finance Ltd\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#myModal1\">Add to Wallet</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      <!-- Modal -->\r\n");
      out.write("      <div class=\"modal fade\" id=\"myModal1\" role=\"dialog\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("    \r\n");
      out.write("      <!-- Modal content-->\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("          <h4 class=\"modal-title\"><font color=\"white\">Successfully added to wallet!</font></h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <hr width=\"100%\">\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("      <!--<h4><small>RECENT POSTS</small></h4>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <h2>Officially Blogging</h2>\r\n");
      out.write("      <h5><span class=\"glyphicon glyphicon-time\"></span> Post by John Doe, Sep 24, 2015.</h5>\r\n");
      out.write("      <h5><span class=\"label label-success\">Lorem</span></h5><br>-->\r\n");
      out.write("      <h2>ICICI Home Finance Company LTD</h2>\r\n");
      out.write("      <h4>\r\n");
      out.write("        As one of the largest Home Loan financiers in India, ICICI go the extra mile to make your dreams come true. Be it attractive interest rates, simplified paperwork or faster processing, you get your loan easily, quickly and just the way you need it.\r\n");
      out.write("        <br>\r\n");
      out.write("        Doorstep service.Speedy loan sanction.Simplified documentation.Attractive interest rate options: Floating Rate, Fixed Rate or Part-fixed and Part-floating Rate.  \r\n");
      out.write("        Loan amounts ranging from Rs. 3 lakh to Rs. 3 crore.Sanction prior to selection of property.Insurance options for your Home Loan at attractive premium.Free Personal Accident Insurance.Guidance throughout the process\r\n");
      out.write("      </h4>\r\n");
      out.write("      <br>\r\n");
      out.write("      <form name=\"id\" method=\"post\" action=\"walletaddtry.jsp\">\r\n");
      out.write("          <input type=\"hidden\" name=\"loanname\" value=\"ICICI Home Finance Company Ltd\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#myModal1\">Add to Wallet</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      <div class=\"modal fade\" id=\"myModal1\" role=\"dialog\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("    \r\n");
      out.write("      <!-- Modal content-->\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("          <h4 class=\"modal-title\"><font color=\"white\">Successfully added to wallet!</font></h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <hr width=\"100%\">\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("      <h2>Reliance Home Finance LTD (RHF)</h2>\r\n");
      out.write("      <h4>\r\n");
      out.write("        Reliance Group is among India's top private sector business houses serving over 250 million customers across telecommunications, power, financial services, infrastructure, media, entertainment and healthcare sectors.\r\n");
      out.write("        <br>\r\n");
      out.write("        Provision to Apply and get Home Loan Sanctioned online.Sanction within 48 hours of Application.Higher loan eligibility for an un-identified property.Competitive Interest Rate.Simplified Documentation.Customized Loan Solutions.Door Step Service by well trained staff.Balance Transfer and Top up facility available at attractive Rate of Interest. Processing Loans eligible for Credit Linked Subsidy as per under Pradhan Mantri Awas Yojana (PMAY).More than 1000 Approved Projects.Online management of Loan account.\r\n");
      out.write("      </h4>\r\n");
      out.write("      <br>\r\n");
      out.write("      <form name=\"id\" method=\"post\" action=\"walletaddtry.jsp\">\r\n");
      out.write("          <input type=\"hidden\" name=\"loanname\" value=\"Reliance Home Finance Ltd\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#myModal1\">Add to Wallet</button>\r\n");
      out.write("      </form>\r\n");
      out.write("      <div class=\"modal fade\" id=\"myModal1\" role=\"dialog\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("    \r\n");
      out.write("      <!-- Modal content-->\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("          <h4 class=\"modal-title\"><font color=\"white\">Successfully added to wallet!</font></h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br><br>\r\n");
      out.write("      <hr width=\"100%\">\r\n");
      out.write("      <a class=\"btn btn-warning btn-lg button1\" href=\"homeloan-select.jsp\"><b>Compare Home Loans</b></a>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"container-fluid\">\r\n");
      out.write("  <p><font face=\"TIMES NEW ROMAN\">THANK YOU FOR VISITING!!</font></p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
