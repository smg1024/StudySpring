package com.poby.myapp.dao;

import java.util.List;

import com.poby.myapp.vo.BoardVO;
import com.poby.myapp.vo.PageVO;

public interface BoardDAO {
	// 새 글 등록
	public int boardPostOk(BoardVO vo);
	
	// 해당 페이지 글 선택
	public List<BoardVO> boardList(PageVO pvo);
	
	// 총 데이터 수 구하기
	public int totalData(PageVO pvo);
	
	// 글 보기
	public BoardVO boardView(int postno);
	
	// 글 수정
	public int boardEditOk(BoardVO vo);
	
	// 글 삭제
	public int boardDel(int postno, String username);
}
