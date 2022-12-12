package com.poby.myapp.service;

import java.util.List;

import com.poby.myapp.vo.MemberVO;
import com.poby.myapp.vo.ZipcodeVO;

public interface MemberService {
	public int idCheck(String username);
	public List<ZipcodeVO> searchZipcode(String street);
	public int signupOk(MemberVO vo);
	public MemberVO loginOk(MemberVO vo);
}