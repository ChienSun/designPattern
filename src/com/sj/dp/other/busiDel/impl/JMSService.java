package com.sj.dp.other.busiDel.impl;

import com.sj.dp.other.busiDel.BusinessService;

/**
 *  JMS服务
 */
public class JMSService implements BusinessService {

   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking JMS Service");
   }

}