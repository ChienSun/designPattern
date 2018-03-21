package com.sj.dp.structPattern.facade.impl;

import com.sj.dp.structPattern.facade.Shape;

/**
 * 图形制造商
 */
public class ShapeMaker {

   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}