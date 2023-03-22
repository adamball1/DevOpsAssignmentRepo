/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.objectoriented.abstractclass;

/**
 *
 * @author Me
 */

abstract class Course {
  
  public abstract void courseCode();
  
  public void courseName() {
    System.out.println("Advanced Object-oriented programming II");
  }
}


class Assignment extends Course {
  public void courseCode() {
    System.out.println("The course code is : CSC 481");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    Assignment a = new Assignment(); 
    a.courseCode();
    a.courseName();
  }
}
