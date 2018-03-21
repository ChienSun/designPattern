package com.sj.dp.other.filter.impl;

import com.sj.dp.other.filter.Criteria;
import com.sj.dp.other.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *  特殊人群
 */
public class CriteriaSingle implements Criteria {

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> singlePersons = new ArrayList<Person>(); 

      for (Person person : persons) {
         if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
            singlePersons.add(person);
         }
      }
      return singlePersons;
   }
}