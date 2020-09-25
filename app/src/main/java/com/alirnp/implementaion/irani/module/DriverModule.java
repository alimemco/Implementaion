package com.alirnp.implementaion.irani.module;

import com.alirnp.implementaion.irani.component.ActivityComponent;
import com.alirnp.implementaion.irani.model.Driver;
import com.alirnp.implementaion.irani.scops.PerApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @PerApplicationScope
    Driver provideDriver(){
        return new Driver(driverName);
    }
}
