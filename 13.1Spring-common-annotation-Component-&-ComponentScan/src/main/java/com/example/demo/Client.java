package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("beans.xml is loaded");
		College college = context.getBean("collegeObj" , College.class);
		System.out.println(college);
		college.test();
	}
}
