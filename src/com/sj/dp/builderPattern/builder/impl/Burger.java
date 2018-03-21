package com.sj.dp.builderPattern.builder.impl;

import com.sj.dp.builderPattern.builder.Item;
import com.sj.dp.builderPattern.builder.Packing;

/**
 * 汉堡包
 * @author 孙建
 */
public abstract class Burger implements Item{

	/**
	 * 汉堡包打包使用包装纸
	 */
	@Override
	public Packing packing() {
		return new Wapper();
	}

	@Override
	public abstract float price();

}
