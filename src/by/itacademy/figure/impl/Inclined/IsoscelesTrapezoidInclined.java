package by.itacademy.figure.impl.Inclined;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class IsoscelesTrapezoidInclined extends Figure {
    private final double a1, b1, h1,
            a2, b2, h2;

    public IsoscelesTrapezoidInclined(double a1, double b1, double h1,
                                      double a2, double b2, double h2, FluidType fluidType) {
        super(fluidType);
        this.a1 = a1;
        this.b1 = b1;
        this.h1 = h1;
        this.a2 = a2;
        this.b2 = b2;
        this.h2 = h2;
    }

    @Override
    public double[] area() {
        return new double[]{isoscelesTrapezoid(a1, b1, h1), isoscelesTrapezoid(a2, b2, h2)};
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + "a1 = %-8.2f b1 = %-8.2f h1 =%-8.2f a2 = %-8.2f b2 = %-8.2f h2 =%.2f",
                a1, b1, h1, a2, b2, h2);
    }
}
