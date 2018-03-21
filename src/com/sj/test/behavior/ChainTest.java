package com.sj.test.behavior;

import com.sj.dp.structPattern.chain.AbstractLogger;
import com.sj.dp.structPattern.chain.impl.ConsoleLogger;
import com.sj.dp.structPattern.chain.impl.ErrorLogger;
import com.sj.dp.structPattern.chain.impl.FileLogger;

/**
 *  责任链模式测试
 */
public class ChainTest {

   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);

      return errorLogger;
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");

      loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information.");

      loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
   }
}