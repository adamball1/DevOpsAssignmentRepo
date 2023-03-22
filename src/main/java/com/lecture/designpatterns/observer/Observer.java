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
public abstract class Observer {
    protected AircraftProducer aircraft;
    public abstract void update();
}
