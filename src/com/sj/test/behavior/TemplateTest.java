package com.sj.test.behavior;

import com.sj.dp.behavior.template.Game;
import com.sj.dp.behavior.template.impl.Cricket;
import com.sj.dp.behavior.template.impl.Football;

/**
 *  模板模式测试
 */
public class TemplateTest {

   public static void main(String[] args) {
      Game game = new Cricket();
      game.play();
      System.out.println();

      game = new Football();
      game.play();
   }
}