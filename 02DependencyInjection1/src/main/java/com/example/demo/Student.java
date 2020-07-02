package com.example.demo;

public class Student {

	private int id;
	private String studentName;

	public void setId(int id) {
		this.id = id;
		System.out.println("Setter method called"+" :StuID");
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter method called"+" :StuNAME");
	}

	public void display() {
		System.out.println("Student name is " + studentName +
				                         "  Student Roll no"+ id);
	}
}
