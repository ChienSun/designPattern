package com.sj.dp.builderPattern.abstFactory.impl;

import com.sj.dp.builderPattern.abstFactory.Color;

/**
 * 图形工厂  - 生产图形
 * @author 孙建
 */
public class ShapeFactory extends AbstractFactory{

	/**
	 * 获取图形
	 */
	public Shape getShape(String shapeName) {
		if(shapeName == null) {
			return null;
		}else if(Shape.RECTANGLE.equals(shapeName)) {
			return new Rectangle();
		}else if(Shape.SQUARE.equals(shapeName)) {
			return new Square();
		}else if(Shape.CIRCLE.equals(shapeName)) {
			return new Circle();
		}
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		return null;
	}
}
