package com.poby.myapp.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.poby.myapp.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDAO dao;

	@Override
	public int idCheck(String username) {
		return dao.idCheck(username);
	}
}
