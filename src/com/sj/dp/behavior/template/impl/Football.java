package com.sj.dp.behavior.template.impl;

/**
 *  足球游戏
 */

import com.sj.dp.behavior.template.Game;

public class Football extends Game {

   @Override
   public void endPlay() {
      System.out.println("Football Game Finished!");
   }

   @Override
   public void initialize() {
      System.out.println("Football Game Initialized! Start playing.");
   }

   @Override
   public void startPlay() {
      System.out.println("Football Game Started. Enjoy the game!");
   }
}