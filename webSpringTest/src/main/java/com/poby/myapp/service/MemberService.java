package com.poby.myapp.service;

import java.util.List;

import com.poby.myapp.vo.MemberVO;
import com.poby.myapp.vo.ZipcodeVO;

public interface MemberService {
	// 아이디 중복확인
	public int idCheck(String username);
	
	// 우편번호 검색
	public List<ZipcodeVO> searchZipcode(String street);
	
	// 회원 등록
	public int signupOk(MemberVO vo);
	
	// 로그인
	public MemberVO loginOk(MemberVO vo);
	
	// 회원정보수정 페이지 이동
	public MemberVO myAccount(MemberVO vo);
	
	// 회원정보수정
	public int myAccountOk(MemberVO vo);
}