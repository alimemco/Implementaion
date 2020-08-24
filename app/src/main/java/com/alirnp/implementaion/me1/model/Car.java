package com.alirnp.implementaion.me1.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;
import com.alirnp.implementaion.me1.Engine;

import javax.inject.Inject;

public class Car {

    @Inject
    Engine engine;
    Wheel wheel;
    Driver driver;

    @Inject
    public Car(Wheel wheel , Driver driver) {
        this.driver = driver;
        this.wheel = wheel;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.enable();
    }

    public void drive() {
        engine.start();
       // Log.i(Constants.LOG_TAG, "driving... Driver = "+driver.hashCode() + " | Car = "+this.hashCode());
        Log.i(Constants.LOG_TAG, "driving... Driver = " +driver.hashCode() + " | Car = "+this.hashCode());
    }
}
