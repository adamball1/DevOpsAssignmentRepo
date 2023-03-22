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
import java.sql.SQLException;
import java.text.ParseException;
import com.objectoriented.crudoperations.CheckDuplicate;
import static java.lang.System.exit;
/**
 *
 * @author Me
 */

public class CreateOperation
{
    /*
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {

        // method to insert data into a database
        createOperation();   //Measure execution time for this method
      
    }
    */
    
    public static void createOperation() throws SQLException, FileNotFoundException {

        //Registering the Driver  
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());


        //Registering the Driver
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Getting the connection  
        //String mysqlUrl = "jdbc:mysql://localhost:3306/courseregistration?useSSL=false";
        String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";

        Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
        System.out.println("Connection established......");

        String sql = "INSERT INTO course VALUES(?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        // Inserting course records
        String courseCode =  "GA006";
        pstmt.setInt(1, 4);
        pstmt.setString(2, courseCode);
        pstmt.setString(3, "Software Quality");
        pstmt.setInt(4, 2);
        pstmt.setInt(5, 3);

        // check for duplicates
        CheckDuplicate  cd = new CheckDuplicate();
        int noRecords =  cd.checkDuplicate(courseCode);
        if (noRecords > 0) {
           System.out.println("Duplicate Record! Record cannot be inserted.");
           exit(0);
        }
        
        // Executing the statement
        pstmt.execute();
        System.out.println("Record inserted......");
    }
}