<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- attribute : vo -->
<title>${ vo.subject }</title>
<script>
	function dataDel(){
		if(confirm("글을 삭제하시겠습니까?")){
			location.href = "/myapp/data/dataDel/${vo.postno}";
		}
	}
</script>
<div class="container">
	<h1>글 보기</h1>
	<ul>
		<li>글 번호</li>
		<li>${ vo.postno }</li>
		<li>작성자</li>
		<li>${ vo.username }</li>
		<li>등록일</li>
		<li>${ vo.regdate }</li>
		<li>조회수</li>
		<li>${ vo.hitcount }</li>
		<li>제목</li>
		<li>${ vo.subject }</li>
		<li>내용</li>
		<li>${ vo.content }</li>
		<li>첨부파일</li>
		<li>
			<a href="/myapp/upload/${ vo.filename1 }" download>${ vo.filename1 }</a><br>
			<c:if test="${ vo.filename2!=null && vo.filename2!='' }">
				<a href="/myapp/upload/${ vo.filename2 }" download>${ vo.filename2 }</a>
			</c:if>
		</li>
	</ul>
	<div>
		<a href="/myapp/data/dataEdit?postno=${ vo.postno }">수정</a>
		<a href="javascript:dataDel()">삭제</a>
	</div>
</div>