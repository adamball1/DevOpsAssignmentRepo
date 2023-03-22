/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.observer;
import com.lecture.designpatterns.observer.AircraftProducer;


/**
 *
 * @author Me
 */


public class Observerpattern {
    
    
    public static void main(String args[]){  
        AircraftProducer aircraft = new AircraftProducer();
    
        new AircraftConsumer1(aircraft);
        new AircraftConsumer2(aircraft);
        new AircraftConsumer3(aircraft);
        
        System.out.println("First model: Airbus 500");
        aircraft.setNewAircraft("Airbus 500");
        
        System.out.println("Second model: Airbus 300");
        aircraft.setNewAircraft("Airbus 300");
    }  
    
}
