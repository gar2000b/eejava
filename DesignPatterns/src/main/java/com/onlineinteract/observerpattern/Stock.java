package com.onlineinteract.observerpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock implements Observable {

	private List<Observer> observers;
	private String name;
	private int price;

	public Stock() {
		observers = new ArrayList<Observer>();
	}

	public int getStockPrice() {
		return price;
	}

	public void updateStockPrice(int updatedPrice) {
		this.price = updatedPrice;
		this.notifyObservers();
	}

	public String getStockName() {
		return name;
	}

	public void setName(String stockName) {
		this.name = stockName;
	}

	@Override
	public void registerObserver(Observer observer) {
		if (observer != null) {
			this.observers.add(observer);
		}
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer observer = it.next();
			observer.update(this);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observer != null) {
			this.observers.remove(observer);
		}
	}
}
