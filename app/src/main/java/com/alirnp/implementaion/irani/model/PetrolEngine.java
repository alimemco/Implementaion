package com.alirnp.implementaion.irani.model;

import android.util.Log;

import com.alirnp.implementaion.Constants;

import javax.inject.Inject;

public class PetrolEngine implements Engine{

    private int hoursPower ;

    public PetrolEngine( int hoursPower ) {
        this.hoursPower = hoursPower ;
    }

    @Override
    public void start() {
        Log.i(Constants.LOG_TAG, "start PetrolEngine "+hoursPower);
    }
}
