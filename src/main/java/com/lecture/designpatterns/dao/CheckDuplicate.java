/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lecture.designpatterns.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Me
 */
public class CheckDuplicate {

    public static int checkDuplicate(String matno, String coursecode) throws SQLException, FileNotFoundException {
       //Registering the Driver
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
      
      //Creating the Statement object
      Statement stmt = con.createStatement();
      String query = "select * from courseregistration";
      
      //Executing the query
      ResultSet rs = stmt.executeQuery(query);
      int count = 0;
      while (rs.next()) {
        if (rs.getString("matno").toUpperCase().equals(matno.toUpperCase()) && rs.getString("coursecode").toUpperCase().equals(coursecode.toUpperCase())){ 
            count++;
        }
      }
      
      return count;
    }
            
            
            
}
