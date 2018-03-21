package com.sj.dp.builderPattern.builder.impl;

/**
 * 套餐生产 - 构造器
 * @author 孙建
 */
public class MealBuilder {

	// 准备素食套餐
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	// 准备肉食套餐
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());;
		meal.addItem(new Pepsi());
		return meal;
	}
}
