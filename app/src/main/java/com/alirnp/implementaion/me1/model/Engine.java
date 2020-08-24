package com.alirnp.implementaion.me1.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;

import javax.inject.Inject;

public class Engine {

    @Inject
    public Engine() {
        Log.i(Constants.LOG_TAG, "Engine Started :D ");
    }
}
