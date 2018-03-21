package com.sj.test.behavior;

import com.sj.dp.behavior.visitor.ComputerPart;
import com.sj.dp.behavior.visitor.impl.Computer;
import com.sj.dp.behavior.visitor.impl.ComputerPartDisplayVisitor;

/**
 *  访问者模式测试
 */
public class VisitorTest {
   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());

   }
}