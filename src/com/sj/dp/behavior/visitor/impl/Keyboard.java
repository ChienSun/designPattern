package com.sj.dp.behavior.visitor.impl;

import com.sj.dp.behavior.visitor.ComputerPart;

/**
 *  键盘
 */
public class Keyboard implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }

}