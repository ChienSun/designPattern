package com.sj.dp.structPattern.bridge;

/**
 * 图形接口抽象类
 * @author 孙建
 */
public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
