<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- attribute로 넘어온 변수 : result -->
<!-- 등록 안 됐을때, 뒤로가기 -->
<c:if test="${ result==0 }">
	<script>
		alert("글 등록 실패.");
		history.back();
	</script>
</c:if>
<!-- 등록됐을때, 목록으로 이동 -->
<c:if test="${ result>0 }">
	<script>
		location.href = "/myapp/board/boardList";
	</script>
</c:if>