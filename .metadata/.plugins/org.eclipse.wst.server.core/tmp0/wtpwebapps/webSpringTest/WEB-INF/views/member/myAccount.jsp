<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- attribute로 넘어온 변수 : vo -->
<script>
	$(function(){
		// 우편번호 찾기 버튼 누르면
		$("#searchZipcode").click(function(){
			// 우편번호 검색 팝업창 생성
			window.open("/myapp/member/searchZipcode","zipcode","width=600px, height=500px, top=200px, left=200px");
		});
		
		// 회원가입 유효성 검사
		$("#myAccountForm").submit(function(){
			// 비밀번호 확인
			if($("#password").val() != $("#v-password").val()){
				alert("비밀번호를 확인하세요.");
				return false;
			}
			
			// 연락처 검사
			var tel = $("#tel1").val()+"-"+$("#tel2").val()+"-"+$("#tel3").val();
			console.log("tel -> ", tel);	// 브라우저 콘솔에 전화번호 표시
			// 지역번호 : 010, 02, 031, 032, 041, 042
			reg = /^(010|02|031|032|041|042)-[0-9]{3,4}-[0-9]{4}$/
			if(!reg.test(tel)){
				alert("전화번호를 확인하세요.");
				return false;
			}
			
			// 이메일 검사
			// smg1024@naver.com	smg1024@cau.ac.kr
			if($("#email").val()!=""){	// 이메일은 필수 입력 항목이 아님
				// 이메일은 다른 사이트의 이메일을 가져오는 것이기 때문에 최대한 널널한 조건으로 설정
				// ? : 있거나 없거나
				reg = /^\w{6,15}[@][a-z0-9]{2,8}[.][a-z]{1,3}([.][a-z]{1,3})?$/
				if(!reg.test($("#email").val())){
					alert("잘못된 이메일 주소입니다.");
					return false;
				}
			}
		});
	});
</script>
<title>내 정보 수정</title>
<div class="container">
	<h1>내 정보 수정 Form</h1>
	<form method="post" action="/myapp/member/myAccountOk" id="myAccountForm">
		<ul>
			<li>아이디</li>
			<li><input type="text" name="username" id="username" value="${ vo.username }" readonly></li>
			<li>새 비밀번호</li>
			<li><input type="password" name="password" id="password"></li>
			<li>새 비밀번호 확인</li>
			<li><input type="password" name="v-password" id="v-password"></li>
			<li>이름</li>
			<li><input type="text" name="name" id="name" value="${ vo.name }" readonly></li>
			<li>연락처</li>
			<li>
				<input type="text" name="tel1" id="tel1" value="${ vo.tel1 }">-
				<input type="text" name="tel2" id="tel2" value="${ vo.tel2 }">-
				<input type="text" name="tel3" id="tel3" value="${ vo.tel3 }">
			</li>
			<li>이메일</li>
			<li><input type="text" name="email" id="email" value="${ vo.email }"></li>
			<li>우편번호</li>
			<li>
				<input type="text" name="zipcode" id="zipcode" value="${ vo.zipcode }" readonly>
				<input type="button" value="우편번호 찾기" id="searchZipcode">
			</li>
			<li>주소</li>
			<li><input type="text" name="addr" id="addr" style="width:50%" value="${ vo.addr }"></li>
			<li>상세주소</li>
			<li><input type="text" name="detailaddr" id="detailaddr" value="${ vo.detailaddr }"></li>
			<li><input type="submit" value="저장"><input type="button" value="취소" onclick="history.back()"></li>
		</ul>
		
	</form>
</div>