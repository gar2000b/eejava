package com.onlineinteract.builderpattern.model;

import com.onlineinteract.builderpattern.model.api.Packing;

public class Wrapper implements Packing{

	@Override
	public String pack() {
		return "Wrapper";
	}

}
