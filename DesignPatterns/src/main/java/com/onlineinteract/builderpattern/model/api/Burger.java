package com.onlineinteract.builderpattern.model.api;

import com.onlineinteract.builderpattern.model.Wrapper;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
