package com.sj.dp.builderPattern.builder.impl;

/**
 * 可口可乐 - 冷饮具体的实现
 * @author 孙建
 */
public class Coke extends ColdDrink{

	/**
	 * 冷饮的名称
	 */
	public String name() {
		return "Coke";
	}
	
	/**
	 * 冷饮的价格
	 */
	@Override
	public float price() {
		return 2.5F;
	}

}
