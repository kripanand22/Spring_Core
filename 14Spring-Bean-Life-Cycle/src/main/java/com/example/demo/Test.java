package com.example.demo;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context);
		StudentDB student = context.getBean("StudentObj", StudentDB.class);
		student.selectRows();
		
		Hello hello = context.getBean("HelloObj" ,Hello.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
