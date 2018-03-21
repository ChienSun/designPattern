package com.sj.dp.behavior.visitor.impl;

import com.sj.dp.behavior.visitor.ComputerPart;

/**
 * 鼠标
 */
public class Mouse implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }

}