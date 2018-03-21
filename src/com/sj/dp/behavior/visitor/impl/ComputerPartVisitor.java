package com.sj.dp.behavior.visitor.impl;

/**
 *  访问者接口
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);

}