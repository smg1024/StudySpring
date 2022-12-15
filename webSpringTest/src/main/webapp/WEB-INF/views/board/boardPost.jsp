<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
	function formCheck(){
		if(document.getElementById("subject").value == ""){
			alert("제목을 입력하세요.");
			return false;
		}
		if(document.getElementById("content").value == ""){
			alert("내용을 입력하세요.");
			return false;
		}
		return true;
	}
</script>
<title>글 쓰기</title>
<div class="container">
	<h1>글 쓰기 form</h1>
	<form method="post" action="/myapp/board/boardPostOk" onsubmit="return formCheck()">
		<ul>
			<li>제목</li>
			<li><input type="text" name="subject" id="subject" size="50"></li>
			<li>내용</li>
			<li>
				<textarea name="content" id="content" rows="20" cols="100"></textarea>
			</li>
			<li><input type="submit" value="등록"></li>
		</ul>
	</form>
</div>
