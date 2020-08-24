package com.alirnp.implementaion.di.components;

import com.alirnp.implementaion.di.modules.AppModule;
import com.alirnp.implementaion.di.modules.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {NetModule.class , AppModule.class} )
public interface NetComponent {

    Retrofit retrofit();
}
