package com.onlineinteract.factorypattern.model;

import com.onlineinteract.factorypattern.model.api.Shape;


public class Square implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Inside Square:draw() method.");
	}
}
