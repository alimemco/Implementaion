package com.alirnp.implementaion.di.modules;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module()
public class NetModule {

    private String BASE_URL;

    public NetModule(String BASE_URL) {
        this.BASE_URL = BASE_URL;
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient , Gson gson){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
    }

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(Cache cache){
       return new OkHttpClient.Builder()
                .cache(cache)
                .build();
    }

    @Singleton
    @Provides
    Gson provideGSON(){
       return new GsonBuilder().create();
    }

    @Singleton
    @Provides
    Cache provideCache(Application application){
        int cacheSize = 10 * 1024 * 1024 ; // 10 MB
        return new Cache(application.getCacheDir() , cacheSize);
    }
}
