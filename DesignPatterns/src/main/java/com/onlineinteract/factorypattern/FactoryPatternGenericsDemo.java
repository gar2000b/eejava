package com.onlineinteract.factorypattern;

import com.onlineinteract.factorypattern.factory.GenericsShapeFactory;
import com.onlineinteract.factorypattern.model.Circle;
import com.onlineinteract.factorypattern.model.Rectangle;
import com.onlineinteract.factorypattern.model.Square;
import com.onlineinteract.factorypattern.model.api.Shape;

public class FactoryPatternGenericsDemo {

	public static void main(String[] args) {
		GenericsShapeFactory<Shape> shapeFactory = new GenericsShapeFactory<>();
		
		Shape shape1 = shapeFactory.getShape(Circle.class);
		Shape shape2 = shapeFactory.getShape(Rectangle.class);
		Shape shape3 = shapeFactory.getShape(Square.class);
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
}
