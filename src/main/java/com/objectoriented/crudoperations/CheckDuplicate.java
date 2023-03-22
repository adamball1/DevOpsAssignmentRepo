/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.objectoriented.crudoperations;

import java.io.FileNotFoundException;
import static java.lang.System.exit;
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
public class CheckDuplicate {
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {

        // method to insert data into a database
        //int noRecords = findOperation("GA05");   //Measure execution time for this method
        //System.out.println("The number of records : " + noRecords);
        
        CheckDuplicate  cd = new CheckDuplicate();
        int noRecords =  cd.checkDuplicate("GA03");
        if (noRecords > 0) {
           System.out.println("Record found!");
        }
        else{
           System.out.println("No record found!");
        }
    }
    
    
    
    public static int checkDuplicate(String coursecode) throws SQLException, FileNotFoundException {
       //Registering the Driver
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
      
      //Creating the Statement object
      Statement stmt = con.createStatement();
      String query = "select coursecode from course";
      
      //Executing the query
      ResultSet rs = stmt.executeQuery(query);
      int count = 0;
      while (rs.next()) {
        if (rs.getString("coursecode").toUpperCase().equals(coursecode.toUpperCase())){
            count++;
        }
      }
      
      System.out.println("Number of records in the course table: "+count);
      return count;
    }
            
            
            
}
