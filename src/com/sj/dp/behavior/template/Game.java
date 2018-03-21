package com.sj.dp.behavior.template;

/**
 *  游戏
 */
public abstract class Game {

   public abstract void initialize();
   public abstract void startPlay();
   public abstract void endPlay();

   public final void play(){
      initialize();
      startPlay();
      endPlay();
   }
}