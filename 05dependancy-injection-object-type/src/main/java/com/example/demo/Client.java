package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		/*Student student=new Student();
		MathCheat cheat=new MathCheat();
		student.setMathcheat(cheat);
		student.cheating(); */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml is loaded");
		Student student=context.getBean("stu" , Student.class);
		student.cheating();
		
		AnotherStudent anotherStu=context.getBean("anotherstu",AnotherStudent.class);
		anotherStu.cheating();
	}
}
