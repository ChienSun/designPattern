package com.sj.dp.structPattern.chain.impl;

import com.sj.dp.structPattern.chain.AbstractLogger;

/**
 * 工作台打印
 */
public class ConsoleLogger extends AbstractLogger {

   public ConsoleLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {        
      System.out.println("Standard Console::Logger: " + message);
   }
}