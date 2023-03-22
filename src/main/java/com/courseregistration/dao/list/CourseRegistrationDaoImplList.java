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

public class CourseRegistrationDaoImplList implements CourseRegistrationDaoList {
    
    ArrayList<CourseRegistration> coursereg = new ArrayList<CourseRegistration>();
    
    @Override
    public void save(CourseRegistration cr) {
        coursereg.add(cr);
    }
    
    
    @Override   
    public List<CourseRegistration> findAll() {
        return coursereg;
    } 
    
    @Override
    public CourseRegistration findById(int id) {
        CourseRegistration cr = null;
        
        for (int i=0; i < coursereg.size(); i++){
            if (coursereg.get(i).getId() == id) {
                cr = coursereg.get(i);
                break;
            }  
        }
        return cr;
    }
    
    
    @Override
    public void update(CourseRegistration cr, String coursecode) {
        for (int i=0; i < coursereg.size(); i++){
            if (coursereg.get(i) == cr) {
                coursereg.get(i).setMatno(coursecode);
                break;
            }  
        }
    }
    
    
    @Override
    public void delete(CourseRegistration cr) {
        coursereg.remove(cr);
    }
    
}
