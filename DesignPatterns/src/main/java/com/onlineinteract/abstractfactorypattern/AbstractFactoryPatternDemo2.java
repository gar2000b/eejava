package com.onlineinteract.abstractfactorypattern;

import com.onlineinteract.abstractfactorypattern.factory.api.AbstractFactory;
import com.onlineinteract.abstractfactorypattern.model.colors.api.Color;
import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public class AbstractFactoryPatternDemo2 {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = AbstractFactory.getFactory("SHAPE");

		Shape shape1 = shapeFactory.getShape("CIRCLE");

		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");

		shape3.draw();

		AbstractFactory colorFactory = AbstractFactory.getFactory("COLOR");

		Color color1 = colorFactory.getColor("RED");

		color1.fill();

		Color color2 = colorFactory.getColor("Green");

		color2.fill();

		Color color3 = colorFactory.getColor("BLUE");

		color3.fill();
	}
}