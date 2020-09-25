package com.alirnp.implementaion.irani.model;

import com.alirnp.implementaion.irani.scops.PerApplicationScope;

import javax.inject.Inject;

@PerApplicationScope
public class Driver {

    private String driverName;

    @Inject
    public Driver(String driverName) {
        this.driverName = driverName;
    }


    public String getDriverName() {
        return driverName;
    }
}
