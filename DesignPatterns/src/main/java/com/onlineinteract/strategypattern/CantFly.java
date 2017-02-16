package com.onlineinteract.strategypattern;

public class CantFly implements FlyingStrategy {

	@Override
	public String fly() {
		return "I can't fly";
	}

}
