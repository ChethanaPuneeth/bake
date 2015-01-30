
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registeration</title>
        <script type="text/javascript">
                 function validate()
                 {
                    if(document.form1.custName.value=="")
                    {
                        alert("please provide your name!");
                        document.form1.custName.focus();
                        return false;
                    }
                    if(document.form1.phNumber.value==""||isNaN(document.form1.phNumber.value)||document.form1.phNumber.value.length!=10)
                    {
                        alert("Please enter Phone Number!");
                        document.form1.phNumber.focus();
                        return false;
                    }
                    return (true);
                 }
</script>
    </head>
    <body bgcolor="lightblue">
        <h1 align="center">Welcome to Bihar Bakery</h1><br/>
        <h1 align="center">Registration Page</h1>
        <form action="RegisterationController" method="post" name="form1" onsubmit="javascript:return validate();">
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="custName"/></td>
                </tr>
                <tr>
                    <td>Phone Number</td>
                    <td><input type="text" name="phNumber"/></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><textarea  rows="4" cols="18" name="address"></textarea></td>
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
