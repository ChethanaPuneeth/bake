<%--
    Document   : Registeration
    Created on : Dec 7, 2013, 11:26:50 AM
    Author     : MSLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registeration</title>
        <script type="text/javascript">
                 function validate()
                 {
                    if(document.form1.userName.value=="")
                    {
                        alert("Please select a User Name!");
                        document.form1.userName.focus();
                        return false;
                    }
                    if(document.form1.password.value=="")
                    {
                        alert("Please enter Password!");
                        document.form1.password.focus();
                        return false;
                    }
                     if(document.form1.password1.value=="")
                    {
                        alert("Please re-enter Password!");
                        document.form1.password1.focus();
                        return false;
                    }
                    if(document.form1.password.value!=document.form1.password1.value)
                    {
                        alert("Pasword do not match!");
                        return false;
                    }
                    return (true);
                 }
</script>
    </head>
    <body bgcolor="DCE6E5">
        <h1 align="center">Welcome to Bihar Bakery</h1>
        <form action="RegController" method="post" name="form1" onsubmit="javascript:return validate();">
            <table>
                 <tr>
                    <td>User Name</td>
                    <td><input type="text" name="userName"/></td>
                </tr>
                 <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>Re-Enter Password</td>
                    <td><input type="password" name="password1"/></td>
                </tr>
                <tr>
                    <td colspan="2"align="center"><input type="submit" value="Submit"/>
                        <input type="reset" value="Reset"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
