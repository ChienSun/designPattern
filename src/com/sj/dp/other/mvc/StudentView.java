package com.sj.dp.other.mvc;

/**
 *  展示学生信息
 */
public class StudentView {

   public void printStudentDetails(String studentName, String studentRollNo){
      System.out.println("Student: ");
      System.out.println(" Name: " + studentName);
      System.out.println("    Roll No: " + studentRollNo);
   }

}