/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.factory;

import com.lecture.lecture.*;

/**
 *
 * @author Me
 */
public class Factorypattern {
    
    public static void main(String args[]){  
        CoursecodeFactory courseCode = new CoursecodeFactory();
        
        //get an object of Software Deployment and call its get course code method
        CourseRegistered registered1 = courseCode.getCourseCode(3);
        
        // call the get course code method of Software Deployment
        registered1.getCode();
    }  
    
}



