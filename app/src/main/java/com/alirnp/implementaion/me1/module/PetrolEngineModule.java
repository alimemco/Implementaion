package com.alirnp.implementaion.me1.module;

import com.alirnp.implementaion.me1.Engine;
import com.alirnp.implementaion.me1.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine petrolEngine);
}
