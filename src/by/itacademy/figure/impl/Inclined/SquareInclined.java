package by.itacademy.figure.impl.Inclined;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;
import java.util.Locale;

public class SquareInclined extends Figure {
    private final double a1, a2;

    public SquareInclined(double a1, double a2, FluidType fluidType) {
        super(fluidType);
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public double[] area() {
        return new double[] {square(a1), square(a2)};
    }

    @Override
    public double volume() {
        return volume(area()[0], area()[1]);
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a1 = %-8.2f a2 = %.2f",
                a1, a2);
    }

}