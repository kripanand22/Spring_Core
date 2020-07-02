package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegeBean" , College.class);
		System.out.println(college);
		college.test();

		//((AnnotationConfigApplicationContext)context).close();
		context.close();
	}
}
