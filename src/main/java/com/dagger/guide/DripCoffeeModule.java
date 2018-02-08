package com.dagger.guide;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    Pump providePump() {
        return new Thermosiphon();
    }
}
