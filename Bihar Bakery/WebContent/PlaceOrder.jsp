<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.bakery.beans.*"%>
<%
    ArrayList<Display> al = (ArrayList<Display>)request.getAttribute("itemCatalogue");
    Iterator itr = al.iterator();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Place Order</title>
<script type="text/javascript">
   function EnableQuantityTextBox(itemId)
   {
	     var textBox = document.getElementById("q"+itemId);
	     if(textBox.disabled)
	    	 {
	    	  textBox.disabled=false;
	    	  textBox.style.display="block";
	    	 }
	     else
	    	 {
	    	  textBox.disabled=false;
	       		textBox.style.display="block";
	    	 }
	     
	     var checkBox=document.getElementById(selected);
   }
   function getSelected(opt) {
       var selected = new Array();
       var index = 0;
     (opt.length);
       for (var i = 0; i < opt.length; i++) 
        {
          if ((opt[i].selected) ||
              (opt[i].checked)) 
           {
             index = selected.length;
             var id = i+1;

             var quantity = document.getElementById("q"+id).value; 
             var itemId = document.getElementById("l"+id).innerHTML;
             var value = itemId+"-"+quantity;

             selected[index] = new Object();
             selected[index].value =value;
             selected[index].index = i;
          }
       }
       return selected;
    }

    function computeSelected() {

   	
    	 var checkbox = document.getElementsByName("selected");
      var selected = getSelected(checkbox);
      var allSelected = "";
       for (var item in selected)       
    	   allSelected += selected[item].value + "#";

       document.getElementById("selectedItems").value = allSelected;

    }
</script>
</head>
<body bgcolor="dimblue">
  <h2 align="left"> <input type="submit" value="Home" onclick="window.location.href='CustomerView.jsp'"/></h2>

<img src=orders.jpg  width= 200 height=400 align="right"/>
   <h3 align="center">Select the Items</h3>
   <table>
      <thead>
        <th></th>
        <th>Item Name</th>
        <th>Item Quantity</th>
        <th></th>
        <th>Item MFD</th>
        <th></th>
        <th>Item Price</th>
        <th></th>
        <th>Select Quantity</th>
      </thead>
      
      <tbody>
        <% 
          int i=0;
          while(itr.hasNext())
          {
        	   Display display = (Display)itr.next();
        	   i++;
        %>
            <tr>
                <td><input type='checkbox' name='selected' onchange="EnableQuantityTextBox(<%=i %>)"/></td>
                <td><label id="l<%=i %>"><%=display.getitemName() %></label></td>
                <td><%=display.getitemPrice() %></td>
                <td></td>
                <td><%=display.getitemMfd() %></td>
                <td></td>
                <td><%=display.getQuantity() %></td>
                <td></td>
                <td>
                 <input type="text" id="q<%=i %>" disabled="disabled" style="display:block">
                </td>
            </tr>
        <% }
        %>
        <tr>
           <td colspan="5" align="center">
               <form action="InsertOrderController" method="post"> 
                   <input type="hidden" name="selectedItems" id="selectedItems">
                   <input type="submit" value="submit" onclick="computeSelected()">
               </form>
           </td>
        </tr>
      </tbody>
   </table>
</body>
</html>