package com.sj.dp.builderPattern.prototype.cache;

import java.util.Hashtable;

import com.sj.dp.builderPattern.prototype.Shape;
import com.sj.dp.builderPattern.prototype.impl.Circle;
import com.sj.dp.builderPattern.prototype.impl.Rectangle;
import com.sj.dp.builderPattern.prototype.impl.Square;

/**
 * 图形缓存
 * @author 孙建
 */
public class ShapeCache {
	
	public static final String CIRCLE = "circle";
	public static final String RECTANGLE = "rectangle";
	public static final String SQUARE = "square";

	// 缓存map
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	// 获取图形
	public static Shape getShape(String shapeId) {
		Shape shape = shapeMap.get(shapeId);
		return (Shape) shape.clone();
	}
	
	public static void loadCache() {
		// 将圆形放到缓存中
		Circle circle = new Circle();
		circle.setId("circle");
		shapeMap.put(circle.getId(), circle);
		
		// 将矩形放到缓存中
		Rectangle rectangle = new Rectangle();
		rectangle.setId("rectangle");
		shapeMap.put(rectangle.getId(), rectangle);
		
		// 将正方形放到缓存中
		Square square = new Square();
		square.setId("square");
		shapeMap.put(square.getId(), square);
	}
}
