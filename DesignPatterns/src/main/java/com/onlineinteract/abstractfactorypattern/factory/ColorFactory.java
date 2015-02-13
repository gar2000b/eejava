package com.onlineinteract.abstractfactorypattern.factory;

import com.onlineinteract.abstractfactorypattern.factory.api.AbstractFactory;
import com.onlineinteract.abstractfactorypattern.model.colors.Blue;
import com.onlineinteract.abstractfactorypattern.model.colors.Green;
import com.onlineinteract.abstractfactorypattern.model.colors.Red;
import com.onlineinteract.abstractfactorypattern.model.colors.api.Color;
import com.onlineinteract.abstractfactorypattern.model.shapes.api.Shape;

public class ColorFactory extends AbstractFactory {

	private static final String BLUE = "BLUE";
	private static final String GREEN = "GREEN";
	private static final String RED = "RED";

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase(RED)) {
			return new Red();
		} else if (colorType.equalsIgnoreCase(GREEN)) {
			return new Green();
		} else if (colorType.equalsIgnoreCase(BLUE)) {
			return new Blue();
		}

		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
