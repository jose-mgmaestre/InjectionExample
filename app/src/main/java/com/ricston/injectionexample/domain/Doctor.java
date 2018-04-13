package com.ricston.injectionexample.domain;

import com.ricston.injectionexample.domain.com.ricston.injectionexample.domain.blood.Blood;

import dagger.Component;

@Component( modules = InjectionModule.class )
public interface Doctor {
    Body injectBlood();
}
