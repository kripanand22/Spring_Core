package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		JdbcConnection obj=context.getBean("jdbcobj",JdbcConnection.class);
		obj.displayInfo();
		obj.getJdbcConnection();
	}
}
