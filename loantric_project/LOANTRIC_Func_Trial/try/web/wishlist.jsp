<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>wallet</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>

.text{
  text-align: "center";
}

.button{
  background-color: #FFFFFF;
  border-color: transparent;
}
.button1
{
  background-color: #191970;
}

 .modal-header, h4, .close {
      background-color: #191970;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #191970;
  }

footer {
      background-color: #191970;
      color: white;
      padding-top: 8px;
    }
.font{
padding-top: 7px;
}

.navbar{
margin-bottom: 0;
border-radius: 0;
background-color: #FF8C00;
border-color: transparent;

}

table th, td{
    border-spacing: 5px;
    border: 3px solid black;
    border-radius:6px;
    border-collapse: separate;
    width: 940px;
    padding: 30px;
}


</style>
<body>
<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
  <p class="font"><font size="5" color="white">&nbsp&nbsp&nbsp&nbsp<u>LOANTRIC</u></font>
    </div>
     <div class="col-xs-6">
    <form class="navbar-form navbar-left">
      <div class="input-group">
        <input type="text" class="form-control" size="40" placeholder="Search" name="search">
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
    </form>
  </div>
  <ul class="nav navbar-nav navbar-right">
<li><a href="#"  data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-check" style="color: white"></span>&nbsp&nbsp<font color="white">Check Eligibility</font></a>

<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:35px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-ok"></span> Eligibility-Check</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form">
      <div class="form-group">
              <label for="fname"><span class="glyphicon glyphicon-user"></span> First name</label>
              <input type="text" class="form-control" id="fname" placeholder="First name">
            </div>
            <div class="form-group">
              <label for="lname"><span class="glyphicon glyphicon-user"></span> Last name</label>
              <input type="text" class="form-control" id="lname" placeholder="Last name">
            </div>
            <div class="form-group">
              <label for="emi"><span class="glyphicon glyphicon-envelope"></span> Email-id</label>
              <input type="text" class="form-control" id="emi" placeholder="Email">
            </div>
      <div class="form-group">
              <label for="npsw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="password" class="form-control" id="npsw" placeholder="Password">
            </div>
      <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Re-enter Password</label>
              <input type="password" class="form-control" id="psw" placeholder="Re-enter Password">
            </div>
              <a onclick="window.location.href='#'" type="submit" class="btn btn-success btn-block button1"><span class="glyphicon glyphicon-check"></span> Check Eligibility</a>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left button" data-dismiss="modal"><span class="glyphicon glyphicon-remove" style="color: black"></span><font color="black"><b> Cancel</b></font></button>
            </div>
      </div>s

</li>
<li><a href="#">&nbsp&nbsp<font color="white">Compare</font></a></li>
<li><a href="project.html" style="color: white"><span class="glyphicon glyphicon-log-in"></span>&nbsp&nbsp<font color="white">Logout</font></a></li>
</ul>
</p>
  </div>
</nav>
	
<br>
<div class="container text-center">
  <h1><font face="calibri">MY WALLET</font></h1>
  <hr width=100%>
</div>
<br><br><br>

    <%
    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/loans";
    String user = "root";
    String psw = "root";
    String lnid1=request.getParameter("id1");
    String lnid2=request.getParameter("id2");
    
    Connection con = null;
    PreparedStatement ps1 = null;
    PreparedStatement ps2 = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
   
    String wallet1 = null;
    String wallet2 = null;
    String wallet3 = null;
    try
    {
        Class.forName(driverName);
        con = DriverManager.getConnection(url,user,psw);
        
        String sql1 = "SELECT * FROM customer.custdata WHERE CustID=1";
        
        ps1 = con.prepareStatement(sql1);
        
        rs1 = ps1.executeQuery();
        
        if(rs1.next())
        {
            wallet1 = rs1.getString("Wallet_1");
            if(wallet1!=null)
            {
    %>
            <table align="center">        
            <tr><td><h3><%=wallet1%></h3></td></tr>
            </table><br>
            <%
            }
        }
        rs1.beforeFirst();
        if(rs1.next())
        {
            wallet2 = rs1.getString("Wallet_2");
            if(wallet2!=null)
            {
    %>
            <table align="center">        
            <tr><td><h3><%=wallet2%></h3></td></tr>
            </table><br>
            <%
            }
        }
            rs1.beforeFirst();
            if(rs1.next())
                {
                    wallet3 = rs1.getString("Wallet_3");
                    if(wallet3!=null)
                    {
            %>
            <table align="center">        
            <tr><td><h3><%=wallet3%></h3></td></tr>
            </table><br>
            <%
                }
            }
           
    }catch(SQLException sqe)
        { 
            out.println(sqe);
        }
    %>
</table>
</div>

</body>
</html>