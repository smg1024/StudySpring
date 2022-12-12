package com.poby.myapp.dao;

import java.util.List;

import com.poby.myapp.vo.MemberVO;
import com.poby.myapp.vo.ZipcodeVO;

public interface MemberDAO {
	// 아이디 중복확인
	public int idCheck(String username);
	
	// 우편번호 검색
	public List<ZipcodeVO> searchZipcode(String street);
	
	// 회원 등록
	public int signupOk(MemberVO vo);
	
	// 로그인
	public MemberVO loginOk(MemberVO vo);
}