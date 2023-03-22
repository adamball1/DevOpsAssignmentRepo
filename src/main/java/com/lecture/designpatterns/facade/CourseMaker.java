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

public class CourseMaker {
   private CourseRegistered softwaredep;
   private CourseRegistered softwaredes;
   private CourseRegistered softwarereq;

   public CourseMaker() {
      softwaredep = new SoftwareDep();
      softwaredes = new SoftwareDes();
      softwarereq = new SoftwareReq();
   }

   public void getCodeSoftwareDep(){
       softwaredep.getCode();
   }

   public void getCodeSoftwareDes(){
       softwaredes.getCode();
   }
   
   public void getCodeSoftwareReq(){
       softwarereq.getCode();
   }
   
}