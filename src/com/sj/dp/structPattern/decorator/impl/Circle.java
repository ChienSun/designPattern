package com.sj.dp.structPattern.decorator.impl;

import com.sj.dp.structPattern.decorator.Shape;

/**
 * 圆形
 */
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

}