package com.onlineinteract.observerpattern;

public class DisplayBoard implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println(
				"DISPLAYBOARD - The price of " + stock.getStockPrice() + " has changed: " + stock.getStockPrice());
	}

}
