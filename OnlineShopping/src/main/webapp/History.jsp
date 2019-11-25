<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table,tr,td {
  border: 1px solid black;
}
</style>
    <title>Retailer Homepage</title>
  <link rel="stylesheet" href="homepage.css" type="text/css">
  <link href='Login.css' rel='stylesheet' type='text/css'>

</head>
<body>
<ul>
    <li><a href="#user"><label>Welcome User</label></a></li>
     <form id="form1" action="displayAllProducts.lti" method="get">
    <li><a href="#viewProducts" onclick="document.getElementById('form1').submit();">View Products</a></li>
     </form>
     
        <form id="form2" action="RetailerAddProduct.lti" method="get">
    <li><a href="#addproducts" onclick="document.getElementById('form2').submit();">Add Products</a></li>
     </form>
     
    <li><a href="#orders">Orders</a></li>
    <li><a href="#inventory">Update Inventory</a></li>
    <li id="log"><a href="retailer_login.html">Logout</a></li>
    
    
</ul>
<br><br><br>


<table style="width:100%">
<tr>
<td>Order ID</td>
<td>Order Date</td>
<td>Order Status</td>
</tr>

<c:forEach items="${ orders }" var="c">
<tr>

<td> ${ c.orderId }  </td>
<td> ${ c.orderDate } </td>
<td> ${ c.status } </td>

</tr>
</c:forEach>
</table>



</form>
</div>


</body>
</html>