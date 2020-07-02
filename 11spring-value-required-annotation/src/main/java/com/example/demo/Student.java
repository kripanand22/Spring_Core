package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Autowired
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;

	@Value("${student.hobby}")
	private String hobby;

	public void displayInfo() {
		System.out.println("Name is" + " " + name);
		System.out.println("IntrestedCourse is" + " " + intrestedCourse);
		System.out.println("Hobby is" + " " + hobby);
	}
}
