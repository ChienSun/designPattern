package com.sj.dp.behavior.memento;

/**
 *  备忘录类
 */
public class Memento {

   private String state;   // 状态

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }    
}