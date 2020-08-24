package com.alirnp.implementaion.me1.module;

import com.alirnp.implementaion.me1.model.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }
}
