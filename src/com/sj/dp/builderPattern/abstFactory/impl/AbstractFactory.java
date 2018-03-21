package com.sj.dp.builderPattern.abstFactory.impl;

import com.sj.dp.builderPattern.abstFactory.Color;

/**
 * 抽象工厂 - 生产工厂
 * @author 孙建
 */
public abstract class AbstractFactory {
	
	public static final String SHAPE_FACTORY = "shapeFactory";	// 图形工厂
	public static final String COLOR_FACTORY = "colorFactory";	// 颜色工厂

	/** 生产图形 */
	public abstract Shape getShape(String shapeName);
	/** 生产颜色 */
	public abstract Color getColor(String colorName);
}
