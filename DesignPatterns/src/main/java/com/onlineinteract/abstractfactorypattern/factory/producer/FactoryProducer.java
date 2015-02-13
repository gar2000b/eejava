package com.onlineinteract.abstractfactorypattern.factory.producer;

import com.onlineinteract.abstractfactorypattern.factory.ColorFactory;
import com.onlineinteract.abstractfactorypattern.factory.ShapeFactory;
import com.onlineinteract.abstractfactorypattern.factory.api.AbstractFactory;

public class FactoryProducer {
	private static final String COLOR = "COLOR";
	private static final String SHAPE = "SHAPE";

	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase(SHAPE)) {
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase(COLOR)) {
			return new ColorFactory();
		}
		return null;
	}
}
