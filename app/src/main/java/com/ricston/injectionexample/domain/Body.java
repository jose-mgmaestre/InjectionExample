package com.ricston.injectionexample.domain;

import com.ricston.injectionexample.domain.com.ricston.injectionexample.domain.blood.Blood;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Body {

    @Inject
    Blood blood;


    @Inject
    public Body(){}

    public Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}
