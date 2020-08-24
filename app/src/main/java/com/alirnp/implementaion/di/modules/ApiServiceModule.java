package com.alirnp.implementaion.di.modules;

import com.alirnp.implementaion.di.scopes.UserScope;
import com.alirnp.implementaion.interfaces.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiServiceModule {

    @UserScope
    @Provides
    ApiService provideApiService(Retrofit retrofit){
       return retrofit.create(ApiService.class);
    }
}
