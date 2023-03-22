/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lecture.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Me
 */

public class AircraftConsumer3  extends Observer{
    
    public AircraftConsumer3(AircraftProducer aircraft){
        this.aircraft = aircraft;
        this.aircraft.attach(this);
    }
    
    
    @Override
    public void update(){
        System.out.println("EasyJet demand: " + aircraft.getNewAircraft());
    }
}
