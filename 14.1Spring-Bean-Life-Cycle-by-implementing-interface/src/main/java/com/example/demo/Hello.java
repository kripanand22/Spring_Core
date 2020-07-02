package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside the destroy--> destroy");
	}
	
	public void simple() {
		System.out.println("The code is start here");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside the init--> init");
	}

}
