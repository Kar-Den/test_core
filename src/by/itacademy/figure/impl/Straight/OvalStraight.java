package by.itacademy.figure.impl.Straight;

import by.itacademy.figure.Capacity;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class OvalStraight extends Capacity {
    private final double a, b;

    public OvalStraight(double a, double b, FluidType fluidType) {
        super(fluidType);
        this.a = a;
        this.b = b;
    }

    @Override
    public double areaBase() {
        return oval(a, b);
    }

    @Override
    public double volume() {
        return volume(areaBase());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a = %-8.2f b = %.2f",
                a, b);
    }
}
