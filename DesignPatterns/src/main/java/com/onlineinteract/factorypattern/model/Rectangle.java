package com.onlineinteract.factorypattern.model;

import com.onlineinteract.factorypattern.model.api.Shape;

public class Rectangle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
