/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courseregistration.dao.list;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Me
 */
public class DaopatternList {
 
    public static void main(String[] args) {
        CourseRegistrationDaoImplList courseregistrationDaolist = new CourseRegistrationDaoImplList();
        
        CourseRegistration cr = new CourseRegistration();
        cr.setId(1);
        cr.setMatno("UD01");
        cr.setCoursecode("GA01");
        cr.setTerm(1);
        cr.setAcademicsession("2021");
        courseregistrationDaolist.save(cr);
        
        cr = new CourseRegistration();
        cr.setId(2);
        cr.setMatno("UD02");
        cr.setCoursecode("GA02");
        cr.setTerm(2);
        cr.setAcademicsession("2021");
        courseregistrationDaolist.save(cr);
        
        List<CourseRegistration> courseregistration = courseregistrationDaolist.findAll();
        System.out.println(courseregistration);
        
        
        CourseRegistration id = courseregistrationDaolist.findById(2);
        System.out.println(id);
        
        courseregistrationDaolist.update(cr, "UD0001XX");
        System.out.println(id);
        
        
        
    }
    
    
    
    
}
