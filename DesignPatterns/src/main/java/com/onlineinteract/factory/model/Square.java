package com.onlineinteract.factory.model;

import com.onlineinteract.factory.model.api.Shape;


public class Square implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Inside Square:draw() method.");
	}
}
