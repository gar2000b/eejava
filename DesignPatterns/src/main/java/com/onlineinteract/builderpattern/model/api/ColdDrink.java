package com.onlineinteract.builderpattern.model.api;

import com.onlineinteract.builderpattern.model.Bottle;

public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
