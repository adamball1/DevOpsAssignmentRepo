/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courseregistration.database;

import static com.courseregistration.database.createcourse.createCourse;
import static com.courseregistration.database.createcourseregistration.createCourseRegistration;
import static com.courseregistration.database.createdatabase.createDatabase;
import static com.courseregistration.database.createstudent.createStudent;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class CRSDatabase {
    
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {
       // test how to create database and related table
       //createDatabase("csr"); 
       //createCourse("csr", "course");   
       //createStudent("csr", "student");
       createCourseRegistration("csr", "courseregistration");
    }
}
