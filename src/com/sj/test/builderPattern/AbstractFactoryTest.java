package com.sj.test.builderPattern;

import com.sj.dp.builderPattern.abstFactory.Color;
import com.sj.dp.builderPattern.abstFactory.impl.AbstractFactory;
import com.sj.dp.builderPattern.abstFactory.impl.FactoryProducer;
import com.sj.dp.builderPattern.abstFactory.impl.Shape;

/**
 * 抽象工厂测试
 * @author 孙建
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(AbstractFactory.SHAPE_FACTORY);
		Shape shape = shapeFactory.getShape(Shape.CIRCLE);
		shape.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory(AbstractFactory.COLOR_FACTORY);
		Color color = colorFactory.getColor(Color.BLUE);
		color.fill();
	}
}
