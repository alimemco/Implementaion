package com.alirnp.implementaion.irani.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {
    }

    public void enable(Car car){
        Log.i(Constants.LOG_TAG, "enable remote "+car.toString());
    }
}
