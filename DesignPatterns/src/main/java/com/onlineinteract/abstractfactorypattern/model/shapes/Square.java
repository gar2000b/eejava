package com.onlineinteract.abstractfactorypattern.model.shapes;

import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square:draw() method.");
	}
}
