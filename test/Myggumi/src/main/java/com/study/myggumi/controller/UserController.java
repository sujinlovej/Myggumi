package com.study.myggumi.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.myggumi.service.UserService;

@Controller
public class UserController {
	
	@Resource(name="com.study.myggumi.service")
	UserService userservice;
	
	@RequestMapping("/")
	private String userList(Model model) throws Exception{
		model.addAttribute("list",userservice.getUserList());
		
		return "sample1";
	}

}
