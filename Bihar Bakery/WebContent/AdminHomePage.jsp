<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home </title>
    </head>
    <body >
    
        <h1 align="left"> Welcome Admin </h1>
        <table align="right" border="0">
            <tr>
            	<td><input type="button" value="View Orders" onclick="window.location.href='PendingOrdersController'"/><br>
                <input type="button" value="Add Item" onclick="window.location.href='add.jsp'"/><br>
                <input type="button" value="Delete Item" onclick="window.location.href='delete.jsp'"/><br>
              <!--   <input type="button" value="Modify Item" onclick="window.location.href='DisplayController'"/><br> -->
                <input type="button" value="Sign Out" onclick="window.location.href='index.jsp'"/></td><br>
            </tr>
        </table>
        <img src=admin.jpg  width=86% align="left""/>
    </body>
</html>
<% String msg=request.getParameter("msg");
if(msg!=null){%>
<label><font color="red"><%=msg%></font></label>
<%}%>
<% String msg1=request.getParameter("msg1");
if(msg1!=null){%>
<label><font color="green"><%=msg1%></font></label>
<%}%>