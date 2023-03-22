/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.dao;

import com.courseregistration.model.CourseRegistration;
import java.util.List;

/**
 *
 * @author Me
 */
public interface CourseRegistrationDao { 
    void findAll();
    void findById(String coursecode);
    void save(CourseRegistration courseregistration);
    void update(String academicsession, String matno, String coursecode);
    void delete(String matno, String coursecode);
    
}
