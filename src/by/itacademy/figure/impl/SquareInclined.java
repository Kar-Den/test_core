package by.itacademy.figure.impl;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class SquareInclined extends Figure {
    double a1, a2;

    public SquareInclined(double a1, double a2, FluidType fluidType) {
        super(fluidType);
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public double[] area() {
        return new double[] {square(a1), square(a2)};
    }

    @Override
    public double volume() {
        return volume(area());
    }

    @Override
    public double mass() {
        return mass(fluidType, volume());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a1 = %.2f, a2 = %-12.2f",
                a1, a2);
    }

}
