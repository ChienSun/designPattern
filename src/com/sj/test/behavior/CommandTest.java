package com.sj.test.behavior;

import com.sj.dp.behavior.command.impl.Broker;
import com.sj.dp.behavior.command.impl.BuyStock;
import com.sj.dp.behavior.command.impl.SellStock;
import com.sj.dp.behavior.command.impl.Stock;

/**
 * 命令模式测试
 */
public class CommandTest {

   public static void main(String[] args) {

      Stock abcStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   }
}