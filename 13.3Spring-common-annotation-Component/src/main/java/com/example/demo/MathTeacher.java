package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi i am a math teacher");
		System.out.println("And my name is Saurav");

	}
}
