package com.sj.test.other;

import com.sj.dp.other.busiDel.impl.BusinessDelegate;
import com.sj.dp.other.busiDel.impl.Client;

/**
 *  业务委派模式测试
 */
public class BusiDelTest {

   public static void main(String[] args) {

      BusinessDelegate businessDelegate = new BusinessDelegate();
      businessDelegate.setServiceType("EJB");

      Client client = new Client(businessDelegate);
      client.doTask();

      businessDelegate.setServiceType("JMS");
      client.doTask();
   }
}