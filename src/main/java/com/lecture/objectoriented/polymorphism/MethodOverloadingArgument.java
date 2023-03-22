
package com.lecture.objectoriented.polymorphism;

class Multiplier {
    static int multiply(int a, int b){
        return a*b;
    }
    
    static int multiply(int a, int b, int c){
        return a*b*c;
    }
}

public class MethodOverloadingArgument {
    
    public static void main(String args[]){  
        System.out.println(Multiplier.multiply(5,5));
        System.out.println(Multiplier.multiply(5,5,5));
    }  
}