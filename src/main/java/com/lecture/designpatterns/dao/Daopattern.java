/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.dao;

import com.courseregistration.model.CourseRegistration;
import com.lecture.designpatterns.dao.CourseRegistrationDao;
import com.lecture.designpatterns.dao.CourseRegistrationDaoImpl;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author Me
 */
public class Daopattern {
    public static void main(String[] args)throws ParseException, SQLException, FileNotFoundException {
        CourseRegistrationDaoImpl courseregistrationDao = new CourseRegistrationDaoImpl();
        
        CourseRegistration cr = new CourseRegistration();
        cr.setId(3);
        cr.setMatno("UD003");
        cr.setCoursecode("GA003");
        cr.setTerm(2);
        cr.setAcademicsession("2024");
        courseregistrationDao.save(cr);
        
        // display all records
        courseregistrationDao.findAll();
        
        // display a single record
        courseregistrationDao.findById("GA002");
        //System.out.println(courseregistration);
        
        //update record
        //courseregistrationDao.update("2028", "UD003", "GA003");
        
        //delete record
        //courseregistrationDao.delete("UD003", "GA003");
        
    }
}
