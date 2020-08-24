package com.alirnp.implementaion.codeFlow;

import com.alirnp.implementaion.codeFlow.model.Car;

import dagger.Component;

@Component(modules = WheelModule.class)
public interface CarComponent {
    Car getCar();


    void inject(CodeFlowActivity codeFlowActivity);
}
