package com.sj.dp.builderPattern.prototype.impl;

import com.sj.dp.builderPattern.prototype.Shape;

/**
 * 正方形
 * @author 孙建
 */
public class Square extends Shape{

	public Square() {
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("draw square");
	}

}
