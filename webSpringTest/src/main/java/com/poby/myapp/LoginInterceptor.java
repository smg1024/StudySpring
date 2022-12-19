package com.poby.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// Interceptor처리 할 클래스
// 반드시 HandlerInterceptorAdapter 상속해야함
public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	// 컨트롤러가 호출되기 전에 호출되게하는 메소드
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception{
		// 로그인 여부 확인 후, 로그인이 돼있으면 진행, 안 돼있으면 로그인 페이지로 이동하도록 설정
		HttpSession session = req.getSession();
		String logUsername = (String)session.getAttribute("logUsername");
		
		if(logUsername==null || logUsername.equals("")) {	// 로그인이 안 된 경우 -> 로그인 페이지로
			res.sendRedirect(req.getContextPath()+"/member/login");
			return false;	// false: 가던 길 멈추고 로그인으로 이동하라.
		}else {	// 로그인이 된 경우
			return true;
		}
	}
	
	// 컨트롤러 실행 후 뷰페이지로 이동하기 전에 호출되는 메소드
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, @Nullable ModelAndView mav) throws Exception{
	}
	
	// 컨트롤러 실행 후 호출되는 메소드
	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, @Nullable Exception ex) throws Exception{
	}
	
	/*
	 * 비동기식 요청이 있을 때 preHandle이나 postHandle을 수행하지 않고 afterConcurrentHandlingStated가 호출된다.
	 * afterConcurrentHandlingStated(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception{}
	 */
}
