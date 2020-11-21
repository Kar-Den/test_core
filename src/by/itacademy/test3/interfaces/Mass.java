package by.itacademy.test3.interfaces;

import by.itacademy.test3.type.FluidType;

public interface Mass {
    double COEFFICIENT = 0.95;
    double mass();

    default double mass(FluidType fluidType, double volume) {
        return volume * fluidType.getDensity() * COEFFICIENT;
    }
}
