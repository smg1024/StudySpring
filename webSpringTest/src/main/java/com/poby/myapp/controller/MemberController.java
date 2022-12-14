package com.poby.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.poby.myapp.service.MemberService;
import com.poby.myapp.vo.MemberVO;
import com.poby.myapp.vo.ZipcodeVO;

@Controller
public class MemberController {
	// 클래스를 찾아 객체를 생성해주는 어노테이션
	@Autowired
	MemberService service;
	
	// 회원가입 페이지 이동
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
	
	// 우편번호 검색 팝업
	@GetMapping("/member/searchZipcode")
	public ModelAndView searchZipcode(String street) {
		ModelAndView mav = new ModelAndView();
		
		List<ZipcodeVO> list = null;
		if(street!=null && street!="") {
			// 도로명 주소가 있을때만 DB검색 실시
			list = service.searchZipcode(street);
		}
		
		mav.addObject("list", list);	// 검색값이 있으면 제대로 리턴, 없으면 null
		
		mav.setViewName("member/searchZipcode");
		return mav;
	}
	
	// 회원가입
//	@RequestMapping(value="/member/signupOk", method=RequestMethod.POST)
	@PostMapping("/member/signupOk")
	public ModelAndView signupOk(MemberVO vo) {
		ModelAndView mav = new ModelAndView();
		System.out.println(vo.toString());
		
		int result = service.signupOk(vo);
		
		if(result>0) {
			mav.setViewName("redirect:/");	// 뷰페이지 이름을 jsp파일명 대신 다른 컨트롤러의 매핑 주소로 보낸다
		}else {
			mav.setViewName("member/signupOk");
		}
		return mav;
	}
	
	// 로그인 페이지로 이동
	@RequestMapping("/member/login")
	public String login() {
		return "member/login";
	}
	
	// 로그인
	@PostMapping("/member/loginOk")
	public ModelAndView loginOk(MemberVO vo, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		
		// 아이디와 비밀번호가 일치하면 username, name 선택
		MemberVO VO = service.loginOk(vo);
		
		if(VO==null) {
			// 로그인 실패 시 로그인 페이지로 이동
			mav.setViewName("member/login");
		}else {
			// 세션에 로그인 정보 저장
			session.setAttribute("logUsername", VO.getUsername());
			session.setAttribute("logName", VO.getName());
			session.setAttribute("logStatus", "Y");
			// 로그인 성공 시 홈페이지로 이동
			mav.setViewName("redirect:/");
		}
		
		return mav;
	}
	
	// 로그아웃
	@RequestMapping("/member/logout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		
		session.invalidate();
		mav.setViewName("redirect:/");
		
		return mav;
	}
	
	// 회원정보수정 페이지로 이동
	@RequestMapping("/member/myAccount")
	public ModelAndView myAccount(MemberVO vo) {
		ModelAndView mav = new ModelAndView();
		MemberVO VO = new MemberVO();
		
		VO = service.myAccount(vo);
		
		mav.addObject("vo", VO);
		mav.setViewName("member/myAccount");
		
		return mav;
	}
	
	// 회원정보수정 저장
	@PostMapping("/member/myAccountOk")
	public ModelAndView myAccountOk(MemberVO vo) {
		ModelAndView mav = new ModelAndView();
		
		int result = service.myAccountOk(vo);
		
		if(result>0) {
			mav.setViewName("redirect:/");
		}else {
			mav.setViewName("member/myAccountOk");
		}
		return mav;
	}
}
