package by.itacademy.figure.impl.Straight;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class CircleStraight extends Figure {
    private final double r;

    public CircleStraight(double r, FluidType fluidType) {
        super(fluidType);
        this.r = r;
    }

    @Override
    public double[] area() {
        return new double[]{circle(r)};
    }

    @Override
    public double volume() {
        return volume(area()[0]);
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " r = %-8.2f",
                r);
    }
}
