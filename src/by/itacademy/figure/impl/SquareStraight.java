package by.itacademy.figure.impl;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;
import java.util.Locale;

public class SquareStraight extends Figure {
    private final double a;

    public SquareStraight(double a, FluidType fluidType) {
        super(fluidType);
        this.a = a;
    }

    @Override
    public double[] area() {
        return new double[]{square(a)};
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a = %.2f",
                a);
    }
}
