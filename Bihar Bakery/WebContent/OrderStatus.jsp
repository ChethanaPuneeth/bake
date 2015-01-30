<%-- 
    Document   : OrderStatus
    Created on : Dec 10, 2013, 8:53:26 PM
    Author     : MSLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Status</title>
                             <input type="submit" value="Home" onclick="window.location.href='CustomerView.jsp'"/>
        
    </head>
    <body bgcolor="DCE6E5">
        <h2>Check Your Status</h2>
        <form action="StatusController">
            <table align="center" border="0">
                <tr>
                    <td>Enter The Order Number</td>
                    <td><input type="text" name="statusCode"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>

<% String msg=request.getParameter("msg");
if(msg!=null){%>
<label><font color="red"><%=msg%></font></label>
<%}%>

<% String msg11=request.getParameter("msg1");
if(msg11!=null){%>
<label><font color="green"><%=msg11%></font></label>
<%}%>