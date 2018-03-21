package com.sj.dp.behavior.command.impl;

/**
 *  请求对象
 */
public class Stock {

   private String name = "ABC";
   private int quantity = 10;

   /**
    *  购买
    */
   public void buy(){
      System.out.println("Stock [ Name: "+ name+ ",Quantity: " + quantity +" ] bought");  // 购买
   }

   // 出售
   public void sell(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");     // 出售
   }
}