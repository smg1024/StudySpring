package com.poby.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.poby.myapp.dao.MemberDAO;
import com.poby.myapp.vo.MemberVO;
import com.poby.myapp.vo.ZipcodeVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDAO dao;

	@Override
	public int idCheck(String username) {
		return dao.idCheck(username);
	}

	@Override
	public List<ZipcodeVO> searchZipcode(String street) {
		return dao.searchZipcode(street);
	}

	@Override
	public int signupOk(MemberVO vo) {
		return dao.signupOk(vo);
	}

	@Override
	public MemberVO loginOk(MemberVO vo) {
		return dao.loginOk(vo);
	}

	@Override
	public MemberVO myAccount(MemberVO vo) {
		return dao.myAccount(vo);
	}

	@Override
	public int myAccountOk(MemberVO vo) {
		return dao.myAccountOk(vo);
	}
}
