package com.study.myggumi;

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
	public UserServiceImpl UserService() {

		UserServiceImpl service = new UserServiceImpl(null);
		
		return service;
	}

}