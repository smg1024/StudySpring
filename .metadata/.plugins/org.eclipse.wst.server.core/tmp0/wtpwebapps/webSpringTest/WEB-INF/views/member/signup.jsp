<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
	$(function(){
		$("#idCheck").click(function(){
			if($("#username").val()!=""){
				window.open("/myapp/member/idCheck?username="+$("#username").val(),"idCheck","width=500px, height=400px");
			}else{
				alert("아이디를 입력해주세요.")
			}
		});
		
		$("#username").keyup(function(){
			$("#idCheckStatus").val("N");
		});
	});
</script>
<title>회원가입</title>
<div class="container">
	<h1>회원가입 Form</h1>
	<form method="post" action="/myapp/member/signup">
		<ul>
			<li>아이디</li>
			<li>
				<input type="text" name="username" id="username">
				<input type="button" value="중복확인" id="idCheck">
				<input type="hidden" value="N" id="idCheckStatus">
			</li>
			<li>비밀번호</li>
			<li><input type="password" name="password" id="password"></li>
			<li>비밀번호 확인</li>
			<li><input type="password" name="v-password" id="v-password"></li>
			<li>이름</li>
			<li><input type="text" name="name" id="name"></li>
			<li>연락처</li>
			<li>
				<input type="text" name="tel1" id="tel1">-
				<input type="text" name="tel2" id="tel2">-
				<input type="text" name="tel3" id="tel3">
			</li>
			<li>이메일</li>
			<li><input type="text" name="email" id="email"></li>
			<li>우편번호</li>
			<li>
				<input type="text" name="zipcode" id="zipcode">
				<input type="button" value="우편번호 찾기">
			</li>
			<li>주소</li>
			<li><input type="text" name="addr" id="addr"></li>
			<li>상세주소</li>
			<li><input type="text" name="detailaddr" id="detailaddr"></li>
			<li><input type="submit" value="회원가입"></li>
		</ul>
	</form>
</div>