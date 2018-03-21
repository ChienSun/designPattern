package com.sj.test.behavior;

import com.sj.dp.behavior.observer.BinaryObserver;
import com.sj.dp.behavior.observer.HexaObserver;
import com.sj.dp.behavior.observer.OctalObserver;
import com.sj.dp.behavior.observer.Subject;

/**
 *  观察员模式测试
 */
public class ObserverTest {

   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");    
      subject.setState(15);
      System.out.println("Second state change: 10");
      subject.setState(10);
   }

}