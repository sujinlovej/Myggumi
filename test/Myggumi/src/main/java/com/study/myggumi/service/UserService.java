package com.study.myggumi.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.study.myggumi.configuration.User;

@Service("com.study.myggumi.service")
public interface UserService {
	
    List<User> getUserList();

}
