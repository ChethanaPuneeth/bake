<%-- 
    Document   : add
    Created on : Dec 7, 2013, 1:13:12 PM
    Author     : MSLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Items</title>
    </head>
    <body bgcolor="FFCCFF">
        <h1 align="center">Welcome Admin</h1>
        <p align="right"><a href="AdminHomePage.jsp">Home</a></p>
        <h3>Add New Items</h3>
        <form action="SubmitItemController">
        <table border="0">
            <tr>
                <th>Item Code</th>
                <th>Item Name</th>
                <th>Item Price</th>
                <th>Quantity</th>
                <th>Item MFD</th>
            </tr>
            <tr>
                <td><input type="text" name="itemCode"></td>
                <td><input type="text" name="itemName"></td>
                <td><input type="text" name="itemPrice"></td>
                <td><input type="text" name="Quantity"></td>
                <td><input type="text" name="itemMfd"></td>
            </tr>
            <tr>
                <td colspan="4"><input type="submit" value="Submit"/>
                    <input type="reset" value="Reset"/></td>
            </tr>
        </table>
        </form>
    </body>
</html>
