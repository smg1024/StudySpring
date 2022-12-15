package com.poby.myapp.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.poby.myapp.dao.DataDAO;

@Service
public class DataServiceImpl implements DataService {
	@Inject
	DataDAO dao;
}
