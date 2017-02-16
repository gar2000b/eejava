package com.onlineinteract.strategypattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());
	}
}
