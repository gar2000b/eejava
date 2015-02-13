package com.onlineinteract.abstractfactorypattern.factory;

import com.onlineinteract.abstractfactorypattern.factory.api.AbstractFactory;
import com.onlineinteract.abstractfactorypattern.model.colors.api.Color;
import com.onlineinteract.abstractfactorypattern.model.shapes.Circle;
import com.onlineinteract.abstractfactorypattern.model.shapes.Rectangle;
import com.onlineinteract.abstractfactorypattern.model.shapes.Square;
import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public class ShapeFactory extends AbstractFactory {

	public static final String SQUARE = "SQUARE";
	public static final String RECTANGLE = "RECTANGLE";
	public static final String CIRCLE = "CIRCLE";

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase(CIRCLE)) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase(RECTANGLE)) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase(SQUARE)) {
			return new Square();
		}

		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
