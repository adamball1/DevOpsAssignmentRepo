/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courseregistration.dao.list;

import java.util.List;

/**
 *
 * @author Me
 */

public interface CourseRegistrationDaoList {     
    public List<CourseRegistration> findAll();
    public CourseRegistration findById(int id);
    public void save(CourseRegistration courseregistration);
    public void delete(CourseRegistration courseregistration);
    public void update(CourseRegistration courseregistration, String coursecode);

}

