package com.sj.dp.behavior.interpreter.impl;

import com.sj.dp.behavior.interpreter.Expression;

/**
 * 终结符解释器
 */
public class TerminalExpression implements Expression {

   private String data;

   public TerminalExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
      if(data.contains(context)){
         return true;
      }
      return false;
   }
}