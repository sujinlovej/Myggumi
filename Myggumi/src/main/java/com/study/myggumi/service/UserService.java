package com.study.myggumi.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.myggumi.domain.User;
import com.study.myggumi.mapper.UserMapper;

@Service
public class UserService {
	
	private UserMapper userMapper;
	
    @Autowired
    UserService(UserMapper userMapper) {
	    this.userMapper = userMapper;
	}

	
	public List<User> getUserList() throws Exception{
		
		return userMapper.getUserList();
	}

}
