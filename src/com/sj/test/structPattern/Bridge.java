package com.sj.test.structPattern;

import com.sj.dp.structPattern.bridge.Shape;
import com.sj.dp.structPattern.bridge.impl.Circle;
import com.sj.dp.structPattern.bridge.impl.GreenCircle;
import com.sj.dp.structPattern.bridge.impl.RedCircle;

/**
 * 桥接模式测试
 * @author 孙建
 */
public class Bridge {

	public static void main(String[] args) {
		Shape redShape = new Circle(100, 100, 10, new RedCircle());
		Shape greenShape = new Circle(100, 100, 10, new GreenCircle());
		redShape.draw();
		greenShape.draw();
	}
}

