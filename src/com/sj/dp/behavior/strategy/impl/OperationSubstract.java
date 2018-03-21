package com.sj.dp.behavior.strategy.impl;

import com.sj.dp.behavior.strategy.Strategy;

/**
 *  减操作
 */
public class OperationSubstract implements Strategy {

   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }

}