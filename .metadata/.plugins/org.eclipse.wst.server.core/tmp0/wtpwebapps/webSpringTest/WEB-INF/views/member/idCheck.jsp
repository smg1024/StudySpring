<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- parameter로 넘어온 변수 : username -->
<style>
	.topMenu, .bottomMenu{
		display:none;
	}
	b{
		color:blue;
		text-decoration:underline;
	}
</style>
<script>
 	$(function(){
		$("#idCheckForm").submit(function(){
			if($("#username").val()==""){
				alert("아이디를 입력하세요.");
				return false;
			}
			return true;
		});
	});
	
	function setUsername(success){
		// DB검색해서 사용 가능한 아이디 회원등록Form에 표시하고
		opener.document.getElementById("username").value = success;
		opener.document.getElementById("idCheckStatus").value = "Y";
		
		// window 닫기
		window.close();
	}
	
	/* onsubmit='return idCheck' */
/* 	function idCheck(){
		if(document.getElementById("username").value = ""){
			alert("아이디를 입력하세요.");
			return false;
		}else{
			return true;
		}
	} */
</script>
<title>아이디 중복확인</title>
<div>
	<div>
		<!-- 사용 가능 -->
		<c:if test="${ result==0 }">
			<b>${ username }</b>는 사용 가능한 아이디입니다.
			<input type="button" value="사용하기" onclick="setUsername('${ username }')">
		</c:if>
		<!-- 사용 불가능 -->
		<c:if test="${ result==1 }">
			${ username }는 사용 불가한 아이디입니다.
		</c:if>
	</div>
	<hr>
	<div>
		<form action="/myapp/member/idCheck" id="idCheckForm">
			아이디 입력 : <input type="text" name="username" id="username" value="${ param.username }">
			<input type="submit" value="중복확인">
		</form>
	</div>
</div>