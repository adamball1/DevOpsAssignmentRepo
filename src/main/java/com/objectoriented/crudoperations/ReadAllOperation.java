/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectoriented.crudoperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import com.courseregistration.model.Course;
import java.util.Arrays;

/**
 *
 * @author Me
 */

public class ReadAllOperation
{
    /*
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {
        // test crud operation
        readOperation();   
      
    }
    */
    
    public static void readallOperation() throws SQLException, FileNotFoundException {
            //Registering the Driver  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Getting the connection  
            String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
            
            String sql = "select * from course";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
               System.out.println(resultSet.getInt("id"));
               System.out.println(resultSet.getString("coursecode"));
               System.out.println(resultSet.getString("coursename"));
               System.out.println(resultSet.getString("term"));
               System.out.println(resultSet.getString("creditunit"));
               
               Course course =  new Course();
               course.setId(resultSet.getInt("id"));
               course.setCoursecode(resultSet.getString("coursecode"));
               course.setCoursename(resultSet.getString("coursename"));
               course.setTerm(resultSet.getInt("term"));
               course.setCreditunit(resultSet.getInt("creditunit"));
               
               
               System.out.println(course);
               
            }
            resultSet.close();

    }
}