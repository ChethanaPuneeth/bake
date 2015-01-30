<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.bakery.beans.*"%>
<%
    ArrayList<Order> al = (ArrayList<Order>)request.getAttribute("ordersPending");
    Iterator itr = al.iterator();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Pending Orders</title>
</head>
<body>
   <h3>View Pending Orders</h3>
   <h2>Orders</h2>
   <form action="AcceptOrRejectOrderController">
	   <table border="1">
	      <thead>
	         <th>User</th>
	         <th>Address</th>
	         <th>Item Name</th>
	         <th>item Price</th>
	         <th>Quantity</th>
	         <th>Status</th>
	         
	      </thead>
	      </body>
	         <% 
             int i=0;
	          while(itr.hasNext())
	          {
	            Order order = (Order)itr.next();
	            i++;
	        %>
	             <tr>
	                <input type="hidden" name="orderId<%=i %>" value="<%=order.getItemCode() %>">
	                <input type="hidden" name="quantity<%=i %>" value="<%=order.getQuantity() %>">
	                <input type="hidden" name="ItemName<%=i %>" value="<%=order.getItemName() %>">
	                <td><%=order.getUsername() %></td>
	                <td><%=order.getAddress() %></td>
	                <td><%=order.getItemName() %></td>
	                <td><%=order.getItemPrice() %></td>
	                <td><%=order.getQuantity() %></td>
	                <td><select name="status<%=i %>">
	                       <option value="PENDING">PENDING</option>
	                       <option value="DELIVERED">DELIVERED</option>
	                      <!--  <option value="ACCEPT">ACCEPT</option>
	                       <option value="REJECT">REJECT</option>  -->
	                    </select>
	                </td>
	            </tr>
	        <%}
	        %>
	        <input type="hidden" name="totalOrders" value="<%=i %>">
	        <tr>
	          <td colspan="5" align="center">
	              <input type="submit" name="submit">
	          </td>
	        </tr>
	      </tbody>
	   </table>
	   <a href="AdminHomePage.jsp">Back</a>
   </form>
   </body>
</html>