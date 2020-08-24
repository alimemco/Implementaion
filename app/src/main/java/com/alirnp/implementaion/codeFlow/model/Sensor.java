package com.alirnp.implementaion.codeFlow.model;

import android.util.Log;

import javax.inject.Inject;

public class Sensor {

    private static final String TAG = "APP_LOG";
    @Inject
    public Sensor() {
    }

    public void enable(){
        Log.i(TAG, "enable sensor");
    }
}
