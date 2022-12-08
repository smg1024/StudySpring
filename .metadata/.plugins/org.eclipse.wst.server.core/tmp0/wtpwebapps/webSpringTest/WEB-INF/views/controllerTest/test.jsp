<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- attribute : name, num -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>controllerTest/test.jsp</title>
</head>
<body>
	<div class="container">
		<ul>
			<li>이름 : ${ name }</li>
			<li>번호 : ${ num }</li>
		</ul>
	</div>
</body>
</html>