package com.sj.dp.structPattern.bridge.impl;

import com.sj.dp.structPattern.bridge.DrawAPI;

/**
 * 红色圆形
 * @author 孙建
 */
public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("draw RedCircle at " + radius + " " + x + " " + y);
	}

}
