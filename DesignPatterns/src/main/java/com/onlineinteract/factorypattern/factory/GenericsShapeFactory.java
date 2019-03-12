package com.onlineinteract.factorypattern.factory;

import com.onlineinteract.factorypattern.model.api.Shape;

public class GenericsShapeFactory<T extends Shape> {

	@SuppressWarnings("unchecked")
	public T getShape(Class<?> shapeClazz) {

		try {
			return (T) shapeClazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return null;
	}
}
