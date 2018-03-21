package com.sj.test.builderPattern;

import com.sj.dp.builderPattern.factory.Shape;
import com.sj.dp.builderPattern.factory.impl.ShapeFactory;

/**
 * 工厂模式测试
 * @author 孙建
 */
public class ShapeFactoryTest {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShape(Shape.RECTANGLE);
		Shape shape2 = factory.getShape(Shape.SQUARE);
		Shape shape3 = factory.getShape(Shape.CIRCLE);
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
}
