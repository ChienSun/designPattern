package com.sj.dp.builderPattern.prototype.impl;

import com.sj.dp.builderPattern.prototype.Shape;

/**
 * 矩形
 * @author 孙建
 */
public class Rectangle extends Shape{
	
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("draw rectangle");
	}
	
}
