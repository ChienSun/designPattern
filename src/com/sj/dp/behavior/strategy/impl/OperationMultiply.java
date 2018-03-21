package com.sj.dp.behavior.strategy.impl;

import com.sj.dp.behavior.strategy.Strategy;

/**
 *  乘法操作
 */
public class OperationMultiply implements Strategy {

   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }

}