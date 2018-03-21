package com.sj.dp.behavior.iterator.impl;

import com.sj.dp.behavior.iterator.Container;
import com.sj.dp.behavior.iterator.Iterator;

/**
 *  集合
 */
public class NameRepository implements Container {

   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   /**
    * 迭代器
    */
   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }        
   }
}