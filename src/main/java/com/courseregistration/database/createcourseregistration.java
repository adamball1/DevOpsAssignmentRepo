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
public class createcourseregistration {
 
    public static void createCourseRegistration(String databaseName, String tableName) throws SQLException, FileNotFoundException {
        //Registering the Driver  
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Getting the connection  
        String mysqlUrl = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
        
        String sql = "CREATE TABLE courseregistration"
        + "("
        + "id int NOT NULL AUTO_INCREMENT,"
        + "matno varchar(45) NOT NULL,"
        + "coursecode varchar(45) NOT NULL,"
        + "term int NOT NULL,"
        + "academicsession varchar(45) NOT NULL,"
        + "PRIMARY KEY (id),"
        + "KEY fk_studentid_idx (id),"
        + "KEY fk_studentid_idx1 (matno),"
        + "KEY fk_courseid_idx (coursecode),"
        + "CONSTRAINT fk_courseid FOREIGN KEY (coursecode) REFERENCES course (coursecode),"
        + "CONSTRAINT fk_studentid FOREIGN KEY (matno) REFERENCES student (matno)"
        + ")";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.execute();
        pstmt.close();
        con.close(); 
        
        System.out.println("CourseRegistration table created.....");
    }
}
