package com.alirnp.implementaion.irani.scops;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;
import javax.inject.Singleton;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Scope
@Documented
@Retention(RUNTIME)
public @interface PerApplicationScope {
}
