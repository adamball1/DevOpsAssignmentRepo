/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.courseregistration.model.CourseRegistration;

/**
 *
 * @author Me
 */

public class ReadAllOperation
{
    
    public static void readallOperation() throws SQLException, FileNotFoundException {
            //Registering the Driver  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Getting the connection  
            String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
            
            String sql = "select * from courseregistration";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {        
               CourseRegistration coursereg =  new CourseRegistration();
               coursereg.setId(resultSet.getInt("id"));
               coursereg.setMatno(resultSet.getString("matno"));
               coursereg.setCoursecode(resultSet.getString("coursecode"));
               coursereg.setTerm(resultSet.getInt("term"));
               coursereg.setAcademicsession(resultSet.getString("academicsession"));
               System.out.println(coursereg);
            }
            resultSet.close();

    }
}