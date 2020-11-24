package by.itacademy.figure.impl.Straight;

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
    public double volume() {
        return volume(area()[0]);
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a = %-8.2f",
                a);
    }
}
