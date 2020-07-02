package com.example.demo;

public class Address {

	private String city;
	private String State;
	private String Country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		State = state;
		Country = country;
	}

	public String value() {
		return Country + " " + State + " " + Country;
	}

}
