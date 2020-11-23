package by.itacademy.figure.impl.Inclined;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class CircleInclined extends Figure {
    private final double r1, r2;

    public CircleInclined(double r1, double r2, FluidType fluidType) {
        super(fluidType);
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double[] area() {
        return new double[]{circle(r1), circle(r2)};
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " r1 = %-8.2f r2 = %.2f",
                r1, r2);
    }
}
