package com.alirnp.implementaion.me1;

import android.app.Application;

import com.alirnp.implementaion.me1.Components.ActivityComponent;
import com.alirnp.implementaion.me1.Components.AppComponent;
import com.alirnp.implementaion.me1.Components.DaggerActivityComponent;
import com.alirnp.implementaion.me1.Components.DaggerAppComponent;

public class MyApp extends Application {

     private AppComponent appComponent;
     private ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();

        activityComponent = DaggerActivityComponent.builder()
                .horsePower(220)
                .engineCapacity(1400)
                .appComponent(appComponent)
                .build();

    }


    public AppComponent getAppComponent() {
        return appComponent;
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
