/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.dao;

import com.courseregistration.model.CourseRegistration;
import static com.lecture.designpatterns.dao.CreateOperation.createOperation;
import static com.lecture.designpatterns.dao.DeleteOperation.deleteOperation;
import static com.lecture.designpatterns.dao.UpdateOperation.updateOperation;
import static com.lecture.designpatterns.dao.ReadAllOperation.readallOperation;
import static com.lecture.designpatterns.dao.ReadOperation.readOperation;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Me
 */




public class CourseRegistrationDaoImpl implements CourseRegistrationDao {
          
        @Override
	public void findAll() {
        try {
            readallOperation();
        } catch (SQLException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
        
        
        
	@Override
	public void findById(String coursecode) {
        try {
            readOperation(coursecode);
        } catch (SQLException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
	}
        
        
        
        @Override
	public void save(CourseRegistration courseregistration) {
            

            try {
                createOperation(courseregistration);
            } catch (SQLException ex) {
                Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
	}
        
        
        @Override
	public void update(String academicsession, String matno, String coursecode) {
        try {
            updateOperation(academicsession, matno, coursecode);
        } catch (SQLException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
        
        
        @Override
	public void delete(String matno, String coursecode) {
        try {
            deleteOperation(matno, coursecode);
        } catch (SQLException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CourseRegistrationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}
             
}

