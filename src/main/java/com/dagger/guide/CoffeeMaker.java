package com.dagger.guide;

import dagger.Lazy;

import javax.inject.Inject;

public class CoffeeMaker {

    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump) {

    }
}
