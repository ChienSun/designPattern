package com.sj.dp.builderPattern.abstFactory.impl;

import com.sj.dp.builderPattern.abstFactory.Color;

/**
 * 颜色工厂  - 生产颜色
 * @author 孙建
 */
public class ColorFactory extends AbstractFactory{

	/**
	 * 获取颜色
	 */
	public Color getColor(String colorName) {
		if(colorName == null) {
			return null;
		}else if(Color.GREEN.equals(colorName)) {
			return new Green();
		}else if(Color.BLUE.equals(colorName)) {
			return new Blue();
		}
		return null;
	}

	
	@Override
	public Shape getShape(String shapeName) {
		return null;
	}

}
