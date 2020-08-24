package com.alirnp.implementaion.me1.module;

import com.alirnp.implementaion.me1.Engine;
import com.alirnp.implementaion.me1.model.DieselEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
     int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideDieselEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }


}
