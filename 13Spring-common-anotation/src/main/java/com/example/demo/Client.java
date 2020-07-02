package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("beans.xml is loaded");
		College obj=context.getBean("collegeObj" ,College.class);
		System.out.println("Object is =" +obj);
		obj.test();
		
		context.close();
		
//		Principal Obj1 = context.getBean("principalObj" , Principal.class);
//		Obj1.principalInfo();
	}
}
