/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courseregistration.database;

import com.courseregistration.dao.list.CourseRegistrationDaoImplList;
import com.objectoriented.crudoperations.CheckDuplicate;
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class createdatabase {

    public static void createDatabase(String databaseName) throws SQLException, FileNotFoundException {
        //Registering the Driver  
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Getting the connection  
        String mysqlUrl = "jdbc:mysql://localhost";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
        
        String sql = "CREATE DATABASE " + databaseName;
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.execute();
        pstmt.close();
        con.close(); 
        
        System.out.println("Database created.....");
    }
    
}
