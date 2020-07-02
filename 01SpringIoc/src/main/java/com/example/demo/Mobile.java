package com.example.demo;

import java.io.ObjectInputStream.GetField;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
//		Vodaphone air=(Vodaphone) context.getBean("vodaphone");
//		air.calling();
//		air.Data();
		
		
//		Vodaphone voda=context.getBean("vodaphone" ,Vodaphone.class);
//		voda.calling();
//		voda.Data();
		
		
		Sim sim=context.getBean("sim" ,Sim.class); 
		sim.calling();
		sim.Data();
	}

}
