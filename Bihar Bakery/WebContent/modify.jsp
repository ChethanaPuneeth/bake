<%-- 
    Document   : modify
    Created on : Dec 7, 2013, 3:04:41 PM
    Author     : MSLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modify Items</title>
    </head>
    <body bgcolor="#6A5ACD">
        <table align="center">
            <tr>
                <td width="900"><h2 align="center">Modify Items</h2></td>
                <td align="right"><p align="right"><a href="AdminHomePage.jsp">Home</a></p></td>
            </tr>
        </table>
        <form action="DisplayController">
            <table align="center">
                <tr>
                    <td>Enter the Item Code</td>
                </tr>
                <tr>
                    <td><input type="text" name="code"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
