package com.onlineinteract.prototypepattern.model;

import com.onlineinteract.prototypepattern.model.api.Shape;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
