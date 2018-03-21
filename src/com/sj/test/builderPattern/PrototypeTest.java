package com.sj.test.builderPattern;

import com.sj.dp.builderPattern.prototype.Shape;
import com.sj.dp.builderPattern.prototype.cache.ShapeCache;

/**
 * 原型测试
 * @author 孙建
 */
public class PrototypeTest {

	public static void main(String[] args) {
		// 加载缓存
		ShapeCache.loadCache();
		
		Shape shape1 = ShapeCache.getShape(ShapeCache.CIRCLE);
		Shape shape2 = ShapeCache.getShape(ShapeCache.RECTANGLE);
		Shape shape3 = ShapeCache.getShape(ShapeCache.SQUARE);
		
		System.out.println(shape1);
		System.out.println(shape2);
		System.out.println(shape3);
		
		Shape shape4 = ShapeCache.getShape(ShapeCache.CIRCLE);
		Shape shape5 = ShapeCache.getShape(ShapeCache.RECTANGLE);
		Shape shape6 = ShapeCache.getShape(ShapeCache.SQUARE);
		
		System.out.println(shape4);
		System.out.println(shape5);
		System.out.println(shape6);
	}
}
