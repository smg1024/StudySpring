package com.poby.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poby.myapp.service.MemberService;

@Controller
public class MemberController {
	// 클래스를 찾아 객체를 생성해주는 어노테이션
	@Autowired
	MemberService service;
	
	// 회원가입 페이지
	@RequestMapping("/member/signup")
	public String signup() {
		return "member/signup";
	}
	
	// 아이디 중복확인 팝업
	@RequestMapping("/member/idCheck")
	public String idCheck(String username, Model model) {
		// DB에 username이 이미 존재하는지 확인
		int result = service.idCheck(username);
		
		model.addAttribute("username", username);	// 검색 조건
		model.addAttribute("result", result);		// 검색 결과
		
		return "member/idCheck";
	}
}
