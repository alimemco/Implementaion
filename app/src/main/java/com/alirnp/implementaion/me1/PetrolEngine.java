package com.alirnp.implementaion.me1;

import android.util.Log;

import com.alirnp.implementaion.Constants;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine{

    private int horsePower ;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower , @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity ;
    }

    @Override
    public void start() {
        Log.i(Constants.LOG_TAG, "PetrolEngine Started ." +
                "\n horse power = "+ horsePower +"" +
                "\n engineCapacity = "+ engineCapacity +"" );
    }
}
