<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
	.dataDiv{
		overflow:auto;
	}
	.dataDiv>li{
		float:left;
		width:10%;
		height:40px;
		line-height:40px;
		border-bottom:1px solid #ddd;
	}
	.dataDiv>li:nth-child(6n+2) {
		width:50%
	}
</style>
<title>자료실 목록</title>
<div class="container">
	<h1>자료실 목록</h1>
	<div>
		<a href="/myapp/data/dataPost">자료 올리기</a>
	</div>
	<ul class="dataDiv">
		<li>번호</li>
		<li>제목</li>
		<li>작성자</li>
		<li>조회수</li>
		<li>첨부</li>
		<li>등록일</li>

		<li>10</li>
		<li>ㅁㄹㅎㅇㄴㅁ</li>
		<li>포비</li>
		<li>0</li>
		<li>
			<a href="" download><img src="/myapp/img/disk.png"></a>
			<a href="" download><img src="/myapp/img/disk.png"></a>
		</li>
		<li>12-15 16:26</li>
		
		<li>10</li>
		<li>ㅁㄹㅎㅇㄴㅁ</li>
		<li>포비</li>
		<li>0</li>
		<li>
			<a href="" download><img src="/myapp/img/disk.png"></a>
			<a href="" download><img src="/myapp/img/disk.png"></a>
		</li>
		<li>12-15 16:26</li>		
	</ul>
</div>