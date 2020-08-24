package com.alirnp.implementaion.me1.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote() {
    }

    public void enable(){
        Log.i(Constants.LOG_TAG, "enable remote");
    }
}
