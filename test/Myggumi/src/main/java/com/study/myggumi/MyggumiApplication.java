package com.study.myggumi;

import java.sql.SQLException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.study.myggumi.service.Impl.UserServiceImpl;

@SpringBootApplication
public class MyggumiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyggumiApplication.class, args);
	}
	
	@Bean
	public UserServiceImpl UserServiceImpl()  throws SQLException {

		UserServiceImpl service = new UserServiceImpl(null);
		
		service.getUserList();
		System.out.println("getUserList======");
		
		return service;
	}

}