/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.objectoriented.crudoperations;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class FindOperation {
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {

        // method to insert data into a database
        int noRecords = findOperation();   //Measure execution time for this method
        System.out.println("The number of records : " + noRecords);
    }
    
    
    
    public static int findOperation() throws SQLException, FileNotFoundException {
       //Registering the Driver
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

      //Getting the connection
      
      String mysqlUrl = "jdbc:mysql://localhost:3306/courseregistration?useSSL=false";

      Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
      System.out.println("Connection established......");
      //Creating the Statement object
      Statement stmt = con.createStatement();
      //Query to get the number of rows in a table
      //String query = "select count(*) from course";
      String query = "select coursecode, count(coursecode) from course GROUP BY coursecode HAVING COUNT(coursecode) > 1";
      //Executing the query
      ResultSet rs = stmt.executeQuery(query);
      //Retrieving the result
      rs.next();
      int count = rs.getInt(1);
      System.out.println("Number of records in the course table: "+count);
      return count;
    }
            
            
            
}
