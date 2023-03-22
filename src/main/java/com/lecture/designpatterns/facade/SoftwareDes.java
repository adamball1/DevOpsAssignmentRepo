/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.facade;

import com.lecture.designpatterns.factory.*;

/**
 *
 * @author Me
 */



public class SoftwareDes  implements CourseRegistered {
    
    @Override
    public String getCode(){
        String courseCode = "GA002";
        System.out.println("Course code: " + courseCode);
        return courseCode;
    }
}
