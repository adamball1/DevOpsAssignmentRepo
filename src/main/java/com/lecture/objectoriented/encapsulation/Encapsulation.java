/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.objectoriented.encapsulation;

/**
 *
 * @author Me
 */


class Student{  
    //private data member  
    public String Matno;
    private String name;  
    
    //getter and setter method for variables  
    public String getName(){  
    return name;  
    }  
    
    public void setName(String name){  
    this.name=name;  
    }  

    
//    public String getMatno() {
//        return Matno;
//    }

    
    public void setMatno(String Matno) {
        this.Matno = Matno;
    }
    
}  


public class Encapsulation {
    public static void main(String[] args){  
        //creating instance of the encapsulated class  
        Student s=new Student();  
        //setting value in the name member  
        s.setName("Charles");  
        //getting value of the name member  
        System.out.println(s.getName());  
        
        //Compile-time Error
        //It is not possible to get the value of the Matno, you can only change the value of Matno data member.
        //System.out.println(s.getMatno());//Compile Time Error, because there is no such method  
        
        //Matno cannot be accessed from outside the class, becuase the matno data member is private 
        s.setMatno("U/55000");
        System.out.println(s.Matno);
    }    
}
