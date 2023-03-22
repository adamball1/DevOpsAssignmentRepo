
package com.lecture.objectoriented.polymorphism;

class Summer {
    static int sum(int a, int b){
        return a+b;
    }
    
    static double sum(double a, double b){
        return a+b;
    }
    
}

public class MethodOverloadingDatatype {
    
    public static void main(String args[]){  
        System.out.println(Summer.sum(5,5));
        System.out.println(Summer.sum(5.0,5.25));
    }  
}