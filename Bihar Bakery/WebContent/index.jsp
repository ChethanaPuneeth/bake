<%--
    Document   : index
    Created on : Jan 13, 2012, 5:43:37 PM
    Author     : DR100623
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <style>
        #header h2{
        width:100%;
        font-family: Viner Hand ITC;
        font-size: 50px;
        color: Brown;
        text-align: center;
       
    
        }
        body
        
        {    font-family: "Trebuchet MS", Verdana, sans-serif;
    font-size: 16px;
    color: #696969;
         background-color:lightblue;
        }
        #formset{color:black;
       
        font-family: Bookman Old Style;
        }
        </style>
        <script type="text/javascript">
                function validate()
                {
                     if(document.main.userName.value=="")
                     {
                         alert("please provide Login ID!");
                         document.main.userName.focus();
                         return false;
                     }
                     if(document.main.password.value=="")
                     {
                         alert("please provide Password!");
                         document.main.password.focus();
                         return false;
                     }
                     return (true);
                }
        </script>
    </head>
    <body bgcolor=#F3E169 >
    <div id ="header" >
  <img src="bake.jpg"  align="left"" width=250 height=250/><h2>BIHAR BAKERY</h2>
        </div>
        
        <div id="formset">
        <form action="LoginController" method="post" name="main" onsubmit="javascript:return validate();">
            <table align=right>
                <tr>
                    <td align=right>Login ID</td>
                    <td align=right><input type="text" name="userName" maxlength=10/></td>
                </tr>
                <tr>
                    <td align=right>Password</td>
                    <td align=right><input type="password" name="password" maxlength=8/></td>
       </tr>
                <tr>
                    <td colspan="2" align=right><input type="submit" value="Login"/><input type="reset" value="Cancel"/></td></tr>
                     <!-- <tr><td colspan="2" align=right>New User?? Then please<input type="button" value="Signup" onclick="window.location.href='Registeration.jsp'"/> </td> -->
                </tr>
            </table>
            <br>
            <br>
            <br>
            <br>
            <p align=right>New User?? Then please<input type="button" value="Signup" onclick="window.location.href='Registeration.jsp'"/> </p>
        </form>
        </div>
        </div>
         </body>
</html>
<% String msg=request.getParameter("msg");
if(msg!=null){%>
<label><font color="red"><%=msg%></font></label>
<%}%>