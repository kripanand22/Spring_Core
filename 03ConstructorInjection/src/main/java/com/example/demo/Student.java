package com.example.demo;

public class Student {

	private int id;
	private String studentName;
	
	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public void display() {
		System.out.println("Student name is :-" + studentName + "  Student Roll no :-" + id);
	}
}
