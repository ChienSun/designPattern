package com.sj.dp.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *  被观察的主题
 */
public class Subject {

   // 观察员列表
   private List<Observer> observers = new ArrayList<Observer>();

   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      // 状态改变通知所有观察者
      notifyAllObservers();
   }

   // 添加观察者
   public void attach(Observer observer){
      observers.add(observer);
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }     
}