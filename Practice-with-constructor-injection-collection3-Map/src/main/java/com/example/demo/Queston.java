package com.example.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Queston {

	private int id;
	private String name;
	private Map<String, String> answer;

	public Queston(int id, String name, Map<String, String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}

	public void displayinfo() {
		System.out.println("Question id" + id);
		System.out.println("Question name" + name);
		System.out.println("Answer......");

		Set<Map.Entry<String, String>> set = answer.entrySet();

		Iterator<Map.Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Answer " + entry.getKey() + " " + entry.getValue());
		}

	}

}
