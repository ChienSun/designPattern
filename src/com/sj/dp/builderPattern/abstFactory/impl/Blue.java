package com.sj.dp.builderPattern.abstFactory.impl;

import com.sj.dp.builderPattern.abstFactory.Color;

/**
 * 蓝色
 * @author 孙建
 */
public class Blue implements Color{

	@Override
	public void fill() {
		System.out.println("fill蓝色");
	}

}
