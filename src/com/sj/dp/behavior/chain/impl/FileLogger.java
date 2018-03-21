package com.sj.dp.structPattern.chain.impl;

import com.sj.dp.structPattern.chain.AbstractLogger;

/**
 *  文件日志打印
 */
public class FileLogger extends AbstractLogger {

   public FileLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {        
      System.out.println("File::Logger: " + message);
   }
}