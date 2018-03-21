package com.sj.dp.other.filter.impl;

import com.sj.dp.other.filter.Criteria;
import com.sj.dp.other.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *  过滤男性
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }

}
