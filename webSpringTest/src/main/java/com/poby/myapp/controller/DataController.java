package com.poby.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poby.myapp.service.DataService;

@Controller
public class DataController {
	@Autowired
	DataService service;
	
	@RequestMapping("/data/dataList")
	public String dataList(Model model) {
		// 자료실 데이터 선택
		
		return "data/dataList";
	}
	
	@GetMapping("/data/dataPost")
	public String dataPost() {
		return "data/dataPost";
	}
	
}
