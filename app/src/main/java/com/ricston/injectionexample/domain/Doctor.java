package com.ricston.injectionexample.domain;

import javax.inject.Singleton;

import dagger.Component;

@Component( modules = RandomInjectionModule.class )
@Singleton
public interface Doctor {
    Body injectBlood();
    Person getPerson();
}
