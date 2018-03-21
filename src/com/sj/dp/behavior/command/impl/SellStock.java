package com.sj.dp.behavior.command.impl;

import com.sj.dp.behavior.command.Order;

/**
 * 出售命令
 */
public class SellStock implements Order {
   private Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   @Override
   public void execute() {
      abcStock.sell();
   }
}