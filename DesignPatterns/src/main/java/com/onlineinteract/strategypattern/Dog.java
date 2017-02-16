package com.onlineinteract.strategypattern;

public class Dog extends Animal {

	public Dog() {
		super();
		
		flyingType = new CantFly();
	}
}
