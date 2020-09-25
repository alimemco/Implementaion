package com.alirnp.implementaion.irani.component;

import com.alirnp.implementaion.irani.IranianActivity;
import com.alirnp.implementaion.irani.module.DieselEngineModule;
import com.alirnp.implementaion.irani.module.WheelModule;
import com.alirnp.implementaion.irani.model.Car;
import com.alirnp.implementaion.irani.scops.PerActivityScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivityScope
@Subcomponent( modules = {DieselEngineModule.class , WheelModule.class })
public interface ActivityComponent {

    Car getCar();

    void inject(IranianActivity iranianActivity);

    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        Builder hoursPower(@Named("hoursPower") int hoursPower);

        @BindsInstance
        Builder engineCapacity( @Named("engineCapacity") int engineCapacity);

        ActivityComponent build();
    }


}
