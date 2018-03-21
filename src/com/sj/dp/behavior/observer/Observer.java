package com.sj.dp.behavior.observer;

/**
 *  观察员
 */
public abstract class Observer {

   protected Subject subject;

   // 通知
   public abstract void update();

}