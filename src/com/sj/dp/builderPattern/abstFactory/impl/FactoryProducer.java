package com.sj.dp.builderPattern.abstFactory.impl;

/**
 * 工厂提供者
 * @author 孙建
 */
public class FactoryProducer {

	/**
	 * 生产工厂
	 */
	public static AbstractFactory getFactory(String factoryName) {
		if(factoryName == null) {
			return null;
		}else if(AbstractFactory.SHAPE_FACTORY.equals(factoryName)){
			return new ShapeFactory();
		}else if(AbstractFactory.COLOR_FACTORY.equals(factoryName)){
			return new ColorFactory();
		}
		return null;
	}
}
