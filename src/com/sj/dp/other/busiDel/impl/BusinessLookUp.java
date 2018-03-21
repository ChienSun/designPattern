package com.sj.dp.other.busiDel.impl;

import com.sj.dp.other.busiDel.BusinessService;

/**
 * 业务查找服务
 */
public class BusinessLookUp {

   public BusinessService getBusinessService(String serviceType){
      if(serviceType.equalsIgnoreCase("EJB")){
         return new EJBService();
      }else {
         return new JMSService();
      }
   }

}