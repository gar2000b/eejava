package com.onlineinteract.abstractfactorypattern.factory.api;

import com.onlineinteract.abstractfactorypattern.model.colors.api.Color;
import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
