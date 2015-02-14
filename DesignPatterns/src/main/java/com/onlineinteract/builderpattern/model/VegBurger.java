package com.onlineinteract.builderpattern.model;

import com.onlineinteract.builderpattern.model.api.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
