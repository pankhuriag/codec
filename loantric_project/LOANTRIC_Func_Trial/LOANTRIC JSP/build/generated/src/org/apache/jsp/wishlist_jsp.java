package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class wishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>wallet</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".text{\n");
      out.write("  text-align: \"center\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button{\n");
      out.write("  background-color: #FFFFFF;\n");
      out.write("  border-color: transparent;\n");
      out.write("}\n");
      out.write(".button1\n");
      out.write("{\n");
      out.write("  background-color: #191970;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" .modal-header, h4, .close {\n");
      out.write("      background-color: #191970;\n");
      out.write("      color:white !important;\n");
      out.write("      text-align: center;\n");
      out.write("      font-size: 30px;\n");
      out.write("  }\n");
      out.write("  .modal-footer {\n");
      out.write("      background-color: #191970;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("footer {\n");
      out.write("      background-color: #191970;\n");
      out.write("      color: white;\n");
      out.write("      padding-top: 8px;\n");
      out.write("    }\n");
      out.write(".font{\n");
      out.write("padding-top: 7px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar{\n");
      out.write("margin-bottom: 0;\n");
      out.write("border-radius: 0;\n");
      out.write("background-color: #FF8C00;\n");
      out.write("border-color: transparent;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("table th, td{\n");
      out.write("    border-spacing: 5px;\n");
      out.write("    border: 3px solid black;\n");
      out.write("    border-radius:6px;\n");
      out.write("    border-collapse: separate;\n");
      out.write("    width: 940px;\n");
      out.write("    padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("  <p class=\"font\"><font size=\"5\" color=\"white\">&nbsp&nbsp&nbsp&nbsp<u>LOANTRIC</u></font>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"col-xs-6\">\n");
      out.write("    <form class=\"navbar-form navbar-left\" action=\"searchtry.jsp\">\n");
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
      out.write("  <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("<li><a href=\"#\"  data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-check\" style=\"color: white\"></span>&nbsp&nbsp<font color=\"white\">Check Eligibility</font></a>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4><span class=\"glyphicon glyphicon-ok\"></span> Eligibility-Check</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
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
        
        
      out.write("\n");
      out.write("        <form class=\"form-signin\" method=\"post\" action=\"loandisplay.jsp\">\n");
      out.write("    <div style=\"padding-bottom: 20px\">\n");
      out.write("    <p style=\"font-size: 20px;color: #7c3168;font-weight: bold;\">Select Loan Scheme :</p>\n");
      out.write("        <select name=\"id1\">\n");
      out.write("        ");

            while(rs1.next())
            {
                String fname1 = rs1.getString("Loan_Name");
                String id1 = rs1.getString("LoanID");
        
      out.write("\n");
      out.write("        <option value=\"");
      out.print(id1 );
      out.write('"');
      out.write('>');
      out.print(fname1 );
      out.write("</option>\n");
      out.write("        ");

            }
            rs1.close();
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <br><br>\n");
      out.write("        <p style=\"font-size: 20px;color: #7c3168;font-weight: bold;\">Salary :</p>\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"salary\" placeholder=\"Enter Your Salary\">\n");
      out.write("        </div>\n");
      out.write("        <div style=\"margin-top: 25px\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success btn-block button1\"><span class=\"glyphicon glyphicon-check\"></span> Check Eligibility</button>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"submit\" class=\"btn btn-danger btn-default pull-left button\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\" style=\"color: black\"></span><font color=\"black\"><b> Cancel</b></font></button>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</li>\n");
      out.write("<li><a href=\"homepage.jsp\" style=\"color: white\"><span class=\"glyphicon glyphicon-log-in\"></span>&nbsp&nbsp<font color=\"white\">Logout</font></a></li>\n");
      out.write("</ul>\n");
      out.write("</p>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\t\n");
      out.write("<br>\n");
      out.write("<div class=\"container text-center\">\n");
      out.write("  <h1><font face=\"calibri\">MY WALLET</font></h1>\n");
      out.write("  <hr width=100%>\n");
      out.write("</div>\n");
      out.write("<br><br><br>\n");
      out.write("\n");
      out.write("    ");

        String sql2 = "SELECT * FROM customer.custdata WHERE CustID=1";
        
        ps2 = con.prepareStatement(sql2);
        rs2 = ps2.executeQuery();
        
        if(rs2.next())
        {
            wallet1 = rs2.getString("Wallet_1");
            if(wallet1!=null)
            {
    
      out.write("\n");
      out.write("            <table align=\"center\">        \n");
      out.write("            <tr><td><h3>");
      out.print(wallet1);
      out.write("</h3></td></tr>\n");
      out.write("            </table><br>\n");
      out.write("            ");

            }
        }
        rs2.beforeFirst();
        if(rs2.next())
        {
            wallet2 = rs2.getString("Wallet_2");
            if(wallet2!=null)
            {
    
      out.write("\n");
      out.write("            <table align=\"center\">        \n");
      out.write("            <tr><td><h3>");
      out.print(wallet2);
      out.write("</h3></td></tr>\n");
      out.write("            </table><br>\n");
      out.write("            ");

            }
        }
            rs2.beforeFirst();
            if(rs2.next())
                {
                    wallet3 = rs2.getString("Wallet_3");
                    if(wallet3!=null)
                    {
            
      out.write("\n");
      out.write("            <table align=\"center\">        \n");
      out.write("            <tr><td><h3>");
      out.print(wallet3);
      out.write("</h3></td></tr>\n");
      out.write("            </table><br>\n");
      out.write("            ");

                }
            }
           
    }catch(SQLException sqe)
        { 
            out.println(sqe);
        }
    
      out.write("\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
