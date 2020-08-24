package com.alirnp.implementaion.me1.model;

import javax.inject.Inject;

public class Wheel {

    private Tire tire ;
    private Ring ring;

    @Inject
    public Wheel(Tire tire , Ring ring) {
        this.tire = tire ;
        this.ring = ring ;
    }

}
