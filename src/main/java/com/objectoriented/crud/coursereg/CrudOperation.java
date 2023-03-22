/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectoriented.crud.coursereg;

import com.objectoriented.crudoperations.*;
import static com.objectoriented.crud.coursereg.ReadAllOperation.readallOperation;
import static com.objectoriented.crud.coursereg.CreateOperation.createOperation;
import static com.objectoriented.crud.coursereg.ReadOperation.readOperation;
import static com.objectoriented.crud.coursereg.UpdateOperation.updateOperation;
import static com.objectoriented.crud.coursereg.DeleteOperation.deleteOperation;
import static com.objectoriented.crud.coursereg.CheckDuplicate.checkDuplicate;



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
        // test crud operations
        
        //createOperation();
        //readallOperation();
        //readOperation("GA002");
        updateOperation("2025", "UD003", "GA003");  
        //deleteOperation("UD003", "GA003");
      
    }
}
