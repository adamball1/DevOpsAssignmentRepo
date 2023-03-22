/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.dao;

import com.courseregistration.model.CourseRegistration;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.objectoriented.crud.coursereg.CheckDuplicate;
import static java.lang.System.exit;
/**
 *
 * @author Me
 */

public class CreateOperation
{
    
    
    
    public static void createOperation(CourseRegistration coursereg) throws SQLException, FileNotFoundException {

        //Registering the Driver  
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Getting the connection  
        String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";

        Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
        System.out.println("Connection established......");

        String sql = "INSERT INTO courseregistration VALUES(?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        // Inserting course records
        pstmt.setInt(1, coursereg.getId());
        pstmt.setString(2, coursereg.getMatno());
        pstmt.setString(3, coursereg.getCoursecode());
        pstmt.setInt(4, coursereg.getTerm());
        pstmt.setString(5, coursereg.getAcademicsession());

        // check for duplicates
        CheckDuplicate  cd = new CheckDuplicate();
        int noRecords =  cd.checkDuplicate(coursereg.getMatno(), coursereg.getCoursecode());
        if (noRecords > 0) {
           System.out.println("Duplicate Record! Record cannot be inserted.");
           exit(0);
        }
        
        // Executing the statement
        pstmt.execute();
        System.out.println("Record inserted......");
    }
}