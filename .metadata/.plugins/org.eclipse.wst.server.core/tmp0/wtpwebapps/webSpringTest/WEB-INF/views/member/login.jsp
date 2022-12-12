<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">
	<h1>로그인</h1>
	<form method="post" action="/myapp/member/loginOk">
		<ul>
			<li>아이디 : <input type="text" name="username" id="username" maxlength="15" placeholder="아이디를 입력하세요."></li>
			<li>비밀번호 : <input type="password" name="password" id="password" placeholder="비밀번호를 입력하세요."></li>
			<li><input type="submit" value="로그인"></li>
		</ul>
	</form>
</div>