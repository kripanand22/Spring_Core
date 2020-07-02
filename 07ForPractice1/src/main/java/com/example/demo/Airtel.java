package com.example.demo;

public class Airtel {
	
	private Service ser;

	public void setSer(Service ser) {
		this.ser = ser;
	}
	
	public void serviceAvilable() {
		ser.service();
	}

}
