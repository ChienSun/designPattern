package com.sj.dp.other.busiDel.impl;

import com.sj.dp.other.busiDel.BusinessService;

/**
 *  业务委派类
 */
public class BusinessDelegate {

   private BusinessLookUp lookupService = new BusinessLookUp();
   private BusinessService businessService;
   private String serviceType;

   public void setServiceType(String serviceType){
      this.serviceType = serviceType;
   }

   public void doTask(){
      businessService = lookupService.getBusinessService(serviceType);
      businessService.doProcessing();
   }
}