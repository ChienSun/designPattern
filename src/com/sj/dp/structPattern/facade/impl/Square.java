package com.sj.dp.structPattern.facade.impl;

import com.sj.dp.structPattern.facade.Shape;

/**
 *  正方形
 */
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }

}