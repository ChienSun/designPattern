package com.sj.dp.builderPattern.builder.impl;

/**
 * 百事可乐 - 冷饮具体的实现
 * @author 孙建
 */
public class Pepsi extends ColdDrink{

	/**
	 * 冷饮的名称
	 */
	@Override
	public String name() {
		return "Pepsi";
	}

	/**
	 * 冷饮的价格
	 */
	@Override
	public float price() {
		return 3.0F;
	}

}
