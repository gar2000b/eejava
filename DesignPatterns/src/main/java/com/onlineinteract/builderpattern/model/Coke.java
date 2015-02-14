package com.onlineinteract.builderpattern.model;

import com.onlineinteract.builderpattern.model.api.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
