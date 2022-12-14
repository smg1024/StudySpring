package com.poby.myapp;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller	// 어노테이션
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// localhost:1024/myapp/
	@RequestMapping(value = "/", method = RequestMethod.GET)	// RequestMethod.GET, RequestMethod.POST
	public String home() {
		return "home";
	}
	
	// localhost:1024/myapp/test1
	// 반환형은 문자열(뷰페이지 파일명)
	@RequestMapping("/test1")	// 디폴트값: RequestMethod.GET
	public String test1(Model model) {
		// **매개변수**로 있는 Model객체에 데이터를 세팅하면 뷰페이지에서 사용할 수 있다. (attribute넘겨주기)
		model.addAttribute("name", "조규성");
		model.addAttribute("num", 9);
		
//		<beans:property name="prefix" value="/WEB-INF/views/" />
//		<beans:property name="suffix" value=".jsp" />
		
		// 		/WEB-INF/views/controllerTest/test.jsp
		return "controllerTest/test";
	}
	
	// localhost:1024/myapp/test2
	@RequestMapping("/test2")
	public ModelAndView test2() {
		// 뷰페이지와 데이터를 한번에 리턴
		ModelAndView mav = new ModelAndView();
		
		// 데이터
		mav.addObject("name", "이순신");
		mav.addObject("num", 12);
		
		// 뷰파일명
		mav.setViewName("controllerTest/test");
		return mav;
	}
	
	// 클라이언트에게서 서버로 데이터 가져오기 request
	// localhost:1024/myapp/test3?num=1234&name=홍길동
	@RequestMapping("/test3")
	public String test3(HttpServletRequest req, Model model) {
		// parameter를 변수로 선언
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		
		System.out.println("num = " + num);
		System.out.println("name = " + name);
		
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		
		return "controllerTest/test";
	}
	
	// localhost:1024/myapp/test4?num=5678&name=세종대왕
	@RequestMapping("/test4")
	public ModelAndView test4(@RequestParam("num") int num, @RequestParam("name") String name) {
		System.out.println("num = " + num);
		System.out.println("name = " + name);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("num", num);
		mav.addObject("name", name);
		
		mav.setViewName("controllerTest/test");
		
		return mav;
	}
	
	// localhost:1024/myapp/test5?num=1111&name=김상민
	@RequestMapping("/test5")
	public String test5(TestVO vo) {
		System.out.println("num = " + vo.getNum());
		System.out.println("name = " + vo.getName());
		
		return "controllerTest/test";
	}
	
	// localhost:1024/myapp/test6?num=2222&name=대조영
	@RequestMapping("/test6")
	public String test6(int num, String name) {
		System.out.println("num = " + num);
		System.out.println("name = " + name);
		
		return "controllerTest/test";
	}
	
}
