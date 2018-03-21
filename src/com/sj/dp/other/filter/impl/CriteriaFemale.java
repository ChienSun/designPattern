package com.sj.dp.other.filter.impl;

import com.sj.dp.other.filter.Criteria;
import com.sj.dp.other.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *  过滤女性
 */
public class CriteriaFemale implements Criteria {

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> femalePersons = new ArrayList<Person>(); 

      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("FEMALE")){
            femalePersons.add(person);
         }
      }
      return femalePersons;
   }
}