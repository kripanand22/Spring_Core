package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public MathTeacher teacherObj() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalObj() {
		Principal principal = new Principal();
		return principal;
	}

	@Bean 
	public College collegeObj()
	{
		College college = new College();
		college.setPrincipal(principalObj());
		
		college.setTeacher(teacherObj());
		return college;
	}
}
