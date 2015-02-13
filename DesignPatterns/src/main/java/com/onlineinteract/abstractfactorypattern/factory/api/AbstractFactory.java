package com.onlineinteract.abstractfactorypattern.factory.api;

import com.onlineinteract.abstractfactorypattern.factory.ColorFactory;
import com.onlineinteract.abstractfactorypattern.factory.ShapeFactory;
import com.onlineinteract.abstractfactorypattern.model.colors.api.Color;
import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public abstract class AbstractFactory {
	private static final String COLOR = "COLOR";
	private static final String SHAPE = "SHAPE";
	
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase(SHAPE)) {
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase(COLOR)) {
			return new ColorFactory();
		}
		return null;
	}
}
