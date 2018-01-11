package com.study.myggumi.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.myggumi.domain.User;

public interface UserMapper {
	
	//¸®½ºÆ®
	public List<User> getUserList();
}
