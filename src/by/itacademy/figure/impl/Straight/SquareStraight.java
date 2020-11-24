package by.itacademy.figure.impl.Straight;

import by.itacademy.figure.Capacity;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class SquareStraight extends Capacity {
    private final double a;

    public SquareStraight(double a, FluidType fluidType) {
        super(fluidType);
        this.a = a;
    }

    @Override
    public double areaBase() {
        return square(a);
    }

    @Override
    public double volume() {
        return volume(areaBase());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a = %-8.2f",
                a);
    }
}


