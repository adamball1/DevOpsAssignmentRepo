/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.factory;

/**
 *
 * @author Me
 */
public class CoursecodeFactory {
    
    public CourseRegistered getCourseCode(int term){
        if (term == 1 ){
            return new SoftwareReq();
        } else if(term ==2){
            return new SoftwareDes();
        } else if(term ==3){
            return new SoftwareDep();
        }
        
        return null;
    }
    
    
}
