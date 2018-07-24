<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>amazingkart Web Application</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script> 
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

 <link rel="stylesheet" href="resources/css/bootstrap.css">

<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/cloud-zoom.css" />" rel="stylesheet">

<link rel="stylesheet" href="resources/css/style.css">  

<script src="<c:url value="/resources/js/jquery-3.2.0.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<script src="<c:url value="/resources/js/CustomJS.js" />"></script>

 <script src="resources/js/jquery-3.2.0.js"></script>
<script src="resources/js/bootstrap.js"></script>
<style type="text/css">
body{
    background: url("http://mdbootstrap.com/img/Photos/Others/img%20(42).jpg")no-repeat center center;
    background-size: cover;
   
}

</style> 
</head>
<body>
	
	<jsp:include page="Menu.jsp"></jsp:include>
	<div class="container-fluid">
	</div>

	

	<c:if test="${isAdmin=='true'}">
		<jsp:include page="admin/adminHome.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${isUserClickedProductByCategory=='true'}">
		<jsp:include page="CategoryProducts.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${isUserCheckedOut=='true'}"> 
		<jsp:include page="user/checkOut.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${isUserClickedCart=='true'}">
		<jsp:include page="user/myCart.jsp"></jsp:include>
	</c:if>

	<c:if test="${isAdminClickedCategories=='true' }">
		<jsp:include page="admin/Category.jsp"></jsp:include>
		<div class="container col-sm-offset-3 col-sm-9" style="color: green">${cMessage}</div>
		<div class="container col-sm-offset-3 col-sm-9" style="color: green">${categoryMessage}</div>
	</c:if>
	
	<c:if test="${isAdminClickedSuppliers=='true' }">
		<jsp:include page="admin/Supplier.jsp"></jsp:include>
		<div class="container col-sm-offset-3 col-sm-9" style="color: green">${sMessage}</div>
		<div class="container col-sm-offset-3 col-sm-9" style="color: green">${supplierMessage}</div>
	</c:if>

	<c:if test="${isAdminClickedProducts=='true' }">
		<jsp:include page="admin/Product.jsp"></jsp:include>
		<div class="container col-sm-offset-3 col-sm-9" style="color: green">${pMessage}</div>
	</c:if>
	
	<c:if test="${isAdminClickedContactUs=='true' }">
		<jsp:include page="admin/AdminContactUs.jsp"></jsp:include>
		<div class="container col-sm-offset-3 col-sm-9" style="color: green">${contactUsMessage}</div>
	</c:if>
	
	<c:if test="${isUserSelectedProduct=='true'}">
		<jsp:include page="ProductPage.jsp"></jsp:include>
	</c:if>

	<c:if test="${isUserClickedContactUs=='true' }">
		<jsp:include page="ContactUs.jsp"></jsp:include>
	</c:if>

	<c:if test="${isUserClickedLogin=='true'}">
		<jsp:include page="Login.jsp"></jsp:include>
	</c:if>

	<c:if test="${isUserClickedRegistration=='true'}">
		<jsp:include page="Register.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${isUserAtHomePage=='true'}">
		<jsp:include page="Carousel.jsp"></jsp:include>
		<jsp:include page="AllProducts.jsp"></jsp:include>
	</c:if>

	
	<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>