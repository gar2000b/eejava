package com.onlineinteract.factorypattern.model;

import com.onlineinteract.factorypattern.model.api.Shape;

public class Circle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
