package com.study.myggumi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.myggumi.configuration.User;
import com.study.myggumi.mapper.UserMapper;
import com.study.myggumi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserMapper userMapper;
	
	@Autowired
	public UserServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
    @Override
    public List<User> getUserList() {
		return userMapper.getUserList();
	}

}
