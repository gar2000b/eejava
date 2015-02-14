package com.onlineinteract.builderpattern.builder;

import com.onlineinteract.builderpattern.model.ChickenBurger;
import com.onlineinteract.builderpattern.model.Coke;
import com.onlineinteract.builderpattern.model.Meal;
import com.onlineinteract.builderpattern.model.Pepsi;
import com.onlineinteract.builderpattern.model.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
