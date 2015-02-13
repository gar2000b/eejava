package com.onlineinteract.factory.model;

import com.onlineinteract.factory.model.api.Shape;

public class Circle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
