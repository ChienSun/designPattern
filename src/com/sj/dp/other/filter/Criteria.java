package com.sj.dp.other.filter;

import java.util.List;

/**
 * 标准
 */
public interface Criteria {

    // 标准过滤
    public List<Person> meetCriteria(List<Person> persons);
    
}
