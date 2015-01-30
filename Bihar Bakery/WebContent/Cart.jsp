<%-- 
    Document   : Cart
    Created on : Dec 9, 2013, 6:35:31 PM
    Author     : MSLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,com.bakery.beans.*"%>
<%
    ArrayList<Display> al = (ArrayList<Display>)request.getAttribute("itemCatalogue");
    Iterator itr = al.iterator();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
        <script>
        function validate()
        {
        	
          if(document.form1.phoneno.value==""||isNaN(document.form1.phoneno.value)||document.form1.phoneno.value.length!=10)
           {
               alert("Please enter Phone Number!");
               document.form1.phoneno.focus();
               return false;
           }
          if(document.form1.address.value=="")
          {
              alert("Please enter address!");
              document.form1.address.focus();
              return false;
          }
           return (true);
        }
       
        </script>
    </head>
    <%-- <body  bgcolor=dimgrey>
             <h2 align="left"> <input type="submit" value="Home" onclick="window.location.href='CustomerView.jsp'"/></h2>
        <h2 align="Center">Cart</h2><img src=cart1.jpg width=40% height=40%  align="right""/>
        <h3>Items Selected</h3>
				   <!-- <table border="1">
				      <thead>
				        <th>Item Name</th>
				        <th>Item Price</th>
				        <th>Item MFD</th>
				        <th>Selct Quantity</th>
				        <th>Total Price</th>
				      </thead>
      
           <tbody> -->
        <% 
          int i=0;
        int ctotal=0;
          while(itr.hasNext())
          {
            Display display = (Display)itr.next();
            int a=Integer.parseInt(display.getQuantity());
            int b=Integer.parseInt(display.getitemPrice());
            int total=a*b;
             ctotal=ctotal+total;
            i++;
        %>
            <tr>
                <td><%=display.getitemName() %></td>
                <td><%=display.getQuantity() %></td>
                <td><%=display.getitemMfd() %></td>
                <td><%=display.getQuantity() %></td>
                <td><%=total %></td>
            </tr>
            
        <% } %>
        <tr>
            <td colspan=4 align=right>TOTAL PRICE </td>
            <td><%=ctotal %></td>
            </tr>
          </tbody>
        </table> --%>
        
        <form action="AddressUpdateController" method="post" name="form1" onsubmit="javascript:return validate();">
        <h1 aligh="centre"> DETAILS </h1>
            <table align="center">
                <tr>
                    <td>Address</td>
                   <td><input type="text" name="address"/></td>
                   </tr>
                   <tr>
                 <td>Contact Number</td>
                    <td><input type="text" name="phoneno"/></td>
                </tr>
                <tr align="center">
                    <td colspan="2"><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form>
<a href="PlaceOrder.jsp">Back</a>
    </body>
</html>
