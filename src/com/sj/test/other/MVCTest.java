package com.sj.test.other;

import com.sj.dp.other.mvc.Student;
import com.sj.dp.other.mvc.StudentController;
import com.sj.dp.other.mvc.StudentView;

/**
 *  MVC模式测试
 */
public class MVCTest {

   public static void main(String[] args) {

      Student student = new Student();
      student.setName("Robert");
      student.setRollNo("10");

      StudentView view = new StudentView();

      StudentController controller = new StudentController(student, view);

      controller.updateView();

      controller.setStudentName("John");

      controller.updateView();
   }

}