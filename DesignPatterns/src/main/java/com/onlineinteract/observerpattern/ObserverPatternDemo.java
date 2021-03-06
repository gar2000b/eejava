package com.onlineinteract.observerpattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// Create stocks
		IBM ibm = new IBM();
		Microsoft microsoft = new Microsoft();
		Apple apple = new Apple();
		
		// Create observers
		Mobile mobile = new Mobile();
		DisplayBoard displayBoard = new DisplayBoard();
		
		// Register observers for stocks
		ibm.registerObserver(mobile);
		ibm.registerObserver(displayBoard);
		microsoft.registerObserver(mobile);
		microsoft.registerObserver(displayBoard);
		apple.registerObserver(mobile);
		apple.registerObserver(displayBoard);
		
		// Set some random stock prices
		for (int i = 0; i < 300; i++) {
			ibm.updateStockPrice((int)(Math.random() * 101) + 1);
			microsoft.updateStockPrice((int)(Math.random() * 101) + 1);
			apple.updateStockPrice((int)(Math.random() * 101) + 1);
		}
	}
}
