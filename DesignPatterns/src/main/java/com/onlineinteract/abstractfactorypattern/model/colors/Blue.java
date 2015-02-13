package com.onlineinteract.abstractfactorypattern.model.colors;

import com.onlineinteract.abstractfactorypattern.model.colors.api.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}