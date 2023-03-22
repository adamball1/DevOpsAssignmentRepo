/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.singleton;

import com.lecture.designpatterns.factory.CourseRegistered;
import com.lecture.designpatterns.factory.CoursecodeFactory;

/**
 *
 * @author Me
 */
public class SingleObject {
    private static SingleObject message = new SingleObject();
    private SingleObject(){};
    
    public static SingleObject getMessage(){
        return message;
    }
    
    public void displayMessage(){
        System.out.println("This is a demonstration of singleton pattern!");
    }
    
}
