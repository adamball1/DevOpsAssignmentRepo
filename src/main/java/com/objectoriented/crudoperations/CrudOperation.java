/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectoriented.crudoperations;

import static com.objectoriented.crudoperations.ReadAllOperation.readallOperation;
import static com.objectoriented.crudoperations.CreateOperation.createOperation;
import static com.objectoriented.crudoperations.ReadOperation.readOperation;
import static com.objectoriented.crudoperations.UpdateOperation.updateOperation;
import static com.objectoriented.crudoperations.DeleteOperation.deleteOperation;
import static com.objectoriented.crudoperations.CheckDuplicate.checkDuplicate;
import static com.objectoriented.crudoperations.FindOperation.findOperation;


import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Me
 */
public class CrudOperation {
    public static void main(String[] args) throws ParseException, SQLException, FileNotFoundException 
    {
        // test crud operation
        //createOperation();
        //readallOperation();
        //readOperation("GA006"); 
        updateOperation(45, "GA006");
        //deleteOperation("GA006");
      
    }
}
