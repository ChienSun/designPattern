package com.sj.dp.behavior.interpreter;

/**
 * 表达式接口
 */
public interface Expression {

   /**
    * 解释
    */
   public boolean interpret(String context);

}