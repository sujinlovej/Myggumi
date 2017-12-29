package com.study.myggumi.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.myggumi.configuration.User;

@Repository
public interface UserMapper {
	
	List<User> getUserList();

}
