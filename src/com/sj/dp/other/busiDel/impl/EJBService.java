package com.sj.dp.other.busiDel.impl;

import com.sj.dp.other.busiDel.BusinessService;

/**
 *  EJB服务
 */
public class EJBService implements BusinessService {

   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking EJB Service");
   }

}