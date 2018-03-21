package com.sj.dp.behavior.state.impl;

import com.sj.dp.behavior.state.State;

public class Context {

   private State state;

   public Context(){
      state = null;
   }

   public void setState(State state){
      this.state = state;
   }

   public State getState(){
      return state;
   }
}