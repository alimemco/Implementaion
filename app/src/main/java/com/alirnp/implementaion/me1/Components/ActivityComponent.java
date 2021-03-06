package com.alirnp.implementaion.me1.Components;

import com.alirnp.implementaion.me1.Me1Activity;
import com.alirnp.implementaion.me1.model.Car;
import com.alirnp.implementaion.me1.module.PetrolEngineModule;
import com.alirnp.implementaion.me1.module.WheelModule;
import com.alirnp.implementaion.me1.scope.PerActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(Me1Activity me1Activity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }
}
