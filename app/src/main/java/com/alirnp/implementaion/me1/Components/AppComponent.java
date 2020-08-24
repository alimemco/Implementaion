package com.alirnp.implementaion.me1.Components;

import com.alirnp.implementaion.me1.model.Driver;
import com.alirnp.implementaion.me1.module.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
