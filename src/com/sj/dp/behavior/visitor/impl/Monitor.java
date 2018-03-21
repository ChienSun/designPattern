package com.sj.dp.behavior.visitor.impl;

import com.sj.dp.behavior.visitor.ComputerPart;

/**
 * 显示器
 */
public class Monitor implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}