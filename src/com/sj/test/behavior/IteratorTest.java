package com.sj.test.behavior;

import com.sj.dp.behavior.iterator.Iterator;
import com.sj.dp.behavior.iterator.impl.NameRepository;

/**
 *  迭代器测试
 */
public class IteratorTest {

   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      Iterator iterator = namesRepository.getIterator();
      while(iterator.hasNext()){
         Object obj = iterator.next();
         System.out.println("name:" + obj);
      }
   }
}