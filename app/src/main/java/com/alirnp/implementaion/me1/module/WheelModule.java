package com.alirnp.implementaion.me1.module;

import com.alirnp.implementaion.me1.model.Ring;
import com.alirnp.implementaion.me1.model.Tire;
import com.alirnp.implementaion.me1.model.Wheel;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    private Tire tire ;
    private Ring ring;



    @Provides
    static Wheel provideWheel(Tire tire , Ring ring){
        return new Wheel( tire , ring);
    }


    @Provides
    static Tire provideTire(){
        return new Tire();
    }



    @Provides
    static Ring provideRing(){
        Ring ring = new Ring();
        ring.inflate();
        return ring;
    }

}
