/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.lecture;

/**
 *
 * @author Me
 */
public class lecture {
    
    
    public static void main(String args[]){  
          
        String S =  "011100";
       
        int opt = solution(S);
        System.out.println("Check no. operations: " + opt);  
        
               

        
    }  
    
   
    
    public static int solution(String S){
        int opt  =  0;
        int bin = Integer.parseInt(S, 2);
        System.out.println("Check bin no.: " + bin);  
        
    
        return opt;
}
    
}



