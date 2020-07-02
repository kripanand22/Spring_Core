package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public Teacher mathteacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBena() {
		return new Principal();
	}

	//@Bean({"colBean" , "ColBeanAnother"})  We also done with one or multiple bean id
	
	
	@Bean()    //default bean id(bean id is the name of method is collegeObj)
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(principalBena());
		college.setTeacher(mathteacherBean());
		return college;
	}
	
}
