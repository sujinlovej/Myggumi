package com.study.myggumi.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.myggumi.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService UserService;
	
	// 리스트 화면 호출
	@RequestMapping("/list")
	private String UserList(Model model) throws Exception{
		
		model.addAttribute("resultList", UserService.getUserList());
		System.out.println("result" + UserService.getUserList());
		
		return "list";
	}

}
