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
public class AircraftProducer {
    List <Observer> observers = new ArrayList<Observer>();
    private String newAircraft;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getNewAircraft() {
        return newAircraft;
    }

    public void setNewAircraft(String newAircraft) {
        this.newAircraft = newAircraft;
        notifyAllObservers();
    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
