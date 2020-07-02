package com.example.demo;

public class AnotherStu implements Cheat {
	
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	@Override
	public void cheat() {
		cheat.cheat();
	}
}
