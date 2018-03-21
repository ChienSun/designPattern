package com.sj.dp.behavior.state.impl;

import com.sj.dp.behavior.state.State;

/**
 *  停止状态
 */
public class StopState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);    
   }

   public String toString(){
      return "Stop State";
   }
}