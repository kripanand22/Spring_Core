package com.example.demo;

public class Answer {

	private int stuId;
	private String ansSubmit;
	private String ansGivenBy;

	public Answer(int stuId, String ansSubmit, String ansGivenBy) {
		super();
		this.stuId = stuId;
		this.ansSubmit = ansSubmit;
		this.ansGivenBy = ansGivenBy;
	}

	public String toString() {
		return stuId + " " + ansSubmit + " " + ansGivenBy;
	}

}
