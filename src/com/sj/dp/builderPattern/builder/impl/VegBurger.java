package com.sj.dp.builderPattern.builder.impl;

/**
 * 素食汉堡 - 抽象汉堡具体的实现类
 * @author 孙建
 */
public class VegBurger extends Burger{

	/**
	 * 汉堡的名称
	 */
	@Override
	public String name() {
		return "Veg Burger";
	}

	/**
	 * 汉堡价格
	 */
	@Override
	public float price() {
		return 15.5F;
	}

}
