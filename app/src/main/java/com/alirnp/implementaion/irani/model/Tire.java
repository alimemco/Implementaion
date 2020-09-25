package com.alirnp.implementaion.irani.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;

import javax.inject.Inject;

public class Tire {

    @Inject
    public Tire() {
    }

    public void inflate(){
        Log.i(Constants.LOG_TAG, "inflate tire");
    }
}
