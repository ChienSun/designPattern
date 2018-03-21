package com.sj.dp.structPattern.chain;

/**
 *  抽象日志类
 */
public abstract class AbstractLogger {

   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;

   protected int level;

   // 下一个对象的引用
   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
      if(nextLogger != null){
         nextLogger.logMessage(level, message);
      }
   }

   abstract protected void write(String message);

}