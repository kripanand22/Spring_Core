package com.kripa;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
//		Student s=new Student();
//		s.setStudentName("kripa");
//		s.display();
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
	}

}
