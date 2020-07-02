package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ScienceTeacher2 implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi i am a Science teacher");
		System.out.println("And my name is Dhoni");

	}
}
