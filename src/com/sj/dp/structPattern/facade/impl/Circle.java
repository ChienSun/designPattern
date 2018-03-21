package com.sj.dp.structPattern.facade.impl;

import com.sj.dp.structPattern.facade.Shape;

/**
 * 圆形
 */
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }

}