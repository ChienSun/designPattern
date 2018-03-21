package com.sj.dp.structPattern.flyweight.impl;

import com.sj.dp.structPattern.flyweight.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 *  图形工厂
 */
public class ShapeFactory {

   // 存放已存在的图形对象
   private static final Map<String, Shape> circleMap = new HashMap<String, Shape>();

   // 通过颜色获取圆形
   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);
      if(circle == null) {
         circle = new Circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }

}