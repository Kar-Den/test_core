package by.itacademy.figure.impl;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class RectangleStraight extends Figure {
    private final double a, b;

    public RectangleStraight(double a, double b, FluidType fluidType) {
        super(fluidType);
        this.a = a;
        this.b = b;
    }

    @Override
    public double[] area() {
        return new double[]{square(a), square(b)};
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a = %-8.2f b = %.2f",
                a, b);
    }
}
