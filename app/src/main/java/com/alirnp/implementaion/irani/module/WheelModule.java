package com.alirnp.implementaion.irani.module;

import com.alirnp.implementaion.irani.model.Rims;
import com.alirnp.implementaion.irani.model.Tire;
import com.alirnp.implementaion.irani.model.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    Tire provideTire() {
        Tire tire = new Tire();
        tire.inflate();
        return tire;
    }

    @Provides
    Rims provideRims() {
        return new Rims();
    }


    @Provides
    Wheel provideWheel(Rims rims, Tire tire) {
        return new Wheel(rims, tire);
    }
}
