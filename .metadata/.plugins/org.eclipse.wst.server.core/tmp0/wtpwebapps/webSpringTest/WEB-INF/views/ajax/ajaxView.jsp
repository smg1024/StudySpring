<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>ajaxView.jsp</title>
<script>
	$(function(){
		// 비동기식으로 서버에 접속하여 문자열을 결과값으로 얻어오기
		$("#ajaxString").click(function(){
			var params = "num=12&name=홍길동";
			$.ajax({
				url:"/myapp/ajaxString",	// 매핑주소
				data:params,	// 서버로 보내는 데이터(parameter)
				type:"GET",		// 전송 방식(GET, POST)
				success:function(result){	// 서버에서 정상 응답했을 때
					// append() : 마지막에 추가
					// prepends() : 제일 앞에 추가
					$("#ajaxResult").append(result);
				},error:function(e){	// 서버에서 응답받지 못했을 때
					console.log(e.responseText);
				}
			});
		});
		
		$("#ajaxObject").click(function(){
			var params = {
					username:"세종대왕",
					tel:"010-9701-5637",
					age:25
			};
			var url = "/myapp/ajaxObject";
			
			$.ajax({
				url:url,
				data:params,
				dataType:"json",
				type:"GET",
				success:function(result){
					var tag = "<ol>";
					tag += "<li>번호 : " + result.postno + "</li>";
					tag += "<li>제목 : " + result.subject + "</li>";
					tag += "<li>작성자 : " + result.username + "</li>";
					tag += "</ol>";
					$("#ajaxResult").append(tag);
				},error:function(e){
					console.log(e.responseText);
				}
			});
		});
		
		// 비동기식으로 서버에 접속하여 List받아오기
		$("#ajaxList").click(function(){
			
			$.ajax({
				url:"/myapp/ajaxList",
				data:{nowPage:2},
				type:"GET",
				success:function(result){
					// console.log(result);
					// List의 객체를 순차적으로 접근하기 위해서 $(result)한다
					var $result = $(result);
					var tag = "<ul>";
					
					$result.each(function(idx, obj){
						tag += "<li>" + obj.postno + "</li>";
						tag += "<li>" + obj.subject + "</li>";
						tag += "<li>" + obj.regdate + "</li>";
					});
					tag += "</ul>";
					
					$("#ajaxResult").append(tag);
				},error:function(e){
					console.log(e.responseText);
				}
			});
		});
		
		// 비동기식으로 Map객체 얻어오기
		$("#ajaxMap").click(function(){
			
			$.ajax({
				url:"/myapp/ajaxMap",
				success:function(result){
					// console.log(result);
					var tag = "<ul>";
					tag += "<li>총 데이터 수 : " + result.totalData + "</li>";
					tag += "<li>메시지 : " + result.msg + "</li>";
					tag += "<li>글 번호 -> " + result.vo.postno + "<br>";
					tag += "글 제목 -> " + result.vo.subject + "<br>";
					tag += "작성일 -> " + result.vo.regdate + "</li>";
					
					$("#ajaxResult").append(tag);
				},error:function(e){
					console.log(e.responseText);
				}
			});
			
		});
	});
</script>
<div class="container">
	<h1>AJAX : 동기식, 비동기식으로 요청처리</h1>
	<pre>
		pom.xml에서 gson프레임워크 추가
	</pre>
	<div>
		<input type="button" value="String" id="ajaxString">
		<input type="button" value="Object" id="ajaxObject">
		<input type="button" value="List" id="ajaxList">
		<input type="button" value="Map" id="ajaxMap">
	</div>
	<div id="ajaxResult"></div>
</div>