package com.alirnp.implementaion.irani.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;
import com.alirnp.implementaion.irani.scops.PerActivityScope;

import javax.inject.Inject;

@PerActivityScope
public class Car {

    private Wheel wheel;
   @Inject Engine engine;
   @Inject Driver driver;

    @Inject
    public Car(Wheel wheel,Driver driver) {
        this.wheel = wheel;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.enable(this);
    }

    public void drive(){
        engine.start();
        Log.i(Constants.LOG_TAG, "driving... "+"| car ="+this+"| driver ="+driver+"| driver NAME ="+driver.getDriverName());
    }
}
