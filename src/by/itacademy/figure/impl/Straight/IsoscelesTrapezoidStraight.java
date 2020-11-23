package by.itacademy.figure.impl.Straight;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class IsoscelesTrapezoidStraight extends Figure {
    private final double a, b, h;

    public IsoscelesTrapezoidStraight(double a, double b, double h, FluidType fluidType) {
        super(fluidType);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double[] area() {
        return new double[]{isoscelesTrapezoid(a, b, h)};
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + "a = %-8.2f b = %-8.2f h =%.2f",
                a, b, h);
    }
}
