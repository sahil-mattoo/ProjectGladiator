<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${ product.getProductName() } 
${ product.getProductPrice() } <br />
${ product.getBrand() } <br />
${ product.getProductDescription() } <br />
<a href="addToCart.lti?pid=${ product.productId }">Add to Cart</a>

</body>
</html>