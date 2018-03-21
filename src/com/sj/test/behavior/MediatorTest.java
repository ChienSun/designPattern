package com.sj.test.behavior;

import com.sj.dp.behavior.mediator.User;

/**
 * 中介者模式测试
 */
public class MediatorTest {

   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");

   }
}