package com.alirnp.implementaion.irani.module;

import com.alirnp.implementaion.irani.model.DieselEngine;
import com.alirnp.implementaion.irani.model.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
    
}
