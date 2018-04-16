package com.ricston.injectionexample.domain;

import dagger.Component;

@Component( modules = RandomInjectionModule.class )
public interface Doctor {
    Body injectBlood();
}
