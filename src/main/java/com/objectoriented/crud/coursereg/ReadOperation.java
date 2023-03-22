/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectoriented.crud.coursereg;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Me
 */

public class ReadOperation
{
    /*
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {

        // method to insert data into a database
        readOperation("GA01");   //Measure execution time for this method
      
    }
    */
    
 
    public static void readOperation(String coursecode) throws SQLException, FileNotFoundException {
            //Registering the Driver  
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Getting the connection  
            String mysqlUrl = "jdbc:mysql://localhost:3306/csr?useSSL=false";
            Connection con = DriverManager.getConnection(mysqlUrl, "root", "welcome");
            
            String sql = "select * from courseregistration";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
               if (resultSet.getString("coursecode").toUpperCase().equals(coursecode.toUpperCase())){
                    System.out.println(resultSet.getInt("id"));
                    System.out.println(resultSet.getString("matno"));
                    System.out.println(resultSet.getString("coursecode"));
                    System.out.println(resultSet.getString("term"));
                    System.out.println(resultSet.getString("academicsession"));
               }
            }
            resultSet.close();

    }
}