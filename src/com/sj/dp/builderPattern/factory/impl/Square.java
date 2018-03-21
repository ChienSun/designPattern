package com.sj.dp.builderPattern.factory.impl;

import com.sj.dp.builderPattern.factory.Shape;

/**
 * 矩形
 * @author 孙建
 */
public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("draw矩形");
	}

}
