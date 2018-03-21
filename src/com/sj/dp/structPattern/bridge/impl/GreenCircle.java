package com.sj.dp.structPattern.bridge.impl;

import com.sj.dp.structPattern.bridge.DrawAPI;

/**
 * 绿色圆形
 * @author 孙建
 */
public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("draw GreenCircle at " + radius + " " + x + " " + y);
	}

}
