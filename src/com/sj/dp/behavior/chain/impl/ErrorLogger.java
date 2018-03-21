package com.sj.dp.structPattern.chain.impl;

import com.sj.dp.structPattern.chain.AbstractLogger;

/**
 *  错误日志打印
 */
public class ErrorLogger extends AbstractLogger {

   public ErrorLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {        
      System.out.println("Error Console::Logger: " + message);
   }
}