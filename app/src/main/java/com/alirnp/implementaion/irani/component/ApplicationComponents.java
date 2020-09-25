package com.alirnp.implementaion.irani.component;

import com.alirnp.implementaion.irani.model.Car;
import com.alirnp.implementaion.irani.model.Driver;
import com.alirnp.implementaion.irani.module.DriverModule;
import com.alirnp.implementaion.irani.scops.PerApplicationScope;

import dagger.Component;
import dagger.Subcomponent;

@PerApplicationScope
@Component(modules = DriverModule.class)
public interface ApplicationComponents {

    Driver getDriver();

    ActivityComponent.Builder getActivityComponentBuilder();


    @Component.Factory
    interface Factory{

        ApplicationComponents create(DriverModule driverModule);
    }
}
