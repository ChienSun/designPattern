package com.sj.dp.behavior.visitor;

import com.sj.dp.behavior.visitor.impl.ComputerPartVisitor;

/**
 *  电脑组成接口
 */
public interface ComputerPart {

   public void accept(ComputerPartVisitor computerPartVisitor);

}