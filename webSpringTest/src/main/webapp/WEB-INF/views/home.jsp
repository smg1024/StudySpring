<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<div class="container">
		<h1 style="text-align:center"><a href="/myapp/ajaxView">풀떼기 화이팅!</a></h1>
		<a href="/myapp/img/ddance.gif" download><img src="<%= request.getContextPath() %>/img/ddance.gif" width="80%" style="padding:50px;"></a>
		<a href="/myapp/img/newyork.jpg" download>다운로드(gif, png,, jpg, pdf, xls, ppt,...,zip, exe 등)</a>
	</div>
</body>
</html>
