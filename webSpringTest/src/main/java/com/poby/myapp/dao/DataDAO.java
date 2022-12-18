package com.poby.myapp.dao;

import java.util.List;

import com.poby.myapp.vo.DataVO;

public interface DataDAO {
	// 자료 올리기
	public int dataPostOk(DataVO vo);
	
	// 자료실 목록
	public List<DataVO> dataList();
	
	// 글 보기
	public DataVO dataView(int postno);
}
