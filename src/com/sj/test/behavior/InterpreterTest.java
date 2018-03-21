package com.sj.test.behavior;

import com.sj.dp.behavior.interpreter.Expression;
import com.sj.dp.behavior.interpreter.impl.AndExpression;
import com.sj.dp.behavior.interpreter.impl.OrExpression;
import com.sj.dp.behavior.interpreter.impl.TerminalExpression;

/**
 *  解释器模式测试
 *  不是很懂...
 */
public class InterpreterTest {

   public static void main(String[] args) {
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      OrExpression orExpression = new OrExpression(robert, john);
      System.out.println("John is male? " + orExpression.interpret("John"));


      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      AndExpression andExpression = new AndExpression(julie, married);
      System.out.println("Julie is a married women? " + andExpression.interpret("Married Julie"));
   }
}