package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class College {

	private Principal principal;
	
	private Teacher teacher;
	
	

//	public College(Principal principal) {
//		this.principal = principal;
//	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		System.out.println("Using set Principal");
		this.principal = principal;
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		
		System.out.println("testing this  method");
	}

	
}
