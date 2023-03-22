/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.observer;

/**
 *
 * @author Me
 */
public class AircraftConsumer1  extends Observer{
    
    public AircraftConsumer1(AircraftProducer aircraft){
        this.aircraft = aircraft;
        this.aircraft.attach(this);
    }
    
    
    @Override
    public void update(){
        System.out.println("Air France demand: " + aircraft.getNewAircraft());
    }
}
