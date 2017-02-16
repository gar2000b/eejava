package com.onlineinteract.strategypattern;

public class Bird extends Animal {

	public Bird() {
		super();
		
		flyingType = new ItFlys();
	}
}
