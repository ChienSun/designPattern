package com.sj.dp.behavior.state.impl;

import com.sj.dp.behavior.state.State;

/**
 *  开始状态
 */
public class StartState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this);
   }

   public String toString(){
      return "Start State";
   }
}