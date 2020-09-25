package com.alirnp.implementaion.me1;

import android.app.Application;

import com.alirnp.implementaion.irani.component.ApplicationComponents;
import com.alirnp.implementaion.irani.component.DaggerApplicationComponents;
import com.alirnp.implementaion.irani.module.DriverModule;
import com.alirnp.implementaion.me1.Components.AppComponent;
import com.alirnp.implementaion.me1.Components.DaggerAppComponent;


public class MyApp extends Application {

     private AppComponent appComponent;
   private ApplicationComponents applicationComponents;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.factory().create(new com.alirnp.implementaion.me1.module.DriverModule("ali"));

        applicationComponents = DaggerApplicationComponents.factory().create(new DriverModule("rnp"));

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public ApplicationComponents getApplicationComponents() {
        return applicationComponents;
    }
}
