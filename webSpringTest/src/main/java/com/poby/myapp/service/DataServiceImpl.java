package com.poby.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.poby.myapp.dao.DataDAO;
import com.poby.myapp.vo.DataVO;

@Service
public class DataServiceImpl implements DataService {
	@Inject
	DataDAO dao;

	@Override
	public int dataPostOk(DataVO vo) {
		return dao.dataPostOk(vo);
	}

	@Override
	public List<DataVO> dataList() {
		return dao.dataList();
	}

	@Override
	public DataVO dataView(int postno) {
		return dao.dataView(postno);
	}

	@Override
	public DataVO selectFilename(int postno) {
		return dao.selectFilename(postno);
	}

	@Override
	public int dataEdit(DataVO vo) {
		return dao.dataEdit(vo);
	}

	@Override
	public int dataDel(int postno, String username) {
		return dao.dataDel(postno, username);
	}
}
