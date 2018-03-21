package com.sj.dp.other.busiDel.impl;

/**
 *  客户端
 */
public class Client {

   BusinessDelegate businessService;

   public Client(BusinessDelegate businessService){
      this.businessService  = businessService;
   }

   public void doTask(){        
      businessService.doTask();
   }
}