package com.example.demo;

public class Airtel implements Sim {
	
	

	public Airtel() {
		System.out.println("Constructor successully");
	}

	@Override
	public void Data() {
		System.out.println("Data using Airtel");
		
	}

	@Override
	public void calling() {
		System.out.println("Calling is done by Airtel");
		
	}
	
}
