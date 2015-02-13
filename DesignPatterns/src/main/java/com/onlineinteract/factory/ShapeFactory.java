package com.onlineinteract.factory;

import com.onlineinteract.factory.model.Circle;
import com.onlineinteract.factory.model.Rectangle;
import com.onlineinteract.factory.model.Square;
import com.onlineinteract.factory.model.api.Shape;

public class ShapeFactory {

	public static final String SQUARE = "SQUARE";
	public static final String RECTANGLE = "RECTANGLE";
	public static final String CIRCLE = "CIRCLE";

	public Shape getShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase(CIRCLE)) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase(RECTANGLE)) {
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase(SQUARE)) {
			return new Square();
		}
		
		return null;
	}
}
