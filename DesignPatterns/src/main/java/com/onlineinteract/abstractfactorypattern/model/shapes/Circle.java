package com.onlineinteract.abstractfactorypattern.model.shapes;

import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
