package com.sj.dp.structPattern.flyweight.impl;

import com.sj.dp.structPattern.flyweight.Shape;

/**
 *  圆形
 */
public class Circle implements Shape {

   private String color;   // 颜色
   private int x;          // x轴坐标
   private int y;          // y轴坐标
   private int radius;    // 半径

   public Circle(String color){
      this.color = color;
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   @Override
   public void draw() {
      System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
   }
}