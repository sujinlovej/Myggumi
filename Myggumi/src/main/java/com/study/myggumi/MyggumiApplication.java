package com.study.myggumi;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.study.myggumi.mapper.UserMapper;

@SpringBootApplication
@MapperScan("com.study.myggumi.mapper")
public class MyggumiApplication {
	
	@Autowired
	UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(MyggumiApplication.class, args);
	}
	
	/*
	 * SqlSessionFactory ¼³Á¤
	 */
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		
		sessionFactory.setDataSource(dataSource);
		return sessionFactory.getObject();
	}
}
