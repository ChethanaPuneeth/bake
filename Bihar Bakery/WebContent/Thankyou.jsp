<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.bakery.util.DBUtility"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<!-- 
               <input type="submit" value="Home" onclick="window.location.href='CustomerView.jsp'"/>
               <h1>Thank You For Shopping With US</h1>
               <h2>Please make note of this order id for future reference</h2>
               <img src=cart.jpg align="left">
             -->
 <%-- <%
Connection con = DBUtility.getConnection();
PreparedStatement psmt = con.prepareStatement("select OrderID from OrderPlace where Status='PENDING' order by no desc");
ResultSet rs = psmt.executeQuery();
int count=0;
if(rs.next())
{
	 count = rs.getInt("OrderID");
	out.println(count);
}

%>  --%> 
<h1>Thank You</h1> 
<a href="CustomerView.jsp">Back</a>

</body>
</html>
