package com.poby.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.poby.myapp.dao.BoardDAO;
import com.poby.myapp.vo.BoardVO;
import com.poby.myapp.vo.PageVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	BoardDAO dao;

	@Override
	public int boardPostOk(BoardVO vo) {
		return dao.boardPostOk(vo);
	}

	@Override
	public List<BoardVO> boardList(PageVO pvo) {
		return dao.boardList(pvo);
	}

	@Override
	public int totalData() {
		return dao.totalData();
	}

}
