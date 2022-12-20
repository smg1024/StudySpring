package com.poby.myapp.dao;

import java.util.List;

import com.poby.myapp.vo.CommentVO;

public interface CommentDAO {
	// 댓글 달기
	public int commentPost(CommentVO vo);
	
	// 댓글 불러오기
	public List<CommentVO> commentList(int postno);
	
	// 댓글 수정하기
	public int commentEdit(CommentVO vo);
}
