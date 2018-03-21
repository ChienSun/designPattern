package com.sj.dp.other.nullP.impl;

import com.sj.dp.other.nullP.AbstractCustomer;

/**
 *  客户
 */
public class RealCustomer extends AbstractCustomer {

   public RealCustomer(String name) {
      this.name = name;
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public boolean isNil() {
      return false;
   }
}