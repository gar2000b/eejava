package com.onlineinteract.abstractfactorypattern.model.shapes;

import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
