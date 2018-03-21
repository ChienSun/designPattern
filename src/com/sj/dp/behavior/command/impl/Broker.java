package com.sj.dp.behavior.command.impl;

import com.sj.dp.behavior.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 *  制作商
 */
public class Broker {

   private List<Order> orderList = new ArrayList<Order>();

   public void takeOrder(Order order){
      orderList.add(order);
   }

   public void placeOrders(){
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}