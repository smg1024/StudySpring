package com.poby.myapp.service;

import java.util.List;

import com.poby.myapp.vo.BoardVO;
import com.poby.myapp.vo.PageVO;

public interface BoardService {
	// 새 글 등록
	public int boardPostOk(BoardVO vo);
	
	// 해당 페이지 글 선택
	public List<BoardVO> boardList(PageVO pvo);
	
	// 총 데이터 수 구하기
	public int totalData();
}
