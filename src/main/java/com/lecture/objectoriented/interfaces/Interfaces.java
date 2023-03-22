/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.objectoriented.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Me
 */


interface CourseInterface {
    public void createCourse(String coursecode, ArrayList<String> courses);
    public void readCourse(ArrayList<String> courses);
    public void updateCourse(String coursecode, ArrayList<String> courses);
    public void deleteCourse(String coursecode, ArrayList<String> courses);
}


class CourseInterfaceImpl implements CourseInterface{
    
    public void createCourse(String coursecode, ArrayList<String> courses){
        courses.add(coursecode);
    }
    
    public void readCourse(ArrayList<String> courses){
        for (int i = 0; i<courses.size();i++){
            System.out.println("Courses " + i + " : " + courses.get(i));
        }
    }
    
    
    public void updateCourse(String coursecode, ArrayList<String> courses){
        courses.set(5, "CSC 486");
    }
    
    public void deleteCourse(String coursecode, ArrayList<String> courses){
     courses.remove(0);
    }
    
    
}

public class Interfaces {  
    public static void main(String args[]){  
        ArrayList<String> courses = new ArrayList<String>();
        CourseInterfaceImpl course = new CourseInterfaceImpl();
        
        String courseCode1 = "CSC 481";
        String courseCode2 = "CSC 482";
        String courseCode3 = "CSC 483";
        String courseCode4 = "CSC 484";
        String courseCode5 = "CSC 485";
         
        course.createCourse(courseCode1,courses);
        course.createCourse(courseCode2,courses);
        course.createCourse(courseCode3,courses);
        course.createCourse(courseCode4,courses);
        course.createCourse(courseCode5,courses);
        course.readCourse(courses);
    }  
}  
