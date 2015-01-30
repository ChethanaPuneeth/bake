<%-- 
    Document   : delete
    Created on : Dec 7, 2013, 3:04:51 PM
    Author     : MSLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Item</title>
    </head>
    <body>
        <h2 align="center">Delete Item</h2>
        <p align="right"><a href="AdminHomePage.jsp">Home</a></p>
        <h3>Enter the item code to be delete</h3>
        <form action="DeleteController">
        <table border="0">
            <tr>
                <th>Item Code</th>
            </tr>
            <tr>
                <td><input type="text" name="itemCode"/></td>
            </tr>
            <tr>
                <td colspan="4"><input type="submit" value="Submit"/>
                    <input type="reset" value="Reset"/></td>
            </tr>
        </table>
        </form>
    </body>
</html>
