/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.dao;

import com.objectoriented.crud.coursereg.*;
import com.objectoriented.crudoperations.*;
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class DeleteOperation {
 
    public static void deleteOperation(String matno, String coursecode) throws SQLException, FileNotFoundException {
            //Registering the Driver  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Getting the connection  
            String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
            
            String sql = "delete from courseregistration where matno=? and coursecode=?";
            //String sql = "delete from courseregistration where coursecode=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, matno);
            preparedStatement.setString(2, coursecode);
            
            // check for duplicates
            CheckDuplicate  cd = new CheckDuplicate();
            int noRecords =  cd.checkDuplicate(matno, coursecode);
            if (noRecords < 1) {
               System.out.println("No Record found! Record cannot be deleted.");
               exit(0);
            }

            preparedStatement.executeUpdate();
            System.out.println("Record deleted!");
            preparedStatement.close();

    }
}
