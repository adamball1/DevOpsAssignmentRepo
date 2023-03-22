/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courseregistration.database;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class createstudent {
    
    public static void createStudent(String databaseName, String tableName) throws SQLException, FileNotFoundException {
        //Registering the Driver  
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Getting the connection  
        String mysqlUrl = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
        
        String sql = "CREATE TABLE student"
        + "("
        + "id int NOT NULL AUTO_INCREMENT,"
        + "matno varchar(45) NOT NULL,"
        + "firstname varchar(45) NOT NULL,"
        + "lastname varchar(45) NOT NULL,"
        + "email varchar(45) NOT NULL,"
        + "PRIMARY KEY (id, matno),"
        + "UNIQUE KEY matno_UNIQUE (matno)"
        + ")";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        pstmt.close();
        con.close(); 
        
        System.out.println("Student table created.....");
    }
}
