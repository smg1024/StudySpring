package com.poby.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.poby.myapp.service.BoardService;
import com.poby.myapp.vo.BoardVO;
import com.poby.myapp.vo.PageVO;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	// 게시판 목록(페이징, 검색)
	@RequestMapping("/board/boardList")
	public ModelAndView boardList(PageVO pvo) {
		ModelAndView mav = new ModelAndView();
		
		// 총 데이터 수 구하기
		pvo.setTotalData(service.totalData(pvo));
		
		// 페이징, 검색어에 해당하는 글 선택
		mav.addObject("list", service.boardList(pvo));
		mav.addObject("pvo", pvo);
		mav.setViewName("board/boardList");
		
		return mav;
	}
	
	// 글 쓰기
	@GetMapping("/board/boardPost")
	public String boardPost() {
		return "board/boardPost";
	}
	
	// 새 글 등록
	@PostMapping("/board/boardPostOk")
	public ModelAndView boardPostOk(BoardVO vo, HttpServletRequest req) {	// 제목, 내용
		ModelAndView mav = new ModelAndView();
		
		vo.setIpAddr(req.getRemoteAddr());	// 작성자 ip주소
		vo.setUsername((String)req.getSession().getAttribute("username"));	// 현재 로그인한 아이디
		
		mav.addObject("result", service.boardPostOk(vo));
		mav.setViewName("board/boardPostOk");
		
		return mav;
	}
	
	// 글 보기
	@GetMapping("/board/boardView")
	public ModelAndView boardView(int postno) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("vo", service.boardView(postno));
		mav.setViewName("board/boardView");
		
		return mav;
	}
	
	// 글 수정
	@RequestMapping("/board/boardEdit")
	public ModelAndView boardEdit(int postno) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("vo", service.boardView(postno));
		mav.setViewName("board/boardEdit");
		
		return mav;
	}
	
	// 글 수정 저장
	@PostMapping("/board/boardEditOk")
	public ModelAndView boardEdit(BoardVO vo, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		
		// 로그인한 사용자가 자기글만 수정할 수 있도록 한다
		vo.setUsername((String)session.getAttribute("logUsername"));
		
		mav.addObject("result", service.boardEditOk(vo));
		mav.addObject("postno", vo.getPostno());
		mav.setViewName("board/boardEditOk");
		
		return mav;
	}
	
	// 글 삭제
	@GetMapping("/board/boardDel")
	public ModelAndView boardDel(int postno, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		String username = (String)session.getAttribute("logUsername");
		
		int result = service.boardDel(postno, username);
		if(result>0) {
			mav.setViewName("redirect:boardList");
		}else {
			mav.addObject("postno", postno);
			mav.setViewName("redirect:boardView");
		}
		
		return mav;
	}
}
