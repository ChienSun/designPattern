package com.sj.dp.builderPattern.factory.impl;

import com.sj.dp.builderPattern.factory.Shape;

/**
 * 长方形
 * @author 孙建
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("draw长方形");
	}

}
