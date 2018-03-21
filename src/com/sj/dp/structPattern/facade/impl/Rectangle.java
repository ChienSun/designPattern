package com.sj.dp.structPattern.facade.impl;

import com.sj.dp.structPattern.facade.Shape;

/**
 * 矩形
 */
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }

}