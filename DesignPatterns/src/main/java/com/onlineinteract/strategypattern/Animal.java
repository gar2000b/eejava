package com.onlineinteract.strategypattern;

public abstract class Animal {
	
	public FlyingStrategy flyingType;
	
	public String tryToFly () {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(FlyingStrategy newFlyType) {
		flyingType = newFlyType;
	}
}
