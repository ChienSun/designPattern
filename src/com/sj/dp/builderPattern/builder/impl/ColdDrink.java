package com.sj.dp.builderPattern.builder.impl;

import com.sj.dp.builderPattern.builder.Item;
import com.sj.dp.builderPattern.builder.Packing;

/**
 * 冷饮
 * @author 孙建
 */
public abstract class ColdDrink implements Item{

	/**
	 * 冷饮需要使用瓶子包装
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

	
	
}
