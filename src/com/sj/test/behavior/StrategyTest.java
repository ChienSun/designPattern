package com.sj.test.behavior;


import com.sj.dp.behavior.strategy.impl.Context;
import com.sj.dp.behavior.strategy.impl.OperationAdd;
import com.sj.dp.behavior.strategy.impl.OperationMultiply;
import com.sj.dp.behavior.strategy.impl.OperationSubstract;

/**
 *  策略模式测试
 */
public class StrategyTest {

   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}