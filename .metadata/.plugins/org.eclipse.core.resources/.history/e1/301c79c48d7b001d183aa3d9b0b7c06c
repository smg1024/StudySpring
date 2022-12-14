<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/myapp/js_css/board.css" type="text/css">
<!-- attribute로 넘어온 변수 : list, pvo -->
<title>게시판 목록</title>
<div class="container">
	<h1>게시판 목록</h1>
	<div>
		<a href="/myapp/board/boardPost">글 쓰기</a>
	</div>
	<ul class="boardList">
		<li>No.</li>
		<li>제목</li>
		<li>작성자</li>
		<li>등록일</li>
		<li>조회수</li>
		
		<c:forEach var="vo" items="${ list }">
			<li>${ vo.postno }</li>
			<li class="word-cut"><a href="/myapp/board/boardView?postno=${ vo.postno }">${ vo.subject }</a></li>
			<li>${ vo.username }</li>
			<li>${ vo.regdate }</li>
			<li>${ vo.hitcount }</li>
		</c:forEach>
	</ul>
	<!-- 페이지 처리 -->
	<div class="pagesDiv">
		<ul>
			<!-- prev버튼 -->
			<c:if test="${ pvo.nowPage==1 }">
				<li>prev</li>
			</c:if>
			<c:if test="${ pvo.nowPage>1 }">
				<li><a href="/myapp/board/boardList?nowPage=${ pvo.nowPage-1 }">prev</a></li>
			</c:if>
			<!-- 페이지 번호 출력 -->
			<c:forEach var="i" begin="${ pvo.startPage }" end="${ pvo.startPage+pvo.pageCount-1 }">
				<!-- 출력할 페이지번호(i)는 총 페이지 수(pvo.totalPage)보다 작을때까지 출력한다 -->
				<c:if test="${ i<=pvo.totalPage }">
					<!-- 현재 페이지 -->
					<c:if test="${ i==pvo.nowPage }">
						<li style="background-color:#ddd">${ i }</li>
					</c:if>
					<!-- 현재 페이지 아님 -->
					<c:if test="${ i!=pvo.nowPage }">
						<li><a href="/myapp/board/boardList?nowPage=${ i }">${ i }</a></li>
					</c:if>
				</c:if>
			</c:forEach>
			<!-- next버튼 -->
			<c:if test="${ pvo.nowPage==pvo.totalPage }">
				<li>next</li>
			</c:if>
			<c:if test="${ pvo.nowPage<pvo.totalPage }">
				<li><a href="/myapp/board/boardList?nowPage=${ pvo.nowPage+1 }">next</a></li>
			</c:if>
		</ul>
	</div>
	<!-- 검색 기능 -->
	<div class="searchDiv">
		<form action="/myapp/board/boardList">
			<select name="searchKey">
				<option>제목</option>
				<option>내용</option>
				<option>작성자</option>
			</select>
			<input type="text" name="searchValue" id="searchValue">
			<input type="submit" value="검색">
		</form>
	</div>
</div>
