package com.sj.dp.structPattern.decorator.impl;

import com.sj.dp.structPattern.decorator.Shape;

/**
 * 图形装饰器
 */
public abstract class ShapeDecorator implements Shape {

   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }
}