package by.itacademy.figure.impl.Straight;

import by.itacademy.figure.Capacity;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class IsoscelesTrapezoidStraight extends Capacity {
    private final double a, b, h;

    public IsoscelesTrapezoidStraight(double a, double b, double h, FluidType fluidType) {
        super(fluidType);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double areaBase() {
        return isoscelesTrapezoid(a, b, h);
    }

    @Override
    public double volume() {
        return volume(areaBase());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a = %-8.2f b = %-8.2f h =%.2f",
                a, b, h);
    }
}
