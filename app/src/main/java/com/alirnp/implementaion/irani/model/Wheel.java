package com.alirnp.implementaion.irani.model;

import javax.inject.Inject;

public class Wheel {

    private Rims rims ;
    private Tire tire;

    @Inject
    public Wheel(Rims rims, Tire tire) {
        this.rims = rims;
        this.tire = tire;
    }
}
