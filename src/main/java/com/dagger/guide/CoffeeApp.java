package com.dagger.guide;

import dagger.Component;
import javax.inject.Singleton;

public class CoffeeApp {
    @Singleton
    @Component(modules = { DripCoffeeModule.class })
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {

    }
}