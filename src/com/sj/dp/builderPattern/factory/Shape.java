package com.sj.dp.builderPattern.factory;

/**
 * 图形接口
 * @author 孙建
 */
public interface Shape {
	
	String RECTANGLE = "rectangle";	// 长方形
	String SQUARE = "square";		// 矩形
	String CIRCLE = "circle";		// 圆形

	/** 绘画 */
	void draw();
}
