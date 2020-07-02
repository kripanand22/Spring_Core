package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	public void startpumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("Name= " + heart.getNameofAnimal() 
			+ "   number of heart" + heart.getNoOfHeart());
		} else {
			System.out.println("you are dead");
		}
	}
}
