package com.sj.test.builderPattern;

import com.sj.dp.builderPattern.builder.impl.Meal;
import com.sj.dp.builderPattern.builder.impl.MealBuilder;

/**
 * 构造器演示
 * @author 孙建
 */
public class MealBuilderTest {

	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		Meal vegMeal = builder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("total cost : " + vegMeal.getCost());
		
		Meal nonVegMeal = builder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("total cost : " + vegMeal.getCost());
		
	}
}
