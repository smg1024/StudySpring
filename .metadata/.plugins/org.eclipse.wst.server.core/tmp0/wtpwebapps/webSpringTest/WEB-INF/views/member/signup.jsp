<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
	$(function(){
		// 아이디 중복확인 버튼 누르면
		$("#idCheck").click(function(){
			if($("#username").val()!=""){
				window.open("/myapp/member/idCheck?username="+$("#username").val(),"idCheck","width=500px, height=400px");
			}else{
				alert("아이디를 입력해주세요.")
			}
		});
		
		// 아이디 입력칸에 입력되면
		$("#username").keyup(function(){
			$("#idCheckStatus").val("N");
		});
		
		// 우편번호 찾기 버튼 누르면
		$("#searchZipcode").click(function(){
			// 우편번호 검색 팝업창 생성
			window.open("/myapp/member/searchZipcode","zipcode","width=600px, height=500px, top=200px, left=200px");
		});
		
		// 회원가입 유효성 검사
		$("#signupForm").submit(function(){
			// 아이디 조건
			// 영어, 숫자, '_'로 이루어진 길이 6~15자리
			
			// 정규표현식
			// ^ : 처음부터 문자를 검색,	$ : 끝까지 검색
			var reg = /^[A-Za-z]{1}\w{5,14}$/	// \w : 영대소문자,숫자,_	
			if(!reg.test($("#username").val())){	// 맞으면 true, 틀리면 false
				alert("아이디를 잘못 입력하였습니다.\n아이디는 6~15자리의 영문자, 숫자, _만 사용할 수 있습니다.");
				return false;
			}
			
			// 비밀번호 확인
			if($("#password").val() != $("#v-password").val()){
				alert("비밀번호를 확인하세요.");
				return false;
			}
			
			// 이름 조건 : 한글로 2~7글자까지 허용
			reg = /^[가-힣]{2,7}$/
			if(!reg.test($("#name").val())){
				alert("이름은 한글 2~7자까지 허용합니다.");
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
			
			// 아이디 중복확인 검사
			if($("#idCheckStatus").val()=="N"){
				alert("아이디 중복 확인하세요.");
				return false;
			}
		});
	});
</script>
<title>회원가입</title>
<div class="container">
	<h1>회원가입 Form</h1>
	<form method="post" action="/myapp/member/signupOk" id="signupForm">
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
				<input type="text" name="zipcode" id="zipcode" readonly>
				<input type="button" value="우편번호 찾기" id="searchZipcode">
			</li>
			<li>주소</li>
			<li><input type="text" name="addr" id="addr" style="width:50%"></li>
			<li>상세주소</li>
			<li><input type="text" name="detailaddr" id="detailaddr"></li>
			<li><input type="submit" value="회원가입"></li>
		</ul>
	</form>
</div>