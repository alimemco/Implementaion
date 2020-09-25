package com.alirnp.implementaion.me1.module;

import com.alirnp.implementaion.me1.Components.ActivityComponent;
import com.alirnp.implementaion.me1.model.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@Module(subcomponents = ActivityComponent.class)
public class DriverModule {

    private String name ;

    public DriverModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    Driver provideDriver(){
        return new Driver(name);
    }
}
