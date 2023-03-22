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

public class SoftwareReq implements CourseRegistered {
    
    @Override
    public String getCode(){
        String courseCode = "GA003";
        System.out.println("Course code: " + courseCode);
        return courseCode;
    }
}