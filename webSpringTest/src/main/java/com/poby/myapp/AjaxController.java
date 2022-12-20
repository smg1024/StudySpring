package com.poby.myapp;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poby.myapp.service.BoardService;
import com.poby.myapp.vo.BoardVO;
import com.poby.myapp.vo.PageVO;

@Controller
public class AjaxController {
	@Autowired
	BoardService service;
	
	@RequestMapping("/ajaxView")
	public String ajaxView() {
		return "ajax/ajaxView";
	}
	
	// 리턴이 String일때 한글깨짐처리
	@RequestMapping(value="/ajaxString", method=RequestMethod.GET, produces="application/text; charset=UTF-8")
	@ResponseBody	// String, ModelAndView로 리턴되는 경우, jsp파일명이 있지만, 비동기식(Ajax)은 뷰페이지가 필요없으므로
					// 리턴되는 객체가 컨텐츠라는 것을 알려주는 어노테이션
	public String ajaxString(int num, String name) {
		System.out.println("num -> " + num);
		System.out.println("name -> " + name);
		return "<h1>번호 : "+ num + "</h1><h2>이름 : " + name + "</h2>";
	}
	
	// 리턴이 Object일때
	@GetMapping("/ajaxObject")
	@ResponseBody
	public BoardVO ajaxObject(String username, String tel, int age) {
		System.out.println(username + ", " + tel + ", " + age);
		
		BoardVO vo = new BoardVO();
		vo.setPostno(1234);
		vo.setSubject("가짜 글 제목");
		vo.setUsername("아무개");
		
		return vo;
	}
	
	// 리턴이 List일때
	@GetMapping("/ajaxList")
	@ResponseBody
	public List<BoardVO> ajaxList(PageVO pvo) {
		pvo.setTotalData(service.totalData(pvo));
		List<BoardVO> list = service.boardList(pvo);
		
		return list;
	}
	
	// 리턴이 Map일때
	@GetMapping("/ajaxMap")
	@ResponseBody
	public HashMap ajaxMap(PageVO pvo) {
		// 총 데이터 수(PageVO)와 글 보기(BoardVO)를 리턴한다.
		int totalData = service.totalData(pvo);
		BoardVO vo = service.boardView(59);	// 임의로 게시글 하나 고름
		
		HashMap map = new HashMap();
		map.put("totalData", totalData);
		map.put("vo", vo);
		map.put("msg", "맵을 이용한 비동기식 처리하기");
		
		return map;
	}
}
