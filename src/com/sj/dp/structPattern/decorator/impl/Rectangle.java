package com.sj.dp.structPattern.decorator.impl;

import com.sj.dp.structPattern.decorator.Shape;

/**
 * 矩形
 */
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

}