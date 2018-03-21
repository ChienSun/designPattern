package com.sj.test.behavior;

import com.sj.dp.behavior.memento.CareTaker;
import com.sj.dp.behavior.memento.Originator;

/**
 *  备忘录模式测试
 */
public class MementoTest {

   public static void main(String[] args) {

      Originator originator = new Originator();
      originator.setState("State #1");
      originator.setState("State #2");

      CareTaker careTaker = new CareTaker();
      careTaker.add(originator.saveStateToMemento());

      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());

      originator.setState("State #4");
      System.out.println("Current State: " + originator.getState());        

      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}