package by.itacademy.interfaces;

import by.itacademy.type.FluidType;

public interface Mass {
    double COEFFICIENT = 0.95;
    double mass();

    default double mass(FluidType fluidType, double volume) {
        return volume * fluidType.getDensity() * COEFFICIENT;
    }
}
