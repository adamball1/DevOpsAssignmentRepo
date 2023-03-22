/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.facade;

import com.lecture.designpatterns.factory.*;
import com.lecture.lecture.*;

/**
 *
 * @author Me
 */
public class Facadepattern {
    
    public static void main(String args[]){  
        CourseMaker courseMaker = new CourseMaker();
        
        courseMaker.getCodeSoftwareDep();
        courseMaker.getCodeSoftwareDes();
        courseMaker.getCodeSoftwareReq();
    }  
}



