package com.alirnp.implementaion.base;

import android.app.Application;

import com.alirnp.implementaion.di.components.ApiServiceComponent;
import com.alirnp.implementaion.di.components.DaggerApiServiceComponent;
import com.alirnp.implementaion.di.components.DaggerNetComponent;
import com.alirnp.implementaion.di.components.NetComponent;
import com.alirnp.implementaion.di.modules.AppModule;
import com.alirnp.implementaion.di.modules.NetModule;

public class MyApplication extends Application {

    NetComponent netComponent ;
    ApiServiceComponent apiServiceComponent ;


    String BASE_URL = "https://api.github.com/";

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent.builder()
                .netModule(new NetModule(BASE_URL))
                .appModule(new AppModule(this))
                .build();

        apiServiceComponent = DaggerApiServiceComponent.builder()
                .netComponent(netComponent)
                .build();


    }

    public NetComponent getNetComponent() {
        return netComponent;
    }

    public ApiServiceComponent getApiServiceComponent() {
        return apiServiceComponent;
    }


}
