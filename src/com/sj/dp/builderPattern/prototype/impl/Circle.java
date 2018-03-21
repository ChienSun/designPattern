package com.sj.dp.builderPattern.prototype.impl;

import com.sj.dp.builderPattern.prototype.Shape;

/**
 * 圆形
 * @author 孙建
 */
public class Circle extends Shape{
	
	public Circle() {
		type = "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("draw circle");
	}

}
