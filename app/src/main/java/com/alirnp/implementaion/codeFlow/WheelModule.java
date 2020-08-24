package com.alirnp.implementaion.codeFlow;

import com.alirnp.implementaion.codeFlow.model.Ring;
import com.alirnp.implementaion.codeFlow.model.Tire;
import com.alirnp.implementaion.codeFlow.model.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    Ring provideRing(){
        return new Ring();
    }

    @Provides
    Tire provideTire(){
        Tire tire = new Tire();
        tire.inflate();
        return tire;
    }

    @Provides
    Wheel provideWheel(Tire tire , Ring ring){
        return new Wheel(tire , ring);
    }
}
