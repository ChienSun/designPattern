package com.sj.dp.other.nullP.impl;

import com.sj.dp.other.nullP.AbstractCustomer;

/**
 *  客户工厂
 */
public class CustomerFactory {

   public static final String[] names = {"Rob", "Joe", "Julie"};

   public static AbstractCustomer getCustomer(String name){
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealCustomer(name);
         }
      }
      return new NullCustomer();
   }
}