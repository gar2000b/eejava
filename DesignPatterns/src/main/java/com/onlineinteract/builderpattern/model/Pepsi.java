package com.onlineinteract.builderpattern.model;

import com.onlineinteract.builderpattern.model.api.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
