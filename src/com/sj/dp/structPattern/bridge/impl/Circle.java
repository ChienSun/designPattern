package com.sj.dp.structPattern.bridge.impl;

import com.sj.dp.structPattern.bridge.DrawAPI;
import com.sj.dp.structPattern.bridge.Shape;

/**
 * 圆形
 * @author 孙建
 */
public class Circle extends Shape{

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
