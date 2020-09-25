package com.alirnp.implementaion.irani.module;

import com.alirnp.implementaion.irani.model.Engine;
import com.alirnp.implementaion.irani.model.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    private int hoursPower ;

    public PetrolEngineModule(int hoursPower) {
        this.hoursPower = hoursPower;
    }

    @Provides
    Engine provideEngine(){
        return new PetrolEngine(hoursPower);
    }
}
