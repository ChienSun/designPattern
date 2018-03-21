package com.sj.dp.structPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *  员工类
 */
public class Employee {

   private String name;  // 姓名
   private String dept;  // 部门
   private int salary;  // 薪资
   private List<Employee> subordinates; // 下属员工

   public Employee(String name, String dept, int salary) {
      this.name = name;
      this.dept = dept;
      this.salary = salary;
      subordinates = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
   }
}