<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- attribute로 넘어온 변수 : list -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.topMenu, .bottomMenu{
		display:none;
	}
</style>
<script>
	$(function(){
		// 도로명을 입력 후 주소 검색
		$("#zipcodeForm").submit(function(){
			if($("#street").val()==""){
				alert("도로명을 입력하세요.");
				return false;
			}
			return true;
		});
		
		// 우편번호와 주소를 회원가입 Form에 표시하기
		$("#list>li").click(function(){
			// 이벤트가 발생한 li태그의 내용을 얻어오기
			var zipAddr = $(this).text();
			var zipcode = zipAddr.substring(0,5);
			var addr = zipAddr.substring(6);
			
			// 회원가입 Form에 표시
			opener.document.getElementById("zipcode").value = zipcode;
			opener.document.getElementById("addr").value = addr;
			opener.document.getElementById("detailaddr").value = "";
			
			// 팝업 닫기
			self.close();
		});
	});
</script>
<title>우편번호 검색</title>
<style>
	li:hover{
		text-decoration:underline;
		font-weight:bold;
	}
</style>
</head>
<body>
	<div id="zipDiv">
		도로명을 입력 후 우편번호를 검색하세요.<br>
		(예:학동로77길)<br>
		<form id="zipcodeForm" action="/myapp/member/searchZipcode">
			도로명 : <input type="text" name="street" id="street">
			<input type="submit" value="검색">
		</form>
		<hr>
		<ul id="list">
			<c:if test="${ list!=null }">
				<!-- 30062 세종특별자치시 마음로322길, (고운동 1387-0 가락마을22단지) -->
				<c:forEach var="vo" items="${ list }">
					<li>${ vo.zipcode } ${ vo.city } ${ vo.street }${ vo.bldg1 }길, (${ vo.dong } ${ vo.num1 }<c:if test="${ vo.num2>0 }">-${ vo.num2 }</c:if> ${ vo.bldgname })</li>
				</c:forEach>
			</c:if>
		</ul>
	</div>
</body>
</html>