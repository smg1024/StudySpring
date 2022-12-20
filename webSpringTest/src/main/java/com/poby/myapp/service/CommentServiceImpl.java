package com.poby.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.poby.myapp.dao.CommentDAO;
import com.poby.myapp.vo.CommentVO;

@Service
public class CommentServiceImpl implements CommentService {
	@Inject
	CommentDAO dao;

	@Override
	public int commentPost(CommentVO vo) {
		return dao.commentPost(vo);
	}

	@Override
	public List<CommentVO> commentList(int postno) {
		return dao.commentList(postno);
	}

	@Override
	public int commentEdit(CommentVO vo) {
		return dao.commentEdit(vo);
	}
}
