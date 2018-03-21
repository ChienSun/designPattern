package com.sj.dp.behavior.mediator;

import java.util.Date;

/**
 *  聊天室
 */
public class ChatRoom {

   /**
    * 显示用户信息
    */
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }

}