package com.sj.test.structPattern;

import com.sj.dp.structPattern.facade.impl.ShapeMaker;

/**
 *  外观模式测试
 */
public class FacadeTest {

   public static void main(String[] args) {

      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();
   }
}