package com.alirnp.implementaion.me1.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;
import com.alirnp.implementaion.me1.Engine;

import javax.inject.Inject;

import dagger.Provides;

public class DieselEngine implements Engine {

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower ;
    }


    @Override
    public void start() {
        Log.i(Constants.LOG_TAG, "Diesel Engine Start. "+horsePower);
    }
}
