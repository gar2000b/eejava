package com.onlineinteract.prototypepattern.model;

import com.onlineinteract.prototypepattern.model.api.Shape;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
