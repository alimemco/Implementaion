package com.alirnp.implementaion.codeFlow.model;

import android.util.Log;

import javax.inject.Inject;

public class Tire {

    private static final String TAG = "APP_LOG";
    @Inject
    public Tire() {
    }

    public void inflate(){
        Log.i(TAG, "inflate: ");
    }
}
