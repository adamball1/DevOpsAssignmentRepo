/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.objectoriented.polymorphism;

/**
 *
 * @author Me
 */


class Grade{  
    String getGrade(){return "";}  
} 

//Creating child classes.  
class CSC1 extends Grade{  
    String getGrade(){return "A";}  
}  
  
class CSC2 extends Grade{  
    String getGrade(){return "B";}  
} 

class CSC3 extends Grade{  
    String getGrade(){return "F";}  
} 

//Test class to create objects and call the methods  
public class MethodOverriding{  
    public static void main(String args[]){  
        CSC1 a = new CSC1();
        CSC2 b = new CSC2();
        CSC3 c = new CSC3();
        
        System.out.println("Grade Point: "+ a.getGrade());
        System.out.println("Grade Point: "+ b.getGrade());
        System.out.println("Grade Point: "+ c.getGrade()); 
    }  
}  