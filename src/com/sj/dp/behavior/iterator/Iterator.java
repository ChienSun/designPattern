package com.sj.dp.behavior.iterator;

/**
 *  迭代器接口
 */
public interface Iterator {

   /**
    * 是否有下一个元素
    */
   public boolean hasNext();

   /**
    * 返回下一个元素
    */
   public Object next();

}