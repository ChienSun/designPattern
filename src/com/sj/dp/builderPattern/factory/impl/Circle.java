package com.sj.dp.builderPattern.factory.impl;

import com.sj.dp.builderPattern.factory.Shape;

/**
 * 圆形
 * @author 孙建
 */
public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("draw圆形");
	}

}
