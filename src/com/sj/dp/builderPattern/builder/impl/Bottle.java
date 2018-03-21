package com.sj.dp.builderPattern.builder.impl;

import com.sj.dp.builderPattern.builder.Packing;

/**
 * 瓶子 - 包装类型
 * @author 孙建
 */
public class Bottle implements Packing{

	@Override
	public String pack() {
		return "bottle";
	}

}
