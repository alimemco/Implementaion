package com.alirnp.implementaion.codeFlow.model;

import android.util.Log;

import javax.inject.Inject;

public class Wheel {

    private static final String TAG = "APP_LOG";
    @Inject
    public Wheel(Tire tire , Ring ring) {
    }

    public void toast(){
        Log.i(TAG, "toast: ");
    }
}
