/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.objectoriented.inheritance;

class Student{ 
    public double computeCGPA(String grade, int creditUnit){
        int gradePoint = 0;
        if (grade.equals("A")){
            gradePoint = 5;
        }else if (grade.equals("B")){
            gradePoint = 4;
        }else if (grade.equals("C")){
            gradePoint = 3;
        }else if (grade.equals("D")){
            gradePoint = 2;
        }else if (grade.equals("E")){
            gradePoint = 1;
        }else if (grade.equals("F")){
            gradePoint = 0;
        }else {
            gradePoint = 0;
        }
        
        System.out.println("Grade point is : " + gradePoint);
        double pointAverage = (double)gradePoint/creditUnit;
        return pointAverage;
    }
} 

class PublicUniversity extends Student{  
    int pointScale = 5;  
} 

class PrivateUniversity extends Student{  
    int pointScale = 4;  
} 
    
public class Inheritance {  
    public static void main(String args[]){  
        Student stud = new Student();
        double gradstud  = stud.computeCGPA("D",5);
        
        PublicUniversity pu = new PublicUniversity();      
        PrivateUniversity pr = new PrivateUniversity();       
               
        System.out.println("The CGPA of the student in a public university is : " + gradstud*pu.pointScale);
        System.out.println("The CGPA of the student in a private university is : " + gradstud*pr.pointScale);
    }  
}  


