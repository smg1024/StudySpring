package com.poby.myapp.service;

import java.util.List;

import com.poby.myapp.vo.DataVO;

public interface DataService {
	// 자료 올리기
	public int dataPostOk(DataVO vo);
	
	// 자료실 목록
	public List<DataVO> dataList();
	
	// 글 보기
	public DataVO dataView(int postno);
}
/*
 * 1. 파일 업로드 구현을 위해서 필요한 framework
 * commons-io 
 * commons-fileupload를 pom.xml에 dependency추가
 * 
 * 2. root-context.xml에 
 * multipartResolver객체 생성
 * 
 */