package com.alirnp.implementaion.irani.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;

import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements Engine {

    private int hoursPower;
    private int engineCapacity;

    @Inject
    public DieselEngine(@Named("hoursPower") int hoursPower, @Named("engineCapacity") int engineCapacity) {
        this.hoursPower = hoursPower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.i(Constants.LOG_TAG, "start DieselEngine | hoursPower =" + hoursPower + "|engineCapacity =" + engineCapacity);
    }
}
