package com.onlineinteract.builderpattern.model;

import com.onlineinteract.builderpattern.model.api.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
