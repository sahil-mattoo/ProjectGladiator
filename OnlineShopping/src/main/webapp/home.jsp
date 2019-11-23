<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link rel="stylesheet" href="homepage.css" type="text/css">

</head>
<body>
   
<ul>
  <li><a href="home.html">Home</a></li>
  <li><a href="#profile">Profile</a></li>
  <li id="log"><a href="#Login">Login</a></li>
  <li id="log"><a href="shoppingCart.html"><img src="cartnew1.jpg" height="45" width="50"></li></a>

  <li id="search"><input type="text" placeholder="Search for Products"></li>
</ul>

  <br>

<!--Images for slider-->
<div>
     <table> -
     <c:forEach items="${ shopProduct }"  var="p">
      <tr><td> ${ p.productName } </td>
        <td>${ p.productPrice } </td>
        <td>${ p.brand } </td>
        <td> ${ p.productDescription }  </td>
    </tr>
   </c:forEach></table>
   

</div>

<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}
</script>

<br>






<br>
<br>
<br>


<footer>All Rights Reserved by  ©RS3</footer>
</body>
</html>

