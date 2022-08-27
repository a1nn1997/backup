package com.test7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan( basePackages="com.test7")
public class Config {
	@Bean
	public Desk getDesk() {
		return new Desk();
	}
	
	@Bean(name= {"bean1","b","b1","bean"})
	public Student getStudent() {
		Student student=new Student(getDesk());
		return student;
	}
	
}