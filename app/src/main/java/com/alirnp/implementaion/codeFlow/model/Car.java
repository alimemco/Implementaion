package com.alirnp.implementaion.codeFlow.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "APP_LOG";

    @Inject Engine engine ;
    private Wheel wheel ;

    @Inject
    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    @Inject
    public void enableRemote(Remote remote){
       remote.setListener(this);
    }

    @Inject
    public void setSensor(Sensor sensor){
        sensor.enable();
    }

    public void drive(int position){
        Log.i(TAG, "driving... "+ position);
    }

}
