package com.onlineinteract.prototypepattern;

import com.onlineinteract.prototypepattern.model.Triangle;
import com.onlineinteract.prototypepattern.model.api.Shape;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape: " + clonedShape3.getType());

		// Taking a slight detour in order to see if clones member objects
		// are also cloned. We know that primitive scalars work.
		Triangle clonedShape4 = (Triangle) ShapeCache.getShape("4");
		System.out.println("Shape: " + clonedShape4.getType());
		// Primitive scaler OK.
		System.out.println(clonedShape4.getFunkyField());
		// Now we know that complex member OK.
		System.out.println(clonedShape4.getMiniTriangle().getField1());
		// Now we know that complex types including data structures OK.
		System.out.println(clonedShape4.getMiniTriangleList().get(1)
				.getField2());
	}
}
